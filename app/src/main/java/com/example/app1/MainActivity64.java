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

public class MainActivity64 extends AppCompatActivity {
    private Button button129;
    private Button button130;
    private Button button131;
    private Button button132;
    private Button button133;
    private Button button134;
    private Button button135;
    private Button button136;
    private Button button137;
    private Button button138;
    private Button button139;
    private Button button140;
    private Button button141;
    private Button button142;
    private Button button143;
    private Button button144;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main64);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button129 = findViewById(R.id.button129);
        button129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity65.class);
                startActivity(intent);
            }
        });
        button130 = findViewById(R.id.button130);
        button130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity66.class);
                startActivity(intent);
            }
        });
        button131 = findViewById(R.id.button131);
        button131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity67.class);
                startActivity(intent);
            }
        });
        button132 = findViewById(R.id.button132);
        button132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity68.class);
                startActivity(intent);
            }
        });
        button133 = findViewById(R.id.button133);
        button133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity69.class);
                startActivity(intent);
            }
        });
        button134 = findViewById(R.id.button134);
        button134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity70.class);
                startActivity(intent);
            }
        });
        button135 = findViewById(R.id.button135);
        button135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity71.class);
                startActivity(intent);
            }
        });
        button136 = findViewById(R.id.button136);
        button136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity72.class);
                startActivity(intent);
            }
        });
        button137 = findViewById(R.id.button137);
        button137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity73.class);
                startActivity(intent);
            }
        });
        button138 = findViewById(R.id.button138);
        button138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity74.class);
                startActivity(intent);
            }
        });
        button139 = findViewById(R.id.button139);
        button139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity75.class);
                startActivity(intent);
            }
        });
        button140 = findViewById(R.id.button140);
        button140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity76.class);
                startActivity(intent);
            }
        });
        button141 = findViewById(R.id.button141);
        button141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity77.class);
                startActivity(intent);
            }
        });
        button142 = findViewById(R.id.button142);
        button142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity78.class);
                startActivity(intent);
            }
        });
        button143 = findViewById(R.id.button143);
        button143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity79.class);
                startActivity(intent);
            }
        });
        button144 = findViewById(R.id.button144);
        button144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity64.this,MainActivity80.class);
                startActivity(intent);
            }
        });
    }
}