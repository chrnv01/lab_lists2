package ru.mirea.lab_lists2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert("abc");
        list.insert("a");
        list.insert("abcdef");
        list.insert("ab");
        list.insert("abcde");

        list.display();
    }
}
