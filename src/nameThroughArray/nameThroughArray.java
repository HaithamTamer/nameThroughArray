package nameThroughArray;
import java.util.Scanner;
import javax.swing.*;
public class nameThroughArray {

	   public static void main (String []args) {
		  

		                String arr[]=new String[6];   

		               

		                 arr[0]= JOptionPane.showInputDialog(" Name");

		                arr[1]= JOptionPane.showInputDialog("Mobile");

		                arr[2]= JOptionPane.showInputDialog("Email");

		                arr[3]= JOptionPane.showInputDialog("age");

		                arr[4]= JOptionPane.showInputDialog("faculty");

		                arr[5]= JOptionPane.showInputDialog("Department");

		               

		                HaythamPrint(arr);

		          }

		   static void  HaythamPrint (String arr[]){

		         

		   System.out.println("Name  "+arr[0]);

		   System.out.println("Mobile  "+arr[1]);

		   System.out.println("Email  "+arr[2]);

		   System.out.println("age  "+arr[3]);

		   System.out.println("faculty  "+arr[4]);

		   System.out.println("Department  "+arr[5]);

		   }

		  
		   
	   }

