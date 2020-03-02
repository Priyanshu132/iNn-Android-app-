package com.example.inn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class editshow2 extends AppCompatActivity {

    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_and_edit_fee);


        button=(Button)findViewById(R.id.ef);
        button1=(Button)findViewById(R.id.sf);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(editshow2.this, payment.class);

                startActivity(intent1);

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(editshow2.this, editfee3.class);

                startActivity(intent1);

            }
        });

    }
}
