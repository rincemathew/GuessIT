package com.melisa.melisa.guessit;

public class QuestionLibrary9 {
    private Integer mQuestions [] = {
            R.drawable.anthurium,
            R.drawable.dahlia,
            R.drawable.daisy,
            R.drawable.hibiscus,
            R.drawable.jasmine,
            R.drawable.lotus,
            R.drawable.marigold,
            R.drawable.orchid,
            R.drawable.rose,
            R.drawable.sunflower,

    };



    private String mChoices [][] = {
            {"M","A","H", "N", "I","T","U","","R","U"},
            {"","D", "A", "A","","","I","H","L",""},
            {"I","D", "S", "A","Y","","","","",""},
            {"I","S","B", "U", "H","","S","I","C",""},
            {"A","S", "J", "N","E","","M","","I",""},
            {"S","L", "U", "O","T","","","","",""},
            {"D","I", "M", "G","L","","R","A","O",""},
            {"","H", "O", "I","","","C","R","D",""},
            {"","O", "E", "S","","","","R","",""},
            {"W","S", "O", "L","E","U","F","","R","N"}
    };



    private String mCorrectAnswers[] = {"ANTHURIUM", "DAHLIA", "DAISY", "HIBISCUS", "JASMINE", "LOTUS", "MARIGOLD", "ORCHID", "ROSE", "SUNFLOWER"};


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
