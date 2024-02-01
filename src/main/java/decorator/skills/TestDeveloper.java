package decorator.skills;

import decorator.Decorator;
import decorator.Developer;

public class TestDeveloper extends Decorator {
    public TestDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void developCode() {
        super.developCode();
        System.out.println("Making tests...");
    }
}
