package ua.step.homework;

/**
 * Написать и методы работы с квадратными матрицами (матрицы
 * представить в виде двухмерных массивов). 
 * Должны присутствовать методы:
 * • создания единичной (диагональной) матрицы (метод createOne)
 * • создания нулевой матрицы (метод createNull)
 * • сложение матриц (метод sumMatrix)
 * • умножения матриц (метод productMatrix)
 * • умножение матрицы на скаляр (метод productMatrix)
 * • определение детерминанта матрицы (метод determinant)
 * • вывод матрицы на консоль (метод printMatrix)
 */
public class Task01 {

	public static void main(String[] args) {
		// TODO: Проверяйте методы здесь
	}

	/**
	 * Создает единичную матрицу
	 * @param n - количество строк
	 * @param m - количество колонок
	 * @return единичную (диагональную) матрицу
	 */
	public static int[][] createOne (int n, int m) {
		//// TODO: удалите исключение и пишите здесь код
	//	throw new RuntimeException("Not implemented yet");
		int u=0;
		int[][] matrixA;
		matrixA = new int[n][m];
		 //Matrix = new int [n][m];
		//return Matrix[n][m];
		for(int i=0;i<n;i++)
		{for(int t=0;t<m;t++){if(t==u){matrixA[i][t]=1;}else{matrixA[i][t]=0;}}u++;}
		return matrixA;
	}

	/**
	 * Создает нулевую матрицу
	 * @param n - количество строк
	 * @param m - количество колонок
	 * @return нулевую матрицу
	 */
	public static int[][] createNull (int n, int m) {
		// TODO: удалите исключение и пишите здесь код
		//throw new RuntimeException("Not implemented yet");
		int[][] matrixA;
		matrixA = new int[n][m];
		return matrixA;
	}

	/**
	 * Вычисляет сумму двух матриц
	 * @param one - первая матрица
	 * @param two - вторая матрица
	 * @return сумму двух матриц
	 */
	public static int[][] sumMatrix(int[][] one, int[][] two) {
		// TODO: удалите исключение и пишите здесь код
		//throw new RuntimeException("Not implemented yet");
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < one.length; j++) {
				 one[i][j] += two[i][j];
			}
		}
		return one;
	}

	/**
	 * Вычисляет произведение двух матриц
	 * @param one - первая матрица
	 * @param two - вторая матрица
	 * @return произведение матриц
	 */
	public static int[][] productMatrix(int[][] one, int[][] two) {
		// TODO: удалите исключение и пишите здесь код
		//throw new RuntimeException("Not implemented yet");
		int[][] res = new int[one.length][one.length];
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < two.length; j++) {
				for (int r = 0; r < two[0].length; r++) {
					res[i][j] += one[i][r] * two[r][j];
					//one[i][j] = one[i][K] * two[K][j];
				}
			}
		}
		return res;
	}

	/**
	 * Вычисляет произведение матрицы на скаляр
	 * @param matrix - матрица
	 * @param num - скаляр
	 * @return произведение матрицы на скаляр
	 */
	public static int[][] productMatrix(int[][] matrix, int num) {
		// TODO: удалите исключение и пишите здесь код
		//throw new RuntimeException("Not implemented yet");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] *= num;
			}
		}
		return matrix;
	}

	/**
	 * Вычисляет детерминант матрицы
	 * @param matrix - матрица
	 * @return детерминант матрицы
	 */
	public static int determinant(int[][] matrix) {
		// TODO: удалите исключение и пишите здесь код
		//throw new RuntimeException("Not implemented yet");
		int n=matrix.length;
		if(n==1) return matrix[0][0];
		int ans=0;
		int B[][]= new int [n-1][n-1];int l=1;
		for(int i=0;i<n;++i)
		{
			int x=0,y=0;
			for(int j=1;j<n;++j){
				for(int k=0;k<n;++k){
					if(i==k) continue;
					B[x][y]= matrix[j][k];
					++y;
					if(y==n-1) {
					y=0;
					++x;
					}
					}
				}
			ans+=l*matrix[0][i]* determinant(B);
			l*=(-1);
			}

		return ans;
	}

	/**
	 * Печатает матрицу в стандартный поток вывода
	 * @param matrix - матрица
	 */
	public static void printMatrix(int[][] matrix) {
		// TODO: удалите исключение и пишите здесь код
		//throw new RuntimeException("Not implemented yet");
		return;
	}
}
