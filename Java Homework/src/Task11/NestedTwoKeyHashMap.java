package Task11;

import java.util.*;
import java.util.function.Consumer;

public class NestedTwoKeyHashMap<K1, K2, V> implements TwoKeyMap<K1, K2, V> {
    private final Map<K1, Map<K2, V>> map = new HashMap<>();

    public NestedTwoKeyHashMap() {
    }

    @Override
    public V put(K1 k1, K2 k2, V value) {
        if (k1 == null || k2 == null || value == null) {
            throw new NullPointerException("Keys and values cannot be null");
        }
        Map<K2, V> inner = map.get(k1);
        if (inner == null) {
            inner = new HashMap<>();
            map.put(k1, inner);
        }
        return inner.put(k2, value);
    }

    @Override
    public V get(K1 k1, K2 k2) {
        if (k1 == null || k2 == null) {
            throw new NullPointerException("Keys cannot be null");
        }
        Map<K2, V> inner = map.get(k1);
        if (inner == null) {
            return null;
        }
        return inner.get(k2);
    }

    @Override
    public V remove(K1 k1, K2 k2) {
        if (k1 == null || k2 == null) {
            throw new NullPointerException("Keys cannot be null");
        }
        Map<K2, V> inner = map.get(k1);
        if (inner == null) {
            return null;
        }
        V removed = inner.remove(k2);
        if (inner.isEmpty()) {
            map.remove(k1);
        }
        return removed;
    }

    @Override
    public boolean containsKeys(K1 k1, K2 k2) {
        if (k1 == null || k2 == null) {
            throw new NullPointerException("Keys cannot be null");
        }
        Map<K2, V> inner = map.get(k1);
        if (inner == null) {
            return false;
        }
        return inner.containsKey(k2);
    }

    @Override
    public boolean containsValue(V value) {
        if (value == null) {
            throw new NullPointerException("Value cannot be null");
        }
        for (Map<K2, V> inner : map.values()) {
            if (inner.containsValue(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        int total = 0;
        for (Map<K2, V> inner : map.values()) {
            total += inner.size();
        }
        return total;
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Set<Entry<K1, K2, V>> entrySet() {
        Set<Entry<K1, K2, V>> result = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> outer : map.entrySet()) {
            K1 k1 = outer.getKey();
            for (Map.Entry<K2, V> inner : outer.getValue().entrySet()) {
                result.add(new MyEntry<>(k1, inner.getKey(), inner.getValue()));
            }
        }
        return result;
    }

    @Override
    public Set<Pair<K1, K2>> keySet() {
        Set<Pair<K1, K2>> result = new HashSet<>();
        for (Map.Entry<K1, Map<K2, V>> outer : map.entrySet()) {
            K1 k1 = outer.getKey();
            for (K2 k2 : outer.getValue().keySet()) {
                result.add(new Pair<>(k1, k2));
            }
        }
        return result;
    }

    @Override
    public Collection<V> values() {
        List<V> result = new ArrayList<>();
        for (Map<K2, V> inner : map.values()) {
            result.addAll(inner.values());
        }
        return result;
    }

    @Override
    public void putAll(TwoKeyMap<? extends K1, ? extends K2, ? extends V> other) {
        for (Entry<? extends K1, ? extends K2, ? extends V> entry : other) {
            put(entry.getKey1(), entry.getKey2(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Map<K2, V> row(K1 k1) {
        if (k1 == null) {
            throw new NullPointerException("Key1 cannot be null");
        }
        Map<K2, V> inner = map.get(k1);
        if (inner == null) {
            return new HashMap<>();
        }
        return new HashMap<>(inner);
    }

    @Override
    public Map<K1, V> column(K2 k2) {
        if (k2 == null) {
            throw new NullPointerException("Key2 cannot be null");
        }
        Map<K1, V> result = new HashMap<>();
        for (Map.Entry<K1, Map<K2, V>> outer : map.entrySet()) {
            V value = outer.getValue().get(k2);
            if (value != null) {
                result.put(outer.getKey(), value);
            }
        }
        return result;
    }

    @Override
    public Iterator<Entry<K1, K2, V>> iterator() {
        return entrySet().iterator();
    }

    @Override
    public void forEach(Consumer<? super Entry<K1, K2, V>> action) {
        TwoKeyMap.super.forEach(action);
    }

    @Override
    public Spliterator<Entry<K1, K2, V>> spliterator() {
        return TwoKeyMap.super.spliterator();
    }

    private static class MyEntry<K1, K2, V> implements TwoKeyMap.Entry<K1, K2, V> {
        private final K1 key1;
        private final K2 key2;
        private V value;

        public MyEntry(K1 key1, K2 key2, V value) {
            this.key1 = key1;
            this.key2 = key2;
            this.value = value;
        }

        @Override
        public K1 getKey1() {
            return key1;
        }

        @Override
        public K2 getKey2() {
            return key2;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            if (value == null) {
                throw new NullPointerException("Value cannot be null");
            }
            V old = this.value;
            this.value = value;
            return old;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            MyEntry<?, ?, ?> myEntry = (MyEntry<?, ?, ?>) o;
            return Objects.equals(key1, myEntry.key1) && Objects.equals(key2, myEntry.key2) && Objects.equals(value, myEntry.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key1, key2, value);
        }

        @Override
        public String toString() {
            return "(" + key1 + ", " + key2 + ", " + value + ")";
        }
    }
}