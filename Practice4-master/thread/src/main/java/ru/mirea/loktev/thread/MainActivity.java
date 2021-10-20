package ru.mirea.loktev.thread;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView_average;
    String average;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_average = findViewById(R.id.text_lessons_ave);
    }


    public void onClickCalculate(View view) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                average = String.valueOf((28.0*2.0+2.0)/30.0);
                textView_average.setText(average);
            }
        };

        textView_average.post(runnable);

    }
}