package com.melisa.melisa.guessit;

public class QuestionLibrary20 {
    private Integer mQuestions [] = {
            R.drawable.capsicum,
            R.drawable.green_beans,
            R.drawable.potato,
            R.drawable.eggplant,
            R.drawable.taro,
            R.drawable.broccoli,
            R.drawable.leeks,
            R.drawable.okra,
            R.drawable.radish,
            R.drawable.cucumber,

    };



    private String mChoices [][] = {
            {"P","U","I", "C", "M","","S","C","A",""},
            {"E","N", "E", "B","R","S","A","N","G","E"},
            {"","T", "O", "O","","","P","T","A",""},
            {"G","A","G", "E", "T","","L","N","P",""},
            {"","R", "O", "T","","","","A","",""},
            {"R","O", "B", "C","I","","L","O","C",""},
            {"S","E", "K", "L","E","","","","",""},
            {"","R", "O", "K","","","","A","",""},
            {"","A", "S", "R","","","I","H","D",""},
            {"E","R", "C", "M","U","","U","B","C",""}
    };



    private String mCorrectAnswers[] = {"CAPSICUM", "GREENBEANS", "POTATO", "EGGPLANT", "TARO", "BROCCOLI", "LEEKS", "OKRA", "RADISH", "CUCUMBER"};


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
