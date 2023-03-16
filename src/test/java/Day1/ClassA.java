package Day1;

public class ClassA {
	public ClassB methodA() {
		System.out.println("This is method a from class A");
		
		ClassB obj=new ClassB();
		//obj.methodB();
		return obj;
	}

}
