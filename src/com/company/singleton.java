package com.company;

public class singleton {
    private static singleton instance;
    public String value;

    public singleton(String value) {
        this.value = value;
    }
    public static singleton getInstance(String value) {
        if(instance==null)
        {
            instance = new singleton(value);
        }
        return instance;
    }
}
