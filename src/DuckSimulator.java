import no1.*;
import no2.QuackCounter;
import no2.QuackEcho;
import no3.AbstractDuckFactory;
import no3.DuckFactory;
import no3.DuckFactoryWithCounter;
import no3.DuckFactoryWithCounterEcho;
import no4.Flock;
import services.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();

        System.out.println("Duck Factory");
        DuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);

        System.out.println("Duck Factory with Counter");
        DuckFactoryWithCounter duckFactoryWithCounter = new DuckFactoryWithCounter();
        simulator.simulate(duckFactoryWithCounter);

        System.out.println("Duck Factory with Counter and Echo");
        DuckFactoryWithCounterEcho duckFactoryWithCounterEcho = new DuckFactoryWithCounterEcho();
        simulator.simulate(duckFactoryWithCounterEcho);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck =  duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator : With Composite - Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeonDuck);

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks());
        System.out.println("================================================");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
