package com.example.demo;

public class calculator {
    int a;
    int b;
    public calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int cal(){
        if(a< b) return -1;
        else if(a == b) return a;
        else return a+b;
    }
}
