package com.londonappbrewery.destini;

public class Story {
    public int getStoryId() {
        return mStoryId;
    }

    public void setStoryId(int storyId) {
        mStoryId = storyId;
    }

    public int getButtonTopId() {
        return mButtonTopId;
    }

    public void setButtonTopId(int buttonTopId) {
        mButtonTopId = buttonTopId;
    }

    public int getButtonBottomId() {
        return mButtonBottomId;
    }

    public void setButtonBottomId(int buttonBottomId) {
        mButtonBottomId = buttonBottomId;
    }

    public int getChoiceAStoryId() {
        return mChoiceAStoryId;
    }

    public void setChoiceAStoryId(int choiceAStoryId) {
        mChoiceAStoryId = choiceAStoryId;
    }

    public int getChoiceBStoryId() {
        return mChoiceBStoryId;
    }

    public void setChoiceBStoryId(int choiceBStoryId) {
        mChoiceBStoryId = choiceBStoryId;
    }

    public boolean isEnd() {
        return mEnd;
    }

    public void setEnd(boolean end) {
        mEnd = end;
    }

    private int mStoryId;
    private int mButtonTopId;
    private int mButtonBottomId;
    private int mChoiceAStoryId;
    private int mChoiceBStoryId;
    private boolean mEnd;


    public Story(int storyResourceId, int buttonTopRecourceId, int buttonBottomResoucreId, int choiceAResultId, int choiceBResultId, boolean end) {
        mStoryId = storyResourceId;
        mButtonTopId = buttonTopRecourceId;
        mButtonBottomId = buttonBottomResoucreId;
        mChoiceAStoryId = choiceAResultId;
        mChoiceBStoryId = choiceBResultId;
        mEnd = end;
    }
}
