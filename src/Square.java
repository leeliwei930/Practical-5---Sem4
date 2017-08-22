public class Square extends  Rectangle{
    private double side;

    public Square(){

    }
    public Square(double newLength){
        super(newLength , newLength);
    }

    public void showArea(){
        System.out.println("The area for this Square is " + calcArea() );
    }
}
