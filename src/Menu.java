public class Menu {
    String menuName; // 메뉴 이름
    String menuDescription; // 메뉴 설명

    public Menu (String menuName, String menuDescription) {
        this.menuName = menuName;
        this.menuDescription = menuDescription;
    }

    public String getMenuName() {
        return menuName;
    }
    public String getMenuDescription() {
        return menuDescription;
    }
}
