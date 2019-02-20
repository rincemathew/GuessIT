package com.melisa.melisa.guessit;

public class QuestionLibrary18 {
    private Integer mQuestions [] = {
            R.drawable.poppy,
            R.drawable.delphinium,
            R.drawable.begonia,
            R.drawable.lilium,
            R.drawable.centaurea,
            R.drawable.allium,
            R.drawable.snowdrop,
            R.drawable.daffodil,
            R.drawable.anemone,
            R.drawable.hydrangea,

    };



    private String mChoices [][] = {
            {"O","P","P", "P", "Y","","","","",""},
            {"U","I", "D", "P","L","N","I","E","M","H"},
            {"G","A", "E", "I","O","","N","","B",""},
            {"","I","U", "L", "","","I","M","L",""},
            {"U","A", "A", "N","E","C","T","","E","R"},
            {"","L", "I", "L","","","A","M","U",""},
            {"W","P", "O", "D","S","","N","O","R",""},
            {"D","L", "F", "D","A","","F","O","I",""},
            {"E","N", "M", "E","N","","O","","A",""},
            {"Y","G", "A", "A","R","H","E","","N","D"}
    };



    private String mCorrectAnswers[] = {"POPPY", "DELPHINIUM", "BEGONIA", "LILIUM", "CENTAUREA", "ALLIUM", "SNOWDROP", "DAFFODIL", "ANEMONE", "HYDRANGEA"};


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
