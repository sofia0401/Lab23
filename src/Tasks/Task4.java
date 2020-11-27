package Tasks;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task4 {

    public static void main(String args[]) {

        List<String> list = new LinkedList<>();
        File file = new File("C:\\Users\\1311114\\Desktop\\javaa");
        String[] files = file.list();
        for (String s : files) {
            list.add(s);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}