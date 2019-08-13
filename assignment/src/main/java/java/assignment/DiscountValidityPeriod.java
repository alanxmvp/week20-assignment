package java.assignment;

import java.util.Date;

/**
 * PhoneChecker
 */
public class DiscountValidityPeriod {
  public static int check(int originalPrice, int discount, Date startDate, Date endDate, Date buyDate) {

    if (buyDate.after(startDate) && buyDate.before(endDate)) {
      int finalPrice = originalPrice - discount;
      return finalPrice;
    } else {
      int finalPrice = originalPrice;
      return finalPrice;
    }
  }
}