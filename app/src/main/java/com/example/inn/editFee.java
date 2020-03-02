package com.example.inn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class editFee extends AppCompatActivity {


    private Button button4;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private String pre_ph;
    private String pre_ps;
    private EditText editText4;
    private DatabaseReference databaseReference;

    private StudentsName studentsName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_fee);

        button4=(Button)findViewById(R.id.rpsf);
        editText1=(EditText)findViewById(R.id.hf);
        editText2=(EditText)findViewById(R.id.sf);
        editText3=(EditText)findViewById(R.id.phf);
        editText4=(EditText)findViewById(R.id.psf);

        studentsName=new StudentsName();
        databaseReference= FirebaseDatabase.getInstance().getReference().child("StudentsName").child("Rishab_goel");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            pre_ph=dataSnapshot.child("paidhostel").getValue().toString();
             pre_ps=dataSnapshot.child("paidsecurity").getValue().toString();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int paidsecurity=Integer.parseInt(editText4.getText().toString().trim())+Integer.parseInt(pre_ps);
                studentsName.setPaidsecurity(paidsecurity);
                int totalhostle=Integer.parseInt(editText1.getText().toString().trim());
                studentsName.setTotalhostel(totalhostle);
                int totalsecurity=Integer.parseInt(editText2.getText().toString().trim());
                studentsName.setTotalsecurity(totalsecurity);
                int paidhostel;
                paidhostel = Integer.parseInt(editText3.getText().toString().trim())+Integer.parseInt(pre_ph);
                studentsName.setPaidhostel(paidhostel);

                databaseReference.setValue(studentsName);        // for adding new students

                Toast.makeText(editFee.this,"data inserted successfully",Toast.LENGTH_LONG).show();


                Intent intent=new Intent(editFee.this,ShowAndEditFee.class);
                startActivity(intent);
            }
        });

    }
}
