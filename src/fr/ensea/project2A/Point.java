package fr.ensea.project2A;



public class Point {

    // Variables
    int X;
    int Y;

    // constructor
    public Point() {
        X = 0;
        Y = 0;
    }

    // getter
    public int getX() {return X;}
    public int getY() {return Y;}

    // setter
    public void setX(int x) {this.X = X;}
    public void setY(int y) {this.Y = y;}

    // constructor
    public Point(int a, int b){
        X = a;
        Y = b;
    }
    @Override
    public String toString(){
        return "abscisse:" + this.X+" |ordonnée: "+ this.Y;
    }

    static public void main(String[] args){
        Point newPoint1 = new Point(3,4);
        Point newPoint2 = new Point(5,6);
        System.out.println(newPoint1.getX());
        System.out.println(newPoint1.getY());
        System.out.println(newPoint2.getX());
        System.out.println(newPoint2.getY());
        System.out.println(newPoint1);

    }

}
