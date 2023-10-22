package inheritance.A;

public class Box {
    public double l;
    public double h;
    public double w;

    public Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public Box(Box other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }

    public Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
}
