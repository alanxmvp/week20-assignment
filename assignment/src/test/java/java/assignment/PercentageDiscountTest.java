package java.assignment;

import junit.framework.TestCase;

/**
 * PhoneCheckerTest
 */
public class PercentageDiscountTest extends TestCase {

  public void testAbsoluteDiscount() {
    // Given
    int originalPrice = 150;
    int discountPercent = 40;

    // When
    int finalPrice = PercentageDiscount.check(originalPrice, discountPercent);

    // Then
    System.out.println(finalPrice);
  }
}