package distance;

import java.lang.IllegalArgumentException;

/**
 * This is a class represents the velocity calculating in physics.
 * In velocity method, it takes three parameters, two points and the elapsedTime.
 * Points are created by Point3D class.
 * Throw exception if elapsedTime is 0.
 * Final return the velocity.
 */
public class Physics {
  /**
   * Create a static class method, which only belongs to the class itself but not instances of
   * class.
   */
  public static double velocity(Point3D one, Point3D two, double elapsedTime) {
    if (elapsedTime <= 0) {
      throw new IllegalArgumentException("Elapsed time should be greater than zero.");
    }
    double distance = one.distanceTo(two);
    return distance / elapsedTime;
  }
  
  /**
   * This is a main function to do some test print out.
   */
  public static void main(String[] args) {
    try {
      Point3D one = new Point3D();
      Point3D two = new Point3D(1,1,1);
      System.out.println("Displacement = " + one.distanceTo(two));
      double velocity = Physics.velocity(one, two, 0);
      System.out.println("Prof. Keith is on the move! His Velocity =" + velocity);
      velocity = Physics.velocity(one, two, 5);
      System.out.println("Velocity =" + velocity);
    }
    catch (IllegalArgumentException e) {
      System.out.println("Encountered an error: " + e.getMessage());
    }
  }
}

