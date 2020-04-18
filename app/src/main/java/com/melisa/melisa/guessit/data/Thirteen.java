package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Thirteen {
    private Integer mQuestions [] = {
            R.drawable.paraguay,
            R.drawable.dandelion,
            R.drawable.fork,
            R.drawable.cabbage,
            R.drawable.kangaroo,
            R.drawable.slovenia,
            R.drawable.wasp,
            R.drawable.hooves,
            R.drawable.walnut,
            R.drawable.cycling,
            R.drawable.yemen,
            R.drawable.bagan,
            R.drawable.sparrow,
            R.drawable.crab,
            R.drawable.sink,
            R.drawable.peach,
            R.drawable.dianthus,
            R.drawable.boxing,
            R.drawable.austria,
            R.drawable.sanchi,
    };



    private String mChoices [][] = {
            {"T","Y","A","U","R","G","A","Y","P","A"},
            {"D","L","A","I","N","O","D","N","E","U"},
            {"I","K","R","O","P","F","A","S","O","D"},
            {"F","A","B","G","B","E","C","H","A","G"},
            {"O","G","K","A","J","A","K","N","R","O"},
            {"S","L","V","I","O","L","E","A","O","N"},
            {"Z","X","A","C","W","V","S","B","P","N"},
            {"S","M","H","E","O","Q","O","A","V","Z"},
            {"W","T","U","L","S","A","X","N","W","E"},
            {"D","C","C","G","Y","I","C","N","L","R"},
            {"F","V","T","Y","E","N","E","G","M","B"},
            {"Y","B","H","A","N","G","U","A","J","N"},
            {"M","A","R","P","I","W","S","R","K","O"},
            {"O","L","A","P","B","C","Q","R","A","Z"},
            {"W","S","K","X","E","D","C","S","N","I"},
            {"A","C","R","H","E","F","V","T","P","G"},
            {"Y","S","U","A","D","N","H","I","T","H"},
            {"N","B","G","U","N","O","I","J","X","M"},
            {"I","A","U","K","O","A","S","I","T","R"},
            {"L","P","S","H","C","Q","I","A","W","N"}
    };


    private String mCorrectAnswers[] = {"PARAGUAY", "DANDELION", "FORK", "CABBAGE", "KANGAROO", "SLOVENIA", "WASP", "HOOVES",
            "WALNUT", "CYCLING", "YEMEN","BAGAN","SPARROW","CRAB","SINK","PEACH","DIANTHUS","BOXING","AUSTRIA","SANCHI"};
    private String hint[] = {"is a landlocked country between Argentina, Brazil and Bolivia",
            "a widely distributed weed of the daisy family, with a rosette of leaves and large bright yellow flowers",
            "an implement with two or more prongs used for lifting food to the mouth or holding it when cutting",
            "a cultivated plant eaten as a vegetable",
            "a large plant-eating marsupial with a long powerful tail and strongly developed hindlimbs that enable it to travel by leaping",
            "a country in Central Europe, is known for its mountains, ski resorts and lakes",
            "a social winged insect which has a narrow waist and a sting and is typically yellow with black stripes.",
            "the horny part of the foot of an ungulate animal, especially a horse",
            "the large wrinkled edible seed of a deciduous tree",
            "the sport or activity of riding a bicycle",
            "is a country at the southern end of the Arabian Peninsula in Western Asia",
            " is an ancient city and a UNESCO World Heritage Site located in the Mandalay Region of Myanmar",
            "a small Old World bird related to the weaver birds",
            "a crustacean, found chiefly on seashores, with a broad carapace, stalked eyes, and five pairs of legs",
            "a fixed basin with a water supply and outflow pipe",
            "a round stone fruit with juicy yellow flesh and downy pinkish-yellow skin",
            "a flowering plant of a genus that includes the pinks and carnations",
            "the sport or practice of fighting with the fists, especially with padded gloves in a roped square ring",
            "is a landlocked East Alpine country in the southern part of Central Europe",
            "Great Stupa at here is one of the oldest stone structures in India"};

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
