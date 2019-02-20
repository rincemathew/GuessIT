package com.melisa.melisa.guessit;

public class QuestionLibrary28 {
    private Integer mQuestions [] = {
            R.drawable.eagle,
            R.drawable.ostrich,
            R.drawable.mynah,
            R.drawable.pigeon,
            R.drawable.turkeybird,
            R.drawable.peacock,
            R.drawable.crow,
            R.drawable.emu,
            R.drawable.swan,
            R.drawable.rooster,

    };



    private String mChoices [][] = {
            {"E","E","G", "A", "L","","","","",""},
            {"H","I", "R", "T","O","","S","","C",""},
            {"N","Y", "M", "A","H","","","","",""},
            {"","N","E", "G", "","","I","O","P",""},
            {"R","T", "B", "E","R","Y","U","D","K","I"},
            {"E","A", "K", "P","O","","C","","C",""},
            {"","R", "O", "W","","","","C","",""},
            {"","U", "M", "E","","","","","",""},
            {"","A", "W", "S","","","","N","",""},
            {"S","O", "R", "R","E","","T","","O",""}
    };



    private String mCorrectAnswers[] = {"EAGLE", "OSTRICH", "MYNAH", "PIGEON", "TURKEYBIRD", "PEACOCK", "CROW", "EMU", "SWAN", "ROOSTER"};


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
