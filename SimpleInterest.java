import java.util.Scanner;
class SimpleInterest{
public static void main(String args[]){
double si,p,r,t;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of principle rate and time:");

p=sc.nextDouble();
r=sc.nextDouble();
t=sc.nextDouble();
si=(p*r*t)/100;
System.out.println("Simple interest="+si);
sc.close();
}

}