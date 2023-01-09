package com.destination.UI;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.destination.R;

import java.util.Calendar;

public class AddEvent extends AppCompatActivity {

    EditText date, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        date        = findViewById(R.id.editText3);
        time        = findViewById(R.id.editText4);

        date.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                {
                    Calendar mcurrentTime = Calendar.getInstance();
                    int Day = mcurrentTime.get(Calendar.DAY_OF_MONTH);
                    final int Month = mcurrentTime.get(Calendar.MONTH);
                    int Year = mcurrentTime.get(Calendar.YEAR);

                    DatePickerDialog mTimePicker = new DatePickerDialog(AddEvent.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            int Month = month +1 ;
                            date.setText("" + year + "/" + Month + "/" + dayOfMonth);
                        }
                    }, Year, Month, Day);

                    mTimePicker.show();
                }
            }
        });


        time.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b)
                {
                    Calendar mcurrentTime = Calendar.getInstance();
                    int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                    int minute = mcurrentTime.get(Calendar.MINUTE);

                    TimePickerDialog mTimePicker;
                    mTimePicker = new TimePickerDialog(AddEvent.this, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                            time.setText( selectedHour + ":" + selectedMinute);
                        }
                    }, hour, minute, false);
                    mTimePicker.setTitle("Select Time");
                    mTimePicker.show();
                }
            }
        });


    }

    public void Add(View view) {

    }
}