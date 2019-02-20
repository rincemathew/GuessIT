package com.melisa.melisa.guessit;

public class QuestionLibrary4 {
    private Integer mQuestions [] = {
            R.drawable.cherry,
            R.drawable.fig,
            R.drawable.strawberry,
            R.drawable.jackfruit,
            R.drawable.kiwi,
            R.drawable.mango,
            R.drawable.peach,
            R.drawable.pineapple,
            R.drawable.apple,
            R.drawable.grape,

    };



    private String mChoices [][] = {
            {"","C","R", "H", "","","R","E","Y",""},
            {"","G", "F", "I","","","","","",""},
            {"R","S", "R", "T","E","Y","W","B","A","R"},
            {"J","T","R", "A", "F","","K","I","C","U"},
            {"","I", "W", "K","","","","I","",""},
            {"A","O", "M", "G","N","","","","",""},
            {"A","E", "P", "H","C","","","","",""},
            {"P","E", "I", "N","L","E","P","","P","A"},
            {"P","P", "A", "E","L","","","","",""},
            {"P","A", "G", "R","E","","","","",""}
    };



    private String mCorrectAnswers[] = {"CHERRY", "FIG", "STRAWBERRY", "JACKFRUIT", "KIWI", "MANGO", "PEACH", "PINEAPPLE", "APPLE", "GRAPE"};


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
