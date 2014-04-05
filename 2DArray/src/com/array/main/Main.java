package com.array.main;

import com.array.field.Field;

public class Main {

	public static void main(String[] args) {
		Field field = new Field(2, 3);

		System.out.println("Init field");
		System.out.println("==========");
		System.out.println();

		field.setupField();
		field.printField();

		System.out.println();
		System.out.println("Rotate 4 tims CW");
		System.out.println("================");
		System.out.println();

		field.rotateCw();
		field.printField();

		System.out.println();

		field.rotateCw();
		field.printField();

		System.out.println();

		field.rotateCw();
		field.printField();

		System.out.println();

		field.rotateCw();
		field.printField();

		System.out.println();
		System.out.println("Rotate 4 times CCW");
		System.out.println("==================");
		System.out.println();

		field.rotateCcw();
		field.printField();

		System.out.println();

		field.rotateCcw();
		field.printField();

		System.out.println();

		field.rotateCcw();
		field.printField();

		System.out.println();

		field.rotateCcw();
		field.printField();

	}

}
