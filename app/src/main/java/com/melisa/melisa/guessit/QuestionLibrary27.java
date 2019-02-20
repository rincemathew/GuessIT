package com.melisa.melisa.guessit;

public class QuestionLibrary27 {
    private Integer mQuestions [] = {
            R.drawable.aster,
            R.drawable.dandelion,
            R.drawable.crocuses,
            R.drawable.peony,
            R.drawable.bluebells,
            R.drawable.iris,
            R.drawable.amaryllis,
            R.drawable.ranunculus,
            R.drawable.dianthus,
            R.drawable.tulip,

    };



    private String mChoices [][] = {
            {"A","T","S", "R", "E","","","","",""},
            {"A","E", "O", "D","N","I","D","","N","L"},
            {"C","E", "U", "O","S","","S","R","C",""},
            {"Y","N","E", "O", "P","","","","",""},
            {"E","B", "E", "S","B","L","U","","L","L"},
            {"","R", "I", "S","","","","I","",""},
            {"Y","R", "I", "A","S","L","M","","A","L"},
            {"C","N", "U", "R","N","S","U","A","U","L"},
            {"D","I", "S", "N","H","","A","T","U",""},
            {"T","L", "U", "I","P","","","","",""}
    };



    private String mCorrectAnswers[] = {"ASTER", "DANDELION", "CROCUSES", "PEONY", "BLUEBELLS", "IRIS", "AMARYLLIS", "RANUNCULUS", "DIANTHUS", "TULIP"};


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
}
