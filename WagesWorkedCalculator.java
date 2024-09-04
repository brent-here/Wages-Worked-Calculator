import java.util.Scanner;

public class WagesWorkedCalculator {

public static void main(String[] args) {
// reminder declaring variables
double hoursWorked, hourlyRate;
double grosspay, federalTax, netpay;
String name;



//Creating a Scanner class object which is used to get the inputs
// entered by the user
Scanner scanner = new Scanner(System.in);
System.out.println(" Employee Payment Information");
// Getting the input entered by the user
System.out.print("Enter name :");
name = scanner.nextLine();
System.out.print("Enter Numbers of hours worked :");
hoursWorked = scanner.nextDouble();
System.out.print("Enter the hourly rate :$");
hourlyRate = scanner.nextDouble();

// calculating the grosspay
grosspay = hoursWorked * hourlyRate;

// calling the method by passing the grosspay
federalTax = calcFederalTax(grosspay);

// calculating the netpay
netpay = grosspay - federalTax;

// Displaying the output
System.out.println("Name :" + name);
System.out.printf("No of Hours Worked :%.2f\n", hoursWorked);
System.out.printf("Hourly rate :$ %.2f\n", hourlyRate);
System.out.printf("Gross Pay :$ %.2f\n", grosspay);
System.out.printf("Tax Deductions :$ %.2f\n", federalTax);
System.out.printf("Net Pay :$ %.2f\n", netpay);

System.out.println("Name :" + name);
System.out.printf("No of Hours Worked :%.2f\n", hoursWorked);
System.out.printf("Hourly rate :$ %.2f\n", hourlyRate);
System.out.printf("Gross Pay :$ %.2f\n", grosspay);
System.out.printf("Tax Deductions :$ %.2f\n", federalTax);
System.out.printf("Net Pay :$ %.2f\n", netpay);

System.out.println("Name :" + name);
System.out.printf("No of Hours Worked :%.2f\n", hoursWorked);
System.out.printf("Hourly rate :$ %.2f\n", hourlyRate);
System.out.printf("Gross Pay :$ %.2f\n", grosspay);
System.out.printf("Tax Deductions :$ %.2f\n", federalTax);
System.out.printf("Net Pay :$ %.2f\n for",  netpay);

}

private static double calcFederalTax(double grosspay) {
double federalTax = 0.0;
if (grosspay >= 0 && grosspay <= 99.99) {
federalTax = 0.06 * grosspay;
} else if (grosspay >= 100.0 && grosspay <= 299.99) {
federalTax = 0.12 * grosspay;
} else if (grosspay >= 300.0 && grosspay <= 599.99) {
federalTax = 0.18 * grosspay;
} else if (grosspay >= 600.0) {
federalTax = 0.21 * grosspay;


}
return federalTax;


}

}