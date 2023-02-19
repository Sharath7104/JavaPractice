package practice;

public class StaticBlock {
		  int i;	//instance variable
		  static int j;	//class variable
		  static int k;
		  
		  void show(){	//instance method
		    System.out.println(i + " " + j + " " + k);
		  }

		  static{	//static method
		    System.out.println("Inside static block");
		    j = 20;
		    k = 50;
		  }

		  StaticBlock(){	//constructor
		    System.out.println("Inside constructor");
		    i = 10;
		  }

		  public static void main(String args[]){
		    System.out.println("Inside main");
		    StaticBlock p1 = new StaticBlock();
		    p1.show();
		    j = 200;
		    p1.show();

		    StaticBlock p2 = new StaticBlock();
		    p2.show();
		    p1.i=300;
		    k= 500;
		    StaticBlock.j = 20;
		    p1.show();
		    j=50;
		    p1.show();
		    p2.show();
		  }
}


