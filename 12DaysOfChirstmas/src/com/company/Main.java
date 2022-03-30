package com.company;

public class Main {
    
    public static final int DAYS_OF_CHRISTMAS=12;

    public static void main(String[] args)
    {
        int day;

        for(day=1;day<=DAYS_OF_CHRISTMAS;day++)
        {
            System.out.print("On the ");
            switch (day)
            {
                case 1:
                    System.out.print("first ");
                    break;
                case 2:
                    System.out.print("second ");
                    break;
                case 3:
                    System.out.print("third ");
                    break;
                case 4:
                    System.out.print("fourth ");
                    break;
                case 5:
                    System.out.print("fifth ");
                    break;
                case 6:
                    System.out.print("sixth ");
                    break;
                case 7:
                    System.out.print("seventh ");
                    break;
                case 8:
                    System.out.print("eighth ");
                    break;
                case 9:
                    System.out.print("ninth ");
                    break;
                case 10:
                    System.out.print("tenth ");
                    break;
                case 11:
                    System.out.print("eleventh ");
                    break;
                case 12:
                    System.out.print("twelfth ");
                    break;
                default:
                    break;

            }
            System.out.println("day of Christmas");
            System.out.println("my true love sent to me:");
            switch (day)
            {
                case 12:
                    System.out.println("12 Drummers Drumming");
                case 11:
                    System.out.println("11 Pipers Piping ");
                case 10:
                    System.out.println("10 Lords a Leaping ");
                case 9:
                    System.out.println("9 Ladies Dancing ");
                case 8:
                    System.out.println("8 Maids a Milking ");
                case 7:
                    System.out.println("7 Swans a Swimming ");
                case 6:
                    System.out.println("6 Geese a Laying ");
                case 5:
                    System.out.println("5 Golden Rings ");
                case 4:
                    System.out.println("4 Calling Birds ");
                case 3:
                    System.out.println("3 French Hens ");
                case 2:
                    System.out.println("2 Turtle Doves ");
                case 1:
                    System.out.println("A Partridge in a Pear Tree \n");
                    break;
                default:
                    break;
            }

        }

    }
}
