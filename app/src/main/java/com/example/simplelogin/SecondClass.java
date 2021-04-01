package com.example.simplelogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondClass extends AppCompatActivity {

    // Member variable for holding a textview object
    private TextView m_txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondclass);

        // Textview object assignment
        m_txtMessage = (TextView) findViewById(R.id.txtMessage);

        // Reading the valeue of the intent sent here
        Intent intent = getIntent();
        String message = intent.getStringExtra("FirstMessage");
        // Assigning the value to the TextView object
        m_txtMessage.setText(message);

    }
}
