package com.phoenix.interfaces.functional;
/*
 * @author md.faisal
 * @version 1.0
 * @creation date 15-july-2021
 * 
 */
public class LambdaExpressionDemo {

	public void doMath(Addable ob) {
		System.out.println(ob.add(10, 20));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movable m =()->System.out.println("Anoynymous object moves");
		m.move();
		
		Jumpable j=()->System.out.println("Jumping");//Lambda expression
		j.jump();
		
		Addable ob=(int x,int y)->{return x+y;};
		//Addable ob1=(x,y)->{return x+y;};
		//Addable ob2=(x,y)->x+y;
		
		//calling default method
		float res1=ob.addFloats(2.3f, 6.4f);
		System.out.println("Addition of floats: "+res1);
		
		//invoking static method of interface
		Addable.show();
		
		
		int res=ob.add(10, 20);
		System.out.println("Addition is "+res);
	
	
		Greeting g=personName->{return "Hello "+personName;};
		//Greeting g = a-> "Hello"+a;
		System.out.println(g.greet("Faisal"));
		
	
		LambdaExpressionDemo ref=new LambdaExpressionDemo();
		ref.doMath((c,d)->c+d);
	
	
	}

}
