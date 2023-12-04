import java.util.Scanner;
class ParimeterOfCircle{
public static void main(String args[]){
double parimeter,radius;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of radius:");
radius=sc.nextDouble();

parimeter = 2*3.14*radius;
System.out.println("parimeter of circle="+parimeter);
sc.close();

}
}