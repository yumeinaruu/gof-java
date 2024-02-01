package fabric_pattern.fabric;

import fabric_pattern.items.Developer;
import fabric_pattern.items.PythonDev;

public class PythonCourse implements Course{
    @Override
    public Developer getDeveloper() {
        return new PythonDev();
    }
}
