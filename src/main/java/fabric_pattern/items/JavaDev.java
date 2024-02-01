package fabric_pattern.items;

public class JavaDev implements Developer{
    @Override
    public String commonStack() {
        return "Java, Spring, SQL";
    }

    @Override
    public String getLanguage() {
        return "Java";
    }

    @Override
    public int getSalary() {
        return 3000;
    }
}
