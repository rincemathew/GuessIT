package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Five {
    private Integer mQuestions [] = {
            R.drawable.honeybee,
            R.drawable.ukraine,
            R.drawable.bear,
            R.drawable.peeler,
            R.drawable.anthurium,
            R.drawable.fin,
            R.drawable.pergamon,
            R.drawable.apple,
            R.drawable.denmark,
            R.drawable.basketball,
            R.drawable.nilgai,
            R.drawable.saucer,
            R.drawable.bahrain,
            R.drawable.dahlia,
            R.drawable.drumstick,
            R.drawable.litchi,
            R.drawable.crow,
            R.drawable.circle,
            R.drawable.brazil,
            R.drawable.fencing,
    };



    private String mChoices [][] = {
            {"E","N","Y","H","J","E","O","E","B","I"},
            {"W","E","K","S","U","N","R","I","A","P"},
            {"D","E","Y","E","B","B","R","A","G","M"},
            {"R","L","E","E","E","P","P","X","C","K"},
            {"L","A","N","T","H","U","R","I","U","M"},
            {"W","H","I","N","F","S","I","K","R","S"},
            {"M","P","N","E","A","R","O","G","E","I"},
            {"T","E","P","W","A","E","P","O","L","N"},
            {"T","R","D","E","A","K","N","O","M","H"},
            {"L","L","A","S","B","E","T","K","B","A"},
            {"R","R","I","N","F","I","E","L","A","G"},
            {"U","R","S","R","A","E","U","F","C","O"},
            {"A","V","R","B","I","H","E","A","N","S"},
            {"E","A","I","L","D","I","A","X","H","S"},
            {"V","D","C","R","I","U","T","M","K","S"},
            {"E","N","I","E","L","T","I","H","C","I"},
            {"G","H","T","W","R","N","C","I","N","O"},
            {"E","R","I","C","T","E","C","E","L","N"},
            {"E","Z","I","L","V","E","L","B","R","A"},
            {"E","T","N","G","C","E","I","N","W","F"}
    };


    private String mCorrectAnswers[] = {"HONEYBEE", "UKRAINE", "BEAR", "PEELER", "ANTHURIUM", "FIN", "PERGAMON", "APPLE",
            "DENMARK", "BASKETBALL", "NILGAI","SAUCER","BAHRAIN","DAHLIA","DRUMSTICK","LITCHI","CROW","CIRCLE","BRAZIL","FENCING"};
    private String hint[] = {"a bee of a type that collects nectar and pollen, produces wax and honey, and lives in large communities; a hive bee",
            "a large country in Eastern Europe known for its Orthodox churches, Black Sea coastline and forested mountains",
            "a large, heavy mammal that walks on the soles of its feet, having thick fur and a very short tail",
            "a knife or device for removing the skin from fruit and vegetables",
            "a tropical American plant which is widely grown for its ornamental foliage or brightly coloured flowering spathes",
            "a flattened appendage on various parts of the body of many aquatic vertebratesa flattened appendage on various parts of the body of many aquatic vertebrates",
            "a rich and powerful ancient Greek city in Mysia",
            "the round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh",
            "a Scandinavian country comprising the Jutland Peninsula and numerous islands",
            "a game played between two teams of five players in which goals are scored by throwing a ball through a netted hoop fixed at each end of the court",
            "a large Indian antelope, the male of which has a blue-grey coat and short horns, and the female a tawny coat and no horns",
            "a shallow dish, typically having a circular indentation in the centre, on which a cup is placed",
            "a sovereign state in the Persian Gulf",
            "a tuberous-rooted Mexican plant of the daisy family, which is cultivated for its brightly coloured single or double flowers.",
            "one of those rare plant species whose seeds, flowers, leaves, and stems are edible and extremely nutritious",
            "a small rounded fruit with sweet white scented flesh, a large central stone, and a thin rough skin",
            "a large perching bird with mostly glossy black plumage",
            "a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point ",
            "is the largest country in both South America and Latin America",
            "the sport of fighting with swords, especially foils, épées, or sabres"};

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
