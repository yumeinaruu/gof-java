package fabric_pattern.items;

public class PythonDev implements Developer{
    @Override
    public String commonStack() {
        return "Python, Django";
    }

    @Override
    public String getLanguage() {
        return "Python";
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}
