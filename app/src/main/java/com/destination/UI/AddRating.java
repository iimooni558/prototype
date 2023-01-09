package com.destination.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.destination.R;

import java.util.Calendar;

public class AddRating extends AppCompatActivity {

    EditText date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_rating);


        date            = findViewById(R.id.editText3);

        date.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                {
                    Calendar mcurrentTime = Calendar.getInstance();
                    int Day = mcurrentTime.get(Calendar.DAY_OF_MONTH);
                    final int Month = mcurrentTime.get(Calendar.MONTH);
                    int Year = mcurrentTime.get(Calendar.YEAR);

                    DatePickerDialog mTimePicker = new DatePickerDialog(AddRating.this, new DatePickerDialog.OnDateSetListener() {
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

    }

    public void Add(View view) {

    }
}