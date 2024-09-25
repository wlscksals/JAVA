package CH14;

abstract class Shape{
	 abstract void 넓이();
}
class Rectangle extends Shape{
	int width;
	int height;

}
class Triangle extends Shape{
	int height;
	int bottomLine;
}
class Circle extends Shape{
	int radius;
	static final double PI=3.14;


}
public class C03Ex {
	public static void 전체넓이확인(Shape shape) 
	{
		//넓이 출력	
		shape.넓이();
	}
	
	public static void main(String[] args) {
		전체넓이확인(new Rectangle(45,45));
		전체넓이확인(new Triangle(100,20));
		전체넓이확인(new Circle(5));
	}
}
