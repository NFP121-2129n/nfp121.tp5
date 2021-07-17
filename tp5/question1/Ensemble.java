package question1;

import java.util.*;
public class Ensemble<T> extends AbstractSet<T> {

    protected Vector<T> table = new Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }

    public boolean add(T t) {
        if(table.contains(t)) return false;
        return table.add(t);
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
        Ensemble<T> union = new Ensemble<T>();
        union.addAll(table);
        union.addAll(e);
        return union;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        Ensemble<T> inter = new Ensemble<T>();
        inter.addAll(table);
        inter.retainAll(e);
        return inter;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        Ensemble<T> diff = new Ensemble<T>();
        diff.addAll(table);
        diff.removeAll(e);
        return diff;
    }

    public Ensemble<T> diffSym(Ensemble<? extends T> e) {
        Ensemble<T> diffSym = new Ensemble<T>();
        diffSym.addAll(this.union(e));
        diffSym.removeAll(this.inter(e));
        return diffSym;
    }
}
