package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class person{
    String name;
    int age;
    String sex;

    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public String getSex() {
        return sex;
    }

    // Setter
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no of customers");
        int noOfPersons=input.nextInt();
        person[] newPerson= new person[noOfPersons];
        boolean loop= true;
        boolean personFound=false;
        int i=0;
        while(i<noOfPersons&&loop) {
                newPerson[i] =new person();
                System.out.println("Enter person "+ (i+1) +" name");
                newPerson[i].setName(input.next());
                System.out.println("Enter Age");
                newPerson[i].setAge(input.nextInt());
                System.out.println("Enter Gender");
                newPerson[i].setSex(input.next());
                i++;
            }

            input= new Scanner(System.in);

            System.out.println("Enter the person name to find the details");
            String name= input.next();

            int index=0;
            for(int j=0; j< noOfPersons;j++)
            {
                if(name.equals(newPerson[j].getName()))
                {
                    personFound=true;
                    index=j;
                    break;
                }
                else
                {
                    personFound=false;
                }
            }

            if(personFound)
            {
                System.out.println("Person is found");
                System.out.println("Name: " + newPerson[index].getName());
                System.out.println("Age: " + newPerson[index].getAge());
                System.out.println("Gender: " + newPerson[index].getSex());
            }
            else
            {
                System.out.println("Not found");
            }



        }
    }


