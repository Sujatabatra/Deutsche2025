package com.sujata.generics;

public class Person {
    private int pId;
    private String pName;
    private int pAge;

    public Person(){

    }

    public Person(int pId, String pName, int pAge) {
        this.pId = pId;
        this.pName = pName;
        this.pAge = pAge;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }
}
