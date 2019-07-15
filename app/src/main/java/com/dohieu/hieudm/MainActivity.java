package com.dohieu.hieudm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnBai1;
    private Button btnBai2;
    private Button btnBai3;
    private Button btnBai4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBai1 = (Button) findViewById(R.id.btn_bai1);
        btnBai2 = (Button) findViewById(R.id.btn_bai2);
        btnBai3 = (Button) findViewById(R.id.btn_bai3);
        btnBai4 = (Button) findViewById(R.id.btn_bai4);

        final Intent intent1 = new Intent(MainActivity.this, Bai1Activity.class);
        final Intent intent2 = new Intent(MainActivity.this, Bai2Activity.class);
        final Intent intent3 = new Intent(MainActivity.this, Bai3Activity.class);
        final Intent intent4 = new Intent(MainActivity.this, Bai4Activity.class);

        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Bài 1", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Bài 2", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Bài 3", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });
        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Bài 4", Toast.LENGTH_SHORT).show();
                startActivity(intent4);
            }
        });
    }
}
