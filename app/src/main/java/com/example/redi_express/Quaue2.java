package com.example.redi_express;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* Губанова Марина
04.07.2023*/
public class Quaue2 extends AppCompatActivity {//Второй экран

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quaue2);
    }
    //Пропускаем все информационные экраны
    public void skip(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    //Переходим к следующему информационному экрану
    public void next(View view) {
        Intent intent = new Intent(this, Quaue3.class);
        startActivity(intent);
    }
}