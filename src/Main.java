import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char option;
        Scanner _scn = new Scanner(System.in);
        do {
            System.out.println("Please choose an option: ");
            System.out.println("A) Calculate Area of the rectangle");
            System.out.println("B) Calculate Area of the square");
            System.out.println("C) Exit this program");
            System.out.print("Your Option: ");
            option = _scn.next().charAt(0);
            switch (option) {
                case 'a':
                case 'A':
                    System.out.print("Please enter the length of the rectangle: ");
                    double lengthOfRect = _scn.nextDouble();
                    System.out.print("Please enter the length of the width: ");
                    double widthOfRect = _scn.nextDouble();
                    Rectangle rectangle = new Rectangle(lengthOfRect, widthOfRect);
                    //Polymorphic behaviour - two or more method behave differently
                    rectangle.showArea();
                    break;
                case 'B':
                case 'b':
                    System.out.print("Please enter the side of the square: ");
                    double lengthOfSide = _scn.nextDouble();
                    Square square = new Square(lengthOfSide);
                    //Polymorphic behaviour - two or more method behave differently
                    square.showArea();
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (option != 'c' && option != 'C');
        System.exit(0);
    }
}
