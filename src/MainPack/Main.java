package MainPack;

import Task1.*;
import Task2.*;
import Task3.*;
import Task4.*;
import Task5.*;
import Task6.*;

public class Main {
    public static void main(String[] args) {
        Circle circ1 = new Circle();
        Circle circ2 = new Circle(10.0);
        Circle circ3 = new Circle(5.9, "white");
        System.out.println(circ1 + ", area = " + circ1.getArea());
        System.out.println(circ2 + ", area = " + circ2.getArea());
        System.out.println(circ3 + ", area = " + circ3.getArea());

        System.out.println();
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5.123456789f, 6.123456789f);
        System.out.println(rect1 + ", perimeter = " + rect1.getPerimeter() + ", area = " + rect1.getArea());
        System.out.println(rect2 + ", perimeter = " + rect2.getPerimeter() + ", area = " + rect2.getArea());

        System.out.println();
        Employee employee = new Employee(99, "Ivan", "Ivanovich", 1000);
        System.out.println(employee);
        System.out.println("Increase salary by 40%: " + employee.raiseSalary(40));
        System.out.println("Annual salary: " + employee.getAnnualSalary());

        System.out.println();
        Author[] authors = {
                new Author("Robert Lafore", "robert@google.com", 'm'),
                new Author("Herbert Schildt", "shildth@mail.ru", 'm')
        };
        Book book = new Book("Java the best", authors, 100, 5);
        System.out.println(book);
        System.out.println("\"" + book.getName() + "\" authors: " + book.getAuthorNames());

        System.out.println();
        MyPoint point1 = new MyPoint(10, 5);
        MyPoint point2 = new MyPoint(15, 50);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println("Distance from point1 to (0,0): " + point1.distance());
        System.out.println("Distance from point1 to point2: " + point1.distance(point2));
        System.out.println("Distance from point2 to (100, 100): " + point2.distance(100, 100));

        System.out.println();
        MyPoint point3 = new MyPoint(20, 5);
        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println(triangle);
        System.out.println("Type: " + triangle.getType());
    }
}
