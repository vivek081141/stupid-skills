package edu.apcs.project;

import edu.apcs.project.models.Fish;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ProjectMain {

  private Fish[][] catalog;
  private ShoppingCart cart;
  private JFrame frame;

  public ProjectMain() {
    catalog = Catalog.generateCatalog();
    cart = new ShoppingCart();
  }

  public void start() {
    frame = renderCatalogPage();
    frame.setLayout(new BorderLayout());
    frame.pack();
    frame.setVisible(true);
  }

  private JFrame renderCatalogPage() {
    JPanel panel = new JPanel();

    GridLayout glayout = new GridLayout(4,4);
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
        textArea.setSize(200,100);
        String s =   fish.getName() + "(" + fish.getType() +")" + "Available Units: " + fish.getNoOfItems() + "<br>" + "Size: " + fish.getSize() + " (in)" + "<br>" + "Color: " + fish.getColor() + "<br>" + "Price: " + fish.getPrice() + "$" + "<br>" + "Description: Long description is being tested" + fish.getDescription() + "</html>";
        String s1 =   fish.getName() + "(" + fish.getType() +")" +"\n"+ "Available Units: " + fish.getNoOfItems()  +"\n"+ "Size: " + fish.getSize() + " (in)"  +"\n"+ "Color: " + fish.getColor() +"\n"+ "Price: " + fish.getPrice() +"\n"+ "$" + "Description: Long description is being tested" + fish.getDescription();
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
   *  The dialog has Proceed and Cancel Event.
   *  This is the proceed action where user will add items to the cart.
   *
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
      //myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Fish Count:"));
      myPanel.add(countJField);


      int option = JOptionPane.showConfirmDialog(myPanel, null, "Please Enter X and Y Values", JOptionPane.OK_OPTION);

      String name = fishJField.getName();
      String count = countJField.getName();

      name = "FanTail";
      count = "8";
      Fish fish = Catalog.getFish(catalog, name);

      if (Catalog.isCorrectName(fish) && Catalog.isNoOfItemAvailable(fish, Integer.parseInt(count))) {
        JOptionPane.showMessageDialog(null, "Fish name is matched, adding {} no if fishes in the cart.");

        Item item = new Item(fish, Integer.parseInt(count));
        cart.addItem(item);

        userInput = JOptionPane.showInputDialog(null, "Press Y to add more fishes, any other key to proceed to checkout.");

      } else {
        JOptionPane.showMessageDialog(null, "Fish not found. please enter name and count again.");
        userInput = "Y";
      }
    } while ("Y".equals(userInput));


    checkout();
  }

  private void checkout() {
    JOptionPane.showMessageDialog(null, "This is the final bill after discount. " + cart.getFinalPrice());
    String userInput = JOptionPane.showInputDialog(null, "Press Y to payment, any other key to cancel");
    if ("Y".equals(userInput)) {
      cart.processPayment();
    }

    JOptionPane.showMessageDialog(null, "Thanks for the purchase, we are again redirecting to the main menu.");

    renderCatalogPage();
  }

  class ProceedAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      frame.setVisible(false);
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


