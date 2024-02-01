package adapter;

public class SmsSender implements ISender {
    @Override
    public boolean send(String message) {
        try {
            System.out.println("Sending SMS with context: " + message);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
