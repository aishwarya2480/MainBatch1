package Lab1Package;

public class Les04_classesandobj_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box();
		box.calvol();
		
	}

}
class Box{
	double width=10;
	double height=20;
	double depth=30;
	
	double calvol() {
		System.out.println(width*height*depth);
		return width*height*depth;
	}
}
