package P2;
import external_comp_simp9.myinter;
class impleinter implements myinter{
	public void display() {
		System.out.println("Polymorphism using Interface");
	}
}
public class Demo {
	public static void main(String[] args) {
		myinter o=new impleinter();;
		o.display();
	}

}
