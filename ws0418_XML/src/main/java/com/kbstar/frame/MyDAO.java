package com.kbstar.frame;

import java.util.List;

public interface MyDAO<K, V> {

    public void insert(V v);
    public void delete(K k);
    public V select(K k);
    public List<V> select();

    public void update(V v);

}
