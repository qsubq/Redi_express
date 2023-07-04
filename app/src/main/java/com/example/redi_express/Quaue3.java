package com.example.redi_express;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* Губанова Марина
04.07.2023*/
public class Quaue3 extends AppCompatActivity {//Третий экран

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quaue3);
    }
//Переход к экрану входа
    public void SignIn(View view) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
//Переход к экрану регистрации
    public void SignUp(View view) {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}