import java.util.HashMap;
import java.util.Map;

public class MenuItems extends Menu {
    private int menuItemPrice; // 상품 가격
    private int menuItemCount; // 상품 개수
    private Map<Integer, Option> optionMap; // 옵션 맵
    private int soldCount; // 판매된 상품 개수

    public MenuItems(String menuName, String menuDescription, int menuItemPrice, int menuItemCount) {
        super(menuName, menuDescription);
        this.menuItemPrice = menuItemPrice;
        this.menuItemCount = menuItemCount;
        this.optionMap = new HashMap<>();
        this.soldCount = 0;
    }

    // 메서드
    @Override
    public String getMenuName() {
        return super.getMenuName();
    }

    @Override
    public String getMenuDescription() {
        return super.getMenuDescription();
    }

    // 메뉴 상품의 가격을 반환하는 메서드
    public int getMenuItemsPrice() {
        return menuItemPrice;
    }

    // 메뉴 상품의 수량을 반환하는 메서드
    public int getMenuItemCount() {
        return menuItemCount;
    }

    // 메뉴 상품의 수량이 증가하는 메서드
    public void increaseItemCount() {
        menuItemCount++;
    }

    // 옵션 맵에 옵션을 추가하는 메서드
    public void addOption(int optionNumber, Option option) {
        optionMap.put(optionNumber, option);
    }

    // 옵션 맵을 반환하는 메서드
    public Map<Integer, Option> getOptionMap() {
        return optionMap;
    }

    // 판매된 상품 수량을 반환하는 메서드
    public int getSoldCount() {
        return soldCount;
    }

    // 판매된 상품 수량을 증가하는 메서드
    public void increaseSoldCount() {
        soldCount++;
    }
}