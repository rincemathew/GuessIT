package com.melisa.melisa.guessit.data;

import com.melisa.melisa.guessit.R;

public class Nine {
    private Integer mQuestions [] = {
            R.drawable.kenya,
            R.drawable.peacock,
            R.drawable.shark,
            R.drawable.pine_nuts,
            R.drawable.rhinoceros,
            R.drawable.watermelon,
            R.drawable.cucumber,
            R.drawable.centaurea,
            R.drawable.norway,
            R.drawable.versailles,
            R.drawable.jackfruit,
            R.drawable.rafting,
            R.drawable.bulbul,
            R.drawable.cashew_nut,
            R.drawable.italy,
            R.drawable.star,
            R.drawable.daffodil,
            R.drawable.grater,
            R.drawable.lebanon,
            R.drawable.surfing,
    };



    private String mChoices [][] = {
            {"L","A","E","Z","K","T","Y","N","X","C"},
            {"C","V","P","B","E","C","K","O","A","N"},
            {"A","M","H","Q","S","W","E","R","R","K"},
            {"T","U","N","T","I","P","S","E","Y","N"},
            {"I","O","S","H","E","R","R","C","N","O"},
            {"T","A","E","L","M","W","N","R","E","O"},
            {"U","M","U","C","I","U","B","E","C","R"},
            {"E","R","C","E","U","N","O","T","A","A"},
            {"P","W","A","R","O","A","S","N","D","Y"},
            {"S","S","E","R","E","L","A","V","I","L"},
            {"T","I","J","U","K","A","C","F","F","R"},
            {"A","R","G","F","T","H","I","G","N","J"},
            {"K","U","L","L","U","B","B","L","Z","X"},
            {"C","W","E","C","H","U","A","N","S","T"},
            {"V","A","B","L","T","N","Y","I","M","Q"},
            {"W","E","T","R","S","T","A","R","Y","U"},
            {"I","D","O","L","D","F","I","A","F","O"},
            {"E","R","T","G","P","R","A","A","S","D"},
            {"F","N","O","L","N","E","G","B","A","H"},
            {"U","S","J","K","R","G","F","N","I","L"}
    };


    private String mCorrectAnswers[] = {"KENYA", "PEACOCK", "SHARK", "PINENUTS", "RHINOCEROS", "WATERMELON", "CUCUMBER",
            "CENTAUREA", "NORWAY", "VERSAILLES", "JACKFRUIT","RAFTING","BULBUL","CASHEWNUT","ITALY","STAR","DAFFODIL",
            "GRATER","LEBANON","SURFING"};
    private String hint[] = {"is a country in East Africa with coastline on the Indian Ocean",
            "a male peafowl, which has very long tail feathers that have eye-like markings and can be erected and fanned out in display",
            "a long-bodied chiefly marine fish with a cartilaginous skeleton",
            "the edible seed of various pine trees",
            "a large, heavily built plant-eating mammal with one or two horns on the nose and thick folded skin",
            "the large fruit of a plant of the gourd family, with smooth green skin, red pulp, and watery juice.",
            "a long, green-skinned fruit with watery flesh, usually eaten raw in salads or pickled",
            "a plant of a Eurasian genus which includes the cornflower and knapweed.",
            "is a Scandinavian country encompassing mountains, glaciers and deep coastal fjords",
            "the principal royal residence of France from 1682",
            "a fast-growing tropical Asian tree related to the breadfruit",
            "the sport or pastime of travelling down a river on a raft",
            "a tropical African and Asian songbird, typically having a crest, drab plumage, and a melodious voice",
            "a kidney– or boxing-glove–shaped drupe that grows at the end of the cashew apple",
            "a European country with a long Mediterranean coastline, has left a powerful mark on Western culture and cuisine",
            "a Y-shaped arrangement of three-phase electrical windings",
            "a bulbous European plant which typically bears bright yellow flowers with a long trumpet-shaped centre",
            "a device having a surface covered with holes edged by slightly raised cutting edges, used for grating cheese and other foods",
            "is a country in Western Asia. It is bordered by Syria to the north and east and Israel to the south",
            "the sport or pastime of riding a wave towards the shore while standing or lying on a surfboard"};

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
    public String getHint(int a) {
        String hints = hint[a];
        return hints;
    }

}
