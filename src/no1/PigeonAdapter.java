package no1;

import services.Quackable;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;
    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }
    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
