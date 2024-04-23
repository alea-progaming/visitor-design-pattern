public interface TelcoSubscription {
    String getTelcoName();
    double getPromoPrice();
    int getDateAllowance();
    boolean getUnliCallText();
    String accept(UsagePromo promo);
    String accept(UnliCallTextOffer unliCallTextOffer);
}