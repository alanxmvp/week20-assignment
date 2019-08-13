package java.assignment;

/**
 * PhoneChecker
 */
public class UserSpecificDiscount {
  public static int check(int originalPrice, int discount, String userType) {

    if (userType == "premier") {
      int finalPrice = originalPrice - discount;
      return finalPrice;
    } else {
      int finalPrice = originalPrice;
      return finalPrice;
    }
  }

}