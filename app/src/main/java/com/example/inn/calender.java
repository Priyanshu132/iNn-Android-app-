package com.example.inn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class calender extends AppCompatActivity {

      TextView date;
      TextView newthought;
      int data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        date=(TextView)findViewById(R.id.t);
        newthought=(TextView)findViewById(R.id.thought);


        String currentDate=DateFormat.getDateInstance().format(new Date());
        date.setText(currentDate);

        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        String dayOfMonthStr = String.valueOf(dayOfMonth);
        String t1="\"A day wasted on others is not wasted on one’s self\"";
        String t2="\"Creativity is intelligence having fun\"";
        String t3="\"Love only grows by sharing. You can only have more for yourself by giving it away to others\"";
        String t4="\"Kindness in words creates confidence. Kindness in thinking creates profoundness. Kindness in giving creates love\"";
        String t5="\"One who knows how to show and to accept kindness will be a friend better than any possession\"";
        String t6="\"Life is really generous to those who pursue their personal legend\"";
        String t7="\"There is no magic to achievement. It's really about hard work, choices and persistence\"";
        String t8="\"Every moment brings us some benediction. Even the rough hand of trial holds in its clasp for us some treasure of love\"";
        String t9="\"Actions speak louder than words and your love creates peace and goodwill among men\"";
        String t10="\"Success gives you the motivation to work more\"";
        String t11="\"When eating a fruit, think of the person who planted the tree\"";
        String t12="\"Climb the mountain so you can see the world, not so the world can see you\"";
        String t13="\"To forgive means pardoning the unpardonable\"";
        String t14="\"If you're not confident it's going to be hard to get that job, to get people to listen to you...\"";
        String t15="\"You only live once. But if you do it right, once is enough\"";
        String t16="\"The expert in anything was once a beginner\"";
        String t17="\"Preparation is the key to success\"";
        String t18="\"The most certain way to succeed is always to try just one more time\"";
        String t19="\"Be positive, patient and persistent. And you will be successful\"";
        String t20="\"Do not give up, the beginning is always the hardest\"";
        String t21="\"Mistakes are proof that you are trying\"";
        String t22="\"In a world in which you can be anything, be kind\"";
        String t23="\"Inhale courage, exhale fear\"";
        String t24="\"Make your vision so clear that your fears become irrelevant\"";
        String t25="\"Character is doing the right thing when nobody is looking\"";
        String t26="\"You don't have to be perfect to be amazing\"";
        String t27="\"Imagination is the highest kite that can fly\"";
        String t28="\"Imagination means nothing without doing\"";
        String t29="\"Paint is only wasted when it is in the tube\"";
        String t30="\"A book is a gift that you can open again and again\"";
        String t31="\"The best way to get rid of your problems is to face them\"";

        if(dayOfMonthStr.contentEquals("1")){
            newthought.setText(t1);
        }
        if(dayOfMonthStr.contentEquals("2")){
            newthought.setText(t2);
        }
        if(dayOfMonthStr.contentEquals("3")){
            newthought.setText(t3);
        }

        if(dayOfMonthStr.contentEquals("4")){
            newthought.setText(t4);
        }

        if(dayOfMonthStr.contentEquals("5")){
            newthought.setText(t5);
        }

        if(dayOfMonthStr.contentEquals("6")){
            newthought.setText(t6);
        }

        if(dayOfMonthStr.contentEquals("7")){
            newthought.setText(t7);
        }
        if(dayOfMonthStr.contentEquals("8")){
            newthought.setText(t8);
        }
        if(dayOfMonthStr.contentEquals("9")){
            newthought.setText(t9);
        }

        if(dayOfMonthStr.contentEquals("10")){
            newthought.setText(t10);
        }

        if(dayOfMonthStr.contentEquals("11")){
            newthought.setText(t11);
        }

        if(dayOfMonthStr.contentEquals("12")){
            newthought.setText(t12);
        }

        if(dayOfMonthStr.contentEquals("13")){
            newthought.setText(t13);
        }

        if(dayOfMonthStr.contentEquals("14")){
            newthought.setText(t14);
        }

        if(dayOfMonthStr.contentEquals("15")){
            newthought.setText(t15);
        }

        if(dayOfMonthStr.contentEquals("16")){
            newthought.setText(t16);
        }

        if(dayOfMonthStr.contentEquals("17")){
            newthought.setText(t17);
        }

        if(dayOfMonthStr.contentEquals("18")){
            newthought.setText(t18);
        }

        if(dayOfMonthStr.contentEquals("19")){
            newthought.setText(t19);
        }

        if(dayOfMonthStr.contentEquals("20")){
            newthought.setText(t20);
        }

        if(dayOfMonthStr.contentEquals("21")){
            newthought.setText(t21);
        }
        if(dayOfMonthStr.contentEquals("22")){
            newthought.setText(t22);
        }

        if(dayOfMonthStr.contentEquals("23")){
            newthought.setText(t23);
        }

        if(dayOfMonthStr.contentEquals("24")){
            newthought.setText(t24);
        }

        if(dayOfMonthStr.contentEquals("25")){
            newthought.setText(t25);
        }

        if(dayOfMonthStr.contentEquals("26")){
            newthought.setText(t26);
        }

        if(dayOfMonthStr.contentEquals("27")){
            newthought.setText(t27);
        }

        if(dayOfMonthStr.contentEquals("28")){
            newthought.setText(t28);
        }

        if(dayOfMonthStr.contentEquals("29")){
            newthought.setText(t29);
        }

        if(dayOfMonthStr.contentEquals("30")){
            newthought.setText(t30);
        }

        if(dayOfMonthStr.contentEquals("31")){
            newthought.setText(t31);
        }




    }
}
