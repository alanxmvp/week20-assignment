package java.assignment;

import java.util.Date;

import junit.framework.TestCase;

/**
 * PhoneCheckerTest
 */
public class DiscountValidityPeriodTest extends TestCase {

  public void testAbsoluteDiscount() {
    // Given
    int originalPrice = 100;
    Date startDate = new Date(2019, 1, 1);
    Date endDate = new Date(2019, 1, 7);
    Date buyDate = new Date(2019, 1, 8);
    int discount = 20;

    // When
    int finalPrice = DiscountValidityPeriod.check(originalPrice, discount, startDate, endDate, buyDate);

    // Then
    System.out.println(finalPrice);
  }
}