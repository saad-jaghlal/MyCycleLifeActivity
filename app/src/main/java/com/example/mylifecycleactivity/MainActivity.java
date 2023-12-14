package com.example.mylifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button calculate;
    EditText txt1 ,txt2;
    TextView resultat;
    private int result = 0;
    private static final String RESULT_KEY = "result_key";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate = findViewById(R.id.calculbtn);
        txt1 = findViewById(R.id.editTextText);
        txt2 = findViewById(R.id.editTextText2);
        resultat = findViewById(R.id.result);
        if (savedInstanceState != null) {
            result = savedInstanceState.getInt("RESULT_KEY");
            resultat.setText(String.valueOf(result));
        }
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r = Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());
                result = r;
                resultat.setText(String.valueOf(result));

            }
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("RESULT_KEY", result);
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
}