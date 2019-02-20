package com.melisa.melisa.guessit;

public class QuestionLibrary8 {
    private Integer mQuestions [] = {
            R.drawable.apron,
            R.drawable.oven,
            R.drawable.whisk,
            R.drawable.bowl,
            R.drawable.kettle,
            R.drawable.saucer,
            R.drawable.toaster,
            R.drawable.fork,
            R.drawable.peeler,
            R.drawable.jug,

    };



    private String mChoices [][] = {
            {"A","P","R", "O", "N","","","","",""},
            {"","O", "N", "V","","","","E","",""},
            {"W","I", "H", "K","S","","","","",""},
            {"","L","B", "W", "","","","O","",""},
            {"","T", "T", "L","","","E","K","E",""},
            {"","A", "S", "R","","","E","U","C",""},
            {"T","S", "E", "O","R","","T","","A",""},
            {"","R", "O", "K","","","","F","",""},
            {"","L", "P", "R","","","E","E","E",""},
            {"","U", "J", "G","","","","","",""}
    };



    private String mCorrectAnswers[] = {"APRON", "OVEN", "WHISK", "BOWL", "KETTLE", "SAUCER", "TOASTER", "FORK", "PEELER", "JUG"};


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
