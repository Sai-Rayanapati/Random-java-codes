package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int dice[] = {1, 3, 4, 5, 4, 6, 1, 2, 4, 5, 2, 5, 2};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        boolean once = true;
        int i = 0;
        while (i < dice.length) {
            if (dice[i] == 1) {
                count1++;
            }
            if (dice[i] == 2) {
                count2++;
            }
            if (dice[i] == 3) {
                count3++;
            }
            if (dice[i] == 4) {
                count4++;
            }
            if (dice[i] == 5) {
                count5++;
            }
            if (dice[i] == 6) {
                count6++;
            }

            //i++;
            if (count1 >= 1 && count2 >= 1 && count3 >= 1 && count4 >= 1 && count5 >= 1 && count6 >= 1) {
                i++;
            }
        }
        String newline = "\n";
        //while (once) {`


           // }
            System.out.println(i);
        }
    }
}
