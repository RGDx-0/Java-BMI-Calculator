/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi.calculator;
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
    System.out.print("Hello Welcome To The BMI Calculator \n");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your wight(kg):");
    double wight = input.nextDouble();
    System.out.print("Enter your height(m):");
    double height = input.nextDouble();
    
    double BMI = wight / (height * height);
    boolean UnderWeight = BMI < 18.5;
    boolean NormalWeight = BMI>=18.5 && BMI<24.9;
    boolean OverWeight = BMI>= 25 &&BMI<29.9;
    boolean obese = BMI>=30;
 if(UnderWeight){
System.out.println("Your BMI Is " + BMI + ", And Based On The Calculated BMI You Have (Under Weight)");}
 else if(NormalWeight){ 
System.out.println("Your BMI Is " + BMI + ", And Based On The Calculated BMI You Have (Normal Weight)");}
 else if(OverWeight){
System.out.println("Your BMI Is " + BMI + ", And Based On The Calculated BMI You Have (Over Weight)");}
 else if(obese){
 System.out.println("Your BMI Is " + BMI + ", And Based On The Calculated BMI You Have (obese)");}
   double IdealWeight = 22 * (height * height);
 System.out.printf("Your Ideal Weight Is %.2f kg%n", IdealWeight);
if (wight > IdealWeight){
    System.out.printf("You Need to Lose %.2f kg%n",wight - IdealWeight);}
else if (wight < IdealWeight){
    System.out.printf("You Need to Gain %.2f kg%n", IdealWeight - wight);}
else {
    System.out.println("You Are at Your Ideal W eight ");}
 }
}
         