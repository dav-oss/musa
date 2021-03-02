package com.company;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<String> girls = new LinkedList<>();
//Adding a node
    public static void addNode(String girl){
        while (girl != " "){
            girls.add(girl);
        }
    }
    //Removing a node to girls
    public static void removeNode(int option){
        while (option <= girls.size() && option > 0){
                girls.remove(option);
        }
    }
    public static void main(String[] args) {
	// adding nodes
        girls.add("Sharon");
        girls.add("Elsie");
        girls.add("Mirram");
        girls.add("Purity");
        ///Printing the nodes present
        System.out.println("Current available girls are: "+girls);
        //Queerying the user if they want to continue to the operation sections
        System.out.println("Would you want to perform OPERATIONS*******????\nenter 1 for (yes)");
        //Creating a Scanner input Object to enter option
        Scanner userInput = new Scanner(System.in);
        int quiz = userInput.nextInt();
        //Evaluating the option entered by the user
        if(quiz == '1'){
            System.out.println("Please choose an operation to perform\n1. Add a girl to the queue\n2. Remove a girl from the queue");
            int selection = 0;
            //Using switch statement to perform the selected option
            switch(selection){
                //Adding a girl to the list
                case 1 : System.out.println("Enter the name of the girl"); String name = userInput.next(); addNode(name);System.out.println("Available girls are : " +girls);break;
                //Removing a girl from the list
                case 2 : System.out.println("Enter the number the Girl appears to remove"); int num = userInput.nextInt(); removeNode(num);System.out.println("Available girls are : "+girls);break;
            }
        }//Display text message and terminate the program
        else{
            System.out.println("Thank you for checking available girls,\nREMEMBER TO COME BACK WE MAY HAVE MORE###");
            System.exit(0);
        }
    }
}
