package com.company;

public class Main {

    public static void main(String[] args) {
	singleton singleton1 = singleton.getInstance("numer1");
    singleton singleton2 = singleton.getInstance("numer2");
    singleton singleton3 = singleton.getInstance("numer3");
    System.out.println(singleton3.value);
    }
}
