package com.melisa.melisa.guessit;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
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

public class questionActivityOneThree extends Activity{


    private QuestionLibrary4 mQuestionLibrary4 = new QuestionLibrary4();
    private QuestionLibrary5 mQuestionLibrary5 = new QuestionLibrary5();
    private QuestionLibrary6 mQuestionLibrary6 = new QuestionLibrary6();
    private QuestionLibrary7 mQuestionLibrary7 = new QuestionLibrary7();
    private QuestionLibrary8 mQuestionLibrary8 = new QuestionLibrary8();
    private QuestionLibrary9 mQuestionLibrary9 = new QuestionLibrary9();
    private QuestionLibrary10 mQuestionLibrary10 = new QuestionLibrary10();
    private QuestionLibrary11 mQuestionLibrary11 = new QuestionLibrary11();
    private QuestionLibrary12 mQuestionLibrary12 = new QuestionLibrary12();
    private QuestionLibrary13 mQuestionLibrary13 = new QuestionLibrary13();
    private QuestionLibrary14 mQuestionLibrary14 = new QuestionLibrary14();
    private QuestionLibrary15 mQuestionLibrary15 = new QuestionLibrary15();
    private QuestionLibrary16 mQuestionLibrary16 = new QuestionLibrary16();
    private QuestionLibrary17 mQuestionLibrary17 = new QuestionLibrary17();
    private QuestionLibrary18 mQuestionLibrary18 = new QuestionLibrary18();
    private QuestionLibrary19 mQuestionLibrary19 = new QuestionLibrary19();
    private QuestionLibrary20 mQuestionLibrary20 = new QuestionLibrary20();
    private QuestionLibrary21 mQuestionLibrary21 = new QuestionLibrary21();
    private QuestionLibrary22 mQuestionLibrary22 = new QuestionLibrary22();
    private QuestionLibrary23 mQuestionLibrary23 = new QuestionLibrary23();
    private QuestionLibrary24 mQuestionLibrary24 = new QuestionLibrary24();
    private QuestionLibrary25 mQuestionLibrary25 = new QuestionLibrary25();
    private QuestionLibrary26 mQuestionLibrary26 = new QuestionLibrary26();
    private QuestionLibrary27 mQuestionLibrary27 = new QuestionLibrary27();
    private QuestionLibrary28 mQuestionLibrary28 = new QuestionLibrary28();
    private QuestionLibrary29 mQuestionLibrary29 = new QuestionLibrary29();
    private QuestionLibrary30 mQuestionLibrary30 = new QuestionLibrary30();




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

    int no;
    int questionNumber=0;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    ViewFlipper VF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one_two);




        MobileAds.initialize(this,"ca-app-pub-6234689785392855/1695623537");
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
        countDownTimer = new questionActivityOneThree.MyCountDownTimer(startTime, interval);
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



