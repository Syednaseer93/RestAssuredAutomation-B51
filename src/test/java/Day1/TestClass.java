package Day1;

public class TestClass {

	public static void main(String[] args) {
		ClassA obj= new ClassA();
		ClassB obj1=obj.methodA();
		obj1.methodB();
		
		obj.methodA().methodB();// Same thing we can call like this also. this is method chaining. eg: given().when().then()
	}

}
