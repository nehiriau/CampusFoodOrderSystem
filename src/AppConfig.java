class AppConfig {
    private static AppConfig instance;
    private String universityName = "Istanbul Aydin University";
    private double deliveryFee = 25.0;

    private AppConfig() {}

    public static AppConfig getInstance() {
        if (instance == null) { instance = new AppConfig(); }
        return instance;
    }

    public String getUniversityName() { return universityName; }
    public double getDeliveryFee() { return deliveryFee; }
}
