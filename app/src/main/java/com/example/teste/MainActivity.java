package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            TextView textView1 = (TextView) findViewById(R.id.textView1);
            textView1.setText("Type: " + Build.TYPE +
                    "\n" + "Board: " +Build.BOARD +
                    "\n"+"Bootloarder: " +Build.BOOTLOADER +
                    "\n"+"Brand: "+Build.BRAND+
                    "\n"+"Device:"+Build.DEVICE);
        });
    }
}