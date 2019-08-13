package java.assignment;

import junit.framework.TestCase;

/**
 * PhoneCheckerTest
 */
public class AbsoluteDiscountTest extends TestCase {

  public void testAbsoluteDiscount() {
    // Given
    int originalPrice = 100;
    int discount = 20;

    // When
    int finalPrice = AbsoluteDiscount.check(originalPrice, discount);

    // Then
    System.out.println(finalPrice);
  }
}