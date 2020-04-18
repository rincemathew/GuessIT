package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Six {
    private Integer mQuestions [] = {
            R.drawable.vanuatu,
            R.drawable.eagle,
            R.drawable.santorini,
            R.drawable.crescent,
            R.drawable.ladybird,
            R.drawable.mane,
            R.drawable.gorilla,
            R.drawable.albania,
            R.drawable.canada,
            R.drawable.polo,
            R.drawable.hibiscus,
            R.drawable.chad,
            R.drawable.cherry,
            R.drawable.porcupine,
            R.drawable.kettle,
            R.drawable.france,
            R.drawable.rugby,
            R.drawable.orange,
            R.drawable.marigold,
            R.drawable.maize,
    };



    private String mChoices [][] = {
            {"V","R","A","A","N","N","A","U","T","U"},
            {"M","A","S","A","E","E","L","T","G","E"},
            {"R","S","I","N","O","A","T","R","N","I"},
            {"T","N","C","E","R","R","E","S","C","O"},
            {"I","B","R","Y","D","D","S","A","H","L"},
            {"M","A","R","E","N","A","M","I","C","N"},
            {"E","L","L","G","I","M","O","R","A","A"},
            {"T","N","A","I","A","H","L","A","B","E"},
            {"A","N","W","L","A","C","A","D","A","L"},
            {"H","Z","Y","A","O","P","L","O","L","A"},
            {"B","I","A","H","U","I","C","S","S","N"},
            {"T","C","N","A","C","H","D","A","L","I"},
            {"T","N","E","R","H","R","J","C","I","Y"},
            {"C","N","U","E","O","N","R","P","P","I"},
            {"C","K","Y","L","J","E","E","T","T","O"},
            {"A","N","S","F","A","H","R","V","C","E"},
            {"T","A","K","U","R","G","D","U","B","Y"},
            {"A","O","W","R","Q","E","N","U","G","W"},
            {"Z","I","R","A","G","D","O","L","M","I"},
            {"D","F","A","E","B","I","V","M","O","Z"}
    };


    private String mCorrectAnswers[] = {"VANUATU", "EAGLE", "SANTORINI", "CRESCENT", "LADYBIRD", "MANE", "GORILLA", "ALBANIA",
            "CANADA", "POLO", "HIBISCUS","CHAD","CHERRY","PROCUPINE","KETTLE","FRANCE","RUGBY","ORANGE","MARIGOLD","MAIZE"};
    private String hint[] = {"is a South Pacific Ocean nation made up of roughly 80 islands that stretch 1,300 kilometers",
            "a large bird of prey with a massive hooked bill and long broad wings, known for its keen sight and powerful soaring flight",
            "one of the Cyclades islands in the Aegean Sea. It was devastated by a volcanic eruption in the 16th century BC",
            "the curved sickle shape",
            "a small beetle with a domed back, typically red or yellow with black spots",
            "a growth of long hair on the neck of a horse, lion, or other mammal",
            "a powerfully built great ape with a large head and short neck, found in the forests of central Africa",
            " is a small country with Adriatic and Ionian coastlines and an interior crossed by the Albanian Alps",
            "a country in the northern part of North America.",
            "a game of Eastern origin resembling hockey, played on horseback with a long-handled mallet",
            "a plant of the mallow family, grown in warm climates for its large brightly coloured flowers or for products such as fibre or timber",
            "a landlocked country in north-central Africa",
            "a small, soft round stone fruit that is typically bright or dark red",
            "Large rodents with coats of sharp spines, or quills, that protect them against predators",
            "a container or device in which water is boiled, having a lid, spout, and handle",
            "In Western Europe, encompasses medieval cities, alpine villages and Mediterranean beaches",
            "a team game played with an oval ball that may be kicked, carried, and passed from hand to hand",
            "a large round juicy citrus fruit with a tough bright reddish-yellow rind",
            "a plant of the daisy family with yellow, orange, or copper-brown flowers",
            " plant that yields large grains (corn or sweetcorn) set in rows on a cob"};

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
