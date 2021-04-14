package Collections;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {

        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        System.out.println(set.add("indore"));
        System.out.println(set.add("bhopal"));
        System.out.println(set.add("dewas"));
        System.out.println(set);
        System.out.println(set.add("indore"));
        System.out.println(set);

    }
}
