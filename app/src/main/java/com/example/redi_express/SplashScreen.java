package com.example.redi_express;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
/* Губанова Марина
04.07.2023*/
public class SplashScreen extends AppCompatActivity { //Класс начального всплывающего окна
Timer timer; // Переменая для продолжительности всплывающего окна
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Quaue1.class);//По истечению времени переходим к следующему активити
                startActivity(intent);
                finish();
            }
        },1000);// Устанавливаем продолжительность в 1 секунду
    }
}