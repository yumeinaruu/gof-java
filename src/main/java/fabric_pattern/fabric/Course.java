package fabric_pattern.fabric;

import fabric_pattern.items.Developer;

public interface Course {
    default void courseInfo() {
        Developer developer = getDeveloper();
        System.out.println("Welcome on our course!");
        System.out.println("There you'll learn: " + developer.getLanguage() + " language");
        System.out.println("We'll teach you these technologies: " + developer.commonStack());
        System.out.println("Your future salary will be: " + developer.getSalary() + "$!");
    }

    Developer getDeveloper();
}
