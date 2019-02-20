package com.melisa.melisa.guessit;

import android.app.Activity;
import android.arch.core.util.Function;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class quizActivityOne extends Activity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    // private CodingandDecodingQuestionLibrary CodingandDecodingQuestionLibrary = new CodingandDecodingQuestionLibrary();

    private TextView mScoreView;
    private ImageView mQuestionView;
    private Button mButtonChoice11;
    private Button mButtonChoice12;
    private Button mButtonChoice13;
    private Button mButtonChoice14;
    private Button mButtonChoice15;
    private Button mButtonChoice21;
    private Button mButtonChoice22;
    private Button mButtonChoice23;
    private Button mButtonChoice24;
    private Button mButtonChoice25;
    private Button submit;
    private Button back;
    LinearLayout submitandback,optionLayout1,optionLayout2,adMobLayout;
    TextView QuestionNumber,oopsText,category;

    int length;

    TextView countDown;
    private CountDownTimer countDownTimer;
    private boolean timerHasStarted = false;
    private final long startTime = 20 * 1000;
    private final long interval = 1 * 1000;

    //delay
    int secs = 2;

    String answerValue="";

    AdView madView;

    EditText editText,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9,editText10;

    int no=1;
    int questionNumber=0;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    ViewFlipper VF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_one);

        MobileAds.initialize(this,"ca-app-pub-6234689785392855~1030792716");
        madView=findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        madView.loadAd(adRequest);



        LinearLayout RB1 =  findViewById(R.id.optionLayout1);
        LinearLayout RB2 =  findViewById(R.id.optionLayout12);
        LinearLayout RB3 =  findViewById(R.id.optionLayout13);
        VF = (ViewFlipper) findViewById(R.id.ViewFlipper01);



        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (ImageView) findViewById(R.id.question);
        mButtonChoice11 = (Button)findViewById(R.id.choice1);
        mButtonChoice12 = (Button)findViewById(R.id.choice2);
        mButtonChoice13 = (Button)findViewById(R.id.choice3);
        mButtonChoice14 = (Button)findViewById(R.id.choice4);
        mButtonChoice15 = (Button)findViewById(R.id.choice5);
        mButtonChoice21 = (Button)findViewById(R.id.choice21);
        mButtonChoice22 = (Button)findViewById(R.id.choice22);
        mButtonChoice23 = (Button)findViewById(R.id.choice23);
        mButtonChoice24 = (Button)findViewById(R.id.choice24);
        mButtonChoice25 = (Button)findViewById(R.id.choice25);
        submit = (Button)findViewById(R.id.submit);
        back = (Button)findViewById(R.id.back);
        submitandback=(LinearLayout)findViewById(R.id.submitlayout);
        optionLayout1=findViewById(R.id.optionLayout1);
        optionLayout2=findViewById(R.id.optionLayout2);
        adMobLayout=findViewById(R.id.admobLinear);
        QuestionNumber=findViewById(R.id.questionNumber);
        oopsText=findViewById(R.id.oopstext);
        category=findViewById(R.id.category);


        countDown=findViewById(R.id.countDown);
        countDownTimer = new quizActivityOne.MyCountDownTimer(startTime, interval);
        countDown.setText(countDown.getText() + String.valueOf(startTime / 1000));

        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);
        editText5 = (EditText)findViewById(R.id.editText5);
        editText6 = (EditText)findViewById(R.id.editText6);
        editText7 = (EditText)findViewById(R.id.editText7);
        editText8 = (EditText)findViewById(R.id.editText8);
        editText9 = (EditText)findViewById(R.id.editText9);
        editText10 = (EditText)findViewById(R.id.editText10);


        if (no==1){

        }

//        Intent intent = getIntent();
//        no = intent.getIntExtra("numbers",0);
        //     Intent intent = getIntent();
        Intent intent = getIntent();
        String categoryValue = intent.getStringExtra("category");
        category.setText(categoryValue);
        updateQuestion();

        //Start of Button Listener for Button1
        mButtonChoice11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

//                editText.setText(editText.getText()+mButtonChoice11.getText().toString());
//                mButtonChoice11.setText("");
//                mButtonChoice11.setVisibility(View.INVISIBLE);
                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice11.getText().toString());
                    answerValue=answerValue+mButtonChoice11.getText().toString();
                    mButtonChoice11.setText("");
                    mButtonChoice11.setVisibility(View.INVISIBLE);
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice12.getText().toString());
                    answerValue=answerValue+mButtonChoice12.getText().toString();
                    mButtonChoice12.setText("");
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice13.getText().toString());
                    answerValue=answerValue+mButtonChoice13.getText().toString();
                    mButtonChoice13.setText("");
                    mButtonChoice13.setVisibility(View.INVISIBLE);
                }


            }
        });

        mButtonChoice14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here


