

import java.util.Scanner;

public class Tasklist {

    public static void main(String[] args) {
        Scanner gitThe = new Scanner(System.in);

        System.out.println("Congratulations! You're running [YOUR NAME]'s Task List program.\n");
        System.out.println("What would you like to do next?\n");
//        userInput = gitThe.nextInt();
        System.out.println("1. List all tasks:  ");
        System.out.println("2. Add a task to the list:  ");
        System.out.println("3. Delete a task? ");
        System.out.println("q. To quit the program");
        System.out.println("Enter Selection:  ");
        int userInput = gitThe.nextInt();
        String userInput2 = gitThe.nextLine();

        while (!userInput2.equals("q")){

            if (userInput == 1) {
                System.out.println("List all tasks: ");
            }

            if (userInput == 2) {
                System.out.println("Add a task to the list: ");
            }
            if (userInput == 3) {
                System.out.println("Delete a task?");
            }
            if (userInput2.equals("q")) {


            } else {
                System.out.println("Not Valid Entry!!!!!");
        }System.out.println("Add a task to the list: ");
    }


    }
}
