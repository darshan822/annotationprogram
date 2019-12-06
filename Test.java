package com.practiceannotation;
class Animal
{
	public void eat(){
		System.out.println("eating something");
	}
	
}
class dog extends Animal
{
	@Override//this @overide indicates that the parent class mathod are overided at subclass.
	public void eat(){
		System.out.println("eating food");
		
	}
}
public class Test {

	public static void main(String[] args) {
		Animal a=new dog();
		a.eat();
		// TODO Auto-generated method stub

	}

}
