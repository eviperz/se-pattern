package no3;

import no1.DuckCall;
import no1.MallardDuck;
import no1.RedheadDuck;
import no1.RubberDuck;
import no2.QuackCounter;
import services.Quackable;

public class DuckFactoryWithCounter extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
