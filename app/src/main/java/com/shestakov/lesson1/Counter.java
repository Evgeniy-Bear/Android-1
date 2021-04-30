package com.shestakov.lesson1;

import java.io.Serializable;

public class Counter implements Serializable {
    private int counter1 ;
    private int counter2;
    private int counter3 ;

    public Counter() {
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;

    }

    public int getCounter1() {
        return counter1;
    }

    public int getCounter2() {
        return counter2;
    }

    public int getCounter3() {
        return counter3;
    }

    public void incrementCounter1() {
        this.counter1++;
    }

    public void incrementCounter2() {
        this.counter2++;
    }

    public void incrementCounter3() {
        this.counter3++;
    }
}
