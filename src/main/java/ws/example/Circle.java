package ws.example;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * A circle.
 * @version: $Id$
 * @author Roman Mazur (mailto: mazur.roman@gmail.com)
 */
@XmlElement
public class Circle {

  /** Coordinates and radius. */
  private float x, y, r;

  
  /**
   * @return the x
   */
  @XmlElement
  public float getX() { return x; }
  /**
   * @return the y
   */
  @XmlElement
  public float getY() { return y; }
  /**
   * @return the r
   */
  @XmlElement
  public float getR() { return r; }
  /**
   * @param x the x to set
   */
  public void setX(final float x) { this.x = x; }
  /**
   * @param y the y to set
   */
  public void setY(final float y) { this.y = y; }
  /**
   * @param r the r to set
   */
  public void setR(final float r) { this.r = r; }
  
}
