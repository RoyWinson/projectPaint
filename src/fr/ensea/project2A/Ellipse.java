package fr.ensea.project2A;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends TheFigure{

    protected int semiAxysX;
    protected int semiAxysY;

    public Ellipse ( int px, int py , Color c){
        super(c, new Point(px,py));
        setBoundingBox(0,0);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB){
        semiAxysX = heightBB/2;
        semiAxysY = widthBB/2;
    }

    @Override
    public void setBoundingBox(Point first, Point second) {
        if (first.getX() < second.getX() & first.getY() < second.getY()) {
            super.origin = new Point(first.getX(), first.getY());
            semiAxysX = (second.getX() - first.getX())/2;
            semiAxysY = (second.getY() - first.getY())/2;
        } else if (first.getX() < second.getX() & first.getY() > second.getY()) {
            super.origin = new Point(first.getX(), second.getY());
            semiAxysX = (second.getX() - first.getX())/2;
            semiAxysY = (first.getY() - first.getY())/2;
        } else if (first.getX() > second.getX() & first.getY() < second.getY()) {
            super.origin = new Point(second.getX(), first.getY());
            semiAxysX = (first.getX() - second.getX())/2;
            semiAxysY = (second.getY() - first.getY())/2;
        } else if (first.getX() > second.getX() & first.getY() > second.getY()) {
            super.origin = new Point(second.getX(), second.getY());
            semiAxysX = (first.getX() - second.getX())/2;
            semiAxysY = (first.getY() - second.getY())/2;
        }
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(origin.getX(), origin.getY(), semiAxysX*2, semiAxysY*2);
        g.fillOval(origin.getX(), origin.getY(), semiAxysX*2, semiAxysY*2);
    }

    //getter
    public int getSemiAxysX(){ return this.semiAxysX;}
    public int getSemiAxysY(){ return this.semiAxysY;}
    public double getSurface() {return this.semiAxysX*this.semiAxysY*Math.PI;}

    //setter
    public void setSemiAxysX(int semiAxysX) {this.semiAxysX = semiAxysX;}
    public void setSemiAxysY(int semiAxysY) {this.semiAxysY = semiAxysY;}

    @Override
    public void setColor(java.awt.Color color) {super.setColor(color);}

    @Override
    public Point getOrigin() {return super.getOrigin();}

    @Override
    public void setOrigin(Point origin) {super.setOrigin(origin);}

    @Override
    public java.awt.Color getColor() {return super.getColor();}

    @Override
    public String toString(){
        System.out.println("Length:" + this.getSemiAxysX()+" |Width: "+ this.getSemiAxysY() + " Origine=(" + this.origin.getX() + "," + this.origin.getY() + ") coulor :" + this.getColor());
        return null;}

    static public void main(String[] args){
        Ellipse Ellipse1;
        Ellipse1 = new Ellipse(2,3,Color.CYAN);
        Ellipse1.setBoundingBox(2,3);
        Ellipse1.toString();

    }

}
