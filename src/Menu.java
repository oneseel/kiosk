public class Menu {
    private String menuName; // 메뉴 이름
    private String menuDescription; // 메뉴 설명

    public Menu (String menuName, String menuDescription) {
        this.menuName = menuName;
        this.menuDescription = menuDescription;
    }

    // 메서드
    public String getMenuName() {
        return menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }
}
