public class Goods extends Menu {
    private double goodsPrice; // 상품 가격

    public Goods(String menuName, String menuDescription, double goodsPrice) {
        super(menuName, menuDescription);
        this.goodsPrice = goodsPrice;
    }

    @Override
    public String getMenuName() {
        return super.getMenuName();
    }

    @Override
    public String getMenuDescription() {
        return super.getMenuDescription();
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }
}
