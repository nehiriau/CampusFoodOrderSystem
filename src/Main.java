class CampusFoodOrderService {
    public void placeOrder(String studentName, String foodName, String notificationType) {
        double fee = AppConfig.getInstance().getDeliveryFee();
        System.out.println("--- Order for: " + studentName + " | Fee: " + fee + " TL ---");
        
        Notification notification = NotificationFactory.createNotification(notificationType);
        if (notification != null) {
            notification.send(studentName, foodName);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CampusFoodOrderService service = new CampusFoodOrderService();

        service.placeOrder("Ali", "Chicken Sandwich", "EMAIL");
        service.placeOrder("Zeynep", "Vegetarian Pizza", "SMS");
        service.placeOrder("Riv", "Burger", "PUSH");
    }
}
