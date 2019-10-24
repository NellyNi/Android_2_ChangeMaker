package edu.ucsb.cs.cs184.jiawei_ni.jnichangemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonC;
    TextView Amount,d20,d10,d5,d1,c25,c10,c5,c1;
    double number;
    String numstr="";
    int[] r= new int[8];
    boolean Edited=false;
    public int[] money(double m){
        m=m*100;
        int[] ans = new int[8];
        ans[0]=(int)Math.round(m)/2000;
        m=m%2000;
        ans[1]=(int)Math.round(m)/1000;
        m=m%1000;
        ans[2]=(int)Math.round(m)/500;
        m=m%500;
        ans[3]=(int)Math.round(m)/100;
        m=m%100;
        ans[4]=(int)Math.round(m)/25;
        m=m%25;
        ans[5]=(int)Math.round(m)/10;
        m=m%10;
        ans[6]=(int)Math.round(m)/5;
        m=m%5;
        ans[7]=(int)Math.round(m);
        return ans;
    }

    public double num(CharSequence str, char x){
        String str1=str.subSequence(0,str.length()-3).toString();
        str1=str1+str.charAt(str.length()-2)+"."+str.charAt(str.length()-1)+x;
        double r=Double.parseDouble(str1);
        return r;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonC = (Button) findViewById(R.id.buttonC);
        Amount = (TextView) findViewById(R.id.text);
        d20 = (TextView) findViewById(R.id.textView20);
        d10 = (TextView) findViewById(R.id.textView10);
        d5 = (TextView) findViewById(R.id.textView5);
        d1 = (TextView) findViewById(R.id.textView1);
        c25 = (TextView) findViewById(R.id.textView25);
        c10 = (TextView) findViewById(R.id.textView10c);
        c5 = (TextView) findViewById(R.id.textView5c);
        c1 = (TextView) findViewById(R.id.textView1c);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'1');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '1');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'2');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '2');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'3');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '3');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'4');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '4');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'5');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '5');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'6');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '6');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'7');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '7');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'8');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '8');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'9');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '9');
                }
                numstr= String.valueOf(number);
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Edited==false){
                    CharSequence check = new StringBuffer("0.00");
                    number = num(check,'0');
                    Edited=true;
                }else {
                    CharSequence check = Amount.getText().subSequence(7, Amount.getText().length());
                    number = num(check, '0');
                }
                numstr= String.valueOf(number)+'0';
                Amount.setText("Price: "+ numstr);
                r = money(number);
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numstr= "";
                Amount.setText("Price: "+ numstr);
                Edited=false;
                for (int i = 0; i < r.length; i++) {
                    r[i]=0;
                }
                d20.setText("$20: "+r[0]);
                d10.setText("$10: "+r[1]);
                d5.setText("  $5: "+r[2]);
                d1.setText("  $1: "+r[3]);
                c25.setText("25¢: "+r[4]);
                c10.setText("10¢: "+r[5]);
                c5.setText("  5¢: "+r[6]);
                c1.setText("  1¢: "+r[7]);
            }
        });

        if (savedInstanceState != null) {
            number = savedInstanceState.getDouble("count");
            numstr= savedInstanceState.getString("scount");
            Amount.setText("Price: "+ numstr);
            r = savedInstanceState.getIntArray("countArr");
            d20.setText("$20: "+r[0]);
            d10.setText("$10: "+r[1]);
            d5.setText("  $5: "+r[2]);
            d1.setText("  $1: "+r[3]);
            c25.setText("25¢: "+r[4]);
            c10.setText("10¢: "+r[5]);
            c5.setText("  5¢: "+r[6]);
            c1.setText("  1¢: "+r[7]);
            Edited = savedInstanceState.getBoolean("edit");
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putDouble("count",number);
        outState.putString("scount", numstr);
        outState.putIntArray("countArr",r);
        outState.putBoolean("edit", Edited);
    }
}


