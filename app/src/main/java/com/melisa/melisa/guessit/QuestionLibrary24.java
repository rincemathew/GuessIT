package com.melisa.melisa.guessit;

public class QuestionLibrary24 {
    private Integer mQuestions [] = {
            R.drawable.lion,
            R.drawable.nilgai,
            R.drawable.elephant,
            R.drawable.kangaroo,
            R.drawable.porcupine,
            R.drawable.cheetah,
            R.drawable.tiger,
            R.drawable.giraffe,
            R.drawable.zebra,
            R.drawable.hare,

    };



    private String mChoices [][] = {
            {"","N","I", "O", "","","","L","",""},
            {"","N", "G", "I","","","L","A","I",""},
            {"E","E", "T", "P","H","","N","L","A",""},
            {"A","R","A", "K", "O","","G","O","N",""},
            {"E","P", "P", "U","I","O","N","","R","C"},
            {"H","C", "T", "A","H","","E","","E",""},
            {"E","G", "I", "R","T","","","","",""},
            {"E","A", "G", "F","I","","R","","F",""},
            {"A","Z", "R", "E","B","","","","",""},
            {"","E", "H", "A","","","","R","",""}
    };



    private String mCorrectAnswers[] = {"LION", "NILGAI", "ELEPHANT", "KANGAROO", "PORCUPINE", "CHEETAH", "TIGER", "GIRAFFE", "ZEBRA", "HARE"};


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
