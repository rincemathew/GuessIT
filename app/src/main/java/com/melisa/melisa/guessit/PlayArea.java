package com.melisa.melisa.guessit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.melisa.melisa.guessit.data.Eight;
import com.melisa.melisa.guessit.data.Eleven;
import com.melisa.melisa.guessit.data.Five;
import com.melisa.melisa.guessit.data.Four;
import com.melisa.melisa.guessit.data.Fourteen;
import com.melisa.melisa.guessit.data.Nine;
import com.melisa.melisa.guessit.data.One;
import com.melisa.melisa.guessit.data.Seven;
import com.melisa.melisa.guessit.data.Six;
import com.melisa.melisa.guessit.data.Ten;
import com.melisa.melisa.guessit.data.Thirteen;
import com.melisa.melisa.guessit.data.Three;
import com.melisa.melisa.guessit.data.Twelve;
import com.melisa.melisa.guessit.data.Two;

import java.util.Objects;

public class PlayArea extends AppCompatActivity {
    One one;Two two;Three three;Four four;Five five;Six six;Seven seven;
    Eight eight;Nine nine;Ten ten;Eleven eleven;Twelve twelve;Thirteen thirteen;Fourteen fourteen;
    TextView golden;
    String cate,checkIt,checkingValue;
    int value,len;
    int gold;
    LinearLayout adMobLin;
    AdView madView;
    Dialog myDialog;
    ImageView question,previous,next;
    ViewFlipper VF;
    int questionArrayV;
    String choice0,choice1,choice2,choice3,choice4,choice5,choice6,choice7,choice8,choice9,answer,hint;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,
    editText9,editText10;
    Button choiceB1,choiceB2,choiceB3,choiceB4,choiceB5,choiceB6,choiceB7,choiceB8,choiceB9,choiceB10,hintbutton,reset;
    EditText[] editArray =new EditText[10];
    SharedPreferences myPrefs;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_area);
        MobileAds.initialize(this,"ca-app-pub-6234689785392855/2702224072");
        madView=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        madView.loadAd(adRequest);
        Objects.requireNonNull(getSupportActionBar()).hide();
        LinearLayout RB1 =  findViewById(R.id.optionLayout1);
        LinearLayout RB2 =  findViewById(R.id.optionLayout12);
        LinearLayout RB3 =  findViewById(R.id.optionLayout13);
        VF = (ViewFlipper) findViewById(R.id.ViewFlipper01);
        editText1=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        editText3=findViewById(R.id.editText3);
        editText4=findViewById(R.id.editText4);
        editText5=findViewById(R.id.editText5);
        editText6=findViewById(R.id.editText6);
        editText7=findViewById(R.id.editText7);
        editText8=findViewById(R.id.editText8);
        editText9=findViewById(R.id.editText9);
        editText10=findViewById(R.id.editText10);
        choiceB1=findViewById(R.id.choice1);
        choiceB2=findViewById(R.id.choice2);
        choiceB3=findViewById(R.id.choice3);
        choiceB4=findViewById(R.id.choice4);
        choiceB5=findViewById(R.id.choice5);
        choiceB6=findViewById(R.id.choice21);
        choiceB7=findViewById(R.id.choice22);
        choiceB8=findViewById(R.id.choice23);
        choiceB9=findViewById(R.id.choice24);
        choiceB10=findViewById(R.id.choice25);
        hintbutton=findViewById(R.id.hint);
        reset=findViewById(R.id.reset);
        adMobLin=findViewById(R.id.admobLinear);
        myDialog = new Dialog(this);
        editArray[0] = editText1;editArray[1] = editText2;editArray[2] = editText3;editArray[3] = editText4;editArray[4] = editText5;
        editArray[5] = editText6;editArray[6] = editText7;editArray[7] = editText8;editArray[8] = editText9;editArray[9] = editText10;

        golden=findViewById(R.id.gold);
        question=findViewById(R.id.question);
        previous=findViewById(R.id.previous);
        next=findViewById(R.id.next);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            cate = extras.getString("key");
            value = extras.getInt("value");
            //The key argument here must match that used in the other activity
        }
        myPrefs = this.getSharedPreferences("myPrefs", MODE_PRIVATE);
        editor = myPrefs.edit();

        //gold set
        gold=myPrefs.getInt("GOLD", 0);
        golden.setText(gold+"");


        if(cate.equals("levelone")){
            one = new One();
            resetValues();
        }
        else if(cate.equals("leveltwo")){
            two = new Two();
            resetValues();
        }
        else if(cate.equals("levelthree")){
            three = new Three();
            resetValues();
        }
        else if(cate.equals("levelfour")){
            four = new Four();
            resetValues();
        }
        else if(cate.equals("levelfive")){
            five = new Five();
            resetValues();
        }
        else if(cate.equals("levelsix")){
            six = new Six();
            resetValues();
        }
        else if(cate.equals("levelseven")){
            seven = new Seven();
            resetValues();
        }
        else if(cate.equals("leveleight")){
            eight = new Eight();
            resetValues();
        }
        else if(cate.equals("levelnine")){
            nine = new Nine();
            resetValues();
        }
        else if(cate.equals("levelten")){
            ten = new Ten();
            resetValues();
        }
        else if(cate.equals("leveleleven")){
            eleven = new Eleven();
            resetValues();
        }
        else if(cate.equals("leveltwelve")){
            twelve = new Twelve();
            resetValues();
        }
        else if(cate.equals("levelthirteen")){
            thirteen = new Thirteen();
            resetValues();
        }
        else if(cate.equals("levelfourteen")){
            fourteen = new Fourteen();
            resetValues();
        }

        checkIt=myPrefs.getString(cate, "");
        assert checkIt != null;
        if (checkIt.charAt(value)=='T'){
            VF.setDisplayedChild(1);
            flipperView();
        }
        question.setImageResource(questionArrayV);
        placed();


        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value != 0) {
                    value--;
                    resetValues();
                    question.setImageResource(questionArrayV);
                    placed();
                    checkIt = myPrefs.getString(cate, "");
                    assert checkIt != null;
                    if (checkIt.charAt(value) == 'T') {
                        VF.setDisplayedChild(1);
                        flipperView();
                    }else {
                        VF.setDisplayedChild(0);
                    }
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value != 19) {
                    value++;
                    resetValues();
                    question.setImageResource(questionArrayV);
                    placed();
                    checkIt = myPrefs.getString(cate, "");
                    assert checkIt != null;
                    if (checkIt.charAt(value) == 'T') {
                        VF.setDisplayedChild(1);
                        flipperView();
                    }else {
                        VF.setDisplayedChild(0);
                    }
                }
            }
        });
        hintbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtclose;
                TextView hintDialog;


                myDialog.setContentView(R.layout.hind_popup);
                txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
                hintDialog =(TextView) myDialog.findViewById(R.id.hintDialog);
                txtclose.setText("X");
                //    btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });
                hintDialog.setText(hint);

                Objects.requireNonNull(myDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetValues();
                question.setImageResource(questionArrayV);
                placed();

            }
        });
        choiceB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB1.getText().toString());
                            choiceB1.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB1.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
        choiceB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB2.getText().toString());
                            choiceB2.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB2.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }

            }
        });
        choiceB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB3.getText().toString());
                            choiceB3.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB3.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
        choiceB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB4.getText().toString());
                            choiceB4.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB4.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                checkIt=myPrefs.getString(cate, "");
                               // Toast.makeText(PlayArea.this,"Try again, Wrong answer"+checkIt,Toast.LENGTH_SHORT).show();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
        choiceB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB5.getText().toString());
                            choiceB5.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB5.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                checkIt=myPrefs.getString(cate, "");
                               // Toast.makeText(PlayArea.this,"Try again, Wrong answer"+checkIt,Toast.LENGTH_SHORT).show();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
        choiceB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB6.getText().toString());
                            choiceB6.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB6.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                checkIt=myPrefs.getString(cate, "");
                               // Toast.makeText(PlayArea.this,"Try again, Wrong answer"+checkIt,Toast.LENGTH_SHORT).show();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
        choiceB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB7.getText().toString());
                            choiceB7.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB7.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                checkIt=myPrefs.getString(cate, "");
                               // Toast.makeText(PlayArea.this,"Try again, Wrong answer"+checkIt,Toast.LENGTH_SHORT).show();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
        choiceB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB8.getText().toString());
                            choiceB8.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB8.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                checkIt=myPrefs.getString(cate, "");
                               // Toast.makeText(PlayArea.this,"Try again, Wrong answer"+checkIt,Toast.LENGTH_SHORT).show();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
        choiceB9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB9.getText().toString());
                            choiceB9.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB9.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                checkIt=myPrefs.getString(cate, "");
                               // Toast.makeText(PlayArea.this,"Try again, Wrong answer"+checkIt,Toast.LENGTH_SHORT).show();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
        choiceB10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkingValue.length()==len){
                }
                else if (checkingValue.length()<len){
                    for (int qwe=0;qwe<len;qwe++){
                        if (editArray[qwe].getText().toString().equals("")){
                            editArray[qwe].setText(choiceB10.getText().toString());
                            choiceB10.setVisibility(View.INVISIBLE);
                            checkingValue=checkingValue+choiceB10.getText().toString();
                            if (checkingValue.equals(answer) && checkingValue.length()==len){
                                VF.setDisplayedChild(1);
                                goldUpdate();
                                StringBuilder myName = new StringBuilder(checkIt);
                                myName.setCharAt(value, 'T');
                                editor.putString(cate, String.valueOf(myName));
                                editor.apply();
                                checkIt=myPrefs.getString(cate, "");
                               // Toast.makeText(PlayArea.this,"Try again, Wrong answer"+checkIt,Toast.LENGTH_SHORT).show();
                                //checkIt.charAt(value)='T';
                            }else if (!checkingValue.equals(answer) && checkingValue.length()==len){
                                Toast.makeText(PlayArea.this,"Try again, Wrong answer",Toast.LENGTH_SHORT).show();
                            }
                            break;
                        }
                    }
                }
            }
        });
    }
    public void resetValues(){
        if(cate.equals("levelone")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=one.getQuestion(value);
            choice0 =one.getChoice1(value);
            choice1 =one.getChoice2(value);
            choice2 =one.getChoice3(value);
            choice3 =one.getChoice4(value);
            choice4 =one.getChoice5(value);
            choice5 =one.getChoice6(value);
            choice6 =one.getChoice7(value);
            choice7 =one.getChoice8(value);
            choice8 =one.getChoice9(value);
            choice9 =one.getChoice10(value);
            answer =one.getCorrectAnswer(value);
            hint =one.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("leveltwo")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=two.getQuestion(value);
            choice0 =two.getChoice1(value);
            choice1 =two.getChoice2(value);
            choice2 =two.getChoice3(value);
            choice3 =two.getChoice4(value);
            choice4 =two.getChoice5(value);
            choice5 =two.getChoice6(value);
            choice6 =two.getChoice7(value);
            choice7 =two.getChoice8(value);
            choice8 =two.getChoice9(value);
            choice9 =two.getChoice10(value);
            answer =two.getCorrectAnswer(value);
            hint =two.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelthree")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=three.getQuestion(value);
            choice0 =three.getChoice1(value);
            choice1 =three.getChoice2(value);
            choice2 =three.getChoice3(value);
            choice3 =three.getChoice4(value);
            choice4 =three.getChoice5(value);
            choice5 =three.getChoice6(value);
            choice6 =three.getChoice7(value);
            choice7 =three.getChoice8(value);
            choice8 =three.getChoice9(value);
            choice9 =three.getChoice10(value);
            answer =three.getCorrectAnswer(value);
            hint =three.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelfour")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=four.getQuestion(value);
            choice0 =four.getChoice1(value);
            choice1 =four.getChoice2(value);
            choice2 =four.getChoice3(value);
            choice3 =four.getChoice4(value);
            choice4 =four.getChoice5(value);
            choice5 =four.getChoice6(value);
            choice6 =four.getChoice7(value);
            choice7 =four.getChoice8(value);
            choice8 =four.getChoice9(value);
            choice9 =four.getChoice10(value);
            answer =four.getCorrectAnswer(value);
            hint =four.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelfive")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=five.getQuestion(value);
            choice0 =five.getChoice1(value);
            choice1 =five.getChoice2(value);
            choice2 =five.getChoice3(value);
            choice3 =five.getChoice4(value);
            choice4 =five.getChoice5(value);
            choice5 =five.getChoice6(value);
            choice6 =five.getChoice7(value);
            choice7 =five.getChoice8(value);
            choice8 =five.getChoice9(value);
            choice9 =five.getChoice10(value);
            answer =five.getCorrectAnswer(value);
            hint =five.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelsix")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=six.getQuestion(value);
            choice0 =six.getChoice1(value);
            choice1 =six.getChoice2(value);
            choice2 =six.getChoice3(value);
            choice3 =six.getChoice4(value);
            choice4 =six.getChoice5(value);
            choice5 =six.getChoice6(value);
            choice6 =six.getChoice7(value);
            choice7 =six.getChoice8(value);
            choice8 =six.getChoice9(value);
            choice9 =six.getChoice10(value);
            answer =six.getCorrectAnswer(value);
            hint =six.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelseven")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=seven.getQuestion(value);
            choice0 =seven.getChoice1(value);
            choice1 =seven.getChoice2(value);
            choice2 =seven.getChoice3(value);
            choice3 =seven.getChoice4(value);
            choice4 =seven.getChoice5(value);
            choice5 =seven.getChoice6(value);
            choice6 =seven.getChoice7(value);
            choice7 =seven.getChoice8(value);
            choice8 =seven.getChoice9(value);
            choice9 =seven.getChoice10(value);
            answer =seven.getCorrectAnswer(value);
            hint =seven.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("leveleight")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=eight.getQuestion(value);
            choice0 =eight.getChoice1(value);
            choice1 =eight.getChoice2(value);
            choice2 =eight.getChoice3(value);
            choice3 =eight.getChoice4(value);
            choice4 =eight.getChoice5(value);
            choice5 =eight.getChoice6(value);
            choice6 =eight.getChoice7(value);
            choice7 =eight.getChoice8(value);
            choice8 =eight.getChoice9(value);
            choice9 =eight.getChoice10(value);
            answer =eight.getCorrectAnswer(value);
            hint =eight.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelnine")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=nine.getQuestion(value);
            choice0 =nine.getChoice1(value);
            choice1 =nine.getChoice2(value);
            choice2 =nine.getChoice3(value);
            choice3 =nine.getChoice4(value);
            choice4 =nine.getChoice5(value);
            choice5 =nine.getChoice6(value);
            choice6 =nine.getChoice7(value);
            choice7 =nine.getChoice8(value);
            choice8 =nine.getChoice9(value);
            choice9 =nine.getChoice10(value);
            answer =nine.getCorrectAnswer(value);
            hint =nine.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelten")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=ten.getQuestion(value);
            choice0 =ten.getChoice1(value);
            choice1 =ten.getChoice2(value);
            choice2 =ten.getChoice3(value);
            choice3 =ten.getChoice4(value);
            choice4 =ten.getChoice5(value);
            choice5 =ten.getChoice6(value);
            choice6 =ten.getChoice7(value);
            choice7 =ten.getChoice8(value);
            choice8 =ten.getChoice9(value);
            choice9 =ten.getChoice10(value);
            answer =ten.getCorrectAnswer(value);
            hint =ten.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("leveleleven")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=eleven.getQuestion(value);
            choice0 =eleven.getChoice1(value);
            choice1 =eleven.getChoice2(value);
            choice2 =eleven.getChoice3(value);
            choice3 =eleven.getChoice4(value);
            choice4 =eleven.getChoice5(value);
            choice5 =eleven.getChoice6(value);
            choice6 =eleven.getChoice7(value);
            choice7 =eleven.getChoice8(value);
            choice8 =eleven.getChoice9(value);
            choice9 =eleven.getChoice10(value);
            answer =eleven.getCorrectAnswer(value);
            hint =eleven.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("leveltwelve")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=twelve.getQuestion(value);
            choice0 =twelve.getChoice1(value);
            choice1 =twelve.getChoice2(value);
            choice2 =twelve.getChoice3(value);
            choice3 =twelve.getChoice4(value);
            choice4 =twelve.getChoice5(value);
            choice5 =twelve.getChoice6(value);
            choice6 =twelve.getChoice7(value);
            choice7 =twelve.getChoice8(value);
            choice8 =twelve.getChoice9(value);
            choice9 =twelve.getChoice10(value);
            answer =twelve.getCorrectAnswer(value);
            hint =twelve.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelthirteen")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=thirteen.getQuestion(value);
            choice0 =thirteen.getChoice1(value);
            choice1 =thirteen.getChoice2(value);
            choice2 =thirteen.getChoice3(value);
            choice3 =thirteen.getChoice4(value);
            choice4 =thirteen.getChoice5(value);
            choice5 =thirteen.getChoice6(value);
            choice6 =thirteen.getChoice7(value);
            choice7 =thirteen.getChoice8(value);
            choice8 =thirteen.getChoice9(value);
            choice9 =thirteen.getChoice10(value);
            answer =thirteen.getCorrectAnswer(value);
            hint =thirteen.getHint(value);
            len = answer.length();
        }
        else if(cate.equals("levelfourteen")){
            checkingValue="";
            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");
            editText9.setText("");
            editText10.setText("");
            questionArrayV=fourteen.getQuestion(value);
            choice0 =fourteen.getChoice1(value);
            choice1 =fourteen.getChoice2(value);
            choice2 =fourteen.getChoice3(value);
            choice3 =fourteen.getChoice4(value);
            choice4 =fourteen.getChoice5(value);
            choice5 =fourteen.getChoice6(value);
            choice6 =fourteen.getChoice7(value);
            choice7 =fourteen.getChoice8(value);
            choice8 =fourteen.getChoice9(value);
            choice9 =fourteen.getChoice10(value);
            answer =fourteen.getCorrectAnswer(value);
            hint =fourteen.getHint(value);
            len = answer.length();
        }
    }
    public void placed(){
        choiceB1.setVisibility(View.VISIBLE);
        choiceB2.setVisibility(View.VISIBLE);
        choiceB3.setVisibility(View.VISIBLE);
        choiceB4.setVisibility(View.VISIBLE);
        choiceB5.setVisibility(View.VISIBLE);
        choiceB6.setVisibility(View.VISIBLE);
        choiceB7.setVisibility(View.VISIBLE);
        choiceB8.setVisibility(View.VISIBLE);
        choiceB9.setVisibility(View.VISIBLE);
        choiceB10.setVisibility(View.VISIBLE);
        for(int ar=0;ar<10;ar++){
            editArray[ar].setVisibility(View.GONE);
        }
        //len = answer.length();
        for(int r=0;r<len;r++){
            editArray[r].setVisibility(View.VISIBLE);
            //Toast.makeText(PlayArea.this,"hai"+editArray[r],Toast.LENGTH_SHORT).show();
        }
        choiceB1.setText(choice0);
        choiceB2.setText(choice1);
        choiceB3.setText(choice2);
        choiceB4.setText(choice3);
        choiceB5.setText(choice4);
        choiceB6.setText(choice5);
        choiceB7.setText(choice6);
        choiceB8.setText(choice7);
        choiceB9.setText(choice8);
        choiceB10.setText(choice9);
    }
    public void flipperView(){
        for(int r=0;r<len;r++){
            char charAtZero = answer.charAt(r);
            editArray[r].setText(charAtZero+"");
            //Toast.makeText(PlayArea.this,"hai"+editArray[r],Toast.LENGTH_SHORT).show();
        }
    }
    public void goldUpdate(){
        gold=myPrefs.getInt("GOLD", 0);
        gold=gold+10;
        editor.putInt("GOLD",gold);
        editor.apply();
        golden.setText(gold+"");
    }
}
