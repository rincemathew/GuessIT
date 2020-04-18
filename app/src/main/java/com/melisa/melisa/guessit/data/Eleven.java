package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Eleven {
    private Integer mQuestions [] = {
            R.drawable.poppy,
            R.drawable.mexico,
            R.drawable.beetle,
            R.drawable.mixer,
            R.drawable.cheetah,
            R.drawable.tanzania,
            R.drawable.whale,
            R.drawable.rooster,
            R.drawable.monaco,
            R.drawable.cappadocia,
            R.drawable.snowdrop,
            R.drawable.turkey,
            R.drawable.curling,
            R.drawable.kingfisher,
            R.drawable.radish,
            R.drawable.strawberry,
            R.drawable.macao,
            R.drawable.tentacles,
            R.drawable.amaryllis,
            R.drawable.horseball,
    };



    private String mChoices [][] = {
            {"Z","X","P","C","P","V","P","O","Y","B"},
            {"N","M","I","M","Q","E","C","O","X","W"},
            {"E","E","E","R","T","B","T","L","Y","E"},
            {"E","U","X","I","R","M","O","I","P","A"},
            {"C","A","T","S","H","D","H","E","F","E"},
            {"Z","A","A","T","N","G","A","H","N","I"},
            {"W","J","H","K","A","L","L","Z","E","X"},
            {"E","O","R","R","S","C","O","V","T","B"},
            {"C","N","M","M","A","Q","O","O","W","N"},
            {"A","P","D","A","C","O","C","A","I","P"},
            {"E","S","P","W","N","D","R","R","O","O"},
            {"E","U","T","T","R","Y","Y","K","U","I"},
            {"O","P","I","C","G","U","N","R","A","L"},
            {"R","I","K","S","F","H","N","E","G","I"},
            {"S","R","D","A","H","D","F","I","G","S"},
            {"R","R","T","R","W","B","S","Y","A","E"},
            {"H","J","A","K","O","C","M","L","Z","A"},
            {"L","C","X","A","T","E","E","N","T","S"},
            {"Y","L","R","L","A","M","I","S","A","C"},
            {"E","S","V","R","B","A","H","L","O","L"}
    };


    private String mCorrectAnswers[] = {"POPPY", "MEXICO", "BEETLE", "MIXER", "CHEETAH", "TANZANIA", "WHALE", "ROOSTER",
            "MONACO", "CAPPADOCIA", "SNOWDROP","TURKEY","CURLING","KINGFISHER","RADISH","STRAWBERRY","MACAO","TENTACLES",
            "AMARYLLIS","HORSEBALL"};
    private String hint[] = {"a herbaceous plant with showy flowers",
            "is a country in the southern portion of North America",
            "an insect of a large order distinguished by having forewings that are typically modified into hard wing cases",
            "a machine for mixing things, especially an electrical appliance for mixing foods",
            "a large slender spotted cat found in Africa and parts of Asia. It is the fastest animal on land.",
            "is an East African country known for its vast wilderness areas",
            "a very large marine mammal with a streamlined hairless body, a horizontal tail fin, and a blowhole on top of the head for breathing",
            "a male domestic fowl; a cock",
            "is a sovereign city-state, country, and microstate on the French Riviera in Western Europe",
            "is a historical region in Central Anatolia, largely in the Nevşehir, Kayseri, Kırşehir, Aksaray, and Niğde Provinces in Turkey",
            "It is the hope that the harsh winter will be over soon and warmth will come into our lives",
            "a nation straddling eastern Europe and western Asia with cultural connections to ancient Greek, Persian, Roman, Byzantine and Ottoman empires",
            "a game played on ice",
            "an often brightly coloured bird with a large head and long sharp beak",
            "a swollen pungent-tasting edible root",
            "a sweet soft red fruit with a seed-studded surface",
            "an autonomous region on the south coast of China, across the Pearl River Delta from Hong Kong",
            "a slender, flexible limb or appendage in an animal",
            "a bulbous plant with showy trumpet-shaped flowers and strap-shaped leaves",
            "is a game played on horseback where a ball is handled and points are scored by shooting it through a hoop with a diameter of 1m"};

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
