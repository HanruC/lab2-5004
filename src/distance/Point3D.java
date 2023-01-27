package distance;

import org.jetbrains.annotations.NotNull;

/**
 * This class represents 3D points.
 */
public class Point3D {
  private final int x;
  private final int y;
  private final int z;
  
  /**
   * This is a default constructor.
   */
  public Point3D() {
    this.x = 0;
    this.y = 0;
    this.z = 0;
  }
  
  /**
   *Construct a 3D point and initialize it to its given x, y, z.
   * @param x point x.
   * @param y point y.
   * @param z point z.
   */
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  /**
   * Get the point X.
   * @return point x.
   */
  public int getX() {
    return x;
  }
  
  /**
   * Get the point Y.
   * @return point y.
   */
  public int getY() {
    return y;
  }
  
  /**
   * Get the point Z.
   * @return point z.
   */
  public int getZ() {
    return z;
  }
  
  /**
   * Method of get the distance for 3D point.
   * @param other The another point.
   * @return the distance.
   */
  public double distanceTo(Point3D other) {
    int d1 = this.x - other.x;
    int d2 = this.y - other.y;
    int d3 = this.z - other.z;
    return Math.sqrt((d1 * d1) + (d2 * d2) + (d3 * d3));
  }
  
  /**
   * Check if two points are equal.
   * @param object the another point.
   * @return True of False.
   */
  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof Point3D)) {
      return false;
    }
    Point3D other = (Point3D) object;
    if (this.hashCode() != other.hashCode()) {
      return false;
    }
    return x == other.x && y == other.y && z == other.z;
  }
  
  /**
   * hashCode method to check if two points' hash are same.
   * @return result.
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + y;
    result = prime * result + z;
    return result;
  }
}
  
  
    
  

