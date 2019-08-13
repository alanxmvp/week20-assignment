package java.assignment;

import junit.framework.TestCase;

/**
 * PhoneCheckerTest
 */
public class ProductSpecificDiscountTest extends TestCase {

  public void testAbsoluteDiscount() {
    // Given
    int originalPrice = 100;
    int discount = 20;
    String itemType = "cereal";

    // When
    int finalPrice = ProductSpecificDiscount.check(originalPrice, discount, itemType);

    // Then
    System.out.println(finalPrice);
  }
}