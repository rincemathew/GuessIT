package com.melisa.melisa.guessit;

public class QuestionLibrary12 {
    private Integer mQuestions [] = {
            R.drawable.crescent,
            R.drawable.hexagon,
            R.drawable.octagon,
            R.drawable.rhombus,
            R.drawable.trapezium,
            R.drawable.star,
            R.drawable.circle,
            R.drawable.triangle,
            R.drawable.oval,
            R.drawable.square,

    };



    private String mChoices [][] = {
            {"C","S","E", "R", "T","","N","E","C",""},
            {"G","X", "H", "N","O","","E","","A",""},
            {"O","C", "T", "O","N","","A","","G",""},
            {"U","S","M", "B", "H","","R","","O",""},
            {"A","R", "U", "I","T","M","E","","Z","P"},
            {"","T", "S", "A","","","","R","",""},
            {"","E", "C", "R","","","I","L","C",""},
            {"E","T", "N", "R","G","","L","A","I",""},
            {"","L", "O", "V","","","","A","",""},
            {"","Q", "R", "S","","","A","U","E",""}
    };



    private String mCorrectAnswers[] = {"CRESCENT", "HEXAGON", "OCTAGON", "RHOMBUS", "TRAPEZIUM", "STAR", "CIRCLE", "TRIANGLE", "OVAL", "SQUARE"};


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
