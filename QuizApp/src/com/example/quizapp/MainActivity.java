package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private int i = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void displayTest(View view)
	{
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/12zt1v2AkYCXcgvrRt3PL_iyRffp5vWukBNlET1dDUCE/edit?usp=sharing"));
		startActivity(intent);
	}
	
	public void displayQuestions(View view)
	{
		displayTest(view);
		
		setContentView(R.layout.quest1);
	}
	
	public void displayQuestions2(View view)
	{
		setContentView(R.layout.quest2);
	}
	
	public void displayQuestions3(View view)
	{
		setContentView(R.layout.quest3);
	}
	
	public void calculateQuestions(View view)
	{
		RadioGroup r = (RadioGroup) findViewById(R.id.radioGroup1);
		if(r.getCheckedRadioButtonId() == R.id.radio0)
			i++;
		
		displayQuestions2(view);
	}
	
	public void calculateQuestions2(View view)
	{
		RadioGroup r = (RadioGroup) findViewById(R.id.radioGroup2);
		if(r.getCheckedRadioButtonId() == R.id.radio3)
			i++;
		
		displayQuestions3(view);
	}
	
	public void calculateQuestions3(View view)
	{
		//setContentView(R.layout.quest3);
		RadioGroup r = (RadioGroup) findViewById(R.id.radioGroup3);
		if(r.getCheckedRadioButtonId() == R.id.radio6)
			i++;
		
		displayScore(view);
	}
	
	public void displayScore(View view)
	{
		LinearLayout lView = new LinearLayout(this);
		
		TextView myText = new TextView(this);
		myText.setText(String.valueOf(i) + "/3");
		
		lView.addView(myText);
		setContentView(lView);
	}
	
	public void testResults(View view)
	{
		
//		int i = 0;
//		
//		RadioGroup r = (RadioGroup) findViewById(R.id.radioGroup1);
//		
//		if(r == null)
//		{
//			LinearLayout lView = new LinearLayout(this);
//			TextView myText = new TextView(this);
//			myText.setText("something's wrong");
//
//			lView.addView(myText);
//
//			setContentView(lView);
//			return;
//		}
//		
//		if(r.getCheckedRadioButtonId() == 0)
//			i++;
//		r = (RadioGroup) findViewById(R.id.radioGroup2);
//		if(r.getCheckedRadioButtonId() == 0)
//			i++;
//		r = (RadioGroup) findViewById(R.id.radioGroup3);
//		if(r.getCheckedRadioButtonId() == 0)
//			i++;
//		
//		LinearLayout lView = new LinearLayout(this);
//
//		TextView myText = new TextView(this);
//		myText.setText(String.valueOf(i) + "/3");
//
//		lView.addView(myText);
//
//		setContentView(lView);
		
		Intent intent = new Intent(this, ScoringActivity.class);
		
		startActivity(intent);
	}

}
