package com.melisa.melisa.guessit;

public class QuestionLibrary10 {
    private Integer mQuestions [] = {
            R.drawable.bagan,
            R.drawable.hampi,
            R.drawable.pergamon,
            R.drawable.red_fort,
            R.drawable.abu_simbel,
            R.drawable.nyhavn,
            R.drawable.cappadocia,
            R.drawable.santorini,
            R.drawable.taj_mahal,
            R.drawable.moai,

    };



    private String mChoices [][] = {
            {"A","N","B", "G", "A","","","","",""},
            {"I","P", "H", "M","A","","","","",""},
            {"G","N", "R", "P","M","","O","E","A",""},
            {"R","R","_", "D", "F","","T","E","O",""},
            {"M","S", "L", "I","U","E","B","_","B","A"},
            {"","N", "A", "N","","","V","H","Y",""},
            {"P","P", "D", "C","I","O","A","C","A","A"},
            {"I","N", "I", "R","O","T","N","","A","S"},
            {"T","A", "_", "M","A","J","H","","A","L"},
            {"","A", "M", "O","","","","I","",""}
    };



    private String mCorrectAnswers[] = {"BAGAN", "HAMPI", "PERGAMON", "RED_FORT", "ABU_SIMBEL", "NYHAVN", "CAPPADOCIA", "SANTORINI", "TAJ_MAHAL", "MOAI"};


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
