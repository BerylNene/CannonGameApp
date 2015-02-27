package com.example.cannongameapp;

import android.content.Context;
import android.content.SharedPreferences;


public class SharedPreference {

	protected static SharedPreferences highestScore_score_saved;
	protected static final String HIGHESTSCORE = "highestScore";
	protected int highestScore = 0;

	public SharedPreference() {
		super();
	}
	public void addHighestScore(Context context, int score) {
		highestScore_score_saved = context.getSharedPreferences(HIGHESTSCORE, context.MODE_PRIVATE);
		SharedPreferences.Editor preferencesEditor = highestScore_score_saved.edit();
		preferencesEditor.putInt("HighestScore", score);
		preferencesEditor.apply();

	}
	
	public int getHighestScore(Context context){
		   
		highestScore_score_saved = context.getSharedPreferences(HIGHESTSCORE, Context.MODE_PRIVATE);
		   highestScore = highestScore_score_saved.getInt("HighestScore", 0);
		   return highestScore;
		   
	   }

}