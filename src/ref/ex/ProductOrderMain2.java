package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 :");

        int count = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[count];


        for(int i = 0; i < count; i++){
            System.out.println((i+1) +"번째 주문의 정보를 입력하세요.");
            System.out.print("상품명 :");
            String productName = scanner.nextLine();
            System.out.print("가격 :");
            int productPrice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량 :");
            int productQuantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = createOrder(productName, productPrice, productQuantity);
        }
        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));


    }
    static ProductOrder createOrder(String productName, int productPrice, int productQuantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.productPrice = productPrice;
        order.productQuantity = productQuantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("품명: " + order.productName + " 가격: " + order.productPrice + " 수량: " + order.productQuantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.productPrice * order.productQuantity;
        }
        return totalAmount;
    }
}
