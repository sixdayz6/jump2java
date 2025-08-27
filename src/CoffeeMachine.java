import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {
    // 속성 - Map<제품이름, 가격>, 잔액
    Map<String, Integer> itemlist = new HashMap<>();
    public int charge;


    // 기능 - 판매, 제품 등록, 잔액 입출금
    // 기능 - 제품등록, 리턴: void, 이름: insertItem, 입력값: 제품이름, 제품가격
    public void insertItem(String item, int price) {
        itemlist.put(item, price);
    }
    // 기능 - 제품 제거, 리턴: void, 이름: updateItem, 입력값: 제품이름, 제품가격
    public void deleteItem(String item) {
        itemlist.remove(item);
    }

    // 기능 - 잔액 넣기
    public int insertChange(int charge) {
        this.charge += charge;
        System.out.println("Your charge is " + this.charge);
        return charge;
    }

    // 기능 - 잔액 출금
    public int withdrawChange(int charge) {
        if (this.charge >= charge) {
            this.charge -= charge;
        } else {
            charge = this.charge;
            this.charge = 0;
        }
        return charge;
    }

    // 기능 - 판매(물품 갯수, 잔액 확인)
    public void sellItem(String item, int inputMoney) {
        if(itemlist.containsKey(item)) {
            int price = itemlist.get(item);
            if (inputMoney >= price) {
                this.charge += price;
                int change = inputMoney - price;
                System.out.println("I received " + inputMoney);
                System.out.println("This is your " + item);
                System.out.println("This is your change: " + change);
            } else {
                System.out.println("Sorry, not enough money");
            }
        }
    }

}
