package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Three {
    private Integer mQuestions [] = {
            R.drawable.sumo,
            R.drawable.napkin,
            R.drawable.colosseum,
            R.drawable.uae,
            R.drawable.horn,
            R.drawable.eel,
            R.drawable.rhombus,
            R.drawable.guava,
            R.drawable.qatar,
            R.drawable.giraffe,
            R.drawable.jug,
            R.drawable.parrot,
            R.drawable.mosquito,
            R.drawable.oman,
            R.drawable.carrot,
            R.drawable.hazelhut,
            R.drawable.potato,
            R.drawable.jasmine,
            R.drawable.egypt,
            R.drawable.tulip,
    };



    private String mChoices [][] = {
            {"S","O","K","U","K","S","T","M","I","G"},
            {"P","N","N","I","K","K","A","I","P","N"},
            {"U","S","E","S","C","O","L","O","M","W"},
            {"Q","R","A","U","U","Q","E","A","T","O"},
            {"W","R","R","N","K","H","H","O","I","S"},
            {"N","S","E","A","E","K","E","L","A","Q"},
            {"S","Z","B","R","U","H","M","K","O","I"},
            {"A","G","P","A","U","A","P","V","L","E"},
            {"U","A","Q","R","A","E","T","Z","A","X"},
            {"G","E","E","G","F","F","A","I","R","G"},
            {"C","A","J","S","U","A","G","R","O","L"},
            {"D","R","A","R","O","P","T","B","I","R"},
            {"Q","Z","S","O","U","O","T","M","I","A"},
            {"A","Q","A","N","O","M","T","O","R","U"},
            {"B","A","R","C","R","N","A","T","O","A"},
            {"D","C","E","H","N","L","A","T","Z","U"},
            {"P","P","O","T","O","O","T","T","A","O"},
            {"M","M","S","A","J","Y","E","I","N","N"},
            {"J","U","T","Y","P","E","G","T","I","O"},
            {"N","R","O","T","S","P","U","I","L","E"}
    };


    private String mCorrectAnswers[] = {"SUMO", "NAPKIN", "COLOSSEUM", "UAE", "HORN", "EEL", "RHOMBUS", "GUAVA", "QATAR", "GIRAFFE",
            "JUG","PARROT","MOSQUITO","OMAN","CARROT","HAZELNUT","POTATO","JASMINE","EGYPT","TULIP"};
    private String hint[] = {"a Japanese form of heavyweight wrestling, in which a wrestler wins a bout by forcing his opponent outside a marked circle or by making him touch the ground with any part of his body except the soles of his feet",
            "a piece of cloth or paper used at a meal to wipe the fingers or lips and to protect garments",
            "also known as the Flavian Amphitheatre, is an oval amphitheatre in the centre of the city of Rome",
            "a country in Western Asia at the northeast end of the Arabian Peninsula on the Persian Gulf",
            "a hard permanent outgrowth, often curved and pointed, found in pairs on the head",
            "a snake-like fish with a slender elongated body and poorly developed fins, proverbial for its slipperiness",
            "a quadrilateral all of whose sides have the same length",
            "an edible, pale orange tropical fruit with pink juicy flesh and a strong sweet aroma",
            "is a peninsular Arab country whose terrain comprises arid desert and a long Persian (Arab) Gulf shoreline of beaches and dunes",
            "a large African mammal with a very long neck and forelegs, having a coat patterned with brown patches separated by lighter lines. It is the tallest living animal",
            "a cylindrical container with a handle and a lip, used for holding and pouring liquids",
            "a bird, often vividly coloured, with a short downcurved hooked bill, grasping feet, and a raucous voice",
            "a slender long-legged fly with aquatic larvae",
            "is an Arab country on the southeastern coast of the Arabian Peninsula in Western Asia",
            "a tapering orange-coloured root eaten as a vegetable",
            "a round brown hard-shelled nut that is the edible fruit of the haze",
            "a starchy plant tuber which is one of the most important food crops, cooked and eaten as a vegetable",
            "an Old World shrub or climbing plant which is popular as an ornamental and bears fragrant white, pink, or yellow flowers",
            "a country linking northeast Africa with the Middle East, dates to the time of the pharaohs",
            "a bulbous spring-flowering plant of the lily family, with boldly coloured cup-shaped flowers"};

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
