package com.company;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int answer= JOptionPane.showConfirmDialog(null, "Does the vertebrate have cold blood?");
        boolean coldblood=(answer==JOptionPane.YES_OPTION);
        if(coldblood)
        {
            int answer1= JOptionPane.showConfirmDialog(null,"Does the vertebrate have fins? ");
            boolean fins=(answer1==JOptionPane.YES_OPTION);
            if(fins)
            {
                JOptionPane.showMessageDialog(null, "The vertebrate is a Fish");
            }
            else
            {
                int answer3= JOptionPane.showConfirmDialog(null,"Does the vertebrate have Moist Skin? ");
                boolean Moistskin=(answer3==JOptionPane.YES_OPTION);
                if(Moistskin)
                {
                    JOptionPane.showMessageDialog(null, "The vertebrate is an Amphibian");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "The vertebrate is a Reptile");
                }
            }
        }
        else
        {
            int answer4= JOptionPane.showConfirmDialog(null,"Does the vertebrate have Feathers? ");
            boolean Feathers=(answer4==JOptionPane.YES_OPTION);
            if(Feathers)
            {
                JOptionPane.showMessageDialog(null, "The vertebrate is an Bird");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "The vertebrate is a Mammal");
            }
        }


    }
}
