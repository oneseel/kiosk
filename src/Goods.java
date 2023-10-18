public class Goods extends Menu {
    String goodsName; // 상품 이름
    String goodsExplain; // 상품 설명
    double goodsPrice; // 상품 가격

    @Override
    public String getMenuName(String menuName) {
        return super.getMenuName(menuName);
    }

    @Override
    public String getMenuExplain(String menuExplain) {
        return super.getMenuExplain(menuExplain);
    }

    public double getGoodsPrice(double goodsPrice) {
        return goodsPrice;
    }
}
