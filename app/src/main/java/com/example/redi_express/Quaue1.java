package com.example.redi_express;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/* Губанова Марина
04.07.2023*/
public class Quaue1 extends AppCompatActivity {//Первый экран

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quaue1);
    }
//Пропускаем все информационные экраны
    public void skip(View view) {
        Intent skip = new Intent(this, MainActivity.class);
        startActivity(skip);

    }
//Переходим к следующему информационному экрану
    public void next(View view) {
        Intent next = new Intent(this, Quaue2.class);
        startActivity(next);
    }
}