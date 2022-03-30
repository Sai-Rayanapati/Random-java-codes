package com.company;

public class Main {

    public static void main(String[] args) {
    int numberOfParticipants=25;
    int number;
    int won;

    for(number=1;number<=numberOfParticipants;number++)
    {

        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0)
            {
                if(number==2||number==3||number==5||number==7)
                {
                    won=1;
                }
                else
                won=0;
            }


        else
        {
            won=1;
        }



        switch(won)
        {
            case 1:
                System.out.println(number+"st competitor won");
                break;
            default:
                break;
        }

    }

    }
}
