
///////////Basic 1-4//////////////////


public class HelloWorld {
	public static void main(String[] args)
	{	
		System.out.println(greetingMethod());
	}


public static String greetingMethod()
{
	return "hello there my name is nabeel";

}}
 

////////////Basic 5-8/////////////////


public class HelloWorld {
	public static void main(String[] args)
	{	
		
		for (int i = 0; i < 7; i++){
			System.out.println(intMethod(i, i, true));
		}
	}

public static int intMethod(int int1, int int2, boolean intsum)
{
	int int3 = 0;
	if (int1 == 0){
		return int2;
	}
	else if (int2 == 0){
		return int1;
	}
	
	else
		if (intsum) {
			int3 = int1 + int2;
		}
		else {
			int3 = int1 * int2;
		}
		return int3;
	}
}


//////////////Basic 9 /////////////////


public class HelloWorld {
	public static void main(String[] args)
	{	
		
		for (int i = 0; i < 10; i++){
			System.out.println(intMethod(arrayOfInts[i], arrayOfInts[i], true));
		}
	}

public static int intMethod(int int1, int int2, boolean intsum)
{
	int int3 = 0;
	if (int1 == 0){
		return int2;
	}
	else if (int2 == 0){
		return int1;
	}
	
	else
		if (intsum) {
			int3 = int1 + int2;
		}
		else {
			int3 = int1 * int2;
		}
		return int3;
	}
static int[] arrayOfInts = {2,3,6,4,12,11,23,15,7,1};
}



/////////////Basic 10-11///////////////


public class HelloWorld {
	public static void main(String[] args)
	{	
		int[] arrayofints = new int [10];
		for (int i = 0; i < arrayofints.length; i++){
			arrayofints [i] = i * 4;
			System.out.println(arrayofints[i]);
		}
		int[] arrayofints2 = new int [arrayofints.length];
		for (int i = 0; i < arrayofints.length; i++){
			arrayofints2 [i] = arrayofints[i] * 10;
			System.out.println(arrayofints2[i]);
		}
	}
}



/////////////Basic scanner/////////////


import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		System.out.println ("how long should the array be?");
		int x = s.nextInt();
		int[] arrayofints = new int [x];
		for (int i = 0; i < x; i++){
			arrayofints [i] = i * 4;
			System.out.println(arrayofints[i]);
		}
		int[] arrayofints2 = new int [x];
		for (int i = 0; i < x; i++){
			arrayofints2 [i] = arrayofints[i] * 10;
			System.out.println(arrayofints2[i]);
		}
	}
}


////////////////////////////////////////////////////////////////////
/////////////Intermediate Blackjack////////


import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		System.out.println ("first number?");
		int x = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println ("second number?");
		int y = s1.nextInt();
		if (x>y && x<=21){
			System.out.println(x);
		}
		else if (y>x && y<=21){
			System.out.println(y);
		}
		else if (x>=21 && y<=21){
			System.out.println(y);
		}
		else if (y>=21 && x<=21){
			System.out.println(x);
		}
		else {
			System.out.println("you lose");
			}
	}
}


///////////////Intermediate unique sum//////////



import java.util.Scanner;

public class unique_sum {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println ("first number?");
		int i1 = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println ("second number?");
		int i2 = s2.nextInt();
		Scanner s3 = new Scanner(System.in);
		System.out.println ("third number?");
		int i3 = s3.nextInt();
		//int [] i_array = {i1,i2,i3};
		
		if (i1 != i2 && i2 != i3 && i1 != i3){
			System.out.println(i1+i2+i3);
		}		
		else if (i1 == i3 && i2 == i3){
			System.out.println(0);
		}
		else if (i1 == i2){
			System.out.println(i3);
		}
		else if (i1 == i3){
			System.out.println(i2);
		}
		else if (i2 == i3){
			System.out.println(i1);
		}

	}
}


///////////////Intermediate too hot?////////////


import java.util.Scanner;

public class too_hot {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println ("whats the temperature?");
		int temp = t.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.println ("is it summer?");
		String summer = s.nextLine();
		boolean summer1;
		if (summer == "yes"){
			summer1 = true;
		}
		else{
			summer1 = false;
		}
		if (temp>60 && temp<=90 && summer1 == false){
			System.out.println("true");
		}
		else if (temp>60 && temp<=100 && summer1 == true){
			System.out.println("true");
		}
		else System.out.println("false");
	}

}


//////////////////Intermediate leap year///////////


import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.println ("what year is it?");
		int year = y.nextInt();
		
		if ((year % 4) == 0 ){
			if ((year % 400) == 0 || (year % 100) != 0){
				System.out.println ("its a leap year!");
			}
		}
		else System.out.println ("its not a leap year");
	}

}













