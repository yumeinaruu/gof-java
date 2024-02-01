package adapter;

//class not related to ISender
public class NotificationService {
    public boolean sendMessageEmail(String message){
        try {
            System.out.println("Sending SMS with context:" + message);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void printAllMessages(){
        System.out.println("...");
    }
}
