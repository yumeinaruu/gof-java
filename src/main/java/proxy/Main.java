package proxy;

public class Main {
    public static void main(String[] args) {
        Repository repository = new ProxyObject();
        repository.insertDataToDatabase("3672913917");
    }
}
