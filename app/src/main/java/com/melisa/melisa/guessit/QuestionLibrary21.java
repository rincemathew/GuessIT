package com.melisa.melisa.guessit;

public class QuestionLibrary21 {
    private Integer mQuestions [] = {
            R.drawable.cooker,
            R.drawable.napkin,
            R.drawable.dishwasher,
            R.drawable.grill,
            R.drawable.blender,
            R.drawable.spoon,
            R.drawable.mixer,
            R.drawable.cutlery,
            R.drawable.grater,
            R.drawable.sink,

    };



    private String mChoices [][] = {
            {"","O","E", "C", "","","K","O","R",""},
            {"","N", "A", "K","","","I","N","P",""},
            {"S","D", "W", "A","S","H","H","I","R","E"},
            {"I","R","L", "G", "L","","","","",""},
            {"R","E", "N", "D","L","","E","","B",""},
            {"N","O", "S", "O","P","","","","",""},
            {"I","M", "E", "X","R","","","","",""},
            {"L","Y", "T", "U","E","","C","","R",""},
            {"","G", "E", "R","","","A","R","T",""},
            {"","N", "S", "K","","","","I","",""}
    };



    private String mCorrectAnswers[] = {"COOKER", "NAPKIN", "DISHWASHER", "GRILL", "BLENDER", "SPOON", "MIXER", "CUTLERY", "GRATER", "SINK"};


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
