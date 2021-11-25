package fr.ensea.project2A;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends TheFigure{ // Connection with TheFigure class

    // Variables
    protected int length;
    protected int width;

    // constructor
    public Rectangle(Color c, int px, int py){

        super(c, new Point(px,py)); // va chercher au fichier mere ici TheFigure puis l'origin x et y
        setBoundingBox(0,0);
        }

    // Methods
    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
       length = widthBB;
       width = heightBB;
    }


    @Override
    public void setBoundingBox(Point first, Point second) {
        if (first.getX() < second.getX() & first.getY() < second.getY()) {
            super.origin = new Point(first.getX(), first.getY());
            width = (first.getX() - first.getX());
            length = (second.getY() - first.getY());
        } else if (first.getX() < second.getX() & first.getY() > second.getY()) {
            super.origin = new Point(first.getX(), second.getY());
            width = (second.getX() - first.getX());
            length = (first.getY() - first.getY());
        } else if (first.getX() > second.getX() & first.getY() < second.getY()) {
            super.origin = new Point(second.getX(), first.getY());
            width = (first.getX() - second.getX());
            length = (second.getY() - first.getY());
        } else if (first.getX() > second.getX() & first.getY() > second.getY()) {
            super.origin = new Point(second.getX(), second.getY());
            width = (first.getX() - second.getX());
            length = (first.getY() - second.getY());
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(origin.getX(), origin.getY(), width, length);
        g.fillRect(origin.getX(), origin.getY(), width, length);
    }
    //getter
    public int getSurface() {return this.length*this.width;}
    public int getPerimeter() {return 2*this.length + 2*this.width ;}
    public int getLength() {return this.length;}
    public int getWidth(){ return this.width;}

    //setter
    public void setLength(int length) {this.length = length;}
    public void setWidth(int width) {this.width = width;}

    @Override
    public void setColor(java.awt.Color color) {super.setColor(color);}

    @Override
    public java.awt.Color getColor() {return super.getColor();}

    @Override
    public void setOrigin(Point origin) {super.setOrigin(origin);}

    @Override
    public Point getOrigin() {return super.getOrigin();}

    @Override
    public String toString(){
        System.out.println("Length:" + this.getLength()+" |Width: "+ this.getWidth() + " Origin =(" + this.origin.getX() + ";" + this.origin.getY() +") Color :" + this.getColor());
        return null;}

    static public void main(String[] args){
        Rectangle rectangle;
        rectangle = new Rectangle(Color.black,5,10);
        rectangle.setBoundingBox(2,3);
        rectangle.toString();

    }
}
