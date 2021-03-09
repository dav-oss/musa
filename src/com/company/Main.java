package com.company;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    static LinkedList<String> girls = new LinkedList<>();
//Adding a node
    public static void addNode(String girl){
        while (girl.equals(" ")){
            girls.add(girl);
        }
    }
    //Removing a node to girls
    public static void removeNode(int option){
        while (option <= girls.size() && option > 0){
                girls.remove(option);
        }
    }
    //Traversing through the linked list

    /***
     * At first I didn't know what traversal method is or what is trervasing
     * I researched and found out that Traversing is just Going through all the items available in an array or a queue
     * I think am right may be if you may proof me wrong I may agree
     */
    public static void traversal(){
        Iterator treverse = girls.iterator();
        System.out.println("Present girls already in the queue are: ");
        while(treverse.hasNext()) {
            System.out.println(treverse.next());
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
        int option = 1;
        while (option ==  1){
            int quiz = userInput.nextInt();
            //Evaluating the option entered by the user
            if(quiz == '1'){
                System.out.println("Please choose an operation to perform\n1. Add a girl to the queue\n2. Remove a girl from the queue\n3. View available girls in the queue");
                int selection = 0;
                //Using switch statement to perform the selected option
                switch(selection){
                    //Adding a girl to the list
                    case 1 : System.out.println("Enter the name of the girl"); String name = userInput.next(); addNode(name);traversal();break;
                    //Removing a girl from the list
                    case 2 : System.out.println("Enter the number the Girl appears to remove"); int num = userInput.nextInt(); removeNode(num);traversal();break;
                    //Displaying available names in the queue
                    case 3 : traversal();break;
                }
            }//Display text message and terminate the program
            else{
                System.out.println("Thank you for checking available girls,\nREMEMBER TO COME BACK WE MAY HAVE MORE###");
                System.exit(0);
            }

            //Querrying the user if he/she wants to continue
            System.out.println("Would you want to continue ?\n\t1. Yes\n\t2. No");
            option = userInput.nextInt();
        }
    }
}
