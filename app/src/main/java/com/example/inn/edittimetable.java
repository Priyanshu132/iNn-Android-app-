package com.example.inn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class edittimetable extends AppCompatActivity {
    private Button button;
    private  Button button1;
    private  Button button2;
    private  Button button3;
    private  Button button4;
    private  Button button5;
    private  Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittimetable);

        button=(Button)findViewById(R.id.mon);
        button1=(Button)findViewById(R.id.tues);
        button2=(Button)findViewById(R.id.wed);
        button3=(Button)findViewById(R.id.thu);
        button4=(Button)findViewById(R.id.fri);
        button5=(Button)findViewById(R.id.sat);
        button6=(Button)findViewById(R.id.sun);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(edittimetable.this,editmonday.class);
                startActivity(intent);

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(edittimetable.this,edittuesday.class);
                startActivity(intent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(edittimetable.this,editwednesday.class);
                startActivity(intent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(edittimetable.this,editthursday.class);
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(edittimetable.this,editfriday.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(edittimetable.this,editsaturday.class);
                startActivity(intent);
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(edittimetable.this,editsunday.class);
                startActivity(intent);
            }
        });
    }
}
