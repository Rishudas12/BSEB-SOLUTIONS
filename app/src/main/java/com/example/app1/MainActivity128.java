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
    private Button button186;
    private Button button187;
    private Button button188;
    private Button button189;
    private Button button190;
    private Button button191;
    private Button button192;
    private Button button193;
    private Button button194;
    private Button button195;

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
        button186 = findViewById(R.id.button186);
        button186.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity134.class);
                startActivity(intent);
            }
        });
        button187 = findViewById(R.id.button187);
        button187.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity135.class);
                startActivity(intent);
            }
        });
        button188 = findViewById(R.id.button188);
        button188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity136.class);
                startActivity(intent);
            }
        });
        button189 = findViewById(R.id.button189);
        button189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity137.class);
                startActivity(intent);
            }
        });
        button190 = findViewById(R.id.button190);
        button190.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity138.class);
                startActivity(intent);
            }
        });
        button191 = findViewById(R.id.button191);
        button191.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity139.class);
                startActivity(intent);
            }
        });
        button192 = findViewById(R.id.button192);
        button192.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity140.class);
                startActivity(intent);
            }
        });
        button193 = findViewById(R.id.button193);
        button193.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity141.class);
                startActivity(intent);
            }
        });
        button194 = findViewById(R.id.button194);
        button194.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity142.class);
                startActivity(intent);
            }
        });
        button195 = findViewById(R.id.button195);
        button195.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity128.this, MainActivity143.class);
                startActivity(intent);
            }
        });
    }
}