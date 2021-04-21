package com.company;

public class calculator implements math {
    private int valueOne;
    private int valueTwo;
    private int value;

    public calculator(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;

    }

    public int getValue() {
        return valueOne+valueTwo;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }
    public int add(){
        return valueOne+valueTwo;
    }
    public int subtract(){
        return valueOne - valueTwo;
    }
    public int multiply(){
        return valueOne*valueTwo;
    }
    public int devide(){
        return  valueOne/valueTwo;
    }

}
