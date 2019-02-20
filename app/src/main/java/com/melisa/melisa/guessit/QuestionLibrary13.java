package com.melisa.melisa.guessit;

public class QuestionLibrary13 {
    private Integer mQuestions [] = {
            R.drawable.macao,
            R.drawable.malta,
            R.drawable.yemen,
            R.drawable.paraguay,
            R.drawable.niger,
            R.drawable.vanuatu,
            R.drawable.morocco,
            R.drawable.slovenia,
            R.drawable.sudan,
            R.drawable.oman,

    };



    private String mChoices [][] = {
            {"C","A","M", "A", "O","","","","",""},
            {"T","L", "M", "A","A","","","","",""},
            {"E","Y", "E", "M","N","","","","",""},
            {"A","Y","R", "U", "A","","A","G","P",""},
            {"I","R", "G", "N","E","","","","",""},
            {"V","T", "A", "U","U","","N","","A",""},
            {"C","O", "O", "O","C","","M","","R",""},
            {"V","I", "O", "N","L","","S","A","E",""},
            {"D","U", "N", "A","S","","","","",""},
            {"","N", "O", "A","","","","M","",""}
    };



    private String mCorrectAnswers[] = {"MACAO", "MALTA", "YEMEN", "PARAGUAY", "NIGER", "VANUATU", "MOROCCO", "SLOVENIA", "SUDAN", "OMAN"};


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
