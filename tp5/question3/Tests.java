package question3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Tests extends junit.framework.TestCase {

    public void test1(question3.Factory<Set<Integer>> f) throws Exception {
        Set<Integer> set = f.create();
        for (int i = 20; i > 0; i--)
            set.add(i);
        // test that only fails for treemaps because we are adding a none comparable
        // value
        set.add(null);
    }

    public void test2(question3.Factory<Set<Integer>> f) throws Exception {
        Set<Integer> set = f.create();
        for (int i = 20; i > 0; i--)
            set.add(i);
    }

    public void testCreation() {
        try {
            test1(new TreeSetFactory<Integer>());
            test1(new HashSetFactory<Integer>());
        } catch (NoSuchMethodError e) {
            fail("NoSuchMethodError : " + e.getMessage());
        } catch (NullPointerException e) {
            fail("NullPointerException : " + e.getMessage());
        } catch (Exception e) {
            fail("exception inattendue : " + e.getMessage());
        }

        testTreeMapSorted(new TreeSetFactory<Integer>());
    }

    public void testTreeMapSorted(TreeSetFactory<Integer> f) {
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
            fail("NoSuchElementException : " + e.getMessage());
        }
        assertTrue(isTreeSet);
    }

}
