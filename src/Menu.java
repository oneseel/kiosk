public class Menu {
    private String menuName; // 메뉴 이름
    private String menuDescription; // 메뉴 설명

    // 생성자
    public Menu (String menuName, String menuDescription) {
        this.menuName = menuName;
        this.menuDescription = menuDescription;
    }

    // 메서드
    // 메뉴 이름을 반환하는 메서드
    public String getMenuName() {
        return menuName;
    }

    // 메뉴 설명을 반환하는 메서드
    public String getMenuDescription() {
        return menuDescription;
    }
}
