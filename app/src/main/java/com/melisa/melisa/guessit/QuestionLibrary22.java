package com.melisa.melisa.guessit;

public class QuestionLibrary22 {
    private Integer mQuestions [] = {
            R.drawable.betel_nut,
            R.drawable.chestnut,
            R.drawable.pistachio,
            R.drawable.pine_nuts,
            R.drawable.almond_nut,
            R.drawable.hazelhut,
            R.drawable.raisin,
            R.drawable.cashew_nut,
            R.drawable.walnut,
            R.drawable.peanut,
    };



    private String mChoices [][] = {
            {"E","T","_", "U", "T","L","B","","E","N"},
            {"C","U", "T", "N","H","","S","E","T",""},
            {"S","T", "I", "P","I","O","H","","A","C"},
            {"S","E","_", "N", "I","P","U","","T","N"},
            {"L","N", "A", "T","M","D","U","_","O","N"},
            {"H","N", "U", "T","L","","A","Z","E",""},
            {"","A", "R", "N","","","I","I","S",""},
            {"E","H", "C", "_","T","U","A","N","S","W"},
            {"","A", "W", "L","","","U","N","T",""},
            {"","T", "N", "U","","","E","A","P",""}
    };



    private String mCorrectAnswers[] = {"BETEL_NUT", "CHESTNUT", "PISTACHIO", "PINE_NUTS", "ALMOND_NUT", "HAZELNUT", "RAISIN", "CASHEW_NUT", "WALNUT", "PEANUT"};


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
