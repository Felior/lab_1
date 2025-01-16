package mypkg;

import mypkg2.Second;

public class First {
    public static void main(String[] args) {
        Second second = new Second();
        System.out.println(second.getString());
    }
}