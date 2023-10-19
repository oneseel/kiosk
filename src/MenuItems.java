public class MenuItems extends Menu {
    private double menuItemPrice; // 상품 가격
    private int menuItemCount; // 상품 개수

    public MenuItems(String menuName, String menuDescription, double menuItemPrice, int menuItemCount) {
        super(menuName, menuDescription);
        this.menuItemPrice = menuItemPrice;
        this.menuItemCount = menuItemCount;
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

    public double getMenuItemsPrice() {
        return menuItemPrice;
    }

    public int getMenuItemCount() {
        return menuItemCount;
    }

    public void increaseItemCount() {
        menuItemCount++;
    }
}
