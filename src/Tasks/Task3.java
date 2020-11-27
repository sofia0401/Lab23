package Tasks;

import java.util.Scanner;

public class Task3 {

    public static <E> void  AnyType  (int i, E [] arr){

        E [] a = arr;
        AnyTypeArray <E> AnyType = new AnyTypeArray <E> ();
        AnyType.setArr(a);

//        System.out.print(s + "  ");

//        for(int i = 0; i< AnyType.getLength(); i++)
        System.out.print(AnyType.getArrIndex(i)+" ");

        System.out.println();
    }

    public static void main(String [] args){
        System.out.println("Выберите массив, элемент которого хотите вернуть:\n" +
                "1 - массив типа String\n" +
                "2 - массив типа Integer\n" +
                "3 - массив типа Double");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println("Введите индекс элемента");
        int i=sc.nextInt();

        switch (k) {
            case 1: {
                String[] str = {"Hello,", "World", "!"};
                AnyType(i, str);
                break;
            }
            case 2: {
                Integer[] intgr = {1, 2, 36, 21, 9, 83, 17};
                AnyType(i, intgr);
                break;
            }
            case 3: {
                Double[] fl = {1.2, 4.9, 8.8, 1.5, 6.7};
                AnyType(i, fl);
                break;
            }
            default:
                break;
        }
    }

}