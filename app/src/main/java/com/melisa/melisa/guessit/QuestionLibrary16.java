package com.melisa.melisa.guessit;

public class QuestionLibrary16 {
    private Integer mQuestions [] = {
            R.drawable.felcon,
            R.drawable.cockatoo,
            R.drawable.quail,
            R.drawable.macaw,
            R.drawable.tailorbird,
            R.drawable.barbet,
            R.drawable.stork,
            R.drawable.vulture,
            R.drawable.hawk,
            R.drawable.parakeet,

    };



    private String mChoices [][] = {
            {"","C","O", "F", "","","E","N","L",""},
            {"O","C", "K", "O","T","","O","C","A",""},
            {"U","L", "I", "A","Q","","","","",""},
            {"A","M","A", "C", "W","","","","",""},
            {"T","D", "L", "R","B","I","R","I","O","A"},
            {"T","A", "E", "","","","R","B","B",""},
            {"O","R", "T", "S","K","","","","",""},
            {"E","T", "V", "R","U","","U","","L",""},
            {"","A", "K", "W","","","","H","",""},
            {"A","T", "R", "E","P","","K","E","A",""}
    };



    private String mCorrectAnswers[] = {"FELCON", "COCKATOO", "QUAIL", "MACAW", "TAILORBIRD", "BARBET", "STORK", "VULTURE", "HAWK", "PARAKEET"};


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
