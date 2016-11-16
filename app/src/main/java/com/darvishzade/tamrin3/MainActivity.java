package com.darvishzade.tamrin3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button no1 = (Button) findViewById(R.id.btnsignin);
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this , signin.class);
                startActivity(intent1);
            }
        });
        Button no2 = (Button) findViewById(R.id.btnsignup);
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this , signup.class);
                startActivity(intent1);
            }
        });

    }
}
