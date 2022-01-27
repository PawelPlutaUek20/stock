package pl.pluta.stock.payment;

public class PayUApiConfiguration {
    private final String merchantPosId;
    private final String apiUrl;

    public PayUApiConfiguration(String merchantPosId, String apiUrl) {
        this.merchantPosId = merchantPosId;
        this.apiUrl = apiUrl;
    }

    public String getMerchantPosId() {
        return merchantPosId;
    }

    public String getApiUrl() {
        return apiUrl;
    }
}