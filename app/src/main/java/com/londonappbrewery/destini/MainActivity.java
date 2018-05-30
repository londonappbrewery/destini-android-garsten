package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryId;

    private Story[] mStoryArray = new Story[] {
            new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 2, 1, false ),
            new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 2, 3, false ),
            new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 5, 4, false ),
            new Story(R.string.T4_End, 0, 0, 0, 0, true),
            new Story(R.string.T5_End, 0, 0, 0, 0, true),
            new Story(R.string.T6_End, 0, 0, 0, 0, true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            mStoryId = savedInstanceState.getInt("StoryKey");
        } else {
            mStoryId = 0;
        }

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressStory("Top");
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressStory("Bottom");
            }
        });
    }

    private void progressStory(String buttonPressed) {
        if (buttonPressed == "Top") {
            mStoryId = mStoryArray[mStoryId].getChoiceAStoryId();
        } else {
            mStoryId = mStoryArray[mStoryId].getChoiceBStoryId();
        }

        if (mStoryArray[mStoryId].isEnd() == false) {
            // the story continues
            mStoryView.setText(mStoryArray[mStoryId].getStoryId());
            mButtonTop.setText(mStoryArray[mStoryId].getButtonTopId());
            mButtonBottom.setText(mStoryArray[mStoryId].getButtonBottomId());
        } else {
            // the story ends
            mStoryView.setText(mStoryArray[mStoryId].getStoryId());
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
        Log.d("testing", "progressing story with id: "+mStoryArray[mStoryId].getStoryId());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("StoryKey", mStoryId);

    }
}
