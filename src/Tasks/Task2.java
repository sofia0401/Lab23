package Tasks;

public class Task2 {

    public static <E> void  AnyType  (String s, E [] arr){

        E [] a = arr;
        AnyTypeArray <E> AnyType = new AnyTypeArray <E> ();
        AnyType.setArr(a);

        System.out.print(s + "  ");

        for(int i = 0; i< AnyType.getLength(); i++)
            System.out.print(AnyType.getArrIndex(i)+" ");

        System.out.println();
    }

    public static void main(String [] args){

        String [] str = {"Hello,", "World","!"};
        AnyType("String: " , str);

        Integer [] intgr = { 1,2,36,21,9,83,17};
        AnyType("Integer: " , intgr);

        Double [] fl = {1.2,4.9,8.8,1.5,6.7};
        AnyType("Double: " , fl);

    }

}