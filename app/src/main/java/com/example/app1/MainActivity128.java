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

public class MainActivity128 extends AppCompatActivity {
    private Button button181;
    private Button button182;
    private Button button183;
    private Button button184;
    private Button button185;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main128);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button181 = findViewById(R.id.button181);
        button181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity129.class);
                startActivity(intent);
            }
        });
        button182 = findViewById(R.id.button182);
        button182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity130.class);
                startActivity(intent);
            }
        });
        button183 = findViewById(R.id.button183);
        button183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity131.class);
                startActivity(intent);
            }
        });
        button184 = findViewById(R.id.button184);
        button184.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity132.class);
                startActivity(intent);
            }
        });
        button185 = findViewById(R.id.button185);
        button185.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity133.class);
                startActivity(intent);
            }
        });
    }
}