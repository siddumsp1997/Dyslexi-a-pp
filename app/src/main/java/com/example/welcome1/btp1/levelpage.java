package com.example.welcome1.btp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class levelpage extends AppCompatActivity {

    public TextView textView;
    public Button homepage;
    public Button trainingpage;
    public Button testpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levelpage);
        //Get the bundle
        Bundle bundle = getIntent().getExtras();

        //Extract the data…
        String level_name = bundle.getString("level");
        textView = (TextView) findViewById(R.id.level_title);
        textView.setText("Level : " +level_name);
        onclick_homepage_button();
        onclick_trainingpage_button();
        onclick_testpage_button();

    }

    void onclick_homepage_button(){

        homepage = (Button)findViewById(R.id.homepage_button);

        homepage.setOnClickListener(
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

    void onclick_trainingpage_button(){

        trainingpage = (Button)findViewById(R.id.training_button);

        trainingpage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent("com.example.welcome1.btp1.trainingpage");
                        startActivity(intent);
                    }
                }
        );
    }

    void onclick_testpage_button(){

        testpage = (Button)findViewById(R.id.testing_button);

        testpage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent("com.example.welcome1.btp1.testpage");
                        startActivity(intent);
                    }
                }
        );
    }

}
