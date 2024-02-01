package proxy;

public class RepositoryImpl implements Repository{

    @Override
    public void insertDataToDatabase(String data) {
        System.out.println("Connecting to database...");
        System.out.println("Saving data: " + data);
    }
}
