package com.example.pole_vvoda_i_vivod_imeni;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText userName;
    private Button but1;
    private TextView textView;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.userName);
        but1 = findViewById(R.id.but1);
        textView = findViewById(R.id.textView);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userName.getText().toString();
                if (!username.trim().isEmpty()) {
                    textView.setText(String.format("Привет, %s!", username));
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Ошибка: введите имя.", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}