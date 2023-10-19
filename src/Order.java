import java.util.ArrayList;
import java.util.Map;

public class Order {
    private ArrayList<MenuItems> cart = new ArrayList<>();

    // 메서드
    // 장바구니에 물품을 추가하는 메서드
    public void addToCart(Map<Integer, MenuItems> menuItemsMap, int choice) {
        MenuItems selectedItem = menuItemsMap.get(choice);
        cart.add(selectedItem);
    }

    // 장바구니에 있는 물품을 전부 제거하는 메서드
    public void clearOrder() {
        cart.clear();
    }

    // 장바구니에 있는 물품을 확인하는 메서드
    public void getOrder() {
        if (cart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            for (MenuItems item : cart) {
                System.out.println(item.getMenuName() + " \t|\t " +
                        item.getMenuItemsPrice() + " \t|\t " +
                        item.getMenuDescription());
                System.out.println();
            }
        }
    }

    // 장바구니에 있는 물품의 가격을 더하는 메서드
    public double totalOrder() {
        double sum = 0;
        for (MenuItems item : cart) {
            sum += item.getMenuItemsPrice();
        }
        return sum;
    }
}