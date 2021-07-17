package question3;

import java.util.*;

public class test {
    public static Set<Integer> test1(question3.Factory<Set<Integer>> f) throws Exception {
        Set<Integer> set = f.create();
        for (int i = 20; i > 0; i--)
            set.add(i);
        for (int i = 50; i > 30; i--) {
            set.add(i);
        }
        return set;
    }

    public static void test2(question3.Factory<Set<Integer>> f) throws Exception {
        Set<Integer> set = f.create();
        try {
            set.add(null);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void testCreation() {
        try {

            testTreeMapSorted(new TreeSetFactory<Integer>());
        } catch (Exception e) {
            System.out.println("exception" + e);
        }
    }

    public static void testTreeMapSorted(TreeSetFactory<Integer> f) {
        Set<Integer> set = f.create();
        for (int i = 20; i > 0; i--) {
            set.add(i);
        }
        // init flag
        boolean isTreeSet = true;
        Iterator<Integer> iterator = set.iterator();
        try {
            Integer max = iterator.next();
            while (iterator.hasNext()) {
                if (max > iterator.next()) {
                    isTreeSet = false;
                    break;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException : " + e.getMessage());
        }
        System.out.println(isTreeSet);
    }

    public static void main(String[] args) {
        testCreation();
    }

}
