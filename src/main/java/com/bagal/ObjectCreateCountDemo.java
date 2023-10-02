package com.bagal;

import com.bagal.demo.sorting.DemoSorting;

public class ObjectCreateCountDemo {
    public static void main(String[] args) {
        DemoSorting demo1 = new DemoSorting();
        DemoSorting demo2= new DemoSorting();
        DemoSorting demo3 = new DemoSorting();
        DemoSorting demo4 = new DemoSorting();
        DemoSorting demo5 = new DemoSorting();
        DemoSorting demo6 = new DemoSorting();

    }
}

class Demo{
    static int cnt=0;
    public Demo(){
        cnt++;
    }
    public int getCount(){
        return cnt;
    }
}

