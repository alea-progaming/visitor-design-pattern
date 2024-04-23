public class UnliCallTextPackage implements UnliCallTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return "Provides unlimited calls and texts.";
        } else {
            return "Does not provide unlimited calls and texts.";
        }
    }
}