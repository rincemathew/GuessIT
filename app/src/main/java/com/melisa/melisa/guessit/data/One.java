package com.melisa.melisa.guessit.data;

import android.content.SharedPreferences;

import com.melisa.melisa.guessit.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class One {
    private Integer mQuestions [] = {
            R.drawable.toucan,
            R.drawable.peanut,
            R.drawable.rose,
            R.drawable.archery,
            R.drawable.india,
            R.drawable.deer,
            R.drawable.beetroot,
            R.drawable.iris,
            R.drawable.woodpecker,
            R.drawable.cricket,
            R.drawable.petra,
            R.drawable.israel,
            R.drawable.pumpkin,
            R.drawable.leopard,
            R.drawable.apron,
            R.drawable.kiwi,
            R.drawable.australia,
            R.drawable.peony,
            R.drawable.squash,
            R.drawable.starfish,
    };



    private String mChoices [][] = {
            {"B","T","C","D","U","N","Z","O","A","X"},
            {"Y","N","P","T","U","E","C","F","A","L"},
            {"O","S","R","E","V","B","C","I","Q","A"},
            {"E","Z","R","H","R","A","T","Y","C","O"},
            {"W","X","B","I","L","P","A","N","I","D"},
            {"N","E","D","E","E","R","H","G","D","K"},
            {"E","B","E","T","O","R","K","O","T","O"},
            {"N","S","I","U","M","P","R","I","K","I"},
            {"P","W","R","C","E","K","E","D","O","O"},
            {"A","P","R","C","T","I","E","K","C","O"},
            {"P","E","I","S","I","T","R","A","R","I"},
            {"R","Q","I","R","E","S","S","L","U","A"},
            {"F","G","N","M","U","P","I","P","K","K"},
            {"R","A","D","P","C","O","E","E","Y","L"},
            {"N","N","O","R","J","P","K","A","O","L"},
            {"E","W","K","I","H","J","O","P","I","W"},
            {"Z","A","S","T","U","A","R","A","L","I"},
            {"S","D","E","Y","P","N","O","E","K","J"},
            {"Y","S","H","A","Q","U","U","I","S","G"},
            {"A","W","T","S","X","H","R","S","F","I"}
    };


    private String hint[] = {"are renown for their large colorful bills. At 8 inches (20 cm) they have the longest bill of any bird in the world in relation to their body size 25 in (63.5 cm).",
            "also known as the groundnut, goober (US), or monkey nut (UK)",
            "symbol of love", "skill of using a bow to shoot arrows",
            "a country in South Asia. It is the seventh-largest country by area, the second-most populous country",
            "Males grow new antlers each year", "is the taproot portion of a beet plant, usually known in North America as the beet",
            "It takes its name from the Greek word for a rainbow, which is also the name for the Greek goddess of the rainbow",
            "these have chisel-like bill that is used for drilling of the trees when searches for food",
            "a bat-and-ball game played between two teams of eleven players on a field",
            "originally known to its inhabitants as Raqmu, is a historical and archaeological city in southern Jordan",
            "a Middle Eastern country on the Mediterranean Sea",
            "is a cultivar of winter squash that is round with smooth, slightly ribbed skin, and most often deep yellow to orange in coloration",
            " is one of the five extant species in the genus Panthera, a member of the Felidae",
            "is a protective piece of clothing made from fabric (or other materials) that covers the front of the body",
            "a small fruits that pack a lot of flavor and plenty of health benefits. Their green flesh is sweet and tangy",
            "It is the largest country in Oceania and the world's sixth-largest country by total area",
            "is a flowering plant in the genus Paeonia, the only genus in the family Paeoniaceae",
            "is a racket and ball sport played by two (singles) or four players (doubles squash) in a four-walled court with a small, hollow rubber ball",
            "are star-shaped echinoderms belonging to the class Asteroidea"};

    private String mCorrectAnswers[] = {"TOUCAN", "PEANUT", "ROSE", "ARCHERY", "INDIA", "DEER", "BEETROOT", "IRIS", "WOODPECKER", "CRICKET",
            "PETRA","ISRAEL","PUMPKIN","LEOPARD","APRON","KIWI","AUSTRALIA","PEONY","SQUASH","STARFISH"};
//    private List<Boolean> mStatus =new ArrayList<>(Arrays.asList(false,false,true));
//    private ArrayList<Boolean> mStatus =new ArrayList<>(Arrays.asList(false,false,true));
//
//
//    public Boolean getmStatus(int a) {
//        Boolean status = mStatus.get(a);
//        return status;
//    }
//
//    public void setmStatus(int a) {
//        mStatus.set(a,true);
//        this.mStatus = mStatus;
//    }

    public int getLength()  {return mQuestions.length;}


    public Integer getQuestion(int a) {
        Integer question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 =mChoices[a][3];
        return choice3;
    }
    public String getChoice5(int a){
        String choice4 =mChoices[a][4];
        return choice4;
    }
    public String getChoice6(int a){
        String choice5 =mChoices[a][5];
        return choice5;
    }
    public String getChoice7(int a){
        String choice6 =mChoices[a][6];
        return choice6;
    }
    public String getChoice8(int a){
        String choice7 =mChoices[a][7];
        return choice7;
    }
    public String getChoice9(int a){
        String choice8 =mChoices[a][8];
        return choice8;
    }
    public String getChoice10(int a){
        String choice9 =mChoices[a][9];
        return choice9;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
    public String getHint(int a) {
        String hints = hint[a];
        return hints;
    }

}
