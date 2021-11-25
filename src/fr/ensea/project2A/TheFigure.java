package fr.ensea.project2A;

import java.awt.*;


public abstract class TheFigure{

    public java.awt.Color color;
    public Point origin;

    // constructor
    public TheFigure( java.awt.Color c, Point p){
        color = c;
        origin = p;
    }

    public abstract void setBoundingBox(int heightBB, int widthBB);
    public abstract void setBoundingBox(Point first, Point second);
    public abstract void draw(Graphics g);

    // getter
    public java.awt.Color getColor() {return this.color;}
    public Point getOrigin() {return this.origin;}

    // setter
    public void setColor(Color color) {this.color = color;}
    public void setOrigin(Point origin) {this.origin = origin;}

    @Override
    public String toString(){
        System.out.println( "color :" + this.getColor()+" |origin: "+ this.getOrigin());
    return null;
    }


}