//                String sap=mButtonChoice14.getText().toString();
//                editText.setText(editText.getText()+sap);
//                mButtonChoice14.setText("");
//                mButtonChoice14.setVisibility(View.INVISIBLE);

                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice14.getText().toString());
                    answerValue=answerValue+mButtonChoice14.getText().toString();
                    mButtonChoice14.setText("");
                    mButtonChoice14.setVisibility(View.INVISIBLE);
                }



            }
        });

        mButtonChoice15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here




//                editText.setText(editText.getText()+mButtonChoice15.getText().toString());
//                mButtonChoice15.setText("");
//                mButtonChoice15.setVisibility(View.INVISIBLE);
                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice15.getText().toString());
                    answerValue=answerValue+mButtonChoice15.getText().toString();
                    mButtonChoice15.setText("");
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }


            }
        });

        mButtonChoice21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice21.getText().toString());
                    answerValue=answerValue+mButtonChoice21.getText().toString();
                    mButtonChoice21.setText("");
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }
            }
        });

        mButtonChoice22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice22.getText().toString());
                    answerValue=answerValue+mButtonChoice22.getText().toString();
                    mButtonChoice22.setText("");
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }
            }
        });

        mButtonChoice23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice23.getText().toString());
                    answerValue=answerValue+mButtonChoice23.getText().toString();
                    mButtonChoice23.setText("");
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }
            }
        });
        mButtonChoice24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice24.getText().toString());
                    answerValue=answerValue+mButtonChoice24.getText().toString();
                    mButtonChoice24.setText("");
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }
            }
        });
        mButtonChoice25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if ((editText.getText().toString().equals(""))  && (editText.getVisibility()==View.VISIBLE)){
                    editText.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }
                else if ((editText2.getText().toString().equals(""))  && (editText2.getVisibility()==View.VISIBLE)){
                    editText2.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }
                else if ((editText3.getText().toString().equals(""))  && (editText3.getVisibility()==View.VISIBLE)){
                    editText3.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }

                else if ((editText4.getText().toString().equals(""))  && (editText4.getVisibility()==View.VISIBLE)){
                    editText4.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);


                }
                else if ((editText5.getText().toString().equals(""))  && (editText5.getVisibility()==View.VISIBLE)){
                    editText5.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);

                }
                else if ((editText6.getText().toString().equals(""))  && (editText6.getVisibility()==View.VISIBLE)){
                    editText6.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }
                else if ((editText7.getText().toString().equals(""))  && (editText7.getVisibility()==View.VISIBLE)){
                    editText7.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }
                else if ((editText8.getText().toString().equals(""))  && (editText8.getVisibility()==View.VISIBLE)){
                    editText8.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }
                else if ((editText9.getText().toString().equals(""))  && (editText9.getVisibility()==View.VISIBLE)){
                    editText9.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }
                else if ((editText10.getText().toString().equals(""))  && (editText10.getVisibility()==View.VISIBLE)){
                    editText10.setText(mButtonChoice25.getText().toString());
                    answerValue=answerValue+mButtonChoice25.getText().toString();
                    mButtonChoice25.setText("");
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                countDownTimer.cancel();
                //My logic for Button goes in here

                if (answerValue.toString().equals(mAnswer.toString())){
                    mScore = mScore + 1;
                    mScoreView.setText("" + mScore);

                    //        updateScore(mScore);


//                    submitandback.setBackgroundColor(Color.parseColor("#07ff6a"));
//                    optionLayout1.setBackgroundColor(Color.parseColor("#07ff6a"));
//                    optionLayout2.setBackgroundColor(Color.parseColor("#07ff6a"));
                    adMobLayout.setBackgroundColor(Color.parseColor("#07ff6a"));
                    VF.setDisplayedChild(1);

                    //This line of code is optiona
                   // Toast.makeText(quizActivityOne.this, "correct", Toast.LENGTH_SHORT).show();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
//                            submitandback.setBackgroundColor(Color.parseColor("#fec619"));
//                            optionLayout1.setBackgroundColor(Color.parseColor("#fec619"));
//                            optionLayout2.setBackgroundColor(Color.parseColor("#fec619"));
                            adMobLayout.setBackgroundColor(Color.parseColor("#fec619"));
                            VF.setDisplayedChild(0);
                            updateQuestion();

                        }
                    });

                }else {
                    adMobLayout.setBackgroundColor(Color.parseColor("#fc271f"));
                    VF.setDisplayedChild(2);
                    oopsText.setText(mAnswer);
                 //   Toast.makeText(quizActivityOne.this, "Wrong", Toast.LENGTH_SHORT).show();
                    Utils.delay(secs, new Utils.DelayCallback() {
                        @Override
                        public void afterDelay() {
                            adMobLayout.setBackgroundColor(Color.parseColor("#fec619"));
                            VF.setDisplayedChild(0);
                            updateQuestion();

                        }
                    });
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                mQuestionNumber--;
                answerValue="";
                editText.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");
                editText5.setText("");
                editText6.setText("");
                editText7.setText("");
                editText8.setText("");
                editText9.setText("");
                editText10.setText("");

                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                //editText.setText("");
                mQuestionNumber++;

            }
        });

    }


    private void updateQuestion(){
        if (no == 1) {

            if (mQuestionNumber < mQuestionLibrary.getLength()) {
                questionone();


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(quizActivityOne.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }
        else if (no == 2){

//            if (mQuestionNumber < CodingandDecodingQuestionLibrary.getLength()) {
//                mQuestionView.setText(CodingandDecodingQuestionLibrary.getQuestion(mQuestionNumber));
//                mButtonChoice1.setText(CodingandDecodingQuestionLibrary.getChoice1(mQuestionNumber));
//                mButtonChoice2.setText(CodingandDecodingQuestionLibrary.getChoice2(mQuestionNumber));
//                mButtonChoice3.setText(CodingandDecodingQuestionLibrary.getChoice3(mQuestionNumber));
//                mButtonChoice4.setText(CodingandDecodingQuestionLibrary.getChoice4(mQuestionNumber));
//                mAnswer = CodingandDecodingQuestionLibrary.getCorrectAnswer(mQuestionNumber);
//                mQuestionNumber++;
//            } else {
//                Intent intent = new Intent(Quiz2Activity.this, ResultofEvery.class);
//                intent.putExtra("score", mScore);
//                startActivity(intent);
//            }


        }

    }

    private void questionone() {

        questionNumber=questionNumber+1;
        QuestionNumber.setText(""+questionNumber);

        answerValue="";

        editText.setText("");
        editText2.setText("");
        editText3.setText("");
        editText4.setText("");
        editText5.setText("");
        editText6.setText("");
        editText7.setText("");
        editText8.setText("");
        editText9.setText("");
        editText10.setText("");

        countDownTimer.start();

        mQuestionView.setImageResource(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice11.setVisibility(View.VISIBLE);
        mButtonChoice11.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        if (mButtonChoice11.getText().toString().equals("")){
            // mButtonChoice11.setText("1");
            mButtonChoice11.setVisibility(View.INVISIBLE);

        }else{

        }
        mButtonChoice12.setVisibility(View.VISIBLE);
        mButtonChoice12.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        if (mButtonChoice12.getText().toString().equals("")){
            mButtonChoice12.setVisibility(View.INVISIBLE);
        }else{
        }
        mButtonChoice13.setVisibility(View.VISIBLE);
        mButtonChoice13.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        if (mButtonChoice13.getText().toString().equals("")){
            // mButtonChoice11.setText("1");
            mButtonChoice13.setVisibility(View.INVISIBLE);

        }else{

        }
        mButtonChoice14.setVisibility(View.VISIBLE);
        mButtonChoice14.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
        if (mButtonChoice14.getText().toString().equals("")){
            // mButtonChoice11.setText("1");
            mButtonChoice14.setVisibility(View.INVISIBLE);

        }else{

        }
        mButtonChoice15.setVisibility(View.VISIBLE);
        mButtonChoice15.setText(mQuestionLibrary.getChoice5(mQuestionNumber));
        if (mButtonChoice15.getText().toString().equals("")){
            mButtonChoice15.setVisibility(View.INVISIBLE);
        }else{
        }
        mButtonChoice21.setVisibility(View.VISIBLE);
        mButtonChoice21.setText(mQuestionLibrary.getChoice6(mQuestionNumber));
        if (mButtonChoice21.getText().toString().equals("")){
            mButtonChoice21.setVisibility(View.INVISIBLE);
        }else{
        }
        mButtonChoice22.setVisibility(View.VISIBLE);
        mButtonChoice22.setText(mQuestionLibrary.getChoice7(mQuestionNumber));
        if (mButtonChoice22.getText().toString().equals("")){
            mButtonChoice22.setVisibility(View.INVISIBLE);
        }else{
        }
        mButtonChoice23.setVisibility(View.VISIBLE);
        mButtonChoice23.setText(mQuestionLibrary.getChoice8(mQuestionNumber));
        if (mButtonChoice23.getText().toString().equals("")){
            mButtonChoice23.setVisibility(View.INVISIBLE);
        }else{
        }
        mButtonChoice24.setVisibility(View.VISIBLE);
        mButtonChoice24.setText(mQuestionLibrary.getChoice9(mQuestionNumber));
        if (mButtonChoice24.getText().toString().equals("")){
            mButtonChoice24.setVisibility(View.INVISIBLE);
        }else{
        }
        mButtonChoice25.setVisibility(View.VISIBLE);
        mButtonChoice25.setText(mQuestionLibrary.getChoice10(mQuestionNumber));
        if (mButtonChoice25.getText().toString().equals("")){
            mButtonChoice25.setVisibility(View.INVISIBLE);
        }else{
        }
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        length = mAnswer.length();
        sexAnswerBox();
        mQuestionNumber++;
        // editText.setText("");
    }

    private void sexAnswerBox() {
        if (length == 1){

        }
        else if (length == 2){
            editText.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            editText3.setVisibility(View.INVISIBLE);
            editText4.setVisibility(View.INVISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.INVISIBLE);
            editText8.setVisibility(View.INVISIBLE);
            editText9.setVisibility(View.INVISIBLE);
            editText10.setVisibility(View.INVISIBLE);

        }
        else if (length == 3){
            editText.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            editText3.setVisibility(View.INVISIBLE);
            editText4.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.INVISIBLE);
            editText8.setVisibility(View.INVISIBLE);
            editText9.setVisibility(View.INVISIBLE);
            editText10.setVisibility(View.INVISIBLE);

        }
        else if (length == 4){
            editText.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            editText3.setVisibility(View.INVISIBLE);
            editText4.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.VISIBLE);
            editText8.setVisibility(View.INVISIBLE);
            editText9.setVisibility(View.INVISIBLE);
            editText10.setVisibility(View.INVISIBLE);

        }
        else if (length == 5){
            editText.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            editText3.setVisibility(View.VISIBLE);
            editText4.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.VISIBLE);
            editText8.setVisibility(View.INVISIBLE);
            editText9.setVisibility(View.INVISIBLE);
            editText10.setVisibility(View.INVISIBLE);

        }
        else if (length == 6){
            editText.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            editText3.setVisibility(View.VISIBLE);
            editText4.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.VISIBLE);
            editText8.setVisibility(View.VISIBLE);
            editText9.setVisibility(View.INVISIBLE);
            editText10.setVisibility(View.INVISIBLE);

        }
        else if (length == 7){
            editText.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.INVISIBLE);
            editText3.setVisibility(View.VISIBLE);
            editText4.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.VISIBLE);
            editText8.setVisibility(View.VISIBLE);
            editText9.setVisibility(View.VISIBLE);
            editText10.setVisibility(View.INVISIBLE);

        }
        else if (length == 8){
            editText.setVisibility(View.INVISIBLE);
            editText2.setVisibility(View.VISIBLE);
            editText3.setVisibility(View.VISIBLE);
            editText4.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.VISIBLE);
            editText8.setVisibility(View.VISIBLE);
            editText9.setVisibility(View.VISIBLE);
            editText10.setVisibility(View.INVISIBLE);

        }
        else if (length == 9){
            editText.setVisibility(View.VISIBLE);
            editText2.setVisibility(View.VISIBLE);
            editText3.setVisibility(View.VISIBLE);
            editText4.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.VISIBLE);
            editText8.setVisibility(View.VISIBLE);
            editText9.setVisibility(View.VISIBLE);
            editText10.setVisibility(View.INVISIBLE);

        }
        else if (length == 10){
            editText.setVisibility(View.VISIBLE);
            editText2.setVisibility(View.VISIBLE);
            editText3.setVisibility(View.VISIBLE);
            editText4.setVisibility(View.VISIBLE);
            editText5.setVisibility(View.VISIBLE);
            editText6.setVisibility(View.VISIBLE);
            editText7.setVisibility(View.VISIBLE);
            editText8.setVisibility(View.VISIBLE);
            editText9.setVisibility(View.VISIBLE);
            editText10.setVisibility(View.VISIBLE);

        }
    }


    //    private void updateScore(int point) {
//        mScoreView.setText("" + mScore);
//    }
    public class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }
        @Override
        public void onFinish() {
//            adMobLayout.setBackgroundColor(Color.parseColor("#fc271f"));
//            VF.setDisplayedChild(2);
//            Toast.makeText(questionActivityOneTwo.this, "Wrong", Toast.LENGTH_SHORT).show();
//            Utils.delay(secs, new Utils.DelayCallback() {
//                @Override
//                public void afterDelay() {
//                    adMobLayout.setBackgroundColor(Color.parseColor("#fec619"));
//                    VF.setDisplayedChild(0);
//                    updateQuestion();
//
//                }
//            });
            submit.performClick();

            // updateQuestion();
        }
        @Override
        public void onTick(long millisUntilFinished) {
            countDown.setText("" + millisUntilFinished / 1000);
            if (millisUntilFinished<=10200){
                countDown.setTextColor(Color.RED);
            }else {
                countDown.setTextColor(Color.BLUE);
            }

        }

    }

    @Override
    public void onBackPressed() {
        countDownTimer.cancel();
        Intent intent = new Intent(quizActivityOne.this, levelStage.class);
        intent.putExtra("score", mScore);
        startActivity(intent);

    }

}
