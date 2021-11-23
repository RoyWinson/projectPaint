package fr.ensea.project2A;

import java.awt.*;
import java.awt.Color;

public class Circle extends Ellipse{

    public Circle( int px, int py, Color c){

        super(px,py, c);
        this.semiAxysX = 0;
        this.semiAxysY = 0;

    }

    public void setBoundingBox(int heightBB, int widthBB){
        super.setBoundingBox(heightBB, widthBB);
        this.semiAxysX = Math.min( widthBB/2, heightBB/2);
        this.semiAxysY = Math.min(widthBB/2, heightBB/2);
    }

    @Override
    public void setBoundingBox(Point first, Point second) {
        if (first.getX() < second.getX() & first.getY() < second.getY()) {
            super.origin = new Point(first.getX(), first.getY());
            Integer widthBB = (second.getX() - first.getX())/2;
            Integer heightBB = (second.getY() - first.getY())/2;
            this.semiAxysX = Math.max(widthBB/2, heightBB/2);
            this.semiAxysY = Math.max(widthBB/2, heightBB/2);
        } else if (first.getX() < second.getX() & first.getY() > second.getY()) {
            super.origin = new Point(first.getX(), second.getY());
            Integer widthBB = (second.getX() - first.getX())/2;
            Integer heightBB = (first.getY() - first.getY())/2;
            this.semiAxysX = Math.max(widthBB/2, heightBB/2);
            this.semiAxysY = Math.max(widthBB/2, heightBB/2);
        } else if (first.getX() > second.getX() & first.getY() < second.getY()) {
            super.origin = new Point(second.getX(), first.getY());
            Integer widthBB = (first.getX() - second.getX())/2;
            Integer heightBB = (second.getY() - first.getY())/2;
            this.semiAxysX= Math.max(widthBB/2, heightBB/2);
            this.semiAxysY= Math.max(widthBB/2, heightBB/2);
        } else if (first.getX() > second.getX() & first.getY() > second.getY()) {
            super.origin = new Point(second.getX(), second.getY());
            Integer widthBB = (first.getX() - second.getX())/2;
            Integer heightBB = (first.getY() - second.getY())/2;
            this.semiAxysX = Math.max(widthBB/2, heightBB/2);
            this.semiAxysY = Math.max(widthBB/2, heightBB/2);
        }
    }


   // public void draw(Graphics g) {}

    public int getSemiAxysX(){ return this.semiAxysX;}
    public int getSemiAxysY(){ return this.semiAxysY;}
    public void setSemiAxysX(Integer semiAxysX) {this.semiAxysX = semiAxysX;}

   @Override
    public String toString(){
       System.out.println("Rayon:" + this.getSemiAxysX()+ " Origin =(" + this.origin.getX() + "," + this.origin.getY() + ") couleur :" + this.getColor());
       return null;}


    static public void main(String[] args){
        Circle Circle1;
        Circle1 = new Circle(2,3,Color.CYAN);
        Circle1.setBoundingBox(2,3);
        Circle1.toString();

    }

}
