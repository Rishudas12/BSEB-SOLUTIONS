package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity81 extends AppCompatActivity {
    private Button button145;
    private Button button146;
    private Button button147;
    private Button button148;
    private Button button149;
    private Button button150;
    private Button button151;
    private Button button152;
    private Button button153;
    private Button button154;
    private Button button155;
    private Button button156;
    private Button button157;
    private Button button158;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main81);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button145 = findViewById(R.id.button145);
        button145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity81.this,MainActivity82.class);
                startActivity(intent);
            }
        });
        button146 = findViewById(R.id.button146);
        button146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity81.this,MainActivity83.class);
                startActivity(intent);
            }
        });
        button147 = findViewById(R.id.button147);
        button147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity84.class);
                startActivity(intent);
            }
        });
        button148 = findViewById(R.id.button148);
        button148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity85.class);
                startActivity(intent);
            }
        });
        button149 = findViewById(R.id.button149);
        button149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity86.class);
                startActivity(intent);
            }
        });
        button150 = findViewById(R.id.button150);
        button150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity87.class);
                startActivity(intent);
            }
        });
        button151 = findViewById(R.id.button151);
        button151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity88.class);
                startActivity(intent);
            }
        });
        button152 = findViewById(R.id.button152);
        button152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity89.class);
                startActivity(intent);
            }
        });
        button153 = findViewById(R.id.button153);
        button153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity90.class);
                startActivity(intent);
            }
        });
        button154 = findViewById(R.id.button154);
        button154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity91.class);
                startActivity(intent);
            }
        });
        button155 = findViewById(R.id.button155);
        button155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity92.class);
                startActivity(intent);
            }
        });
        button156 = findViewById(R.id.button156);
        button156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity93.class);
                startActivity(intent);
            }
        });
        button157 = findViewById(R.id.button157);
        button157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity94.class);
                startActivity(intent);
            }
        });
        button158 = findViewById(R.id.button158);
        button158.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity81.this, MainActivity95.class);
                startActivity(intent);
            }
        });
    }
}