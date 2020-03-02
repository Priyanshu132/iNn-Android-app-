package com.example.inn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adminPayment extends AppCompatActivity {

    private Button button;
    private  Button button1;
    private  Button button2;
    private  Button button3;
    private  Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_payment);

        button=(Button)findViewById(R.id.rg);
        button1=(Button)findViewById(R.id.as);
        button2=(Button)findViewById(R.id.hsb);
        button3=(Button)findViewById(R.id.md);
        button4=(Button)findViewById(R.id.aa);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adminPayment.this,ShowAndEditFee.class);
                startActivity(intent);

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adminPayment.this,editshow.class);
                startActivity(intent);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adminPayment.this,editshow1.class);
                startActivity(intent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adminPayment.this,editshow2.class);
                startActivity(intent);
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adminPayment.this,editshow3.class);
                startActivity(intent);
            }
        });
    }
}
