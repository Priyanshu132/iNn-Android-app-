package com.example.inn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class editfriday extends AppCompatActivity {

    private EditText bf;
    private EditText bf1;
    private EditText l;
    private EditText l1;
    private EditText l2;
    private EditText l3;
    private EditText l4;
    private EditText s;
    private EditText s1;
    private EditText d;
    private EditText d1;
    private EditText d2;
    private EditText d3;
    private EditText d4;
    private Button button;
    DatabaseReference databaseReference;

    private food food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editfriday);

        bf=(EditText)findViewById(R.id.bf);
        bf1=(EditText)findViewById(R.id.bf1);
        l=(EditText)findViewById(R.id.l);
        l1=(EditText)findViewById(R.id.l1);
        l2=(EditText)findViewById(R.id.l2);
        l3=(EditText)findViewById(R.id.l3);
        l4=(EditText)findViewById(R.id.l4);
        s=(EditText)findViewById(R.id.s);
        s1=(EditText)findViewById(R.id.s1);
        d=(EditText)findViewById(R.id.d);
        d1=(EditText)findViewById(R.id.d1);
        d2=(EditText)findViewById(R.id.d2);
        d3=(EditText)findViewById(R.id.d3);
        d4=(EditText)findViewById(R.id.d4);
        button=(Button)findViewById(R.id.update);

        food=new food();
        databaseReference= FirebaseDatabase.getInstance().getReference().child("Mess_time_table");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                food.setBreakfast_1(bf.getText().toString().trim());
                food.setBreakfast_2(bf1.getText().toString().trim());
                food.setLunch_1(l.getText().toString().trim());
                food.setLunch_2(l1.getText().toString().trim());
                food.setLunch_3(l2.getText().toString().trim());
                food.setLunch_4(l3.getText().toString().trim());
                food.setLunch_5(l4.getText().toString().trim());
                food.setSupper_1(s.getText().toString().trim());
                food.setSupper_2(s1.getText().toString().trim());
                food.setDinner_1(d.getText().toString().trim());
                food.setDinner_2(d1.getText().toString().trim());
                food.setDinner_3(d2.getText().toString().trim());
                food.setDinner_4(d3.getText().toString().trim());
                food.setDinner_5(d4.getText().toString().trim());


                databaseReference.child("Friday").setValue(food);

                Toast.makeText(editfriday.this,"Updated Successfully",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(editfriday.this,edittimetable.class);
                startActivity(intent);
            }
        });

    }
}
