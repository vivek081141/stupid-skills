package edu.apcs.project;

import edu.apcs.project.models.Fish;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  private List<Item> itemList;
  private double grossAmount;
  private double finalAmount;

  //Discount Percentage
  private double discountPercentage;

  public void addItem(Item item) {
    if (itemList == null) {
      itemList = new ArrayList<>();
    }
    itemList.add(item);
  }

  public void setDiscountPercentage(float discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public double getFinalPrice() {
    for (Item item : itemList) {
      grossAmount = grossAmount + (item.getFish().getPrice() * item.getNumber());
    }

    //calculate discount percentage
    calculateDiscountPercentage();

    //applying discount
    finalAmount = grossAmount - (grossAmount * discountPercentage * 100);
    return finalAmount;
  }

  public void calculateDiscountPercentage() {
    if (this.grossAmount > 100) {
      discountPercentage = 10;
    } else if (this.grossAmount > 50) {
      discountPercentage = 5;
    } else {
      discountPercentage = 0;
    }
  }

  /*
   * after a successful payment, please
   * reduce the noOfItems for ordered fish from the catalog
   * reset the orderList and discount
   * show a congratulatory message for the payment.
   */
  public void processPayment() {
    for (Item item : itemList) {
      Fish fish = item.getFish();
      int numberTobeSubtracted = item.getNumber();
      fish.setNoOfItems(fish.getNoOfItems() - numberTobeSubtracted);
    }
    resetValues();
  }

  private void resetValues() {
    itemList = null;
    grossAmount = 0;
    finalAmount = 0;
    discountPercentage = 0;
  }
}
