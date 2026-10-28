// Question: How can a rectangle class model width and height and calculate area and perimeter?
package OOP;
// UML => Unified Model Languange
// use to create diagrams
//class diagram
//

public class UML {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 9);
        System.out.println("The area is: "+r.getArea());
        System.out.println("The parimeter is: "+r.getParimeter());
        System.out.printf("The area is: %.2f%n The parimeter is: %.2f",  r.getArea(),r.getParimeter());
    }
         public static class Rectangle {
            private double width;
            private double height;

            public Rectangle() {
//            this.width = 1;
//            this.height=1;
                this(1.0, 1.0);
            }

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double getArea() {
                return this.width * this.height;
            }

            public double getParimeter() {
                return 2 * (this.width + this.height);

            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public double getHeight() {
                return height;
            }

            public void setHeight(double height) {
                this.height = height;
            }
        }

}
