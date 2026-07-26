import java.util.ArrayList;
public class Generics {

    public static void drawShape(ArrayList<?extends Shape> shapes) {
       for (Shape shape : shapes) {
           shape.draw();
       }
    }

public static void main(String[]a ){
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());

       ArrayList<Circle> circles = new ArrayList<>();
       circles.add(new Circle());
       circles.add(new Circle());
       circles.add(new Circle());

       drawShape(rectangles);
       drawShape(circles);


//       ArrayList<String> testAnotherType = new ArrayList<>();
//       testAnotherType.add(new String());
//       drawShape(testAnotherType);
}


}
