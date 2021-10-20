package ru.mirea.loktev.multi_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        Intent toSecond = new Intent(this, SecondActivity.class);
        toSecond.putExtra("key", "MIREA - ФАМИЛИЯ ИМЯ ОТЧЕСТВО СТУДЕНТА");
        startActivity(toSecond);
    }
}