public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public int getDateAllowance() {
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo) {
        return promo.showAllowance(this.telcoName, this.promoPrice);
    }

    @Override
    public String accept(UnliCallTextOffer unliCallTextOffer) {
        return unliCallTextOffer.showUnliCallsTextOffer(this.telcoName, this.unliCallText);
    }
}