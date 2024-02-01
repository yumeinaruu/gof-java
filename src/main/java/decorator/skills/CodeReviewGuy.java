package decorator.skills;

import decorator.Decorator;
import decorator.Developer;

public class CodeReviewGuy extends Decorator {
    public CodeReviewGuy(Developer developer) {
        super(developer);
    }

    @Override
    public void developCode() {
        super.developCode();
        System.out.println("Reviewing code...");
    }
}
