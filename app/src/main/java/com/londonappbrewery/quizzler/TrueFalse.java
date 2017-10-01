package com.londonappbrewery.quizzler;

/**
 * Created by RyanZhu on 9/30/17.
 */

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int mQuestionId, boolean mAnswer) {
        this.mQuestionId = mQuestionId;
        this.mAnswer = mAnswer;
    }

    public int getmQuestionId() {
        return mQuestionId;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }
}
