package com.example.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint("WrongViewCast") final EditText log  = findViewById(R.id.textView);


        final Button button = findViewById(R.id.sendButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String login = log.getText().toString();
                Intent message = new Intent(MainActivity.this, HomeActivity.class);
                message.putExtra("EXTRA_KEY", login);
                startActivity(message);


            }
        });

    }
}


