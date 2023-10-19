public class MenuItems extends Menu {
    private double menuItemPrice; // 상품 가격

    public MenuItems(String menuName, String menuDescription, double menuItemPrice) {
        super(menuName, menuDescription);
        this.menuItemPrice = menuItemPrice;
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
}
