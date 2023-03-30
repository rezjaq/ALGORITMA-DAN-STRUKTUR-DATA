<<<<<<< HEAD
import java.util.*;
public class snakeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" x : ");
        int x = input.nextInt();
        System.out.print(" y : ");
        int y = input.nextInt();
        System.out.print(" enter width : ");
        int w = input.nextInt();
        System.out.print(" height : ");
        int h = input.nextInt();

        snake snake1 = new snake(x, y, w, h);
        snake1.printPosition();

        boolean continuePlay = true;
        while (continuePlay) {
            System.out.println("enter direction to move (W/S/A/D)");
            String direction = input.next();
            switch (direction) {
                case "A":
                    snake1.moveLeft();
                    break;
                case "D":
                    snake1.moveRight();
                    break;
                case "W":
                    snake1.moveUp();
                    break;
                case "S":
                    snake1.moveDown();
                    break;
                default:
                    System.out.println("your direction cannot be detected");
                    break;
            }
            snake1.printPosition();
            System.out.print("continue playing game? (Y/N): ");
            String continuePlaying = input.next();
            if (continuePlaying.equalsIgnoreCase("N")) {
                continuePlay = false;
            }
        }
    }
=======
import java.util.*;
public class snakeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" x : ");
        int x = input.nextInt();
        System.out.print(" y : ");
        int y = input.nextInt();
        System.out.print(" enter width : ");
        int w = input.nextInt();
        System.out.print(" height : ");
        int h = input.nextInt();

        snake snake1 = new snake(x, y, w, h);
        snake1.printPosition();

        boolean continuePlay = true;
        while (continuePlay) {
            System.out.println("enter direction to move (W/S/A/D)");
            String direction = input.next();
            switch (direction) {
                case "A":
                    snake1.moveLeft();
                    break;
                case "D":
                    snake1.moveRight();
                    break;
                case "W":
                    snake1.moveUp();
                    break;
                case "S":
                    snake1.moveDown();
                    break;
                default:
                    System.out.println("your direction cannot be detected");
                    break;
            }
            snake1.printPosition();
            System.out.print("continue playing game? (Y/N): ");
            String continuePlaying = input.next();
            if (continuePlaying.equalsIgnoreCase("N")) {
                continuePlay = false;
            }
        }
    }
>>>>>>> 12764e386ebbab542de5515c13e6bd1ed44dedd7
}