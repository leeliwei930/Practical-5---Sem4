import  java.util.Scanner;
public class Rectangle {
    private double length;
    private double width;
    Scanner console = new Scanner(System.in);


    public Rectangle(){

    }
    public Rectangle(double newLength, double newWidth){
            while(newLength <= 0){
                    System.out.print("Please re-enter the length of the rectangle: ");
                 newLength = console.nextDouble();
            }
        this.length =  newLength;

        while(newWidth <= 0){
            System.out.print("Please re-enter the  width of the rectangle: ");
            newWidth = console.nextDouble();

        }
        this.width =  newWidth;

    }
    public double calcArea(){
        return (length * width);

    }

    public void showArea(){
        System.out.println("The area for this rectangle is "  + calcArea());
    }

    public void setLength(double newLength){
        this.length = newLength;
    }
    public void setWidth(double newWidth){
        this.width = newWidth;
    }
}
