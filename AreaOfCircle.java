import java.util.Scanner;
class AreaOfCircle{
public static void main(String args[]){
double area,radius;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of radius:");
radius=sc.nextDouble();
area=3.1415*radius*radius;
System.out.println("Area of circle ="+area);
sc.close();
}
}