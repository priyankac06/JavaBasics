package Programs;

public class Airthmetic_Operator 

{
    static void add()
	{
        System.out.println("addition");
		int a = 10;
		int b = 20;
		int add=a+b;
		System.out.println(add);
		}
	static void sub()
	{
        System.out.println("Subtraction");
		int a = 50;
		int b = 20;
		int sub=a-b;
		System.out.println(sub);
		}
	static void mul()
	{
	    System.out.println("Multiplication");
		int a = 8;
		int b = 5;
		int mul=a*b;
		System.out.println(mul);
		}
	static void div()
	{
        System.out.println("Division");
		int a = 10;
		int b = 3;
		int div=a/b;
		System.out.println(div);
		}
	static void mod()
	{
        System.out.println("Modulus");
		int a = 10;
		int b = 3;
		int mod=(a%b);
		System.out.println(mod);
		}
	public static void main(String[] args) {
		add();
		sub();
		div();
		mod();
		mul();
		
	}

}
