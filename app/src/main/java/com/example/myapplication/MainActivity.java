package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout science = findViewById(R.id.scienceLayout);
        final LinearLayout mathematices = findViewById(R.id.mathsLayout);
        final LinearLayout technology = findViewById(R.id.techLayout);
        final LinearLayout engineer = findViewById(R.id.engineerLayout);

        final Button startbtn = findViewById(R.id.startquizbtn);


        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                selectedTopicName = "Science";

                science.setBackgroundResource(R.drawable.round_back_white_stroke10);
                technology.setBackgroundResource(R.drawable.round_back_white10);
                mathematices.setBackgroundResource(R.drawable.round_back_white10);
                engineer.setBackgroundResource(R.drawable.round_back_white10);




            }
        });

        mathematices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Mathematics";

                mathematices.setBackgroundResource(R.drawable.round_back_white_stroke10);

                science.setBackgroundResource(R.drawable.round_back_white10);
                technology.setBackgroundResource(R.drawable.round_back_white10);
                engineer.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Technology";

                technology.setBackgroundResource(R.drawable.round_back_white_stroke10);
                science.setBackgroundResource(R.drawable.round_back_white10);
                mathematices.setBackgroundResource(R.drawable.round_back_white10);
                engineer.setBackgroundResource(R.drawable.round_back_white10);


            }
        });

        engineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName = "Engineering";

                engineer.setBackgroundResource(R.drawable.round_back_white_stroke10);
                technology.setBackgroundResource(R.drawable.round_back_white10);
                science.setBackgroundResource(R.drawable.round_back_white10);
                mathematices.setBackgroundResource(R.drawable.round_back_white10);






            }
        });

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Select an Option",Toast.LENGTH_SHORT).show();
                }
                else{

                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);

                }

            }
        });

    }
}