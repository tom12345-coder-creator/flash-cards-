package com.example.cards;

public class Questions {
    private int mTextId;
    private boolean mAnswer;
        //create the constructor
    public Questions(int textId, boolean answer){
        mTextId = textId;
        mAnswer = answer;
    }
        //create both the getter and the setter for the constructor
    public void setTextId(int textId) {
        mTextId = textId;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }


    public int getTextId() {
        return mTextId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

}
