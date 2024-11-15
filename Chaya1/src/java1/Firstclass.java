package java1;

public class Firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Addition");
//object creation syntax: classname referencename = new classname();
        Firstclass a = new Firstclass();
        a.add(34, 45);
        a.add(12, 5);
        a.sub(56, 6);
        a.greeting("chhaya");
                 //new --for memory allocation
//method call syntax: referencename.methodname();
//    int a = 34;
//      int b = 45;
//        int c=a+b;
//      System.out.println(c);
//        int s = 12;
//      int d = 5;
//        int e = s+d;
//       System.out.println(e);
        
	}
	
	public void add(int a, int b) {//a=12,b=5
		int sum = a + b;
		System.out.println(sum);//17
				
	}
	
	public void sub(int a , int b) {
		int sub = a-b;
		System.out.println(sub);
	}
	public void greeting(String s) {
		System.out.println("hi welcome" + " "+s);
	}
}	
	


