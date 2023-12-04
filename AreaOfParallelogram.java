import java.util.Scanner;
class AreaOfParallelogram{
public static void main(String args[]){
double area,base,height;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of base and height:");
base=sc.nextDouble();
height=sc.nextDouble();
area=base*height;
System.out.println("Area of parallelogram="+area);
sc.close();

}
}