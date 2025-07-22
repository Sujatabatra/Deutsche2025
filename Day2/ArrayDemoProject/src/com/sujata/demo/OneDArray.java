package com.sujata.demo;

public class OneDArray {

    private int arr[];
    private int total;

    public OneDArray(int total){
        this.total=total;
        arr=new int[total];
    }

    public void input(int value,int index){
        arr[index]=value;
    }

    public int[] getArr() {
        return arr;
    }

}
