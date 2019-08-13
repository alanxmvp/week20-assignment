package java.assignment;

import junit.framework.TestCase;

/**
 * PhoneCheckerTest
 */
public class UserSpecificDiscountTest extends TestCase {

  public void testAbsoluteDiscount() {
    // Given
    int originalPrice = 100;
    int discount = 20;
    String userType = "premier";

    // When
    int finalPrice = UserSpecificDiscount.check(originalPrice, discount, userType);

    // Then
    System.out.println(finalPrice);
  }
}