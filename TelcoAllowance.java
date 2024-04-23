import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
  
  private static final Map<String, Double> dataAllowanceMap = new HashMap<>();
  
  static {
    dataAllowanceMap.put("Smart", 15.0);
    dataAllowanceMap.put("Globe", 10.0);
    dataAllowanceMap.put("Ditto", 8.0);
  }

  @Override
  public String showAllowance(String telcoName, double promoPrice) {
    Double dataAllowance = dataAllowanceMap.get(telcoName);
    return dataAllowance + " GB for Php " + promoPrice;
  }
}
