package com.melisa.melisa.guessit;

public class QuestionLibrary30 {
    private Integer mQuestions [] = {
            R.drawable.germany,
            R.drawable.haiti,
            R.drawable.nepal,
            R.drawable.albania,
            R.drawable.chile,
            R.drawable.portugal,
            R.drawable.belgium,
            R.drawable.taiwan,
            R.drawable.bolivia,
            R.drawable.denmark,

    };



    private String mChoices [][] = {
            {"Y","G","M", "A", "E","","R","","N",""},
            {"T","I", "H", "A","I","","","","",""},
            {"L","N", "A", "P","E","","","","",""},
            {"A","L","B", "A", "N","","A","","I",""},
            {"E","C", "L", "H","I","","","","",""},
            {"L","A", "O", "R","T","","G","P","U",""},
            {"G","I", "E", "L","U","","M","","B",""},
            {"","N", "I", "T","","","A","W","A",""},
            {"A","V", "I", "O","B","","L","","I",""},
            {"M","E", "D", "N","A","","R","","K",""}
    };



    private String mCorrectAnswers[] = {"GERMANY", "HAITI", "NEPAL", "ALBANIA", "CHILE", "PORTUGAL", "BELGIUM", "TAIWAN", "BOLIVIA", "DENMARK"};


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
