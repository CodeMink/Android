package com.example.quizapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ScoringActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scoring);
		
		int i = 0;
		LinearLayout lView = new LinearLayout(this);
		setContentView(lView);
		RadioGroup r = (RadioGroup) findViewById(R.id.radioGroup1);
		
		if(r.getCheckedRadioButtonId() == 0)
			i++;
		r = (RadioGroup) findViewById(R.id.radioGroup2);
		if(r.getCheckedRadioButtonId() == 0)
			i++;
		r = (RadioGroup) findViewById(R.id.radioGroup3);
		if(r.getCheckedRadioButtonId() == 0)
			i++;
		
		

		TextView myText = new TextView(this);
		myText.setText(String.valueOf(i) + "/3");

		lView.addView(myText);

		setContentView(lView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scoring, menu);
		return true;
	}

}
