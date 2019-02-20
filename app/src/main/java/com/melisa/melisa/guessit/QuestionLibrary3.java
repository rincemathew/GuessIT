package com.melisa.melisa.guessit;

public class QuestionLibrary3 {
    private Integer mQuestions [] = {
            R.drawable.sparrow,
            R.drawable.duck,
            R.drawable.owl,
            R.drawable.bulbul,
            R.drawable.parrot,
            R.drawable.woodpecker,
            R.drawable.toucan,
            R.drawable.penguin,
            R.drawable.hornbill,
            R.drawable.kingfisher,

    };



    private String mChoices [][] = {
            {"O","W","A", "S", "R","","R","P","",""},
            {"","K", "U", "C","","","","D","",""},
            {"","L", "O", "W","","","","","",""},
            {"","L","L", "B", "","","U","U","B",""},
            {"","R", "O", "T","","","R","P","A",""},
            {"P","O", "D", "E","O","E","C","K","W","R"},
            {"","U", "A", "T","","","O","C","N",""},
            {"E","U", "G", "P","N","","N","I","",""},
            {"R","L", "O", "B","I","","H","N","L",""},
            {"N","S", "G", "K","E","H","R","I","F","I"}
    };



    private String mCorrectAnswers[] = {"SPARROW", "DUCK", "OWL", "BULBUL", "PARROT", "WOODPECKER", "TOUCAN", "PENGUIN", "HORNBILL", "KINGFISHER"};


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
