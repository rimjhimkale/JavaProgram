import java.util.Scanner;
class ParimeterOfRectangle{
public static void main(String args[]){
int parimeter,l,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of length and base:");
l=sc.nextInt();
b=sc.nextInt();
parimeter = 2*(l+b);
System.out.println("parimeter of rectangle="+parimeter);
sc.close();

}
}