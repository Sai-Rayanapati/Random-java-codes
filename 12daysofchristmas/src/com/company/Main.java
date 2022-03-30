package com.company;

public class Main {

    public static final int DAYS_OF_CHRISTMAS=12;

    public static String getOrdinalString ( int day )
    {
        String ordinalString="";

        if(day==1)
        {
            ordinalString="first";
        }
        else if(day==2)
        {
            ordinalString="second";
        }
        else if(day==3)
        {
            ordinalString="third";
        }
        else if(day==4)
        {
            ordinalString="fourth";
        }
        else if(day==5)
        {
            ordinalString="fifth";
        }
        else if(day==6)
        {
            ordinalString="sixth";
        }
        else if(day==7)
        {
            ordinalString="seventh";
        }
        else if(day==8)
        {
            ordinalString="eighth";
        }
        else if(day==9)
        {
            ordinalString="ninth";
        }
        else if(day==10)
        {
            ordinalString="tenth";
        }
        else if(day==11)
        {
            ordinalString="eleventh";
        }
        else if(day==12)
        {
            ordinalString="twelfth";
        }
        return ordinalString;

    }
    public static String getChristmasGift(int day) {
        String christmasGift="";
        switch (day) {
            case 12:
                christmasGift = "12 Drummers Drumming\n";
            case 11:
                christmasGift = christmasGift+"11 Pipers Piping\n";
            case 10:
                christmasGift = christmasGift+"10 Lords a Leaping\n";
            case 9:
                christmasGift = christmasGift+"9 Ladies Dancing\n";
            case 8:
                christmasGift = christmasGift+"8 Maids a Milking\n";
            case 7:
                christmasGift = christmasGift+"7 Swans a Swimming\n";
            case 6:
                christmasGift = christmasGift+"6 Geese a Laying\n";
            case 5:
                christmasGift = christmasGift+"5 Golden Rings\n";
            case 4:
                christmasGift = christmasGift+"4 Calling Birds\n";
            case 3:
                christmasGift = christmasGift+"3 French Hens\n";
            case 2:
                christmasGift = christmasGift+"2 Turtle Doves and\n";
            case 1:
                christmasGift = christmasGift+"A Partridge in a Pear Tree \n";
                break;
            default:
                break;

        }
        return christmasGift;
    }

    public static String getVerse(int day)
    {
        String verse;
        String string4="On the ";
        String string5=" day of Christmas \n";
        String string6="my true love sent to me:\n";

        verse = string4 + getOrdinalString(day) + string5 + string6 + getChristmasGift(day);

        return verse;

    }
    public static void main (String[]args)
    {
        int day;
        for(day=1;day<=DAYS_OF_CHRISTMAS;day++)
        {
            System.out.println(getVerse(day));
        }
    }

}
