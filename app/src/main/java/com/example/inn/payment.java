package com.example.inn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class payment extends AppCompatActivity {

    private TextView pphostelfee;
    private TextView ppsecurity;
    private  TextView thostelfee;
    private TextView tsecurity;
    private TextView duehostel;
    private TextView duesecurity;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        pphostelfee=(TextView)findViewById(R.id.pph);
        ppsecurity=(TextView)findViewById(R.id.pps);
        thostelfee=(TextView)findViewById(R.id.th);
        tsecurity=(TextView)findViewById(R.id.ts);
        duehostel=(TextView)findViewById(R.id.dph);
        duesecurity=(TextView)findViewById(R.id.dps);


        databaseReference= FirebaseDatabase.getInstance().getReference().child("StudentsName").child("Rishab_goel");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String ph=dataSnapshot.child("paidhostel").getValue().toString();
                String th=dataSnapshot.child("totalhostel").getValue().toString();
                String ps=dataSnapshot.child("paidsecurity").getValue().toString();
                String ts=dataSnapshot.child("totalsecurity").getValue().toString();

                String st1="--> Hostel Fee: "+th+" /-";
                String st2="--> Security: "+ps+" /-";
                String st3="--> Hostel Fee: "+ph+" /-";
                String st4="--> Security: "+ts+" /-";

                pphostelfee.setText(st3);
                ppsecurity.setText(st2);
                thostelfee.setText(st1);
                tsecurity.setText(st4);

                int temp=(Integer.parseInt(th))-(Integer.parseInt(ph));
                int temp1=(Integer.parseInt(ts))-(Integer.parseInt(ps));

              String st5="--> Hostel Fee: "+temp+" /-";
              String st6="--> Hostel Fee: "+temp1+" /-";
              duehostel.setText(st5);
              duesecurity.setText(st6);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




    }
}
