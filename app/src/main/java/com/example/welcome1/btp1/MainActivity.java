package com.example.welcome1.btp1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button login_button;
    public EditText user;
    public EditText pass;
    //public Button exit_button;
    public TextView sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_up = (TextView)findViewById(R.id.create_account);
        sign_up.setTextColor(Color.BLUE);

        SpannableString content = new SpannableString("New user ? Click here to sign up !!");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        sign_up.setText(content);

        onclick_login_button();
        onclick_signup_button();
        //onclick_exit_button();
    }

    void onclick_login_button(){

        user = (EditText)findViewById(R.id.username_field);
        pass = (EditText)findViewById(R.id.password_field);
        login_button = (Button) findViewById(R.id.login);

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(user.getText().toString().equals("user") && pass.getText().toString().equals("pass")){

                            Intent intent = new Intent("com.example.welcome1.btp1.homepage");
                            Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }

                        else{
                            Toast.makeText(MainActivity.this, "Incorrect credentials", Toast.LENGTH_LONG).show();
                        }

                    }
                }

        );
    }

    void onclick_signup_button(){

        sign_up.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent("com.example.welcome1.btp1.newuser");
                startActivity(intent);
            }
        });

    }


    /*
    void onclick_exit_button(){
        exit_button = (Button) findViewById(R.id.exit_button);
        exit_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Closing app..", Toast.LENGTH_LONG).show();
                        finish();

                    }
                }

        );
    }
    */




}
