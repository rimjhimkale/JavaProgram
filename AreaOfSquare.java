import java.util.Scanner;
class AreaOfSquare{
public static void main(String args[])
{
int area,side;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of side =");
side=sc.nextInt();
area=side*side;
System.out.println("Area of a square ="+area);
sc.close();
}
}