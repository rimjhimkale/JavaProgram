import java.util.Scanner;
class AreaOfTriangle{
public static void main(String args[]){
double area,base,height;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of base and height");
base=in.nextDouble();
height=in.nextDouble();
area=.5*base*height;
System.out.println("Area of traingle ="+area);
in.close();
}
}