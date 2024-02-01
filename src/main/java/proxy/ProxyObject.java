package proxy;

import java.time.LocalTime;

public class ProxyObject implements Repository {
    RepositoryImpl repository = new RepositoryImpl();

    @Override
    public void insertDataToDatabase(String data) {
        //do smth before
        LocalTime start = LocalTime.now();
        repository.insertDataToDatabase(data);
        try {
            Thread.sleep(200);
        } catch (Exception e){
            System.out.println(e);
        }
        LocalTime finish = LocalTime.now();
        System.out.print("Method life time: ");
        System.out.println(finish.getNano() - start.getNano());
        //do smth after
    }
}
