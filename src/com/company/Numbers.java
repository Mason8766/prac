package com.company;

public class Numbers implements math {
    private int value;
    private String word;

    public Numbers(int value, String word) {
        this.value = value;
        this.word = word;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
