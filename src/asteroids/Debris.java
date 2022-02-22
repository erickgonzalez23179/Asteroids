
package asteroids;

import processing.core.PApplet;


public class Debris extends SpaceThing {

    public Debris(PApplet papp, float initX, float initY) {
        super(papp);
        locationX = initX;
        locationY = initY;
        size = 10;
    }


    public void draw() {
        super.draw();
        update();
        canvas.stroke(355,0,0);
        canvas.ellipse(locationX, locationY, size, size);
    }


    public void update() {
        frame += 1;
        if(frame > 10) {
            remove = true;
        }
    }

}
