package ua.lviv.lgs.part1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(6);
        AddList.addToList(list);

        System.out.println(list);

        /*
         * It's possible. Type of information is available only during compilation and
         * is erased (becomes inaccessible) before runtime.
         **/

    }
}
