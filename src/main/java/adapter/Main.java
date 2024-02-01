package adapter;

public class Main {
    public static void main(String[] args) {
        ISender sender = new SmsSender();
        sender.send("Your code: 489103");
        ISender senderAdapter = new AdapterFromEmailServiceNotificationService();
        senderAdapter.send("Your code: 389012");
    }
}
