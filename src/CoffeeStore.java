import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CoffeeStore {
    public static void main(String[] args) {
//
//        coffeeMachine.insertItem(CoffeeType.CAFE_LATTE.name(), 3000);
//        coffeeMachine.insertItem(CoffeeType.ICE_AMERICANO.name(), 2000);
//        coffeeMachine.insertItem(CoffeeType.AMERICANO.name(), 1500);
//
//        for (String itemName: coffeeMachine.itemlist.keySet()) {
//            System.out.println(itemName + " : " + coffeeMachine.itemlist.get(itemName));
//        }
//
//        System.out.println(coffeeMachine.insertChange(5000));
//        System.out.println(coffeeMachine.withdrawChange(1000));
//
//        coffeeMachine.sellItem(CoffeeType.AMERICANO.name(), 5000);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("\n[INFO] 현재 잔액 : %d 원 입니다.", coffeeMachine.charge);
            System.out.println("\n[INFO] 사용 가능한 기능\n[1.제품등록 2.제품목록 3.제품삭제 4.입금 5.출금 6.판매 7.종료]");
            System.out.print("메뉴를 입력하세요 >>> ");

            String menu = sc.next();
            switch (menu) {
                case "1":
                    System.out.println("1.제품등록.");
                    System.out.print("제품이름 입력 >>> ");
                    String name = sc.next();
                    System.out.print("제품가격 입력 >>> ");
                    int price = sc.nextInt();
                    coffeeMachine.insertItem(name, price);
                    System.out.printf("%s(%d원) 등록 완료.", name, price);
                    break;
                case "2":
                    System.out.println("2.제품목록.");
                    for (String itemName: coffeeMachine.itemlist.keySet()) {
                        System.out.println(itemName + " : " + coffeeMachine.itemlist.get(itemName));}
                    break;
                case "3":
                    System.out.println("3.제품삭제.");
                    System.out.println("삭제하고 싶은 물품 입력 >>> ");
                    String deleteName = sc.next();
                    coffeeMachine.deleteItem(deleteName);

                    break;
                case "4":
                    System.out.println("4.입금.");
                    break;
                case "5":
                    System.out.println("5.출금.");
                    break;
                case "6":
                    System.out.println("6.판매.");
                    break;
                case "7":
                    System.out.println("커피머신을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    break;

            }

        }
    }
}
