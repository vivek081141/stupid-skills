package edu.apcs.project;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private List<Item> itemList;

  //Discount Percentage
  private double discount;

  public void addItem(Item item) {
    if (itemList == null) {
      itemList = new ArrayList<>();
    }
    itemList.add(item);
  }

  public void setDiscount(float discount) {
    this.discount = discount;
  }

  public double getFinalPrice() {
    double price = 0;
    for (Item item: itemList) {
      price = price + (item.getFish().getPrice() * item.getNumber());
    }

    //applying discount
    price = price - price * discount * 100;
    return price;
  }

  /*
    * after a successful payment, please
    * reset the noOfItems for ordered fish from the catalog
    * reset the orderList and discount
    * show a congratulatory message for the payment.
   */
  public void processPayment() {
  }
}
