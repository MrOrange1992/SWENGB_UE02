package fh.java.geometry;

import com.sun.tools.javac.util.*;
import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.quadrilateral.Square;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        main.doIt();

    }

    private void doIt()
    {
        // POLYMORPHISM
        // List is the Interface, ArrayList is the implementation
        List<GeometricShape> shapeList = new ArrayList<>();

        fillList(shapeList);
        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();

        for (GeometricShape shape : shapeList)
        {
            if (shape instanceof Circle)
                circleList.add((Circle)shape);      //Cast to Circle cause Java is statically typed
        }

        //Printing only the circles
        circleList.stream().forEach(System.out :: println);

    }


    private void fillList(List<GeometricShape> shapeList)
    {
        shapeList.add(new Circle(10, 10, 10));
        shapeList.add(new Circle(11, 12, 10));

        shapeList.add(new Square(43, 1, 20));
        shapeList.add(new Square(15, 18, 20));

        shapeList.add(new Rectangle(3, 5, 15, 20));
        shapeList.add(new RightTriangle(66, 4, 12, 15));
    }


    public void printList(List<GeometricShape> shapeList)
    {
        //FOR LOOP -> NOOB VERSION

        //FOREACH LOOP
		for (GeometricShape shape : shapeList) { System.out.println(shape); }

        //FUNCTIONAL 1 with Lambda
        shapeList.stream().forEach(shape -> System.out.println(shape));

        //FUNCTIONAL 2 (sort of wildcart)
        shapeList.stream().forEach(System.out :: println);

    }

}
