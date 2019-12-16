package laba1;

import java.lang.*;
public class testdog {
    public static void main(String[] args) {
        dog d1 = new dog("PanZapekan", 19);
        dog d2 = new dog("Nill", 15);
        dog d3 = new dog("Rikki");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}