package edu.apcs.project;

import edu.apcs.project.models.Fish;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ProjectMain {

  public static final String LINE_BREAK = "\n";
  private Fish[][] catalog;
  private ShoppingCart cart;
  private JFrame menuFrame;

  public ProjectMain() {
    catalog = Catalog.generateCatalog();
    cart = new ShoppingCart();
  }

  public void start() {
    menuFrame = renderCatalogPage();
    menuFrame.setLayout(new BorderLayout());
    menuFrame.pack();
    menuFrame.setVisible(true);
  }

  private JFrame renderCatalogPage() {
    JPanel panel = new JPanel();

    GridLayout glayout = new GridLayout(4, 4);
    glayout.setHgap(20);
    glayout.setVgap(10);
    JPanel parentPanel = new JPanel(glayout);
    parentPanel.setBackground(Color.WHITE);
    for (int i = 0; i < catalog.length; i++) {
      for (int j = 0; j < catalog[i].length; j++) {
        JLabel label = new JLabel();
        Fish fish = catalog[i][j];
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setRows(4);
        textArea.setSize(200, 100);
        String s = fish.getName() + "(" + fish.getType() + ")" + "Available Units: " + fish.getNoOfItems() + "<br>" + "Size: " + fish.getSize() + " (in)" + "<br>" + "Color: " + fish.getColor() + "<br>" + "Price: " + fish.getPrice() + "$" + "<br>" + "Description: Long description is being tested" + fish.getDescription() + "</html>";
        String s1 = fish.getName() + "(" + fish.getType() + ")" + LINE_BREAK + "Available Units: " + fish.getNoOfItems() + LINE_BREAK + "Size: " + fish.getSize() + " (in)" + LINE_BREAK + "Color: " + fish.getColor() + LINE_BREAK + "Price: " + fish.getPrice() + LINE_BREAK + "$" + "Description: Long description is being tested" + fish.getDescription();
        textArea.setText(s1);
        label.setText(s);
        label.setSize(200, 100);
        label.setBorder(new LineBorder(Color.BLUE, 1, true));
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setHorizontalTextPosition(SwingConstants.LEFT);
        parentPanel.add(textArea);
      }
    }

    FlowLayout layout = new FlowLayout();
    JPanel childPanel = new JPanel();

    // set the layout
    JButton b1 = new JButton("Proceed");
    JButton b2 = new JButton("Exit");

    childPanel.setLayout(layout);
    childPanel.add(b1);
    childPanel.add(b2);

    //when we click on the proceed button, this action will be triggered
    b1.addActionListener(new ProceedAction());
    b2.addActionListener(new ExitAction());

    panel.add(parentPanel);
    panel.add(childPanel);
    panel.setAutoscrolls(true);
    panel.setSize(1000, 600);

    JFrame frame = new JFrame("Menu");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(1000, 500);
    frame.add(panel);
    return frame;
  }

  /**
   * The dialog has Proceed and Cancel Event.
   * This is the proceed action where user will add items to the cart.
   */
  public void proceedAction() {
    String userInput = "";
    do {
      JTextField fishJField = new JTextField();
      JTextField countJField = new JTextField();
      fishJField.setSize(100, 50);
      countJField.setSize(100, 50);
      Object[] message = {"Fish Name:", fishJField, "Fish Count:", countJField};


      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Fish Name:"));
      myPanel.add(fishJField);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Fish Count:"));
      myPanel.add(countJField);

      userInput = JOptionPane.showInputDialog(null, "Please enter Name of fish and number of fish eg: Fantail, 6");

      // int option = JOptionPane.showConfirmDialog(myPanel, null, "Please Enter X and Y Values", JOptionPane.OK_OPTION);

      String name = fishJField.getName();
      String count = countJField.getName();

      name = userInput.split(",")[0];
      count = userInput.split(",")[1];

      //we will check here that fish is present and no of fishes should be lesser than items present in catalog
      Fish fish = Catalog.getFish(catalog, name);

      if (Catalog.isCorrectName(fish) && Catalog.isNoOfItemAvailable(fish, Integer.parseInt(count))) {

        //Fish name (Fantail) is matched, no of items selected is 6.
        JOptionPane.showMessageDialog(null, fish.getName() + "Fish name ("+ fish.getName() +") is matched, no of items selected is " + count + " .");

        Item item = new Item(fish, Integer.parseInt(count));
        cart.addItem(item);

        userInput = JOptionPane.showInputDialog(null, "Press Y to add more fishes, any other key to proceed to checkout.");

      } else {
        JOptionPane.showMessageDialog(null, "Fish not found or the count is incorrect. Please enter name and count again.");
        userInput = "Y";
      }
    } while ("Y".equals(userInput));


    checkout();
  }

  //user should have some items selected
  private void checkout() {

    //we need to show the summary
    cart.calculateSummary();


    JScrollPane summaryPane = new JScrollPane();

    JTextArea textArea = new JTextArea();
    textArea.setLineWrap(true);
    textArea.setRows(7);
    textArea.setSize(400, 400);
    textArea.setEditable(false);
    textArea.setColumns(30);
    String summaryDescription = "Fish::" + LINE_BREAK;
    int count = 1;
    for (Item item : cart.getItemList()) {
      //1. Fantail (Gold Fish) 6.0 * 6 = 36.0 $
      summaryDescription = summaryDescription + count + ". " + item.getFish().getName() + " (" + item.getFish().getType() + ") " + item.getFish().getPrice() + " * " + item.getNumber() + " = " + (item.getFish().getPrice() * item.getNumber()) + " $" + LINE_BREAK;
    }

    summaryDescription = summaryDescription + LINE_BREAK;
    summaryDescription = summaryDescription + "Gross Amount:: " + cart.getGrossAmount() + " $" + LINE_BREAK;
    summaryDescription = summaryDescription + "Discount:: " + cart.getDiscount() + " $" + LINE_BREAK;
    summaryDescription = summaryDescription + "Final Amount:: " + cart.getFinalAmount() + " $" + LINE_BREAK;

    textArea.setText(summaryDescription);


    summaryPane.add(textArea);
    summaryPane.setAutoscrolls(true);
    summaryPane.setBorder(new LineBorder(Color.BLUE, 1, true));
    summaryPane.setSize(400, 400);
    summaryPane.setLayout(new ScrollPaneLayout());
    JOptionPane.showMessageDialog(null, textArea);


    String userInput = JOptionPane.showInputDialog(null, "Press Y to payment, any other key to cancel");
    if ("Y".equals(userInput)) {
      //this is the place where user is making the payment
      cart.processPayment();
    }

    JOptionPane.showMessageDialog(null, "Thanks for the purchase, we are again redirecting to the main menu.");

    //todo : This is not working
    renderCatalogPage();
  }

  class ProceedAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      menuFrame.setVisible(false);
      System.out.println("Proceed is clicked");
      proceedAction();
    }
  }

  class ExitAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("Exit is clicked");
      System.exit(1);
    }
  }

}


