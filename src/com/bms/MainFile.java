package com.bms;
import java.util.Scanner;
public class MainFile {
public static void main(String[]args)
{
	int a=1;
	while(true) {
	
		menu();
	}}
private static void close_acc() {
	// TODO Auto-generated method stub
	
}
private static void bal_enq() {
	// TODO Auto-generated method stub
	
}

private static void open_acc() {
	// TODO Auto-generated method stub
	
}

private static void withdraw() {
		System.out.println("U withdraw rs12300000Cr..");
}

private static void deposie() {
	// TODO Auto-generated method stub	
}

private static void menu() {
	Scanner s=new Scanner(System.in);
	System.out.println("*********************");
	System.out.println("1.indian overseas bank");
	System.out.println("2.open a new account");
	System.out.println("3.deposite");
	System.out.println("4.balance");
	System.out.println("5.close account");
	System.out.println("6.view all profiles");
	System.out.println("7.stop program");
	System.out.println("*********************");
	System.out.println("select your choice : ");
	int c=s.nextInt();
	if(c==1)  {
		System.out.println("open account");
		open_acc();
	}
	else if(c==2) {
		System.out.println("deposite money");
		deposie();
	}
	else if(c==3) {
		System.out.println("withdraw money");
		withdraw();
	}
	else if(c==4) {
		System.out.println("balance enqury");
		bal_enq();
	}
	else if(c==5)  {
		System.out.println("close account");
		close_acc();
	}
	else if(c==6)  {
		System.out.println("view all profile");
	}
	else if(c==7)  {
		System.out.println("program stopped");
		System.exit(0);
	} else {
		System.out.println("enter the valid number");
	}

}
}