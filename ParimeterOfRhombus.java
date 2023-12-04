import java.util.Scanner;
class ParimeterOfRhombus{
public static void main(String args[]){
int parimeter,side;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of side:");
side=sc.nextInt();

parimeter = 4*side;
System.out.println("parimeter of rhombus="+parimeter);
sc.close();

}
}