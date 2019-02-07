package com.company;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

//Array of food options
        String[] rice = {"white", "brown", "none"};
        String[] meat = {"chicken" , "steak" ,"carnidas" ,"chorizo" ,"sofritas" ,"just veggies"};
        String[] beans = {"pinto" ,"black" ,"no beans"};
        String[] veggies = {"lettuce" ,"fajita veggies" , "no veggies" , "all"};
        String[] salsa = {"mild" ,"medium" , "hot" , "none" , "all"};
        String[] cheeses = {"yellow" , "white" , "shredded" , "string" , "none" , "all"};
        String[] extras = {"guac" , "queso" , "sour cream" , "grilled onions"};

//Welcome user
        System.out.println("Welcome to Chipotle! Let's make yummy food now!");

        for (int i=1; i<=25; i++){
            int r = rand.nextInt(3);
            int m = rand.nextInt(6);
            int b = rand.nextInt(3);
            int v = rand.nextInt(3);
            int s = rand.nextInt(4);
            int ch = rand.nextInt(5);
            int ex = rand.nextInt(4);

            System.out.println("Your Chipotle is done as has the following yummy items" +" " + ":"+ " "+ i + " " +  rice[r]+ "," +"" +
                    " "+meat[m]+","+" "+beans[b]+","+" "+salsa[s]+","+" "
                    + ""+veggies[v]+","+" " + " " +  extras[ex] + ""+cheeses[ch]+","+" ");
        }
    }
}