package pl.pluta.stock.sales;

public class ReservationLine {
    private String productId;
    private int quantity;

    public ReservationLine(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
}
