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

public class MainActivity6 extends AppCompatActivity {
    private Button button75;
    private Button button76;
    private Button button77;
    private Button button78;
    private Button button79;
    private Button button80;
    private Button button81;
    private Button button82;
    private Button button83;
    private Button button84;
    private Button button85;
    private Button button86;
    private Button button87;
    private Button button88;
    private Button button89;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button75 = findViewById(R.id.button75);
        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity25.class);
                startActivity(intent);
            }
        });
        button76 = findViewById(R.id.button76);
        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity26.class);
                startActivity(intent);
            }
        });
        button77 = findViewById(R.id.button77);
        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity27.class);
                startActivity(intent);
            }
        });
        button78 = findViewById(R.id.button78);
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity28.class);
                startActivity(intent);
            }
        });
        button79 = findViewById(R.id.button79);
        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity29.class);
                startActivity(intent);
            }
        });
        button80 = findViewById(R.id.button80);
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity30.class);
                startActivity(intent);
            }
        });
        button81 = findViewById(R.id.button81);
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity31.class);
                startActivity(intent);
            }
        });
        button82 = findViewById(R.id.button82);
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity32.class);
                startActivity(intent);
            }
        });
        button83 = findViewById(R.id.button83);
        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity33.class);
                startActivity(intent);
            }
        });
        button84 = findViewById(R.id.button84);
        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity34.class);
                startActivity(intent);
            }
        });
        button85 = findViewById(R.id.button85);
        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity35.class);
                startActivity(intent);
            }
        });
        button86 = findViewById(R.id.button86);
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity36.class);
                startActivity(intent);
            }
        });
        button87 = findViewById(R.id.button87);
        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity37.class);
                startActivity(intent);
            }
        });
        button88 = findViewById(R.id.button88);
        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity38.class);
                startActivity(intent);
            }
        });
        button89 = findViewById(R.id.button89);
        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity39.class);
                startActivity(intent);
            }
        });
    }
}