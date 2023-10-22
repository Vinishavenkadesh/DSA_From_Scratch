package inheritance.B;

import inheritance.A.Box;
import inheritance.A.BoxWeight;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.w + " " + box.h);
         
        BoxWeight box1 = new BoxWeight(4);
          System.out.println(box1.l + " " + box1.weight);

        // BoxWeight box2 = new BoxWeight(1,2,3,4);

        Box box4 = new Box(12, 35, 56);
        // BoxWeight box5 = new BoxWeight(box);// => this gives error 
        //because parent class should be given in reference side and the child class should be used as the constructor 
        // System.out.println( box5.h);


        // Box box3 = new BoxWeight(2, 3, 5, 10);
        // System.out.println(box3.w);

        Box box6 = new BoxWeight(box1);// this can be qiven because her box6-variables only get accessed and the boxweight cannot get accessed.
        // BoxWeight box7 = new Box(box1);// this can be qive an error because bexWeightla irukra width Box() => constructorla irukathu

        
    }
}
