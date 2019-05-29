package com.bulana.pickerfortime;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView timeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeTextView = findViewById(R.id.time);
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),"timePicker");
    }

    public void processTimePickerResult(TimePicker view, int hourOfDay, int minute) {
        String hour = Integer.toString(hourOfDay);
        String CurrentMinute = Integer.toString(minute);
        String timeMessage = "Time " + hour + ":" + CurrentMinute;
        timeTextView.setText(timeMessage);
        Toast.makeText(this, timeMessage, Toast.LENGTH_SHORT).show();
    }
}
