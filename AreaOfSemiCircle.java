import java.util.Scanner;
class AreaOfSemiCircle{
public static void main(String args[]){
double area,radius;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of radius:");
radius=in.nextDouble();
area=0.5*3.14*radius*radius;
System.out.println("Area of semicircle ="+area);
in.close();
}
}