//        Intent intent = getIntent();
//        no = intent.getIntExtra("numbers",0);
        //     Intent intent = getIntent();
        Intent intent = getIntent();
        String categoryValue = intent.getStringExtra("category");
        no = intent.getIntExtra("categoryLevel",0);
        category.setText(categoryValue);
       // Toast.makeText(questionActivityOneThree.this, ""+no,  Toast.LENGTH_LONG).show();
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
                   // Toast.makeText(questionActivityOneThree.this, "correct", Toast.LENGTH_SHORT).show();
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
                 //   Toast.makeText(questionActivityOneThree.this, "Wrong", Toast.LENGTH_SHORT).show();
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

                if (no == 4) {
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
                    mButtonChoice11.setText(mQuestionLibrary4.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary4.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary4.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary4.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary4.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary4.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary4.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary4.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary4.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary4.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 5){

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
                    mButtonChoice11.setText(mQuestionLibrary5.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary5.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary5.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary5.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary5.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary5.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary5.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary5.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary5.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary5.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }

                else if (no == 6){
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
                    mButtonChoice11.setText(mQuestionLibrary6.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary6.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary6.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary6.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary6.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary6.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary6.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary6.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary6.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary6.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 7){
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
                    mButtonChoice11.setText(mQuestionLibrary7.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary7.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary7.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary7.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary7.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary7.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary7.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary7.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary7.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary7.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 8){
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
                    mButtonChoice11.setText(mQuestionLibrary8.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary8.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary8.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary8.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary8.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary8.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary8.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary8.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary8.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary8.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 9){
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
                    mButtonChoice11.setText(mQuestionLibrary9.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary9.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary9.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary9.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary9.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary9.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary9.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary9.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary9.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary9.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 10){
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
                    mButtonChoice11.setText(mQuestionLibrary10.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary10.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary10.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary10.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary10.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary10.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary10.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary10.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary10.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary10.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 11){
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
                    mButtonChoice11.setText(mQuestionLibrary11.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary11.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary11.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary11.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary11.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary11.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary11.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary11.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary11.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary11.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 12){
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
                    mButtonChoice11.setText(mQuestionLibrary12.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary12.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary12.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary12.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary12.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary12.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary12.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary12.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary12.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary12.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 13){
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
                    mButtonChoice11.setText(mQuestionLibrary13.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary13.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary13.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary13.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary13.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary13.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary13.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary13.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary13.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary13.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 14){
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
                    mButtonChoice11.setText(mQuestionLibrary14.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary14.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary14.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary14.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary14.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary14.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary14.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary14.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary14.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary14.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 15){
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
                    mButtonChoice11.setText(mQuestionLibrary15.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary15.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary15.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary15.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary15.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary15.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary15.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary15.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary15.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary15.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 16){
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
                    mButtonChoice11.setText(mQuestionLibrary16.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary16.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary16.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary16.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary16.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary16.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary16.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary16.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary16.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary16.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 17){
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
                    mButtonChoice11.setText(mQuestionLibrary17.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary17.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary17.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary17.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary17.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary17.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary17.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary17.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary17.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary17.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 18){
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
                    mButtonChoice11.setText(mQuestionLibrary18.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary18.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary18.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary18.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary18.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary18.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary18.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary18.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary18.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary18.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 19){
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
                    mButtonChoice11.setText(mQuestionLibrary19.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary19.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary19.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary19.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary19.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary19.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary19.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary19.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary19.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary19.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 20){
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
                    mButtonChoice11.setText(mQuestionLibrary20.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary20.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary20.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary20.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary20.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary20.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary20.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary20.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary20.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary20.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 21){
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
                    mButtonChoice11.setText(mQuestionLibrary21.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary21.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary21.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary21.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary21.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary21.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary21.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary21.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary21.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary21.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 22){
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
                    mButtonChoice11.setText(mQuestionLibrary22.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary22.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary22.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary22.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary22.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary22.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary22.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary22.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary22.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary22.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 23){
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
                    mButtonChoice11.setText(mQuestionLibrary23.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary23.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary23.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary23.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary23.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary23.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary23.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary23.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary23.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary23.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 24){
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
                    mButtonChoice11.setText(mQuestionLibrary24.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary24.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary24.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary24.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary24.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary24.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary24.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary24.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary24.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary24.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 25){
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
                    mButtonChoice11.setText(mQuestionLibrary25.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary25.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary25.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary25.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary25.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary25.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary25.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary25.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary25.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary25.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 26){
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
                    mButtonChoice11.setText(mQuestionLibrary26.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary26.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary26.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary26.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary26.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary26.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary26.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary26.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary26.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary26.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 27){
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
                    mButtonChoice11.setText(mQuestionLibrary27.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary27.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary27.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary27.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary27.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary27.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary27.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary27.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary27.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary27.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 28){
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
                    mButtonChoice11.setText(mQuestionLibrary28.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary28.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary28.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary28.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary28.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary28.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary28.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary28.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary28.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary28.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 29){
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
                    mButtonChoice11.setText(mQuestionLibrary29.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary29.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary29.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary29.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary29.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary29.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary29.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary29.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary29.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary29.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                else if (no == 30){
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
                    mButtonChoice11.setText(mQuestionLibrary30.getChoice1(mQuestionNumber));
                    if (mButtonChoice11.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice11.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice12.setVisibility(View.VISIBLE);
                    mButtonChoice12.setText(mQuestionLibrary30.getChoice2(mQuestionNumber));
                    if (mButtonChoice12.getText().toString().equals("")){
                        mButtonChoice12.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice13.setVisibility(View.VISIBLE);
                    mButtonChoice13.setText(mQuestionLibrary30.getChoice3(mQuestionNumber));
                    if (mButtonChoice13.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice13.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice14.setVisibility(View.VISIBLE);
                    mButtonChoice14.setText(mQuestionLibrary30.getChoice4(mQuestionNumber));
                    if (mButtonChoice14.getText().toString().equals("")){
                        // mButtonChoice11.setText("1");
                        mButtonChoice14.setVisibility(View.INVISIBLE);

                    }else{

                    }
                    mButtonChoice15.setVisibility(View.VISIBLE);
                    mButtonChoice15.setText(mQuestionLibrary30.getChoice5(mQuestionNumber));
                    if (mButtonChoice15.getText().toString().equals("")){
                        mButtonChoice15.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice21.setVisibility(View.VISIBLE);
                    mButtonChoice21.setText(mQuestionLibrary30.getChoice6(mQuestionNumber));
                    if (mButtonChoice21.getText().toString().equals("")){
                        mButtonChoice21.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice22.setVisibility(View.VISIBLE);
                    mButtonChoice22.setText(mQuestionLibrary30.getChoice7(mQuestionNumber));
                    if (mButtonChoice22.getText().toString().equals("")){
                        mButtonChoice22.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice23.setVisibility(View.VISIBLE);
                    mButtonChoice23.setText(mQuestionLibrary30.getChoice8(mQuestionNumber));
                    if (mButtonChoice23.getText().toString().equals("")){
                        mButtonChoice23.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice24.setVisibility(View.VISIBLE);
                    mButtonChoice24.setText(mQuestionLibrary30.getChoice9(mQuestionNumber));
                    if (mButtonChoice24.getText().toString().equals("")){
                        mButtonChoice24.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    mButtonChoice25.setVisibility(View.VISIBLE);
                    mButtonChoice25.setText(mQuestionLibrary30.getChoice10(mQuestionNumber));
                    if (mButtonChoice25.getText().toString().equals("")){
                        mButtonChoice25.setVisibility(View.INVISIBLE);
                    }else{
                    }
                    //editText.setText("");
                    mQuestionNumber++;

                }
                }
        });

    }


    private void updateQuestion(){
        if (no == 4) {

            if (mQuestionNumber < mQuestionLibrary4.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary4.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary4.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary4.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary4.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary4.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary4.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary4.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary4.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary4.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary4.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary4.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary4.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }
        else if (no == 5){

            if (mQuestionNumber < mQuestionLibrary5.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary5.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary5.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary5.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary5.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary5.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary5.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary5.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary5.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary5.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary5.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary5.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary5.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 6){

            if (mQuestionNumber < mQuestionLibrary6.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary6.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary6.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary6.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary6.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary6.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary6.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary6.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary6.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary6.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary6.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary6.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary6.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 7){

            if (mQuestionNumber < mQuestionLibrary7.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary7.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary7.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary7.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary7.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary7.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary7.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary7.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary7.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary7.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary7.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary7.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary7.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 8){

            if (mQuestionNumber < mQuestionLibrary8.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary8.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary8.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary8.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary8.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary8.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary8.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary8.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary8.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary8.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary8.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary8.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary8.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 9){

            if (mQuestionNumber < mQuestionLibrary9.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary9.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary9.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary9.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary9.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary9.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary9.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary9.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary9.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary9.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary9.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary9.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary9.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 10){

            if (mQuestionNumber < mQuestionLibrary10.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary10.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary10.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary10.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary10.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary10.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary10.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary10.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary10.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary10.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary10.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary10.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary10.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 11){

            if (mQuestionNumber < mQuestionLibrary11.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary11.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary11.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary11.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary11.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary11.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary11.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary11.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary11.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary11.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary11.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary11.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary11.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 12){

            if (mQuestionNumber < mQuestionLibrary12.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary12.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary12.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary12.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary12.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary12.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary12.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary12.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary12.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary12.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary12.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary12.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary12.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 13){

            if (mQuestionNumber < mQuestionLibrary13.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary13.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary13.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary13.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary13.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary13.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary13.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary13.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary13.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary13.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary13.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary13.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary13.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 14){

            if (mQuestionNumber < mQuestionLibrary14.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary14.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary14.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary14.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary14.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary14.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary14.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary14.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary14.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary14.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary14.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary14.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary14.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 15){

            if (mQuestionNumber < mQuestionLibrary15.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary15.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary15.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary15.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary15.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary15.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary15.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary15.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary15.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary15.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary15.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary15.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary15.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 16){

            if (mQuestionNumber < mQuestionLibrary16.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary16.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary16.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary16.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary16.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary16.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary16.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary16.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary16.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary16.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary16.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary16.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary16.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 17){

            if (mQuestionNumber < mQuestionLibrary17.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary17.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary17.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary17.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary17.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary17.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary17.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary17.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary17.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary17.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary17.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary17.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary17.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 18){

            if (mQuestionNumber < mQuestionLibrary18.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary18.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary18.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary18.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary18.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary18.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary18.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary18.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary18.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary18.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary18.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary18.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary18.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 19){

            if (mQuestionNumber < mQuestionLibrary19.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary19.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary19.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary19.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary19.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary19.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary19.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary19.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary19.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary19.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary19.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary19.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary19.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 20){

            if (mQuestionNumber < mQuestionLibrary20.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary20.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary20.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary20.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary20.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary20.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary20.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary20.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary20.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary20.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary20.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary20.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary20.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 21){

            if (mQuestionNumber < mQuestionLibrary21.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary21.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary21.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary21.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary21.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary21.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary21.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary21.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary21.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary21.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary21.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary21.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary21.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 22){

            if (mQuestionNumber < mQuestionLibrary22.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary22.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary22.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary22.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary22.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary22.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary22.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary22.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary22.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary22.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary22.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary22.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary22.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 23){

            if (mQuestionNumber < mQuestionLibrary23.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary23.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary23.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary23.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary23.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary23.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary23.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary23.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary23.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary23.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary23.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary23.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary23.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 24){

            if (mQuestionNumber < mQuestionLibrary24.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary24.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary24.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary24.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary24.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary24.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary24.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary24.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary24.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary24.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary24.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary24.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary24.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 25){

            if (mQuestionNumber < mQuestionLibrary25.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary25.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary25.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary25.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary25.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary25.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary25.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary25.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary25.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary25.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary25.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary25.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary25.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 26){

            if (mQuestionNumber < mQuestionLibrary26.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary26.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary26.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary26.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary26.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary26.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary26.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary26.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary26.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary26.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary26.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary26.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary26.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 27){

            if (mQuestionNumber < mQuestionLibrary27.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary27.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary27.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary27.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary27.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary27.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary27.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary27.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary27.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary27.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary27.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary27.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary27.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 28){

            if (mQuestionNumber < mQuestionLibrary28.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary28.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary28.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary28.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary28.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary28.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary28.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary28.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary28.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary28.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary28.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary28.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary28.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 29){

            if (mQuestionNumber < mQuestionLibrary29.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary29.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary29.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary29.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary29.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary29.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary29.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary29.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary29.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary29.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary29.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary29.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary29.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

        else if (no == 30){

            if (mQuestionNumber < mQuestionLibrary30.getLength()) {
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

                mQuestionView.setImageResource(mQuestionLibrary30.getQuestion(mQuestionNumber));
                mButtonChoice11.setVisibility(View.VISIBLE);
                mButtonChoice11.setText(mQuestionLibrary30.getChoice1(mQuestionNumber));
                if (mButtonChoice11.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice11.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice12.setVisibility(View.VISIBLE);
                mButtonChoice12.setText(mQuestionLibrary30.getChoice2(mQuestionNumber));
                if (mButtonChoice12.getText().toString().equals("")){
                    mButtonChoice12.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice13.setVisibility(View.VISIBLE);
                mButtonChoice13.setText(mQuestionLibrary30.getChoice3(mQuestionNumber));
                if (mButtonChoice13.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice13.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice14.setVisibility(View.VISIBLE);
                mButtonChoice14.setText(mQuestionLibrary30.getChoice4(mQuestionNumber));
                if (mButtonChoice14.getText().toString().equals("")){
                    // mButtonChoice11.setText("1");
                    mButtonChoice14.setVisibility(View.INVISIBLE);

                }else{

                }
                mButtonChoice15.setVisibility(View.VISIBLE);
                mButtonChoice15.setText(mQuestionLibrary30.getChoice5(mQuestionNumber));
                if (mButtonChoice15.getText().toString().equals("")){
                    mButtonChoice15.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice21.setVisibility(View.VISIBLE);
                mButtonChoice21.setText(mQuestionLibrary30.getChoice6(mQuestionNumber));
                if (mButtonChoice21.getText().toString().equals("")){
                    mButtonChoice21.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice22.setVisibility(View.VISIBLE);
                mButtonChoice22.setText(mQuestionLibrary30.getChoice7(mQuestionNumber));
                if (mButtonChoice22.getText().toString().equals("")){
                    mButtonChoice22.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice23.setVisibility(View.VISIBLE);
                mButtonChoice23.setText(mQuestionLibrary30.getChoice8(mQuestionNumber));
                if (mButtonChoice23.getText().toString().equals("")){
                    mButtonChoice23.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice24.setVisibility(View.VISIBLE);
                mButtonChoice24.setText(mQuestionLibrary30.getChoice9(mQuestionNumber));
                if (mButtonChoice24.getText().toString().equals("")){
                    mButtonChoice24.setVisibility(View.INVISIBLE);
                }else{
                }
                mButtonChoice25.setVisibility(View.VISIBLE);
                mButtonChoice25.setText(mQuestionLibrary30.getChoice10(mQuestionNumber));
                if (mButtonChoice25.getText().toString().equals("")){
                    mButtonChoice25.setVisibility(View.INVISIBLE);
                }else{
                }
                mAnswer = mQuestionLibrary30.getCorrectAnswer(mQuestionNumber);
                length = mAnswer.length();
                sexAnswerBox();
                mQuestionNumber++;


            } else {
                countDownTimer.cancel();
                Intent intent = new Intent(questionActivityOneThree.this, AnswerOne.class);
                intent.putExtra("score", mScore);
                startActivity(intent);
            }

        }

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
        Intent intent = new Intent(questionActivityOneThree.this, levelStage.class);
        intent.putExtra("score", mScore);
        startActivity(intent);

    }

}
