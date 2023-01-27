package distance;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class Point3DTest {
  private Point3D A;
  private Point3D B;
  private Point3D C;
  /**
   * Set up three examples.
   */
  @Before
  public void setUp() {
    A = new Point3D(1, 2, 3);
    B = new Point3D(5,6,7);
    C = new Point3D(1,2,3);
  }
  
  /**
   * Test get X.
   */
  @Test
  public void testGetX() {
    assertEquals(1, A.getX());
    assertEquals(5, B.getX());
    assertEquals(1, C.getX());
  }
  
  /**
   * Test get Y.
   */
  @Test
  public void testGetY() {
    assertEquals(2, A.getY());
    assertEquals(6, B.getY());
    assertEquals(2, C.getY());
  }
  
  /**
   * Test get Z.
   */
  @Test
  public void testGetZ() {
    assertEquals(3, A.getZ());
    assertEquals(7, B.getZ());
    assertEquals(3, C.getZ());
  }
  
  /**
   * Test to get the distance.
   */
  @Test
  public void testDistanceTo() {
    double expectedDistance = Math.sqrt(48);
    double actualDistance = A.distanceTo(B);
    assertEquals(expectedDistance, actualDistance, 0.01);
  }
  
  /**
   * Test if equal.
   */
  @Test
  public void testEquals() {
    assertTrue(A.equals(C));
    assertFalse(A.equals(B));
  }
}