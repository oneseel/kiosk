import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItems> cart = new ArrayList<>(); // 장바구니 목록
    private int totalSales = 0; // 총 판매금액
    private ArrayList<MenuItems> soldItems = new ArrayList<>(); // 판매된 상품맵

    // 메서드
    // 장바구니에 물품을 추가하는 메서드
    public void addToCart(MenuItems menuItems) {
        if (menuItems != null) {
            boolean isAlreadyInCart = false;
            for (MenuItems item : cart) {
                // 장바구니에 이미 같은 메뉴가 있는지 확인
                if (item.getMenuName().equals(menuItems.getMenuName())) {
                    item.increaseItemCount(); // 이미 장바구니에 있는 경우 수량 증가
                    isAlreadyInCart = true;
                    item.increaseSoldCount(); // 판매된 숫자 증가
                    break;
                }
            }

            if (!isAlreadyInCart) {
                cart.add(menuItems); // 장바구니에 물품 추가
                menuItems.increaseSoldCount(); // 판매된 숫자 증가
            }

            // 총 판매금액
            totalSales += menuItems.getMenuItemCount() * menuItems.getMenuItemsPrice();

            // 판매된 상품 목록 업데이트
            soldItems.add(menuItems);

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
                        item.getMenuItemsPrice() + "원 \t|\t " +
                        item.getMenuDescription());
            }
        }
    }

    // 장바구니에 있는 물품의 가격을 더하는 메서드
    public int totalOrder() {
        int sum = 0;
        for (MenuItems item : cart) {
            sum += item.getMenuItemCount() * item.getMenuItemsPrice();
        }
        return sum;
    }

    // 총 판매금액을 조회하는 메서드
    public int getTotalSales() {
        return totalSales;
    }

    // 판매된 상품 목록을 조회하는 메서드
    public ArrayList<MenuItems> getSoldItems() {
        return soldItems;
    }
}