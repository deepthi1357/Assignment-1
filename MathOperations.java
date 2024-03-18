import java.util.*;
public class MathOperations {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	public String add(String str1,String str2) {
		return str1+str2;
	}
	public static void main(String args[]) {
		Math_Operations obj=new Math_Operations();
		System.out.println(obj.add(10,300));
		System.out.println(obj.add(1.2,2.3,3.4 ));
		System.out.println(obj.add("String1"+"String 2"));
	}
}
