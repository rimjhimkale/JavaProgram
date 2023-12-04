import java.util.Scanner;
class ParimeterOfTriangle{
public static void main(String args[]){
int parimeter,b,h,l;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of height base and length:");
b=sc.nextInt();
h=sc.nextInt();
l=sc.nextInt();
parimeter = b+h+l;
System.out.println("parimeter of triangle="+parimeter);
sc.close();

}
}