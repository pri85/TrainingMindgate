package com.mindgate.factory;

import com.mindgate.pojo.Circle;
import com.mindgate.pojo.Shapes;
import com.mindgate.pojo.Square;
import com.mindgate.pojo.Triangle;

public class ShapesFactory {

	public static Shapes getShapes(char choice) {
		Shapes shapes = null;

		switch (choice) {

		case 'a':
			shapes = new Circle();
			break;

		case 'b':
			shapes = new Triangle();
			break;

		case 'c':
			shapes = new Square();
			break;
//		default:
//			shapes = new Shapes();
//			break;
		}
		return shapes;

	}

}
