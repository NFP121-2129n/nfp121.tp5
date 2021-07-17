package question1;

public class EnsembleTest extends junit.framework.TestCase {


    public void testAdd() {
        question1.Ensemble<Integer> e1;
        question1.Ensemble<String> e2;
        question1.Ensemble<Double> e3;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(-1));

        e2 = new question1.Ensemble<String>();
        assertEquals(true, e2.add("test1"));
        assertEquals(true, e2.add("test2"));

        e3 = new question1.Ensemble<Double>();
        assertEquals(true, e3.add(2.0));
        assertEquals(true, e3.add(-1.5));
    }

    public void testUnion() {
        question1.Ensemble<Integer> e1, e2, e3;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        e3 = new question1.Ensemble<Integer>();

        question1.Ensemble<Integer> union1 = e1.union(e2);
        question1.Ensemble<Integer> union2 = e1.union(e3);
        
        assertEquals(3, union1.size());
        assertEquals(2, union2.size());
        assertTrue(union1.contains(2));
        assertTrue(union1.contains(3));
        assertTrue(union1.contains(4));
        assertTrue(union2.contains(2));
        assertTrue(union2.contains(3));
    }

    public void testInter(){
        question1.Ensemble<Integer> e1, e2, e3;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        e3 = new question1.Ensemble<Integer>();

        question1.Ensemble<Integer> inter1 = e1.inter(e2);
        question1.Ensemble<Integer> inter2 = e1.inter(e3);
        assertEquals(1, inter1.size());
        assertEquals(0, inter2.size());
        assertTrue(inter1.contains(3));
    }

    public void testDiff(){
        question1.Ensemble<Integer> e1, e2, e3;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        e3 = new question1.Ensemble<Integer>();

        question1.Ensemble<Integer> inter1 = e1.inter(e2);
        question1.Ensemble<Integer> inter2 = e1.inter(e3);
        assertEquals(1, inter1.size());
        assertEquals(0, inter2.size());
        assertTrue(inter1.contains(3));
    }

    public void testDiffSym(){
        question1.Ensemble<Integer> e1, e2, e3;
        e1 = new question1.Ensemble<Integer>();
        assertEquals(true, e1.add(2));
        assertEquals(true, e1.add(3));

        e2 = new question1.Ensemble<Integer>();
        assertEquals(true, e2.add(3));
        assertEquals(true, e2.add(4));

        e3 = new question1.Ensemble<Integer>();

        question1.Ensemble<Integer> inter1 = e1.inter(e2);
        question1.Ensemble<Integer> inter2 = e1.inter(e3);
        assertEquals(1, inter1.size());
        assertEquals(0, inter2.size());
        assertTrue(inter1.contains(3));
    }
    
}
