package com.example.tom.majority;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartSignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_signup);

        Button mEmailSignInButton = (Button) findViewById(R.id.startSignUp);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent i=new Intent(StartSignupActivity.this, SignUp.class);
                startActivity(i);
            }
        });
    }
}
