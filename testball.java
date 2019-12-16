package laba1;

import java.lang.*;
public class testball {
    public static void main(String[] args) {

        ball b1 = new ball(2.5, "green");
        System.out.println(" Weight is " +b1.getWeight()

                +" Color is " + b1.getColor());

        ball b2 = new ball(4.0);
        System.out.println(" Weight is " +b2.getWeight()
                + " Color is " + b2.getColor());

        ball b3 = new ball (7, "black");
        System.out.println(" Weight is " +b3.getWeight()
                + " Color is " + b3.getColor());
    }
}