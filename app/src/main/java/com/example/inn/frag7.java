package com.example.inn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class frag7 extends Fragment {

    private TextView bf;
    private TextView bf1;
    private TextView l;
    private TextView l1;
    private TextView l2;
    private TextView l3;
    private TextView l4;
    private TextView s;
    private TextView s1;
    private TextView d;
    private TextView d1;
    private TextView d2;
    private TextView d3;
    private TextView d4;
    DatabaseReference databaseReference;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.frag1,container,false);

        bf=(TextView)v.findViewById(R.id.bf);
        bf1=(TextView)v.findViewById(R.id.bf1);
        l=(TextView)v.findViewById(R.id.l);
        l1=(TextView)v.findViewById(R.id.l1);
        l2=(TextView)v.findViewById(R.id.l2);
        l3=(TextView)v.findViewById(R.id.l3);
        l4=(TextView)v.findViewById(R.id.l4);
        s=(TextView)v.findViewById(R.id.s);
        s1=(TextView)v.findViewById(R.id.s1);
        d=(TextView)v.findViewById(R.id.d);
        d1=(TextView)v.findViewById(R.id.d1);
        d2=(TextView)v.findViewById(R.id.d2);
        d3=(TextView)v.findViewById(R.id.d3);
        d4=(TextView)v.findViewById(R.id.d4);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("Mess_time_table").child("Sunday");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String b1=dataSnapshot.child("breakfast_1").getValue().toString();
                String b2=dataSnapshot.child("breakfast_2").getValue().toString();
                String l11=dataSnapshot.child("lunch_1").getValue().toString();
                String l21=dataSnapshot.child("lunch_2").getValue().toString();
                String l31=dataSnapshot.child("lunch_3").getValue().toString();
                String l41=dataSnapshot.child("lunch_4").getValue().toString();
                String l5=dataSnapshot.child("lunch_5").getValue().toString();
                String s11=dataSnapshot.child("supper_1").getValue().toString();
                String s2=dataSnapshot.child("supper_2").getValue().toString();
                String d11=dataSnapshot.child("dinner_1").getValue().toString();
                String d21=dataSnapshot.child("dinner_2").getValue().toString();
                String d31=dataSnapshot.child("dinner_3").getValue().toString();
                String d41=dataSnapshot.child("dinner_4").getValue().toString();
                String d51=dataSnapshot.child("dinner_5").getValue().toString();
                String temp="~";

                bf.setText(temp+b1);
                bf1.setText(temp+b2);
                l.setText(temp+l11);
                l1.setText(temp+l21);
                l2.setText(temp+l31);
                l3.setText(temp+l41);
                l4.setText(temp+l5);
                s.setText(temp+s11);
                s1.setText(temp+s2);
                d.setText(temp+d11);
                d1.setText(temp+d21);
                d2.setText(temp+d31);
                d3.setText(temp+d41);
                d4.setText(temp+d51);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        return v;
    }
}
