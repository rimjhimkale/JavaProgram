import java.util.Scanner;
class AreaOfRhombus{
public static void main(String args[]){
double area,d1,d2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the diagonals:");
d1=sc.nextDouble();
d2=sc.nextDouble();
area=.5*d1*d2;
System.out.println("Area of rhombus ="+area);
sc.close();
}
}