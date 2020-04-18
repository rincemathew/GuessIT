package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Twelve {
    private Integer mQuestions [] = {
            R.drawable.raisin,
            R.drawable.zambia,
            R.drawable.cockroach,
            R.drawable.taiwan,
            R.drawable.elephant,
            R.drawable.belgium,
            R.drawable.lacrosse,
            R.drawable.bluebells,
            R.drawable.big_ben,
            R.drawable.nyhavn,
            R.drawable.chikoo,
            R.drawable.skibobbing,
            R.drawable.penguin,
            R.drawable.pole_vault,
            R.drawable.morocco,
            R.drawable.taro,
            R.drawable.crocuses,
            R.drawable.niger,
            R.drawable.dishwasher,
            R.drawable.swan,
    };



    private String mChoices [][] = {
            {"B","N","I","S","I","N","R","M","A","Q"},
            {"Z","W","E","A","R","A","T","M","B","I"},
            {"Y","A","C","C","O","R","C","K","H","O"},
            {"U","W","I","I","N","A","T","O","A","P"},
            {"A","S","E","P","H","E","A","L","N","T"},
            {"I","D","G","B","U","E","F","L","M","G"},
            {"S","L","S","A","E","C","H","R","J","O"},
            {"B","E","K","L","L","B","S","L","U","E"},
            {"L","B","Z","B","X","I","E","G","N","C"},
            {"V","A","V","Y","B","N","N","H","M","N"},
            {"Q","W","O","O","E","R","K","I","H","C"},
            {"N","I","O","B","B","I","K","B","S","G"},
            {"T","G","Y","N","U","P","I","E","N","U"},
            {"T","L","E","V","A","L","U","P","I","O"},
            {"O","P","O","M","A","O","R","C","O","C"},
            {"S","T","D","A","F","R","G","O","H","J"},
            {"K","U","C","S","E","C","S","R","L","O"},
            {"E","Z","G","I","X","R","N","C","V","B"},
            {"H","S","E","I","S","A","D","H","R","W"},
            {"N","M","Q","S","W","W","E","A","R","N"}
    };


    private String mCorrectAnswers[] = {"RAISIN", "ZAMBIA", "COCKROACH", "TAIWAN", "ELEPHANT", "BELGIUM", "LACROSSE", "BLUEBELLS",
            "BIGBEN", "NYHAVN", "CHIKOO","SKIBOBBING","PENGUIN","POLEVAULT","MOROCCO","TARO","CROCUSES","NIGER","DISHWASHER",
            "SWAN"};
    private String hint[] = {"a partially dried grape",
            "is a landlocked country in Southern-Central Africa",
            "a scavenging insect that resembles a beetle",
            "officially the Republic of China, is a state in East Asia",
            "It is the largest living land animal",
            "is known for medieval towns, Renaissance architecture",
            "a team game, originally played by North American Indians",
            "a European woodland plant of the lily family that produces clusters of blue bell-shaped flowers in spring",
            "nickname for the Great Bell of the striking clock at the north end of the Palace of Westminster",
            "is a 17th-century waterfront, canal and entertainment district in Copenhagen",
            "commonly known as sapodilla, sapota",
            "is a winter sport involving a bicycle-type frame attached to skis",
            "a large flightless seabird of the southern hemisphere",
            "an athletic event in which competitors attempt to vault over a high bar with the aid of an extremely long flexible pole",
            "a North African country bordering the Atlantic Ocean and Mediterranean Sea",
            "a tropical Asian plant of the arum family which has edible starchy corms and edible fleshy leaves",
            "a small spring-flowering Eurasian plant of the iris family, which grows from a corm and bears bright yellow, purple, or white flowers",
            "is a landlocked country in West Africa ",
            "a machine for washing dishes automatically",
            "a large waterbird with a long flexible neck, short legs, webbed feet, a broad bill"};

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
