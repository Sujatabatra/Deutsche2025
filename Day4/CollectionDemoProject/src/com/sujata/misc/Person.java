package com.sujata.misc;

import java.util.Objects;

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
/*
1. when two objects are meaningfully equal , then their hashcode also needs to be same
2. when two objects hashcodes are same, they might not be meaningfully equal
 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pId == person.pId && pAge == person.pAge && Objects.equals(pName, person.pName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pId, pName, pAge);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pAge=" + pAge +
                '}';
    }
}
