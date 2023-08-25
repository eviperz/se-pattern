package no1;

import services.Quackable;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
