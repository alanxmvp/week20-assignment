package java.assignment;

/**
 * PhoneChecker
 */
public class PercentageDiscount {
  public static int check(int originalPrice, int discountPercent) {
    int finalPrice = originalPrice * discountPercent / 100;

    return finalPrice;
  }

}