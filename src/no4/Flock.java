package no4;

import services.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        boolean isLeader = true;
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();

            if (isLeader) {
                System.out.println("Leader of Flock");
                quacker.quack();
                quacker.quack();
                quacker.quack();
                System.out.println("**********");
                isLeader = false;
            } else {
                quacker.quack();
            }
        }
    }
}
