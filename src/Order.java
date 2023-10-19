import java.util.ArrayList;
import java.util.Map;

public class Order {
    private ArrayList<MenuItems> cart = new ArrayList<>();

    // 메서드
    // 장바구니에 물품을 추가하는 메서드
    public void addToCart(Map<Integer, MenuItems> menuItemsMap, int choice) {
        MenuItems selectedItem = menuItemsMap.get(choice);

        if (selectedItem != null) {
            // 장바구니에 이미 같은 메뉴가 있는지 확인
            boolean isAlreadyInCart = false;
            for (MenuItems item : cart) {
                if (item.getMenuName().equals(selectedItem.getMenuName())) {
                    item.increaseItemCount(); // 이미 장바구니에 있는 경우 수량 증가
                    isAlreadyInCart = true;
                    break;
                }
            }

            if (!isAlreadyInCart) {
                cart.add(selectedItem);
            }
        } else {
            System.out.println("선택한 메뉴가 없습니다. 다시 시도해주세요.");
        }
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
                        item.getMenuItemCount() + "개 \t|\t " +
                        item.getMenuItemsPrice() + " \t|\t " +
                        item.getMenuDescription());
            }
        }
    }

    // 장바구니에 있는 물품의 가격을 더하는 메서드
    public double totalOrder() {
        double sum = 0;
        for (MenuItems item : cart) {
            sum += item.getMenuItemCount() * item.getMenuItemsPrice();
        }
        return sum;
    }
}