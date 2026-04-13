// Main class
public class CourierTrackingSystem {
public static void main(String[] args) {
System.out.println("Courier Parcel Tracking System");
} } // Menu logic
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int choice;
System.out.println("1. Book Parcel");
System.out.println("2. Track Parcel");
System.out.println("3. Update Status");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch(choice) {
case 1:
System.out.println("Parcel Booking");
br eak;
ca se 2:
S ystem.out.println("Parcel Tracking");
b reak;
ca se 3:
S ystem.out.println("Status Update");
b reak;
C ase4:
S ystem.out.println("Exit");
b reak;
d efault:
S ystem.out.println("Invalid Choice");
}
// parcel processing logic
int trackingId;
String status = "Shipped";
System.out.print("Enter Tracking ID: ");
trackingId = sc.nextInt();
System.out.println("Current Status: " + status);
// Example Calculation (Same like billing format)
int baseCharge = 100;
int weight = 3;
int total = baseCharge * weight;
int gst = (int)(total * 0.05);
int finalAmount = total + gst;
System.out.println("Total Charge: " + total);
System.out.println("GST: " + gst);
System.out.println("Final Amount: " + finalAmount)
