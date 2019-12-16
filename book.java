package laba1;

import java.lang.*;
public class book{
    private String color;
    private int page;


    public book() {
        color = "black";
        page = 10;
    }
    public book(int p) {
        color = "white";
        page = p;
    }
    public book(int p, String c) {
        color = c;
        page = p;
    }

    public int getPage() {
        return page;
    }
    public String getColor() {
        return color;
    }
}