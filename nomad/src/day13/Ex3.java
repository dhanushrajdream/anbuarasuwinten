package day13;

public class Ex3 {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public String write(String variable) {
		return "hello";
	}
	public static void main(String[] args) {
		Ex3 e=new Ex3();
		System.out.println("Add "+e.add(10,20));
		System.out.println("Sub "+e.sub(15, 10));
		System.out.println("Mul "+e.mul(4, 5));
		System.out.println("Div "+e.div(15,3));
		System.out.println(e.write(""));
		
	}

}
