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

public class MainActivity144 extends AppCompatActivity {
    private Button button196;
    private Button button197;
    private Button button198;
    private Button button199;
    private Button button200;
    private Button button201;
    private Button button202;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main144);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button196 = findViewById(R.id.button196);
        button196.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity145.class);
                startActivity(intent);
            }
        });
        button197 = findViewById(R.id.button197);
        button197.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity146.class);
                startActivity(intent);
            }
        });
        button198 = findViewById(R.id.button198);
        button198.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity147.class);
                startActivity(intent);
            }
        });
        button199 = findViewById(R.id.button199);
        button199.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity148.class);
                startActivity(intent);
            }
        });
        button200 = findViewById(R.id.button200);
        button200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity149.class);
                startActivity(intent);
            }
        });
        button201 = findViewById(R.id.button201);
        button201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity150.class);
                startActivity(intent);
            }
        });
        button202 = findViewById(R.id.button202);
        button202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity151.class);
                startActivity(intent);
            }
        });

    }
}