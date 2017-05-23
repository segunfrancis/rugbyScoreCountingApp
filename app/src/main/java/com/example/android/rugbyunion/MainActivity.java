package com.example.android.rugbyunion;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // This method starts the chronometer
    public void startChronometer(View view) {
        Chronometer chrono = (Chronometer) findViewById(R.id.chronometer);
        chrono.start();
        chrono.setBase(SystemClock.elapsedRealtime());
    }

    // This method stops the chronometer
    public void stopChronometer(View view) {
        ((Chronometer) findViewById(R.id.chronometer)).stop();
    }


    int teamAScore = 0;
    int teamBScore = 0;
    int teamAYellowCard = 0;
    int teamBYellowCard = 0;
    int teamARedCard = 0;
    int teamBRedCard = 0;

    // Increases the score for team A by 5
    public void tryTeamA(View view) {
        teamAScore += 5;
        displayA(teamAScore);
    }

    // Increases the score for team A by 2
    public void conversionTeamA(View view) {
        teamAScore += 2;
        displayA(teamAScore);
    }

    // Increases the score for team A by 3
    public void penaltyTeamA(View view) {
        teamAScore += 3;
        displayA(teamAScore);
    }

    // Increases the score for team A by 3
    public void dropGoalTeamA(View view) {
        teamAScore += 3;
        displayA(teamAScore);
    }

    // Increases the score for team B by 5
    public void tryTeamB(View view) {
        teamBScore += 5;
        displayB(teamBScore);
    }

    // Increases the score for team B by 2
    public void conversionTeamB(View view) {
        teamBScore += 2;
        displayB(teamBScore);
    }

    // Increases the score for team B by 3
    public void penaltyTeamB(View view) {
        teamBScore += 3;
        displayB(teamBScore);
    }

    // Increases the score for team B by 3
    public void dropGoalTeamB(View view) {
        teamBScore += 3;
        displayB(teamBScore);
    }

    // Increases yellow card of team A by 1
    public void yellowCardTeamA(View view) {
        teamAYellowCard += 1;
        displayAYellow(teamAYellowCard);
    }

    // Increases yellow card of team B by 1
    public void yellowCardTeamB(View view) {
        teamBYellowCard += 1;
        displayBYellow(teamBYellowCard);
    }

    // Increases red card of team A by 1
    public void redCardTeamA(View view) {
        teamARedCard += 1;
        displayARed(teamARedCard);
    }

    // Increases red card of team B by 1
    public void redCardTeamB(View view) {
        teamBRedCard += 1;
        displayBRed(teamBRedCard);
    }

    // Resets scores of both teams to zero
    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        teamAYellowCard = 0;
        teamBYellowCard = 0;
        teamARedCard = 0;
        teamBRedCard = 0;
        displayA(teamAScore);
        displayB(teamBScore);
        displayAYellow(teamAYellowCard);
        displayBYellow(teamBYellowCard);
        displayARed(teamARedCard);
        displayBRed(teamBRedCard);
    }

    // this method displays the yellow cards for team a
    private void displayAYellow(int number) {
        TextView yellowTextView = (TextView) findViewById(R.id.yellow_card_a);
        yellowTextView.setText(String.valueOf(number));
    }

    // this method displays the yellow cards for team b
    private void displayBYellow(int number) {
        TextView yellowTextView = (TextView) findViewById(R.id.yellow_card_b);
        yellowTextView.setText(String.valueOf(number));
    }

    // this method displays the red cards for team a
    private void displayARed(int number) {
        TextView redTextView = (TextView) findViewById(R.id.red_card_a);
        redTextView.setText(String.valueOf(number));
    }

    // this method displays the red cards for team a
    private void displayBRed(int number) {
        TextView redTextView = (TextView) findViewById(R.id.red_card_b);
        redTextView.setText(String.valueOf(number));
    }
    // this method displays the score for team a
    private void displayA(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_text_view);
        scoreTextView.setText("" + number);
    }

    // this method displays the score for team b
    private void displayB(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_text_view);
        scoreTextView.setText(String.valueOf(number));
    }

}
