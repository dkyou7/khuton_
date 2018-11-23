package com.example.ydk.khuthon;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;

public class DatePickActivity extends AppCompatActivity {

    CalendarView datePicker;
    Intent intent;
    private int tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_pick);

        Intent get = getIntent();
        tmp = get.getIntExtra("id",-1);
        datePicker = (CalendarView)findViewById(R.id.date_picker);
        intent = new Intent(getApplicationContext(), PackageDetailsActivity.class);

        datePicker.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                intent.putExtra("year", year);
                intent.putExtra("month", month+1);
                intent.putExtra("day", day);
                intent.putExtra("id",tmp);
                startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | intent.FLAG_ACTIVITY_SINGLE_TOP));
            }
        });
    }
}
