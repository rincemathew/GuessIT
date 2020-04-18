package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Four {
    private Integer mQuestions [] = {
            R.drawable.fox,
            R.drawable.spain,
            R.drawable.housefly,
            R.drawable.pear,
            R.drawable.duck,
            R.drawable.whiskers,
            R.drawable.malta,
            R.drawable.mango,
            R.drawable.okra,
            R.drawable.oven,
            R.drawable.chestnut,
            R.drawable.trapezium,
            R.drawable.japan,
            R.drawable.moai,
            R.drawable.spoon,
            R.drawable.daisy,
            R.drawable.hurling,
            R.drawable.broccoli,
            R.drawable.germany,
            R.drawable.marathon,
    };



    private String mChoices [][] = {
            {"Q","D","F","S","A","O","B","X","Z","C"},
            {"I","N","R","S","A","U","P","O","P","M"},
            {"M","F","H","S","E","O","Y","U","L","Q"},
            {"D","R","A","E","R","P","U","G","N","M"},
            {"I","P","D","A","Z","K","X","C","O","U"},
            {"X","W","K","E","H","S","S","I","R","Q"},
            {"A","T","T","L","I","A","F","M","J","M"},
            {"T","O","R","G","M","N","A","Z","N","W"},
            {"L","P","O","A","R","J","K","H","G","C"},
            {"V","B","E","V","N","O","Z","P","O","X"},
            {"Q","E","S","C","T","H","T","U","N","A"},
            {"I","Z","T","X","R","E","U","A","M","P"},
            {"X","A","B","Q","J","A","N","P","F","L"},
            {"I","R","A","D","O","K","M","L","M","V"},
            {"R","S","P","C","G","H","O","I","N","O"},
            {"F","S","Y","S","A","D","C","Z","I","U"},
            {"B","G","N","U","A","H","R","I","L","L"},
            {"R","I","B","L","O","C","C","D","R","O"},
            {"Q","G","Z","Y","E","N","R","A","M","B"},
            {"G","U","N","M","T","A","R","H","O","A"}
    };


    private String mCorrectAnswers[] = {"FOX", "SPAIN", "HOUSEFLY", "PEAR", "DUCK", "WHISKERS", "MALTA", "MANGO", "OKRA", "OVEN",
            "CHESTNUT","TRAPEZIUM","JAPAN","MOAI","SPOON","DAISY","HURLING","BROCCOLI","GERMANY","MARATHON"};
    private String hint[] = {
            "a carnivorous mammal of the dog family with a pointed muzzle and bushy tail, proverbial for its cunning",
            "a country on Europe’s Iberian Peninsula, includes 17 autonomous regions with diverse geography and cultures.",
            "a common small fly occurring worldwide in and around human habitation",
            "a sweet yellowish- or brownish-green edible fruit that is typically narrow at the stalk and wider towards the base, with sweet, slightly gritty flesh",
            "a waterbird with a broad blunt bill, short legs, webbed feet, and a waddling gait",
            "a long projecting hair or bristle growing from the face or snout of many mammals",
            "is an archipelago in the central Mediterranean between Sicily and the North African coast",
            "a fleshy, oval, yellowish-red tropical fruit that is eaten ripe or used green for pickles or chutneys",
            "a plant of the mallow family with long ridged seed pods, native to the Old World tropics",
            "an enclosed compartment, usually part of a cooker, for cooking and heating food",
            "a glossy hard brown edible nut which develops within a bristly case and which may be roasted and eaten",
            "a quadrilateral with one pair of sides paralle",
            "an island country located in East Asia",
            "monolithic human figures carved by the Rapa Nui people on Easter Island in eastern Polynesia between the years 1250 and 1500",
            "an implement consisting of a small, shallow oval or round bowl on a long handle, used for eating, stirring, and serving food",
            "a small European grassland plant which has flowers with a yellow disc and white rays",
            "an Irish game resembling hockey, played with a shorter stick with a broader oval blade",
            "a cultivated variety of cabbage bearing heads of green or purplish flower buds that are eaten as a vegetable",
            "is a Western European country with a landscape of forests, rivers, mountain ranges and North Sea beaches",
            "a long-distance running race"};

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
