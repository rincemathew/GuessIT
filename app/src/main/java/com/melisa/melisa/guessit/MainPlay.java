package com.melisa.melisa.guessit;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainPlay extends Activity {

    Button play;
    Button dailychallenge;
    Button settings;
    Dialog myDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_play);

        play=findViewById(R.id.play);
        dailychallenge=findViewById(R.id.daily);
        settings=findViewById(R.id.settings);
        myDialog = new Dialog(this);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainPlay.this,levelStage.class);
                startActivity(intent);
                }
        });
        dailychallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPlay.this, "This option available only in pro version",
                        Toast.LENGTH_LONG).show();
                }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtclose;
                TextView mail,report,facebook,reset;


                myDialog.setContentView(R.layout.custompopup);
                txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
                facebook =(TextView) myDialog.findViewById(R.id.facebook);
                report =(TextView) myDialog.findViewById(R.id.report);
                mail =(TextView) myDialog.findViewById(R.id.mail);
                reset =(TextView) myDialog.findViewById(R.id.reset);
                txtclose.setText("X");
                //    btnFollow = (Button) myDialog.findViewById(R.id.btnfollow);
                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });
                mail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent(Intent.ACTION_SEND);
                        i.setType("message/rfc822");
                        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"melisamediacreations@gmail.com"});
                        i.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                        // i.putExtra(Intent.EXTRA_TEXT   , "body of email");
                        try {
                            startActivity(Intent.createChooser(i, "Send mail..."));
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(MainPlay.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

                report.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Intent.ACTION_SEND);
                        i.setType("message/rfc822");
                        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"melisamediacreations@gmail.com"});
                        i.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                        // i.putExtra(Intent.EXTRA_TEXT   , "body of email");
                        try {
                            startActivity(Intent.createChooser(i, "Send mail..."));
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(MainPlay.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                facebook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent sharingIntent = new Intent(Intent.ACTION_VIEW);
                        sharingIntent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=melisa"));
                        startActivity(sharingIntent);

                    }
                });
                reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainPlay.this, "cache cleared",
                                Toast.LENGTH_LONG).show();

                    }
                });
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();

            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}
