package com.melisa.melisa.guessit;

public class QuestionLibrary6 {
    private Integer mQuestions [] = {
            R.drawable.green_peas,
            R.drawable.onion,
            R.drawable.drumstick,
            R.drawable.beetroot,
            R.drawable.spinach,
            R.drawable.maize,
            R.drawable.pumpkin,
            R.drawable.cabbage,
            R.drawable.turnip,
            R.drawable.carrot,

    };



    private String mChoices [][] = {
            {"A","E","_", "G", "R","E","S","N","E","P"},
            {"N","I", "O", "O","N","","","","",""},
            {"K","C","D", "M", "R","I","U","","S","T"},
            {"T","B", "E", "E","T","","O","R","O",""},
            {"A","N", "I", "H","C","","S","","P",""},
            {"A","E", "M", "Z","I","","","","",""},
            {"I","K", "N", "U","M","","P","","P",""},
            {"G","B", "C", "A","B","","A","","E",""},
            {"","U", "I", "T","","","R","P","N",""},
            {"","A", "C", "T","","","O","R","R",""}
    };



    private String mCorrectAnswers[] = {"GREEN_PEAS", "ONION", "DRUMSTICK", "BEETROOT", "SPINACH", "MAIZE", "PUMPKIN", "CABBAGE", "TURNIP", "CARROT"};


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
