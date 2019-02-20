package com.melisa.melisa.guessit;

public class QuestionLibrary25 {
    private Integer mQuestions [] = {
            R.drawable.nauru,
            R.drawable.qatar,
            R.drawable.poland,
            R.drawable.tanzania,
            R.drawable.japan,
            R.drawable.norway,
            R.drawable.somalia,
            R.drawable.ukraine,
            R.drawable.kenya,
            R.drawable.romania,

    };



    private String mChoices [][] = {
            {"U","A","N", "R", "U","","","","",""},
            {"T","A", "Q", "A","R","","","","",""},
            {"","A", "P", "D","","","L","N","O",""},
            {"I","T","N", "A", "A","","N","Z","A",""},
            {"J","A", "N", "P","A","","","","",""},
            {"","N", "W", "O","","","Y","R","A",""},
            {"I","S", "O", "L","M","","A","","A",""},
            {"A","R", "N", "K","E","","U","","I",""},
            {"K","E", "N", "A","Y","","","","",""},
            {"O","A", "N", "A","I","","M","","R",""}
    };



    private String mCorrectAnswers[] = {"NAURU", "QATAR", "POLAND", "TANZANIA", "JAPAN", "NORWAY", "SOMALIA", "UKRAINE", "KENYA", "ROMANIA"};


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
