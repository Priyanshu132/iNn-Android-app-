package com.example.inn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Locale;


public class dashboard2 extends AppCompatActivity {


    ImageButton calender;
    ImageButton mess;
    ImageButton studentyear;
    ImageButton myprofile;
    ImageView Logout;
    ImageButton fees;
    ImageButton facility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        calender=(ImageButton) findViewById(R.id.cal);


        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dashboard2.this,calender.class);
                startActivity(intent);
            }
        });


        mess=(ImageButton)findViewById(R.id.mes);

        mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dashboard2.this,MessTimeTable.class);
                startActivity(intent);


            }
        });

        studentyear=(ImageButton)findViewById(R.id.stu);

        studentyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dashboard2.this,Students.class);
                startActivity(intent);
            }
        });

        myprofile=(ImageButton)findViewById(R.id.mp);
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(dashboard2.this,Profile2.class);
                startActivity(intent);

            }
        });

        Logout=(ImageView)findViewById(R.id.logout);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();

                Intent intent=new Intent(dashboard2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        fees=(ImageButton)findViewById(R.id.feee);

        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dashboard2.this,fee1.class);
                startActivity(intent);
            }
        });

        facility=(ImageButton)findViewById(R.id.faci);

        facility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(dashboard2.this,Facility.class);
                startActivity(intent);
            }
        });
    }
}
