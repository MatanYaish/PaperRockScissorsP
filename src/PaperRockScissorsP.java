import java.util.Scanner;

public class PaperRockScissorsP {
    public static void main(String[] args) {

        int randNum = (int) (Math.random() * 3) + 1;

        Scanner scan = new Scanner(System.in);

        System.out.println(randNum); // IF U WANT TO SEE THE PC'S - CHOICE **

        System.out.println("Choose from the following: \n<1>Scissors\n<2>Paper\n<3>Rock");

        int choice = scan.nextInt();

        if (choice == 1) {
            if (randNum == 2) {
                System.out.println("You win !! Scissors cut Paper");
            } else {
                System.out.println("Sorry you lost... :( ");
            }
        }

        if (choice == 2) {
            if (randNum == 3) {
                System.out.println("You win !! Paper covers Rock");
            } else {
                System.out.println("Sorry you lost... :( ");
            }
        }
        if (choice == 3) {
            if (randNum == 1) {
                System.out.println("You win !! Rock breaks Scissors");
            } else {
                System.out.println("Sorry you lost... :( ");
            }
        }
    }
}
