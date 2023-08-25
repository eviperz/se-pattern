package no3;

import no1.DuckCall;
import no1.MallardDuck;
import no1.RedheadDuck;
import no1.RubberDuck;
import no2.QuackCounter;
import no2.QuackEcho;
import services.Quackable;

public class DuckFactoryWithCounterEcho extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }
}
