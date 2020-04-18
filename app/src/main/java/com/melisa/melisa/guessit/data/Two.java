package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Two {
    private Integer mQuestions [] = {
            R.drawable.eggplant,
            R.drawable.football,
            R.drawable.owl,
            R.drawable.sudan,
            R.drawable.aster,
            R.drawable.toaster,
            R.drawable.pistachio,
            R.drawable.dragonfly,
            R.drawable.china,
            R.drawable.lion,
            R.drawable.hampi,
            R.drawable.paws,
            R.drawable.seal,
            R.drawable.jamun,
            R.drawable.chile,
            R.drawable.golf,
            R.drawable.square,
            R.drawable.lotus,
            R.drawable.cooker,
            R.drawable.nepal,
    };



    private String mChoices [][] = {
            {"W","E","A","L","P","G","Q","G","N","T"},
            {"Z","O","L","O","L","T","P","F","B","A"},
            {"S","D","F","W","L","O","G","J","K","U"},
            {"U","Q","D","W","S","N","E","A","B","K"},
            {"O","S","Y","G","A","R","J","T","I","E"},
            {"T","S","A","V","T","E","O","I","R","U"},
            {"Y","O","S","I","I","P","T","C","H","A"},
            {"Y","D","T","O","R","G","N","F","A","L"},
            {"C","A","H","Q","I","X","N","J","A","I"},
            {"E","O","I","G","L","T","J","I","N","R"},
            {"L","G","H","N","A","B","A","M","I","P"},
            {"S","W","N","A","O","P","N","A","M","E"},
            {"P","N","N","E","I","Q","L","A","E","S"},
            {"J","A","A","M","J","U","M","N","U","N"},
            {"B","E","R","L","C","A","H","Z","I","L"},
            {"L","F","G","F","L","O","A","T","O","B"},
            {"C","C","U","R","E","Q","R","S","A","I"},
            {"Y","L","T","O","L","L","S","U","I","L"},
            {"M","R","K","O","O","C","E","Y","N","Z"},
            {"A","N","I","A","L","E","N","P","I","D"}
    };


    private String mCorrectAnswers[] = {"EGGPLANT", "FOOTBALL", "OWL", "SUDAN", "ASTER", "TOASTER", "PISTACHIO", "DRAGONFLY",
            "CHINA", "LION", "HAMPI","PAWS","SEAL","JAMUN","CHILE","GOLF","SQUARE","LOTUS","COOKER","NEPAL"};
    private String hint[] = {"brinjal is a plant species in the nightshade family Solanaceae. Solanum melongena is grown worldwide for its edible fruit",
            "a family of team sports that involve, to varying degrees, kicking a ball to score a goal",
            "birds of prey typified by an upright stance, a large, broad head, binocular vision, binaural hearing, sharp talons, and feathers adapted for silent flight",
            "it is a country in Northeast Africa it is bordered by Egypt to the north",
            " starry-shaped flower heads",
            "used for quickly and easily toasting both sides of sliced bread in order to serve it hot",
            "a member of the cashew family, is a small tree originating from Central Asia and the Middle East",
            "also called darner, devil's arrow, or devil's darning needle",
            "is a country in East Asia. It is the world's most populous country",
            " it is a muscular, deep-chested cat with a short, rounded head, a reduced neck and round ears, and a hairy tuft at the end of its tail",
            "it is a UNESCO World Heritage Site located in east-central Karnataka",
            "is the soft foot-like part of a mammal","the marine mammals that have front and rear flippers",
            "commonly known as Malabar plum, Java plum, or black plum, is an evergreen tropical tree in the flowering plant family Myrtaceae",
            "is a long, narrow country stretching along South America's western edge, with more than 6,000km of Pacific Ocean coastlin",
            "a club-and-ball sport in which players use various clubs to hit balls into a series of holes on a course in as few strokes as possible",
            "it has four equal sides and four equal angles","A prominent figure in Buddhist and Egyptian culture, and native flower for both India and Vietnam",
            "an appliance used for cooking food, typically consisting of an oven, hob, and grill and powered by gas or electricity",
            "It is located mainly in the Himalayas, but also includes parts of the Indo-Gangetic Plain"};

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
