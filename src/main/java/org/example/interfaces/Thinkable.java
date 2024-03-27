package org.example.interfaces;

@FunctionalInterface
public interface Thinkable<T> {
    void think(T friend);
}
