interface Notification {
    void send(String studentName, String foodName);
}

class EmailNotification implements Notification {
    public void send(String studentName, String foodName) {
        String uni = AppConfig.getInstance().getUniversityName();
        System.out.println("Sending EMAIL: Dear " + studentName + ", your " + foodName + " order is received by " + uni + ".");
    }
}

class SmsNotification implements Notification {
    public void send(String studentName, String foodName) {
        System.out.println("Sending SMS: Hi " + studentName + ", your " + foodName + " order is confirmed.");
    }
}

class PushNotification implements Notification {
    public void send(String studentName, String foodName) {
        System.out.println("Sending PUSH: New notification: Your " + foodName + " is being prepared.");
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("EMAIL")) return new EmailNotification();
        if (type.equalsIgnoreCase("SMS")) return new SmsNotification();
        if (type.equalsIgnoreCase("PUSH")) return new PushNotification();
        return null;
    }
}
