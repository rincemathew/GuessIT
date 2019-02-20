package com.melisa.melisa.guessit;

public class QuestionLibrary15 {
    private Integer mQuestions [] = {
            R.drawable.handball,
            R.drawable.cycling,
            R.drawable.marathon,
            R.drawable.sprint,
            R.drawable.hurling,
            R.drawable.boxing,
            R.drawable.rafting,
            R.drawable.kayaking,
            R.drawable.surfing,
            R.drawable.wrestling,

    };



    private String mChoices [][] = {
            {"A","H","B", "L", "D","","N","L","A",""},
            {"G","N", "Y", "I","L","","C","","C",""},
            {"A","N", "R", "O","M","","T","A","H",""},
            {"","T","S", "I", "","","R","P","N",""},
            {"I","L", "G", "H","U","","R","","N",""},
            {"","X", "B", "I","","","O","G","N",""},
            {"T","A", "N", "I","R","","F","","G",""},
            {"G","N", "I", "A","K","","A","K","Y",""},
            {"S","N", "I", "R","G","","U","","F",""},
            {"R","S", "L", "N","G","I","T","","E","W"}
    };



    private String mCorrectAnswers[] = {"HANDBALL", "CYCLING", "MARATHON", "SPRINT", "HURLING", "BOXING", "RAFTING", "KAYAKING", "SURFING", "WRESTLING"};


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
