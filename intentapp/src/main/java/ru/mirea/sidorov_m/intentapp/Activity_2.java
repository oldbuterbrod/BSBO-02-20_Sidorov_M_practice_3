package ru.mirea.sidorov_m.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String date = getIntent().getStringExtra("date");
        String text = "Квадрат значения моего номера по списку в группе составляет 529, а текущее время: " + date;

        TextView view = (TextView) findViewById(R.id.textView);
        view.setText(text);
    }
}
