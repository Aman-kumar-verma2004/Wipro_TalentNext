package OOPS;

import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VideoStore vs = new VideoStore();

        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("===========");
            System.out.println("1. Add Videos:");
            System.out.println("2. Check Out Video:");
            System.out.println("3. Return Video:");
            System.out.println("4. Receive Rating:");
            System.out.println("5. List Inventory:");
            System.out.println("6. Exit:");
            System.out.print("Enter your choice (1..6): ");
            int choice = in.nextInt();
            in.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String nameAdd = in.nextLine();
                    vs.addVideo(nameAdd);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String nameCheckout = in.nextLine();
                    vs.doCheckout(nameCheckout);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to return: ");
                    String nameReturn = in.nextLine();
                    vs.doReturn(nameReturn);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String nameRate = in.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rate = in.nextInt();
                    vs.receiveRating(nameRate, rate);
                    break;
                case 5:
                    vs.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
