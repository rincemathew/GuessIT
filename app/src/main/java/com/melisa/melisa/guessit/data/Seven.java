package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Seven {
    private Integer mQuestions [] = {
            R.drawable.papaya,
            R.drawable.libya,
            R.drawable.dolphin,
            R.drawable.hyena,
            R.drawable.mali,
            R.drawable.pentagon,
            R.drawable.orchid,
            R.drawable.hexagon,
            R.drawable.tennis,
            R.drawable.fig,
            R.drawable.red_fort,
            R.drawable.tiger,
            R.drawable.bangladesh,
            R.drawable.cutlery,
            R.drawable.sunflower,
            R.drawable.spinach,
            R.drawable.volleyball,
            R.drawable.mynah,
            R.drawable.argentina,
            R.drawable.antler,
    };



    private String mChoices [][] = {
            {"P","P","Y","A","A","A","P","P","Y","Y"},
            {"W","A","E","L","V","B","C","I","X","Y"},
            {"D","N","H","I","P","Q","O","R","L","P"},
            {"Q","Z","H","A","N","Y","B","P","E","O"},
            {"I","W","E","T","M","L","I","Y","A","U"},
            {"G","A","O","E","N","T","A","P","X","N"},
            {"D","I","F","G","O","C","H","J","R","K"},
            {"A","X","H","Z","R","E","N","G","O","T"},
            {"D","N","H","E","J","T","B","N","S","I"},
            {"W","T","G","E","F","Y","M","N","I","U"},
            {"F","A","T","R","D","R","E","V","H","O"},
            {"D","E","R","T","R","G","I","I","S","V"},
            {"A","D","B","E","A","G","S","N","H","L"},
            {"B","H","U","E","C","R","T","Y","W","L"},
            {"E","R","N","U","S","W","O","L","F","W"},
            {"Q","A","S","C","N","P","H","I","V","C"},
            {"A","B","Y","E","O","V","L","L","L","L"},
            {"A","N","N","Y","A","H","M","A","T","H"},
            {"A","N","N","A","T","R","U","G","I","E"},
            {"R","E","A","V","N","A","T","N","L","M"}
    };


    private String mCorrectAnswers[] = {"PAPAYA", "LIBYA", "DOLPHIN", "HYENA", "MALI", "PENTAGON", "ORCHID", "HEXAGON", "TENNIS",
            "FIG", "REDFORT","TIGER","BANGLADESH","CUTLERY","SUNFLOWER","SPINACH","VOLLEYBALL","MYNAH","ARGENTINA","ANTLER"};
    private String hint[] = {"a tropical fruit shaped like an elongated melon, with edible orange flesh and small black seeds",
            " a country in the Maghreb region in North Africa",
            "a small gregarious toothed whale that typically has a beaklike snout and a curved fin on the back",
            "a doglike African mammal with forelimbs that are longer than the hindlimbs and an erect mane",
            "a landlocked country in West Africa. Mali is the eighth-largest country in Africa",
            "headquarters of the United States Department of Defense",
            "a plant with complex flowers that are often showy or bizarrely shaped, having a large specialized lip (labellum) and frequently a spur",
            "a plane figure with six straight sides and angles.",
            "a game in which two or four players strike a ball with rackets over a net stretched across a court",
            "a soft pear-shaped fruit with sweet dark flesh and many small seeds, eaten fresh or dried",
            " a historic fort in the city of Delhi in India, which served as the main residence of the Mughal Emperors",
            "a very large solitary cat with a yellow-brown coat striped with black, native to the forests of Asia",
            "the east of India on the Bay of Bengal, is a South Asian country",
            "knives, forks, and spoons used for eating or serving food",
            "a tall North American plant of the daisy family, with very large golden-rayed flowers",
            "an edible Asian plant of the goosefoot family, with large dark green leaves which are widely eaten as a vegetable",
            "a game for two teams, usually of six players, in which a large ball is hit by hand over a high net",
            "an Asian and Australasian starling that typically has dark plumage, gregarious behaviour, and a loud call.",
            " a country located mostly in the southern half of South America",
            "each of the branched horns on the head of an adult deer (typically a male one), which are made of bone and are grown and cast annually"};

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
