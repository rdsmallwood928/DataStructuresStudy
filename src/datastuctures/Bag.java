package datastuctures;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: bigwood928
 * Date: 10/17/13
 * Time: 7:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class Bag<T> implements Collection<T> {

    private T[] bagArr;
    private int bagSize;
    private static Random rnd = new Random();


    public Bag(int capacity) {
        bagArr = (T[]) new Object[capacity];
        bagSize = 0;
    }

    public String toString() {
        return Arrays.toString(toArray());
    }

    private void remove(int i) {
        for(int j=i; j<bagSize-1;j++) {
            bagArr[j] = bagArr[j+1];
        }
        bagSize--;
    }

    public T grab() {
        if(isEmpty()) return null;
        else{
            return bagArr[Math.abs(rnd.nextInt()) % bagSize];
        }

    }

    @Override
    public int size() {
        return bagSize;
    }

    @Override
    public boolean isEmpty() {
        return bagSize==0;
    }

    @Override
    public boolean contains(Object o) {
        T compare = (T) o;
        for(int i = 0; i<bagSize; i++) {
            if(compare.equals(bagArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] retArr = new Object[bagSize];
        for(int i =0; i<bagSize; i++) {
            retArr[i] = bagArr[i];
        }
        return retArr;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean add(T item) {
         if(bagSize >= bagArr.length) return false;
        bagArr[bagSize] = item;
        bagSize++;
        return true;
    }

    @Override
    public boolean remove(Object item) {
        for(int i=0; i<bagSize;i++) {
            if(bagArr[i].equals(item)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
