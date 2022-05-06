package com.example.welcome1.btp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class helppage extends AppCompatActivity {

    public Button back_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helppage);
        onclick_back_button();
    }

    public void onclick_back_button(){

        back_button = (Button)findViewById(R.id.back_button);

        back_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //Intent intent = new Intent("com.example.welcome1.btp1.homepage");
                        //startActivity(intent);
                        finish();
                    }
                }

        );
    }

}
