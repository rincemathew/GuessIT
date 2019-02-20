package com.melisa.melisa.guessit;

public class QuestionLibrary26 {
    private Integer mQuestions [] = {
            R.drawable.colosseum,
            R.drawable.big_ben,
            R.drawable.sanchi,
            R.drawable.petra,
            R.drawable.agra_fort,
            R.drawable.hatra,
            R.drawable.stonehenge,
            R.drawable.pentagon,
            R.drawable.versailles,
            R.drawable.mount_fuji,

    };



    private String mChoices [][] = {
            {"S","E","C", "O", "M","L","S","","O","U"},
            {"N","I", "_", "B","G","","B","","E",""},
            {"","N", "A", "I","","","S","H","C",""},
            {"E","R","P", "T", "A","","","","",""},
            {"F","G", "_", "O","R","T","A","","A","R"},
            {"R","A", "T", "A","H","","","","",""},
            {"N","E", "S", "E","H","G","T","N","O","E"},
            {"P","A", "G", "T","O","","E","N","N",""},
            {"S","E", "A", "R","S","V","L","E","L","I"},
            {"I","T", "N", "_","M","F","U","J","O","U"}
    };



    private String mCorrectAnswers[] = {"COLOSSEUM", "BIG_BEN", "SANCHI", "PETRA", "AGRA_FORT", "HATRA", "STONEHENGE", "PENTAGON", "VERSAILLES", "MOUNT_FUJI"};


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
