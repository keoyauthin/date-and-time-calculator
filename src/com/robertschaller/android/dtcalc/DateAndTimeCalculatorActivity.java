package com.robertschaller.android.dtcalc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DateAndTimeCalculatorActivity extends Activity {
  
    public static TextView display;
  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        display = (TextView)findViewById( R.id.CalculatorDisplay );
    }
}