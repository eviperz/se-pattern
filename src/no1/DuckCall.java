package no1;

import services.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
