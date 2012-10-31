package com.example.my_first_project;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;


public class DisplayMessageActivity extends Activity 
{

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        //get the intent that created this activity & grab the incoming message from it
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        

        // Create the text view to show the income message
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Set the text view as the activity layout
        setContentView(textView);
    }

}
