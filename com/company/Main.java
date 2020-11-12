package com.company;

class A {
    public int i;
    protected int j;

    void setij(int x, int y){
        this.i = x;
        this.j = y;
    }
            
}

class B extends A{
    int total;
    void sum(){
        total = i+j;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        B subob = new B();
        subob.setij(10,12);
        subob.sum();
        System.out.println(subob.total);
    }
}
