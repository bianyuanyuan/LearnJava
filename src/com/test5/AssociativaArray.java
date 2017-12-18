//container/AssociativeArrray.java
//Associates keys with values
package com.test5;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

//Map
public class AssociativaArray<K, V> implements Map<K, V> {
    private Object[][] pairs;
    private int index;
    public int size;

    @Override
    public int size() {
        return size;
    }

    @Contract(pure = true)
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Contract(pure = true)
    public boolean containsKey(Object key) {
        return false;
    }

    private AssociativaArray(int length) {
        pairs = new Object[length][2];

    }

    @Override
    public V put(K key, V value) {
        if (index >= pairs.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++] = new Object[]{key, value};
        return (V) pairs[index][2];
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(@NotNull Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @NotNull
    @Override
    public Set<K> keySet() {
        return null;
    }

    @NotNull
    @Override
    public Collection<V> values() {
        return null;
    }

    @NotNull
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    @SuppressWarnings("unchecked")
    public boolean containsValue(Object value) {
        return false;
    }

    private V get() {
        return get();
    }


    //how to make sure the key is the only one
    public V get(Object key) {//Object
        for (int i = 0; i < index; i++) {
            if (key.equals(pairs[i][0])) {
                return (V) pairs[i][1];
            }
        }
        return null;// did not find key
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(pairs[i][0].toString());
            result.append(":");
            result.append(pairs[i][1]);
            if (i < index - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AssociativaArray<String, String> map = new AssociativaArray<String, String>(6);
        map.put("sky", "blue");
        map.put("grass", "green");
        map.put("ocean", "dancing");
        map.put("tree", "tall");
        map.put("earth", "brown");
        map.put("sun", "warm");
        try {
            map.put("extra", "object");//Past the end
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Too many objects!");
        }
        System.out.println(map);
        System.out.println(map.get("ocean"));
        java.awt.List list = new java.awt.List();
    }

}
