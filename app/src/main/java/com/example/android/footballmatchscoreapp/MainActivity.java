
package com.example.android.footballmatchscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamOne =0;
    int addOffsideTeamOne =0;
    int addCornerTeamOne =0;
    int scoreTeamTwo =0;
    int addOffsideTeamTwo =0;
    int addCornerTeamTwo =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamOne (View v){
        scoreTeamOne = scoreTeamOne +1;
        displayForTeamOne(scoreTeamOne);
    }
    public void displayForTeamOne (int score){
        TextView scoreView =(TextView) findViewById(R.id.team_one_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addOffsidesForTeamOne (View v){
        addOffsideTeamOne = addOffsideTeamOne +1;
        displayOffsideForTeamOne(addOffsideTeamOne);
    }

    public void displayOffsideForTeamOne (int score){
        TextView scoreView =(TextView) findViewById(R.id.team_one_Offsides);
        scoreView.setText(String.valueOf(score));

    }

    public void addCornersForTeamOne (View v){
        addCornerTeamOne = addCornerTeamOne +1;
        displayCornerForTeamOne(addCornerTeamOne);
    }

    public void displayCornerForTeamOne (int score){
        TextView scoreView =(TextView) findViewById(R.id.team_one_Corners);
        scoreView.setText(String.valueOf(score));

    }

    public void addOneForTeamTwo (View v){
        scoreTeamTwo = scoreTeamTwo +1;
        displayForTeamTwo(scoreTeamTwo);
    }
    public void displayForTeamTwo (int score){
        TextView scoreView =(TextView) findViewById(R.id.team_Two_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addOffsidesForTeamTwo (View v){
        addOffsideTeamTwo = addOffsideTeamTwo +1;
        displayOffsideForTeamTwo(addOffsideTeamTwo);
    }

    public void displayOffsideForTeamTwo (int score){
        TextView scoreView =(TextView) findViewById(R.id.team_two_Offsides);
        scoreView.setText(String.valueOf(score));

    }

    public void addCornersForTeamTwo (View v){
        addCornerTeamTwo = addCornerTeamTwo +1;
        displayCornerForTeamTwo(addCornerTeamTwo);
    }

    public void displayCornerForTeamTwo (int score){
        TextView scoreView =(TextView) findViewById(R.id.team_two_Corners);
        scoreView.setText(String.valueOf(score));

    }



    public void resetSore (View v){
        scoreTeamOne=0;
        scoreTeamTwo=0;
        addOffsideTeamOne=0;
        addCornerTeamOne=0;
        addOffsideTeamTwo=0;
        addCornerTeamTwo=0;
        displayCornerForTeamOne(addCornerTeamOne);
        displayOffsideForTeamOne(addOffsideTeamOne);
        displayCornerForTeamTwo(addCornerTeamTwo);
        displayOffsideForTeamTwo(addOffsideTeamTwo);
        displayForTeamOne(scoreTeamOne);
        displayForTeamTwo(scoreTeamTwo);

    }








}
