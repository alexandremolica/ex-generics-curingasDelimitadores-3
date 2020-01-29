package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		// Exemplo Generics - curinga delimitados
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: "+ totalArea(myShapes));

		System.out.println();
		List<Shape> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area do cicles: "+ totalArea(myCircles));

	}
	
	public static double totalArea(List<? extends Shape> list) {
		// esta solucao nao pode adicionar elementos a lista neste
		// metodo
		double sum= 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
