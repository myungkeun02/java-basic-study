package class1.ex.Product;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.productPrice = 1000;
        order1.productQuantity = 2;
        productOrders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.productPrice = 5000;
        order2.productQuantity = 1;
        productOrders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.productPrice = 1500;
        order3.productQuantity = 2;
        productOrders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder oder : productOrders) {
            System.out.println("상품명 : " + oder.productName + ", 가격 : " + oder.productPrice + ", 수량 : " + oder.productQuantity);
            totalAmount += oder.productPrice * oder.productQuantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}
