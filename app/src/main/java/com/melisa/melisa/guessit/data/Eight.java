package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Eight {
    private Integer mQuestions [] = {
            R.drawable.bermuda,
            R.drawable.ostrich,
            R.drawable.lobster,
            R.drawable.circle,
            R.drawable.anemone,
            R.drawable.malaysia,
            R.drawable.stonehenge,
            R.drawable.grape,
            R.drawable.beak,
            R.drawable.mongoose,
            R.drawable.handball,
            R.drawable.belize,
            R.drawable.blender,
            R.drawable.begonia,
            R.drawable.capsicum,
            R.drawable.plum,
            R.drawable.zebra,
            R.drawable.kayaking,
            R.drawable.bhutan,
            R.drawable.whisk,
    };



    private String mChoices [][] = {
            {"B","L","B","E","D","R","A","R","M","U"},
            {"T","H","C","O","I","S","H","T","R","R"},
            {"T","S","L","T","O","E","B","R","E","E"},
            {"N","F","C","I","E","L","C","O","R","R"},
            {"M","T","A","E","N","N","O","E","E","E"},
            {"Y","I","L","S","A","A","M","N","A","F"},
            {"H","S","T","O","N","E","G","N","E","E"},
            {"A","F","I","R","T","E","G","E","P","E"},
            {"Z","A","Q","E","B","E","R","K","T","Y"},
            {"O","O","O","N","G","U","E","M","S","I"},
            {"O","A","A","L","H","B","N","L","P","D"},
            {"Z","I","A","L","E","B","S","E","D","F"},
            {"R","E","D","N","G","B","H","L","J","E"},
            {"B","A","I","K","N","E","L","G","Z","O"},
            {"X","U","C","C","S","I","A","M","P","C"},
            {"V","U","B","L","N","P","M","M","Q","W"},
            {"E","R","T","E","Z","Y","B","U","R","A"},
            {"G","N","A","Y","I","K","K","I","A","O"},
            {"P","A","B","S","U","A","H","N","T","D"},
            {"F","G","K","H","H","I","W","J","S","K"}
    };


    private String mCorrectAnswers[] = {"BERMUDA", "OSTRICH", "LOBSTER", "CIRCLE", "ANEMONE", "MALAYSIA", "STONEHENGE",
            "GRAPE", "BEAK", "MONGOOSE", "HANDBALL","BELIZE","BLENDER","BEGONIA","CAPSICUM","PLUM","ZEBRA","KAYAKING","BHUTAN",
            "WHISK"};
    private String hint[] = {"is a British island territory in the North Atlantic Ocean known for its pink-sand beaches such as Elbow Beach and Horseshoe Bay",
            "a flightless swift-running African bird with a long neck, long legs, and two toes on each foot",
            "a large marine crustacean with a cylindrical body, stalked eyes, and the first of its five pairs of limbs modified as pincers",
            "Its a shape",
            "a plant of the buttercup family which typically has brightly coloured flowers and deeply divided leaves",
            "is a Southeast Asian country occupying parts of the Malay Peninsula and the island of Borneo",
            "is a prehistoric monument in Wiltshire, England, two miles (3 km) west of Amesbury",
            "a berry (typically green, purple, or black) growing in clusters on a grapevine, eaten as fruit and used in making wine",
            "a bird's horny projecting jaws; a bill",
            "a small carnivorous mammal with a long body and tail and a grizzled or banded coat",
            "a game similar to fives, in which the ball is hit with the hand in a walled court",
            "is a nation on the eastern coast of Central America, with Caribbean Sea shorelines to the east and dense jungle to the west",
            "a person or thing that mixes things together, in particular an electric mixing machine used in food preparation for liquidizing, chopping, or pureeing",
            "a herbaceous plant of warm climates, the flowers of which have brightly coloured sepals but no petals",
            "a tropical American plant of the nightshade family with fruits (peppers) containing many seeds",
            "an oval fleshy fruit which is purple, reddish, or yellow when ripe and contains a flattish pointed ston",
            "an African wild horse with black-and-white stripes and an erect mane.",
            "is the use of a kayak for moving across water",
            "a Buddhist kingdom on the Himalayas’ eastern edge, is known for its monasteries",
            "a utensil for whipping eggs or cream"};

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
