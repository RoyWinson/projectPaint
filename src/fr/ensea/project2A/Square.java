package fr.ensea.project2A;

import java.awt.*;
import java.awt.Color;

public class Square extends Rectangle{

    public Square( int px, int py, Color c){
        super(c, px,py);
        setBoundingBox(0,0);
    }

    public void setBoundingBox(Integer heightBB, Integer widthBB) {
        super.setBoundingBox(heightBB, widthBB);
        length = Math.min(heightBB, widthBB);
        width = Math.min(heightBB, widthBB);
    }

    // Methods
    @Override
    public void setBoundingBox(Point first, Point second) {
        if (first.getX() < second.getX() & first.getY() < second.getY()) {
            super.origin = new Point(first.getX(), first.getY());
            int heightBB = (second.getX() - first.getX());
            int widthBB = (second.getY()-first.getY());
            length = Math.min(heightBB, widthBB);
            width = Math.min(heightBB, widthBB);
        } else if (first.getX() < second.getX() & first.getY() > second.getY()) {
            super.origin = new Point(first.getX(), second.getY());
            int heightBB = (second.getX() - first.getX());
            int widthBB = (first.getY() - first.getY());
            length = Math.max(heightBB, widthBB);
            width = Math.max(heightBB, widthBB);
        } else if (first.getX() > second.getX() & first.getY() < second.getY()) {
            super.origin = new Point(second.getX(), first.getY());
            int heightBB = (first.getX() - second.getX());
            int widthBB = (second.getY() - first.getY());
            length = Math.max(heightBB, widthBB);
            width = Math.max(heightBB, widthBB);
        } else if (first.getX() > second.getX() & first.getY() > second.getY()) {
            super.origin = new Point(second.getX(), second.getY());
            int heightBB = (first.getX() - second.getX());
            int widthBB = (first.getY() - second.getY());
            length = Math.max(heightBB, widthBB);
            width = Math.max(heightBB, widthBB);
        }
    }



    //public void draw(Graphics g) {}

    //getter

    public int getLength(){ return this.length;}
    public int getWidth(){ return this.width;}

    //setter
    public void setLength(int length) {this.length = length;}

    @Override

    public String toString(){
        System.out.println("Length:" + this.getLength()+" |width: "+ this.getWidth() + " Origin =(" + this.origin.getX() + "," + this.origin.getY() + ")  color :" + this.getColor());
        return null;}


    static public void main(String[] args){
        Square Square1;
        Square1 = new Square(2,3,Color.blue);
        Square1.setBoundingBox(2,3);
        Square1.toString();

    }
}
