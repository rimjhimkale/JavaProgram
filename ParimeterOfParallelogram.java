import java.util.Scanner;
class ParimeterOfParallelogram{
public static void main(String args[]){
int parimeter,l,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of  base and length:");
b=sc.nextInt();
l=sc.nextInt();
parimeter = 2*(l+b);
System.out.println("parimeter of parallelogram="+parimeter);
sc.close();

}
}