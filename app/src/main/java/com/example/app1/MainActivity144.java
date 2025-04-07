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
    private Button button203;
    private Button button204;
    private Button button205;
    private Button button206;
    private Button button207;
    private Button button208;
    private Button button209;
    private Button button210;
    private Button button211;

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
        button203 = findViewById(R.id.button203);
        button203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity152.class);
                startActivity(intent);
            }
        });
        button204 = findViewById(R.id.button204);
        button204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity153.class);
                startActivity(intent);
            }
        });
        button205 = findViewById(R.id.button205);
        button205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity154.class);
                startActivity(intent);
            }
        });
        button206 = findViewById(R.id.button206);
        button206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity155.class);
                startActivity(intent);
            }
        });
        button207 = findViewById(R.id.button207);
        button207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity156.class);
                startActivity(intent);
            }
        });
        button208 = findViewById(R.id.button208);
        button208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity157.class);
                startActivity(intent);
            }
        });
        button209 = findViewById(R.id.button209);
        button209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity158.class);
                startActivity(intent);
            }
        });
        button210 = findViewById(R.id.button210);
        button210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity159.class);
                startActivity(intent);
            }
        });
        button211 = findViewById(R.id.button211);
        button211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity144.this,MainActivity160.class);
                startActivity(intent);
            }
        });


    }
}