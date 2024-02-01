package decorator.skills;

import decorator.Decorator;
import decorator.Developer;

public class FrontDeveloper extends Decorator {
    public FrontDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void developCode() {
        super.developCode();
        System.out.println("Making frontend...");
    }
}
