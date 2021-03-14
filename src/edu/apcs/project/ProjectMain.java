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
    menuFrame.pack();
    menuFrame.setVisible(true);
    menuFrame.setState(Frame.MAXIMIZED_BOTH);
    menuFrame.setLayout(new BorderLayout(30, 30));


  }

  /**
   * In order to render the screen, I am creating a JFrame and filling it with Panel.
   * The Panel has a grid layout of rows and columns equal to the size of 2D array.
   * Using a for loop, I am displaying the fish description and details for each fish.
   * This is done in text area as I was not able to find anything else in internet.
   *
   * @return
   */
  private JFrame renderCatalogPage() {
    JPanel panel = new JPanel();

    GridLayout glayout = new GridLayout(4, 4);
    glayout.setHgap(20);
    glayout.setVgap(10);
    JPanel parentPanel = new JPanel(glayout);
    parentPanel.setBackground(Color.WHITE);
    for (int i = 0; i < catalog.length; i++) {
      for (int j = 0; j < catalog[i].length; j++) {
        Fish fish = catalog[i][j];
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setRows(4);
        textArea.setSize(200, 100);

        /**
         eg:
         Fantail(Gold Fish)
         Available Units: 10
         Size: 6.0 (in)
         Color:  Mixed
         Price: 6.0
         Description: Long description is being testedposes an egg-shaped body and a high dorsal fi
         */
        String description = fish.getName() + "(" + fish.getType() + ")" + LINE_BREAK + "Available Units: " + fish.getNoOfItems() + LINE_BREAK + "Size: " + fish.getSize() + " (in)" + LINE_BREAK + "Color: " + fish.getColor() + LINE_BREAK + "Price: " + fish.getPrice() + "$" + LINE_BREAK + "Description:" + fish.getDescription();
        textArea.setText(description);
        parentPanel.add(textArea);
      }
    }

    FlowLayout layout = new FlowLayout();
    JPanel childPanel = new JPanel();

    // setting the buttons for Proceed and Exit.
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
      /*JTextField fishJField = new JTextField();
      JTextField countJField = new JTextField();
      fishJField.setSize(100, 50);
      countJField.setSize(100, 50);
      Object[] message = {"Fish Name:", fishJField, "Fish Count:", countJField};


      JPanel myPanel = new JPanel();
      myPanel.add(new JLabel("Fish Name:"));
      myPanel.add(fishJField);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Fish Count:"));
      myPanel.add(countJField);*/

      userInput = JOptionPane.showInputDialog(null, "Please enter Name of fish and number of fish eg: Fantail, 6");

      String[] inputArray = userInput.split(",");
      String name = "";
      String count = "0";
      if (inputArray != null && inputArray.length == 2) {
        name = inputArray != null ? inputArray[0] : "";
        count = inputArray != null ? inputArray[1] : "";
      }

      //we will check here that fish is present and no of fishes should be lesser than items present in catalog
      Fish fish = Catalog.getFish(catalog, name);

      if (Catalog.isCorrectName(fish) && Catalog.isNoOfItemAvailable(fish, Integer.parseInt(count))) {

        //Fish name (Fantail) is matched, no of items selected is 6.
        String selectedFishMessage = "Fish name (" + fish.getName() + ") is matched, no of items selected is " + count + " .";
        JOptionPane.showMessageDialog(null, selectedFishMessage, "Success", JOptionPane.INFORMATION_MESSAGE );

        Item item = new Item(fish, Integer.parseInt(count));
        cart.addItem(item);

        userInput = JOptionPane.showInputDialog(null, "Press Y to add more fishes, any other key to proceed to checkout.");

      } else {
        JOptionPane.showMessageDialog(null, "Fish not found or the count is incorrect. Please enter name and count again.",
                "Failure", JOptionPane.INFORMATION_MESSAGE);
        userInput = "Y";
      }
    } while ("Y".equals(userInput));

    /** This is make the payment after looking at the summary **/
    checkout();
  }

  /**
   * This is make the payment after looking at the summary
   **/
  private void checkout() {

    //we need to calculate the price before showing in JOption
    cart.calculateSummary();


    JScrollPane summaryPane = new JScrollPane();

    JTextArea textArea = new JTextArea();
    textArea.setLineWrap(true);
    textArea.setRows(7);
    textArea.setSize(400, 400);
    textArea.setEditable(false);
    textArea.setColumns(30);

    /** This will contain a multi line summary for the items user has selected.
     * It will also show the discount and final amount.**/
    String summaryDescription = "Fish::" + LINE_BREAK;

    int count = 1;
    for (Item item : cart.getItemList()) {
      //1. Fantail (Gold Fish) 6.0 * 6 = 36.0 $
      summaryDescription = summaryDescription + count + ". " + item.getFish().getName() + " (" + item.getFish().getType() + ") " + item.getFish().getPrice() + " * " + item.getNumber() + " = " + (item.getFish().getPrice() * item.getNumber()) + " $" + LINE_BREAK;
      count++;
    }

    summaryDescription = summaryDescription + LINE_BREAK;
    summaryDescription = summaryDescription + "Gross Amount:: " + cart.getGrossAmount() + "$" + LINE_BREAK;
    summaryDescription = summaryDescription + "Discount:: " + "(" + cart.getDiscountPercentage() + " %) " + cart.getDiscount() + "$" + LINE_BREAK;
    summaryDescription = summaryDescription + "Final Amount:: " + cart.getFinalAmount() + "$" + LINE_BREAK;

    textArea.setText(summaryDescription);
    summaryPane.add(textArea);
    summaryPane.setAutoscrolls(true);
    summaryPane.setBorder(new LineBorder(Color.BLUE, 1, true));
    summaryPane.setSize(400, 400);
    summaryPane.setLayout(new ScrollPaneLayout());
    JOptionPane.showMessageDialog(null, textArea, "Summary", JOptionPane.INFORMATION_MESSAGE);


    String userInput = JOptionPane.showInputDialog(null, "Press Y to initiate payment, any other key to cancel");
    if ("Y".equals(userInput)) {
      //this is the place where user is making the payment
      cart.processPayment();
      JOptionPane.showMessageDialog(null, "Thanks for the purchase, we are redirecting to the main menu.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(null, "Your order has been cancelled as per request, we are redirecting to the main menu.", "Cancelled", JOptionPane.INFORMATION_MESSAGE);
    }

    //I am again redirecting to the main menu after payment or if user cancels payment.
    start();
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


