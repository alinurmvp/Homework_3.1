package com.example.homework_31;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText edPassword;

    private Button btnEnter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

edPassword = findViewById(R.id.ed_password);
btnEnter = findViewById(R.id.btnEnter);
btnEnter.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       String password = edPassword.getText().toString();
       Intent intent = new Intent(MainActivity.this,SecondActivity.class);
       intent.putExtra("password",password);
       startActivity(intent);



    }
});

    }
}