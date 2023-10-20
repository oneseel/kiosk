public class Option {
    private String optionName; // 옵션 이름
    private int optionPrice; // 옵션 가격

    public Option(String optionName, int optionPrice) {
        this.optionName = optionName;
        this.optionPrice = optionPrice;
    }

    // 메서드
    public int getOptionPrice() {
        return optionPrice;
    }

    public String getOptionName() {
        return optionName;
    }
}
