package com.array.field;

public class Field {

	private int[][] array;
	private int rows;
	private int columns;
	private int count = 1;

	public Field(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		array = new int[rows][columns];
	}

	public void setupField() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = count++;
			}
		}
	}

	public void printField() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}
	}

	public void rotateCw() {
		int[][] tmp = new int[columns][rows];

		for (int i = 0; i < tmp.length; i++) {
			for (int k = 0, j = rows - 1; j >= 0; j--, k++) {
				tmp[i][j] = array[k][i];
			}
		}

		array = tmp;
		int tmpRows = rows;
		rows = columns;
		columns = tmpRows;
	}

}
