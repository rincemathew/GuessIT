package com.melisa.melisa.guessit;

public class QuestionLibrary {

    private Integer mQuestions [] = {
            R.drawable.whale,
            R.drawable.lobster,
            R.drawable.eel,
            R.drawable.octopus,
            R.drawable.seal,
            R.drawable.crab,
            R.drawable.shark,
            R.drawable.starfish,
            R.drawable.dolphin,
            R.drawable.turtle,

    };



    private String mChoices [][] = {
            {"","A","L","H","","","E","W","",""},
            {"E","L","B","T","R","","O","S","",""},
            {"","E","L","E","","","","","",""},
            {"U","O","O","P","S","","T","C","",""},
            {"","E","L","A","","","","S","",""},
            {"","A","B","R","","","","C","",""},
            {"","A","R","S","","","K","H","",""},
            {"F","R","T","S","H","","A","I","S",""},
            {"N","O","D","L","H","","","P","I",""},
            {"","R","T","T","","","L","E","U",""}
    };



    private String mCorrectAnswers[] = {"WHALE", "LOBSTER", "EEL", "OCTOPUS", "SEAL", "CRAB", "SHARK", "STARFISH", "DOLPHIN", "TURTLE"};


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
