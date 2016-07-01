/**
 * Created by Mad on 01.07.2016.
 */
import java.util.Random;
public class main {
    public static void main(String[] args) {
        int m1[][] = new int[3][2];
        int m2[][] = new int[2][3];
        int m3[][] = new int[3][3];
        int result = 0;

        Random r = new Random();
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++)
                m1[i][j] = r.nextInt(9);
        }
        System.out.println("Matrix A:");
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++)
                System.out.print(m1[i][j] + "\t");
            System.out.println();
        }

        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++)
                m2[i][j] = r.nextInt(9);
        }

        System.out.println("Matrix B:");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++)
                System.out.print(m2[i][j] + "\t");
            System.out.println();
        }

        System.out.println("Matrix C:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < 2; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];

                }
                System.out.print(m3[i][j] + "\t");
            }
            System.out.println();


        }

    }
}

