package com.melisa.melisa.guessit;

public class QuestionLibrary2 {

    private Integer mQuestions [] = {
            R.drawable.india,
            R.drawable.spain,
            R.drawable.sri_lanka,
            R.drawable.israel,
            R.drawable.brazil,
            R.drawable.australia,
            R.drawable.bahrain,
            R.drawable.canada,
            R.drawable.france,
            R.drawable.egypt,

    };



    private String mChoices [][] = {
            {"","I","N", "D", "","","A","I","",""},
            {"","I", "N", "S","","","A","P","",""},
            {"R","L", "_", "A","K","A","S","I","N",""},
            {"","A","R", "S", "","","E","L","I",""},
            {"","I", "L", "R","","","A","B","Z",""},
            {"A","A", "A", "L","I","T","U","S","R",""},
            {"H","R", "I", "N","B","","A","A","",""},
            {"","A", "A", "A","","","C","N","D",""},
            {"","A", "R", "N","","","F","E","C",""},
            {"","Y", "P", "E","","","G","T","",""}
    };



    private String mCorrectAnswers[] = {"INDIA", "SPAIN", "SRI_LANKA", "ISRAEL", "BRAZIL", "AUSTRALIA", "BAHRAIN", "CANADA", "FRANCE", "EGYPT"};


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
