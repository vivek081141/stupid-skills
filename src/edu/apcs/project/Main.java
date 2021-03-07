package edu.apcs.project;

import edu.apcs.project.models.Fish;
import edu.apcs.project.models.GoldFish;

public class Main {
  public static void main(String[] args) {
    Fish[][] catalog = new Fish[4][5];

    //GoldFish fish[0][0] - fish[0][1]  fish[0][2]
    //Angel Fish fish[1][0] - fish[1][1]  fish[1][2]
    Fish fish = new GoldFish(6f, "MIXED", 6f,
            "From China, Japan, poses an egg-shaped body and a high dorsal fin", 10);
    catalog[0][0] = fish;


    //user sees the catalog
    //how we are going to show in GUI
    //name, 4
    //print the catalog with fishes remaining in each category

    //Faintail = 5
    Item order = new Item(catalog[0][0], 5);
    System.out.println("My order" + order);

    //Gold = 2
    Item order2 = new Item(catalog[1][1], 2);
    System.out.println("My order" + order);

    ShoppingCart cart = new ShoppingCart();
    cart.addItem(order);
    cart.addItem(order2);
    cart.setDiscount(10); //based on some logic 10% if initial amount is 50, 20% is amount is 100

    System.out.println(cart.getFinalPrice());

    System.out.println("Do you want to pay");
    cart.processPayment();

    //if payment is made, then reduce the no of Items.

  }
}
