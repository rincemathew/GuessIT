package com.melisa.melisa.guessit;

public class QuestionLibrary11 {
    private Integer mQuestions [] = {
            R.drawable.beak,
            R.drawable.antler,
            R.drawable.mane,
            R.drawable.tusk,
            R.drawable.horn,
            R.drawable.tentacles,
            R.drawable.fin,
            R.drawable.paws,
            R.drawable.whiskers,
            R.drawable.hooves,

    };



    private String mChoices [][] = {
            {"","A","E", "K", "","","","B","",""},
            {"","E", "T", "L","","","N","A","R",""},
            {"","N", "M", "E","","","","A","",""},
            {"","T","U", "S", "","","","K","",""},
            {"","H", "R", "O","","","","N","",""},
            {"A","E", "C", "T","S","E","T","","N","L"},
            {"","I", "N", "F","","","","","",""},
            {"","P", "W", "A","","","","S","",""},
            {"R","S", "K", "W","I","","E","H","S",""},
            {"","V", "O", "S","","","H","O","E",""}
    };



    private String mCorrectAnswers[] = {"BEAK", "ANTLER", "MANE", "TUSK", "HORN", "TENTACLES", "FIN", "PAWS", "WHISKERS", "HOOVES"};


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
