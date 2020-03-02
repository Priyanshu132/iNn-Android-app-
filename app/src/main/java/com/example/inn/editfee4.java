package com.example.inn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class editfee4 extends AppCompatActivity {


    private Button button4;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
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
        databaseReference= FirebaseDatabase.getInstance().getReference().child("StudentsName");


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int paidsecurity=Integer.parseInt(editText4.getText().toString().trim());
                studentsName.setPaidsecurity(paidsecurity);
                int totalhostle=Integer.parseInt(editText1.getText().toString().trim());
                studentsName.setTotalhostel(totalhostle);
                int totalsecurity=Integer.parseInt(editText2.getText().toString().trim());
                studentsName.setTotalsecurity(totalsecurity);
                int paidhostel=Integer.parseInt(editText3.getText().toString().trim());
                studentsName.setPaidhostel(paidhostel);



                databaseReference.child("Adnan_afridi").setValue(studentsName);        // for adding new students

//                Map<String,Object> updatedvalue=new HashMap<>();     //    for updating value
//
//                updatedvalue.put("/Rishab_goel/paidhostel",paidhostel);
//                updatedvalue.put("/Rishab_goel/paidsecurity",paidsecurity);
//                updatedvalue.put("/Rishab_goel/totalsecurity",totalsecurity);
//                updatedvalue.put("/Rishab_goel/totalhostel",totalhostle);
//
//                databaseReference.updateChildren(updatedvalue);

                Toast.makeText(editfee4.this,"data inserted successfully",Toast.LENGTH_LONG).show();


            }
        });


        Intent intent=new Intent(editfee4.this,editshow3.class);
        startActivity(intent);

    }
}
