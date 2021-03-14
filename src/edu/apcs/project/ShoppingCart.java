package edu.apcs.project;

import edu.apcs.project.models.Fish;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  /**
   * eg: List of Items
   * Faintail 5
   * Fighting Fish 6
   * Teloscopic fish 9
   *
   * Item Summary
   * Faintail 5
   * Fighting Fish 6
   * Teloscopic fish 9
   *
   * Initial Amount(grossAmount) = 100
   * Discount  = 20
   * Final Amount (finalAmount)= 80
   *
   *
   */
  private List<Item> itemList; // 1 Item is  = Fish Name plus no of fishes
  private double grossAmount;
  private double finalAmount;

  //Discount Percentage
  private double discountPercentage;

  //Discount after calculating the percentage
  private double discount;

  /**
   * add the selected fish along with no. of fish in the cart
   */
  public void addItem(Item item) {
    if (itemList == null) {
      itemList = new ArrayList<>();
    }
    itemList.add(item);
  }

  public void setDiscountPercentage(float discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public void calculateSummary() {
    grossAmount = 0;
    for (Item item : itemList) {
      grossAmount = grossAmount + (item.getFish().getPrice() * item.getNumber());
    }

    //grossAmount = 100
    //calculate discount percentage
    calculateDiscountPercentage();

    //applying discount
    //final amount = 100 - 20% of 100

    this.discount = (grossAmount * discountPercentage / 100);
    finalAmount = grossAmount - discount ;
  }

  /**
   * Discount
   * 20% for purchase above 100 dollars
   * 10% for 50-100
   * 5% for 1-50
   */
  public void calculateDiscountPercentage() {
    if (this.grossAmount >= 100) {
      discountPercentage = 20;
    } else if (this.grossAmount >= 50) {
      discountPercentage = 10;
    } else {
      discountPercentage = 5;
    }
  }

  /*
   * after a successful payment, please
   * reduce the noOfItems for ordered fish from the catalog
   * reset the orderList and discount
   * show a congratulatory message for the payment.
   *
   * Item Summary
   * Faintail 5
   * Fighting Fish 6
   * Teloscopic fish 9
   * payment>
   *
   */
  public void processPayment() {
    for (Item item : itemList) {
      Fish fish = item.getFish();
      int numberTobeSubtracted = item.getNumber();
      fish.setNoOfItems(fish.getNoOfItems() - numberTobeSubtracted);
    }
    resetValues();
  }

  public List<Item> getItemList() {
    return itemList;
  }

  public double getGrossAmount() {
    return grossAmount;
  }

  public double getFinalAmount() {
    return finalAmount;
  }

  public double getDiscount() {
    return discount;
  }

  private void resetValues() {
    itemList = null;
    grossAmount = 0;
    finalAmount = 0;
    discountPercentage = 0;
  }
}
