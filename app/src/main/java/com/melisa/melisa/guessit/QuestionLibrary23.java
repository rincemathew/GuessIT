package com.melisa.melisa.guessit;

public class QuestionLibrary23 {
    private Integer mQuestions [] = {
            R.drawable.curling,
            R.drawable.horseball,
            R.drawable.skibobbing,
            R.drawable.pole_vault,
            R.drawable.football,
            R.drawable.baseball,
            R.drawable.ice_hockey,
            R.drawable.water_polo,
            R.drawable.sumo,
            R.drawable.lacrosse,

    };



    private String mChoices [][] = {
            {"L","G","C", "N", "U","","R","","I",""},
            {"L","R", "B", "H","E","S","A","","O","L"},
            {"B","B", "K", "N","O","I","S","B","I","G"},
            {"P","A","T", "O", "L","E","_","V","U","L"},
            {"O","O", "F", "L","A","","B","T","L",""},
            {"B","E", "L", "L","B","","A","S","A",""},
            {"C","H", "_", "E","E","O","Y","I","K","C"},
            {"A","O", "W", "R","L","T","_","O","E","P"},
            {"","U", "M", "S","","","","O","",""},
            {"C","L", "S", "A","S","","E","R","O",""}
    };



    private String mCorrectAnswers[] = {"CURLING", "HORSEBALL", "SKIBOBBING", "POLE_VAULT", "FOOTBALL", "BASEBALL", "ICE_HOCKEY", "WATER_POLO", "SUMO", "LACROSSE"};


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
