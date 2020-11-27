package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class Task1<E>{

        private List<E> list = new ArrayList<>();

        public Task1(E[] array) {
            list.addAll(Arrays.asList(array));
        }

        public void showList() {
            for (Object obj : list) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }

        public void add(E element) {
            list.add(element);
        }

        public List getList() {
            return list;
        }
    public static void main(String[] args) {

        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Task1<Integer> listInt = new Task1(numbers);
        listInt.showList();

        String[] str = {"a","b","c","def","gh"};
        Task1<String> listStr = new Task1(str);
        listStr.showList();
    }
    }