package org.lvl1;

public class Print implements Output {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
