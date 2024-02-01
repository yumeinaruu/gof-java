package adapter;

public class AdapterFromEmailServiceNotificationService extends NotificationService implements ISender{

    @Override
    public boolean send(String message) {
        return sendMessageEmail(message);
    }
}
