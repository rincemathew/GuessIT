package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Fourteen {
    private Integer mQuestions [] = {
            R.drawable.oval,
            R.drawable.allium,
            R.drawable.romania,
            R.drawable.turnip,
            R.drawable.octopus,
            R.drawable.sprint,
            R.drawable.tusk,
            R.drawable.bolivia,
            R.drawable.moth,
            R.drawable.onion,
            R.drawable.ranunculus,
            R.drawable.bowl,
            R.drawable.banana,
            R.drawable.haiti,
            R.drawable.panda,
            R.drawable.hatra,
            R.drawable.turkey,
            R.drawable.hare,
            R.drawable.portugal,
            R.drawable.emu,
    };



    private String mChoices [][] = {
            {"Q","L","A","W","V","E","R","O","T","Y"},
            {"U","A","I","M","L","U","L","O","I","P"},
            {"A","S","R","A","I","N","O","M","D","A"},
            {"F","G","U","T","H","R","J","N","I","P"},
            {"C","T","O","P","O","S","K","L","Z","X"},
            {"T","C","N","V","P","B","S","N","R","I"},
            {"M","Q","T","A","Z","U","W","S","S","K"},
            {"L","O","I","X","B","E","V","D","I","A"},
            {"C","T","H","O","R","F","F","M","V","T"},
            {"N","G","O","B","Y","N","H","I","N","O"},
            {"S","R","U","L","A","U","N","U","C","N"},
            {"U","B","J","O","M","I","W","K","L","O"},
            {"L","B","P","A","Q","A","N","A","N","A"},
            {"A","Z","W","S","H","X","E","I","T","I"},
            {"A","D","D","A","C","N","R","P","F","V"},
            {"T","G","H","B","Y","A","R","H","T","A"},
            {"N","U","Y","E","T","U","R","J","K","M"},
            {"R","A","H","I","K","D","E","F","X","E"},
            {"L","E","P","A","G","R","S","O","T","U"},
            {"U","E","M","S","G","B","N","Y","T","P"}
    };


    private String mCorrectAnswers[] = {"OVAL", "ALLIUM", "ROMANIA", "TURNIP", "OCTOPUS", "SPRINT", "TUSK", "BOLIVIA",
            "MOTH", "ONION", "RANUNCULUS","BOWL","BANANA","HAITI","PANDA","HATRA","TURKEY","HARE","PORTUGAL","EMU"};
    private String hint[] = {"having a rounded and slightly elongated outline or shape like that of an egg",
            "a bulbous plant of a genus that includes the onion and its relatives",
            "is a country located at the crossroads of Central, Eastern, and Southeastern Europe",
            "a round root with white or cream flesh which is eaten as a vegetable and also has edible leaves.",
            "a cephalopod mollusc with eight sucker-bearing arms, a soft body, strong beaklike jaws, and no internal shell",
            "an act or short spell of running at full speed",
            "a long pointed tooth, especially one which protrudes from the closed mouth, as in the elephant",
            "is a landlocked country located in western-central South America",
            "an insect with two pairs of broad wings covered in microscopic scales",
            "a swollen edible bulb used as a vegetable, having a pungent taste and smell and composed of several concentric layers",
            "a temperate plant of a genus that includes the buttercups and water crowfoots, typically having yellow or white bowl-shaped flowers",
            "a round, deep dish or basin used for food or liquid",
            "a long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe",
            "is a Caribbean country that shares the island of Hispaniola with the Dominican Republic to its east",
            "a large bearlike mammal with characteristic black and white markings",
            "an ancient city in the Nineveh Governorate of present-day Iraq",
            "is a nation straddling eastern Europe and western Asia",
            "a fast-running, long-eared mammal that resembles a large rabbit",
            "is a southern European country on the Iberian Peninsula, bordering Spain",
            "a large flightless fast-running Australian bird resembling the ostrich"};

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
