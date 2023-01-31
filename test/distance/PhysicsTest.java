package distance;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * This is a Test class to test physics.
 * Assigning one and two from Point3D class.
 */
public class PhysicsTest {
  private Point3D one;
  private Point3D two;
  
  /**
   * Set up two points example.
   */
  @Before
  public void setUp() {
    one = new Point3D(1,2,3);
    two = new Point3D(4,5,6);
  }
  
  /**
   * Test velocity with valid elapsed time.
   */
  @Test
  public void testVelocity() {
    double elapsedTime = 2;
    double expectedVel = (one.distanceTo(two)) / elapsedTime;
    assertEquals(expectedVel, Physics.velocity(one, two, elapsedTime), 0.01);
  }
  
  /**
   * Test velocity with invalid elapsed time.
   * Finally, will throw exception.
   */
  @Test (expected = IllegalArgumentException.class)
  public void testVelocityInvalidCase() {
    double elapsedTime = 0;
    Physics.velocity(one, two, elapsedTime);
  }
}