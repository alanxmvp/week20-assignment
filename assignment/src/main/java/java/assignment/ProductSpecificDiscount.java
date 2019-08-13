package java.assignment;

/**
 * PhoneChecker
 */
public class ProductSpecificDiscount {
  public static int check(int originalPrice, int discount, String type) {

    if (type == "milk") {
      int finalPrice = originalPrice - discount;
      return finalPrice;
    } else {
      int finalPrice = originalPrice;
      return finalPrice;
    }
  }

}