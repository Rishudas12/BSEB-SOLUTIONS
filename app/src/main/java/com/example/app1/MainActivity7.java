package com.example.app1;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    private Button button90;
    private Button button91;
    private Button button92;
    private Button button93;
    private Button button95;
    private Button button96;
    private Button button97;
    private Button button98;
    private Button button99;
    private Button button94;
    private Button button100;
    private Button button101;
    private Button button102;
    private Button button103;
    private Button button104;
    private Button button001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button90 = findViewById(R.id.button90);
        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity9.class);
                startActivity(intent);
            }
        });
        button91 = findViewById(R.id.button91);
        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity10.class);
                startActivity(intent);
            }
        });
        button92 = findViewById(R.id.button92);
        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity11.class);
                startActivity(intent);
            }
        });
        button93 = findViewById(R.id.button93);
        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity12.class);
                startActivity(intent);
            }
        });
        button95 = findViewById(R.id.button95);
        button95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity13.class);
                startActivity(intent);
            }
        });
        button96 = findViewById(R.id.button96);
        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity14.class);
                startActivity(intent);
            }
        });
        button97 = findViewById(R.id.button97);
        button97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity15.class);
                startActivity(intent);
            }
        });
        button98 = findViewById(R.id.button98);
        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity16.class);
                startActivity(intent);
            }
        });
        button99 = findViewById(R.id.button99);
        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity17.class);
                startActivity(intent);
            }
        });
        button94 = findViewById(R.id.button94);
        button94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity18.class);
                startActivity(intent);
            }
        });
        button100 = findViewById(R.id.button100);
        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity19.class);
                startActivity(intent);
            }
        });
        button101 = findViewById(R.id.button101);
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity20.class);
                startActivity(intent);
            }
        });
        button102 = findViewById(R.id.button102);
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity21.class);
                startActivity(intent);
            }
        });
        button103 = findViewById(R.id.button103);
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity22.class);
                startActivity(intent);
            }
        });
        button104 = findViewById(R.id.button104);
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity23.class);
                startActivity(intent);
            }
        });
        button001 = findViewById(R.id.button001);
        button001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity7.this,MainActivity24.class);
                startActivity(intent);
            }
        });
    }
}