package com.melisa.melisa.guessit;

public class QuestionLibrary29 {
    private Integer mQuestions [] = {
            R.drawable.banana,
            R.drawable.chikoo,
            R.drawable.orange,
            R.drawable.litchi,
            R.drawable.pear,
            R.drawable.plum,
            R.drawable.guava,
            R.drawable.papaya,
            R.drawable.watermelon,
            R.drawable.jamun,

    };



    private String mChoices [][] = {
            {"","N","N", "B", "","","A","A","A",""},
            {"","C", "K", "H","","","O","I","O",""},
            {"","O", "R", "A","","","E","G","N",""},
            {"","T","I", "L", "","","H","C","I",""},
            {"","A", "R", "P","","","","E","",""},
            {"","M", "P", "L","","","","U","",""},
            {"V","G", "A", "U","A","","","","",""},
            {"","P", "Y", "P","","","A","A","A",""},
            {"W","A", "O", "N","T","E","R","L","E","M"},
            {"M","J", "A", "N","U","","","","",""}
    };



    private String mCorrectAnswers[] = {"BANANA", "CHIKOO", "ORANGE", "LITCHI", "PEAR", "PLUM", "GUAVA", "PAPAYA", "WATERMELON", "JAMUN"};


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
