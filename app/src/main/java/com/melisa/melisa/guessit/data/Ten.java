package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Ten {
    private Integer mQuestions [] = {
            R.drawable.poland,
            R.drawable.ant,
            R.drawable.triangle,
            R.drawable.wolf,
            R.drawable.nauru,
            R.drawable.delphinium,
            R.drawable.leeks,
            R.drawable.lilium,
            R.drawable.somalia,
            R.drawable.pineapple,
            R.drawable.turtle,
            R.drawable.hornbill,
            R.drawable.wrestling,
            R.drawable.peru,
            R.drawable.betel_nut,
            R.drawable.hydrangea,
            R.drawable.grill,
            R.drawable.rwanda,
            R.drawable.pigeon,
            R.drawable.baseball,
    };



    private String mChoices [][] = {
            {"L","Z","O","D","N","X","A","P","C","V"},
            {"B","N","M","Q","W","A","E","N","R","T"},
            {"T","G","R","E","T","L","N","I","Y","A"},
            {"U","F","I","O","W","L","P","O","A","S"},
            {"U","D","N","R","F","A","G","U","H","J"},
            {"I","N","D","H","E","I","U","L","M","P"},
            {"K","L","E","Z","E","L","X","K","C","S"},
            {"L","K","I","V","B","L","U","I","N","M"},
            {"A","M","O","S","Q","L","M","W","A","I"},
            {"E","E","P","L","I","A","E","N","P","P"},
            {"R","U","R","E","T","T","Y","T","U","L"},
            {"L","I","R","L","N","H","I","B","O","O"},
            {"G","W","T","N","R","L","P","E","I","S"},
            {"A","E","S","P","D","F","R","U","G","H"},
            {"T","U","T","E","N","B","J","L","K","E"},
            {"A","H","R","E","A","N","Y","L","G","D"},
            {"L","R","G","Z","X","C","I","V","B","L"},
            {"A","R","N","D","M","W","Q","N","A","W"},
            {"E","E","P","N","G","R","T","O","I","Y"},
            {"B","U","E","A","B","L","I","A","L","S"}
    };


    private String mCorrectAnswers[] = {"POLAND", "ANT", "TRIANGLE", "WOLF", "NAURU", "DELPHINIUM", "LEEKS", "LILIUM",
            "SOMALIA", "PINEAPPLE", "TURTLE","HORNBILL","WRESTLING","PERU","BETELNUT","HYDRANGEA","GRILL","RWANDA","PIGEON",
            "BASEBALL"};
    private String hint[] = {"is a country located in Central Europe",
            "a small insect typically having a sting and living in a complex social colony with one or more breeding queens",
            "a plane figure with three straight sides and three angles",
            "a wild carnivorous mammal which is the largest member of the dog family, living and hunting in packs",
            " is a tiny island country in Micronesia, northeast of Australia",
            "a popular garden plant of the buttercup family, which bears tall spikes of blue flowers",
            "a plant related to the onion, with flat overlapping leaves forming an elongated cylindrical bulb which together with the leaf bases is eaten as a vegetable",
            "is a genus of herbaceous flowering plants growing from bulbs, all with large prominent flowers",
            "is a sovereign country located in the Horn of Africa",
            "a large juicy tropical fruit consisting of aromatic edible yellow flesh",
            "a large marine reptile with a bony or leathery shell and flippers",
            "a medium to large tropical Old World bird",
            "the sport or activity of grappling with an opponent and trying to throw or hold them down on the ground",
            "is a country in South America that's home to a section of Amazon rainforest and Machu Picchu",
            "another term for areca nut",
            "a shrub or climbing plant with rounded or flattened flowering heads of small florets, native to Asia and America",
            "a device on a cooker that radiates heat downwards for cooking food.",
            "formerly Ruanda",
            "a stout seed- or fruit-eating bird with a small head",
            "a ball game played between two teams of nine on a diamond-shaped circuit of four base"};

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
