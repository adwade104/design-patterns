package com.wade.adam.patterns.structural.bridge.tp;

/*Acts as a bridge between concrete class circle and implementer classes
  Green Circle and Red Circle
 */
public interface DrawAPI {
    void drawCircle(int x, int y, int radius);
}
