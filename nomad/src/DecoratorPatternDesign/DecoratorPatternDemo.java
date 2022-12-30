package DecoratorPatternDesign;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
			Shape Circle=new Circle();
			Shape redCircle=new RedShapeDecorator(new Circle());
			Shape redRectangle=new RedShapeDecorator(new Rectangle());
			Circle.draw();
			redCircle.draw();
			redRectangle.draw();
			
	}

}
