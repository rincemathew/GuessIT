package com.melisa.melisa.guessit;

public class QuestionLibrary5 {
    private Integer mQuestions [] = {
            R.drawable.archery,
            R.drawable.rugby,
            R.drawable.fencing,
            R.drawable.basketball,
            R.drawable.squash,
            R.drawable.polo,
            R.drawable.tennis,
            R.drawable.cricket,
            R.drawable.golf,
            R.drawable.volleyball,

    };



    private String mChoices [][] = {
            {"R","E","R", "Y", "A","","C","","H",""},
            {"B","G", "R", "Y","U","","","","",""},
            {"I","E", "F", "G","N","","C","","N",""},
            {"S","L","B", "A", "A","L","K","T","E","B"},
            {"","U", "S", "H","","","Q","S","A",""},
            {"","O", "L", "O","","","","P","",""},
            {"","E", "N", "N","","","T","I","S",""},
            {"T","K", "C", "C","E","","I","","R",""},
            {"","F", "L", "O","","","","G","",""},
            {"Y","L", "L", "L","V","E","B","L","A","O"}
    };



    private String mCorrectAnswers[] = {"ARCHERY", "RUGBY", "FENCING", "BASKETBALL", "SQUASH", "POLO", "TENNIS", "CRICKET", "GOLF", "VOLLEYBALL"};


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
