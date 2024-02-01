package fabric_pattern.fabric;

import fabric_pattern.items.Developer;
import fabric_pattern.items.JavaDev;

public class JavaCourse implements Course{
    @Override
    public Developer getDeveloper() {
        return new JavaDev();
    }
}
