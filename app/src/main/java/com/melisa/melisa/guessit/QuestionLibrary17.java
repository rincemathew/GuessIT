package com.melisa.melisa.guessit;

public class QuestionLibrary17 {
    private Integer mQuestions [] = {
            R.drawable.honeybee,
            R.drawable.mosquito,
            R.drawable.beetle,
            R.drawable.dragonfly,
            R.drawable.moth,
            R.drawable.ant,
            R.drawable.ladybird,
            R.drawable.wasp,
            R.drawable.cockroach,
            R.drawable.housefly,

    };



    private String mChoices [][] = {
            {"N","O","E", "H", "B","","Y","E","E",""},
            {"I","U", "M", "O","O","","T","S","Q",""},
            {"","E", "T", "B","","","L","E","E",""},
            {"G","Y","R", "L", "F","A","O","","D","N"},
            {"","H", "T", "O","","","","M","",""},
            {"","T", "N", "A","","","","","",""},
            {"I","D", "B", "L","A","","Y","D","R",""},
            {"","W", "A", "S","","","","P","",""},
            {"R","K", "C", "C","H","C","A","","O","O"},
            {"S","H", "U", "Y","L","","O","F","E",""}
    };



    private String mCorrectAnswers[] = {"HONEYBEE", "MOSQUITO", "BEETLE", "DRAGONFLY", "MOTH", "ANT", "LADYBIRD", "WASP", "COCKROACH", "HOUSEFLY"};


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
