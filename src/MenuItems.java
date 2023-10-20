import java.util.HashMap;
import java.util.Map;

public class MenuItems extends Menu {
    private int menuItemPrice; // 상품 가격
    private int menuItemCount; // 상품 개수
    private Map<Integer, Option> optionMap; // 옵션맵
    private String optionName; // 옵션 이름
    private int soldCount; // 팜매된 상품 개수

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

    public int getMenuItemsPrice() {
        return menuItemPrice;
    }

    public int getMenuItemCount() {
        return menuItemCount;
    }

    // 상품의 수량이 증가하는 메서드
    public void increaseItemCount() {
        menuItemCount++;
    }

    // 옵션맵에 옵션을 추가하는 메서드
    public void addOption(int optionNumber, Option option) {
        optionMap.put(optionNumber, option);
    }

    public Map<Integer, Option> getOptionMap() {
        return optionMap;
    }

    public int getSoldCount() {
        return soldCount;
    }

    // 판매된 상품
    public void increaseSoldCount() {
        soldCount++;
    }
}
