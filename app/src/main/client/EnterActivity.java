package com.hb.socketchatting;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterActivity extends AppCompatActivity {
    EditText editText;
    EditText portnum;
    EditText servip;
    Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        enterButton = findViewById(R.id.enterButton);
        editText = findViewById(R.id.editText);
        portnum = findViewById(R.id.portNum);
        servip = findViewById(R.id.serverIP);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                String username = editText.getText().toString();
                String portNum = portnum.getText().toString();
                String servIP = servip.getText().toString();
                intent.putExtra("username",username);
                intent.putExtra("PortNum",portNum);
                intent.putExtra("ServIP",servIP);
                startActivity(intent);
            }
        });

    }
}