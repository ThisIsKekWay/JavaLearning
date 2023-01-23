package Sems.sem1;
import java.util.Scanner;;
/**
 * programm
 * Тестим жаву и стараемся не отъехать кукухой
 */
public class programm {
    public static void main(String[] args) {
        // int a = 8; // 1000
        // System.out.println(a >> 1);


        // Создание массива
            // Одномерный массив
            {    
            int[] arr = new int[10];
            System.out.println(arr.length); // 10
            }  

            {   
            int[] arr = new int[] {1, 2, 3, 4, 5};
            System.out.println(arr[3]);
            System.out.println(arr.length);
            }


            // Многомерные массивы
            {
                int[][] arr = new int[3][5];
                int[] arr1[] = new int[3][5];
                for (int[] line : arr){
                    for (int item : line){
                        System.out.printf("%d ", item);
                    }
                    System.out.println();
                }
            }
        

        // Получение данных из терминала
        {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("name: ");
            String name = iScanner.nextLine();
            System.out.printf("Привет, %s!\n", name);
            iScanner.close();
        }
        
        sayHi();
    }    

    // Методы
    static void sayHi() {
        System.out.println("hi");
    }   
}
