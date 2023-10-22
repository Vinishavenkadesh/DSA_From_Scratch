package inheritance.A;

public class BoxWeight extends Box {
    public double weight;


    public BoxWeight(double weight) {
        this.weight = weight;
    }
    
    public BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other) {
    }

}
