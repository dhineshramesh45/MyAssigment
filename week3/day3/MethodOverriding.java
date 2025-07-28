package week3.day3;

class Animal {
	public void sound() {
		System.out.println("Animal sound");
	}
}
class dog extends Animal{
	public void sound() {
		System.out.println("Woow");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myanimal=new dog(); // 
		myanimal.sound();

	}

}
