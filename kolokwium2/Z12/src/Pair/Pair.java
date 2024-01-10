package Pair;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair() {
        this.key = null;
        this.value = null;
    }
// Nie wiedziałem o jaki konstruktor chodzi. W treści zadania nie określono czy ma być parametryczny czy domyślny.
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }
}
