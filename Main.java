import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    
    int[][] Macierz1 = new int[3][3];
    int[][] Macierz2 = new int[3][3];
    int i,j;
    int z;
    System.out.println("Podaj elementy 1 Macierzy:");
     for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                z=scan.nextInt();
                Macierz1[i][j]=z;
            }
        }
        System.out.println("Elementy macierzy1 : ");
        System.out.println("");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(Macierz1[i][j]+"\t");
            }
            System.out.println();
        }
    System.out.println("Podaj elementy 2 Macierzy:");
     for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                z=scan.nextInt();
                Macierz2[i][j]=z;
            }
        }
        System.out.println("Elementy macierzy2 : ");
        System.out.println("");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(Macierz2[i][j]+"\t");
            }
            System.out.println();
        }
  }
}