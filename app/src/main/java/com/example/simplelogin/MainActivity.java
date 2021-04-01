package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// These library is added by Android Studeio
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // Member variables for controls
    private Button m_btnLogin = null;
    private EditText m_txtPassword = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating control objects
        m_btnLogin = (Button) findViewById(R.id.btnLogin);
        m_txtPassword = (EditText) findViewById(R.id.txtPassword);


        m_btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String password = "";

                //Reading the password control
                password = m_txtPassword.getText().toString();

                // Some validation ...
                if (password.length() < 8) {
                    Toast.makeText(getApplicationContext(), "Incorrect password!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    // Sending a string to the SecondClass.
                    Intent intent = new Intent(getApplicationContext(), SecondClass.class);
                    intent.putExtra("FirstMessage", "You logged in!");
                    startActivity(intent);
                }
            }
        });





    }
}
