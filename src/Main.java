import java.util.Scanner;

public class Main {

    // Kullanicidan aldigimiz degerlerle diziler olusturdugumuz alan.
    static int[][] createMatrix(int row, int column) {
        int[][] matrix;
        Scanner input = new Scanner(System.in);

        matrix = new int[row][column]; // Satir ve kolon degerlerini main metottan alip gerekli atamalari sagliyoruz

        System.out.println();
        for (int i = 0; i < row; i++) { // Ic ice for donguleri ile beraber satirlari sirayla doldurmaya basliyoruz
            for (int j = 0; j < column; j++) {
                System.out.print((i + 1) + ". satirin " + (j + 1) + ". sutununun degerini gir: ");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix; // main metotta ki ilgili degiskenimize yeni olusturulan bu diziyi gonderiyoruz
    }

    // Asagida ki metot yardimiyla tersine cevirme islemi yapiyoruz. Burada dogrudan dizi gonderip islem yapiyoruz.
    static int[][] transpozMatrix(int[][] matrix) {
        int rowIndex = matrix.length, columnIndex = matrix[0].length;

        int[][] transpozMatrix = new int[columnIndex][rowIndex]; // Main metottan gelen matrisin sutun degerini tersini olusturacagimiz bu yeni matrisin satir degerine, satir degerini ise transpozun sutun degerine atiyoruz.

        for (int i=0; i<rowIndex; i++){ // Ic ice for dongulerininin maksimum degerlerini aldigimiz bu matrisin satir ve sutun buyuklukleri ile sinirlandiriyoruz.
            for (int j=0; j<columnIndex; j++){
                transpozMatrix[j][i] = matrix[i][j]; // Bu capraz atama icin i ve j degerlerini capraz atamak yetiyor
            }
        }
        return transpozMatrix;
    }

    // Kendisine gelen matrisleri dogrudan bu metot yardimiyla bastiriyoruz.
    static void printMatrix(int[][] matrix){
        int rowIndex = matrix.length, columnIndex = matrix[0].length;

        for (int i=0; i<rowIndex; i++){
            for (int j=0; j<columnIndex; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row, column;
        int[][] matrix;
        Scanner input = new Scanner(System.in);

        // Kullanicidan matrisimizin buyuklugu icin degerler alip ilgili degiskenlere atadik.
        System.out.print("Olusturmak istedigin matrisin satir sayisini gir: ");
        row = input.nextInt();
        System.out.print("Olusturmak istedigin matrisin sutun sayisini gir: ");
        column = input.nextInt();

        // Asagida ise metotlar cagirildi.
        matrix = createMatrix(row, column);

        System.out.println("\nGirilen matrisin ciktisi:\n");
        printMatrix(matrix);
        System.out.println("\nGirilen matrisin transpozunun ciktisi:\n");
        printMatrix(transpozMatrix(matrix));
    }
}