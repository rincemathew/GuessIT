package com.melisa.melisa.guessit;

public class QuestionLibrary7 {private Integer mQuestions [] = {
        R.drawable.peru,
        R.drawable.belize,
        R.drawable.lebanon,
        R.drawable.bhutan,
        R.drawable.argentina,
        R.drawable.uae,
        R.drawable.rwanda,
        R.drawable.turkey,
        R.drawable.bangladesh,
        R.drawable.italy,

};



    private String mChoices [][] = {
            {"","U","R", "P", "","","","E","",""},
            {"","Z", "B", "L","","","E","E","I",""},
            {"A","L", "N", "E","B","","O","","N",""},
            {"","B","A", "H", "","","T","N","U",""},
            {"A","E", "R", "N","G","I","N","","T","A"},
            {"","A", "E", "U","","","","","",""},
            {"","R", "D", "W","","","A","A","N",""},
            {"","R", "T", "U","","","E","K","Y",""},
            {"G","D", "B", "L","E","A","S","H","A","N"},
            {"L","T", "I", "A","Y","","","","",""}
    };



    private String mCorrectAnswers[] = {"PERU", "BELIZE", "LEBANON", "BHUTAN", "ARGENTINA", "UAE", "RWANDA", "TURKEY", "BANGLADESH", "ITALY"};


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
