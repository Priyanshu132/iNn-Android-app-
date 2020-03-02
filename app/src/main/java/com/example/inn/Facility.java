package com.example.inn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Facility extends AppCompatActivity {

    private TextView textView;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);

        textView=(TextView)findViewById(R.id.gym);
        textView1=(TextView)findViewById(R.id.laundry);
        textView2=(TextView)findViewById(R.id.electricity);
        textView3=(TextView)findViewById(R.id.room);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Facility.this,Gym.class);
                startActivity(intent);

            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Facility.this,Electricty.class);
                startActivity(intent);
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Facility.this,Laundry.class);
                startActivity(intent);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Facility.this,Room.class);
                startActivity(intent);

            }
        });
    }
}
