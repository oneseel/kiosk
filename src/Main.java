import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Goods goods = new Goods();

        int choice;
        int goodsChoice;
        int orderChoice;

        System.out.println("KFC에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[KFC MENU]");
        System.out.println("1. " + menu.getMenuName("Chicken") + "    \t | \t" + menu.getMenuExplain("치킨입니다."));
        System.out.println("2. " + menu.getMenuName("Hamburger") + "\t | \t" + menu.getMenuExplain("햄버거입니다."));
        System.out.println("3. " + menu.getMenuName("Side") + "        \t | \t" + menu.getMenuExplain("사이드입니다."));
        System.out.println("4. " + menu.getMenuName("Drink") + "      \t | \t" + menu.getMenuExplain("음료입니다."));
        System.out.println();
        System.out.println("[ORDER MENU]");
        System.out.println("5. Order    \t | \t장바구니를 확인 후 주문합니다." );
        System.out.println("6. Cancel   \t | \t진행중인 주문을 취소합니다.");

        choice = sc.nextInt();

        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println("[Chicken Menu]");
                    System.out.println("1. " + goods.getMenuName("갓양념블랙라벨") + "       \t | \t"
                            + goods.getGoodsPrice(3700) + "  |  "
                            + goods.getMenuExplain("KFC에서도 ‘양념 순살’을 먹고 싶다는 고객님들을 위해 준비했다! 블랙라벨 치킨의 변신! 닭다리 통살 블랙라벨이 갓양념과 만났다!"));
                    System.out.println("2. " + goods.getMenuName("갓양념치킨") + "          \t | \t"
                            + goods.getGoodsPrice(3300) + "  |  "
                            + goods.getMenuExplain("달콤 매콤, 먹을수록 땡기는 맵달의 조화 한국인 입맛에 딱 맞춘 환상의 양념치킨"));
                    System.out.println("3. " + goods.getMenuName("켄터키통다리순살치킨") + "\t | \t"
                            + goods.getGoodsPrice(3100) + "  |  "
                            + goods.getMenuExplain("부드러운 닭다리 통살로 만든 최고급 프리미엄 치킨"));
                    System.out.println("4. " + goods.getMenuName("오리지널치킨") + "       \t | \t"
                            + goods.getGoodsPrice(3000) + "  |  "
                            + goods.getMenuExplain("KFC만의 11가지 비밀양념, 고압쿠킹 방식으로 육즙이 살아있어 촉촉 담백한 오리지널치킨"));
                    System.out.println("5. " + goods.getMenuName("핫크리스피치킨") + "      \t | \t"
                            + goods.getGoodsPrice(3000) + "  |  "
                            + goods.getMenuExplain("KFC만의 비법으로 매콤 바삭하게 튀겨낸 KFC 핫크리스피치킨"));
                    goodsChoice = sc.nextInt();

                    switch (goodsChoice) {
                        case 1:
                            System.out.println(goods.getMenuName("갓양념블랙라벨") + "       \t | \t"
                                    + goods.getGoodsPrice(3700) + "  |  "
                                    + goods.getMenuExplain("KFC에서도 ‘양념 순살’을 먹고 싶다는 고객님들을 위해 준비했다! 블랙라벨 치킨의 변신! 닭다리 통살 블랙라벨이 갓양념과 만났다!"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인 \t\t 2. 취소");
                            orderChoice = sc.nextInt();
                            switch (orderChoice) {
                                case 1:
                                    System.out.println("갓양념블랙라벨이 장바구니에 추가되었습니다.");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("잘못된 입력입니다.");
                            }
                            break;
                        case 2:
                            System.out.println(goods.getMenuName("갓양념치킨") + "          \t | \t"
                                    + goods.getGoodsPrice(3300) + "  |  "
                                    + goods.getMenuExplain("달콤 매콤, 먹을수록 땡기는 맵달의 조화 한국인 입맛에 딱 맞춘 환상의 양념치킨"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인 \t\t 2. 취소");
                            orderChoice = sc.nextInt();
                            switch (orderChoice) {
                                case 1:
                                    System.out.println("갓양념블랙라벨이 장바구니에 추가되었습니다.");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("잘못된 입력입니다.");
                            }
                            break;
                        case 3:
                            System.out.println(goods.getMenuName("켄터키통다리순살치킨") + "\t | \t"
                                    + goods.getGoodsPrice(3100) + "  |  "
                                    + goods.getMenuExplain("부드러운 닭다리 통살로 만든 최고급 프리미엄 치킨"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인 \t\t 2. 취소");
                            orderChoice = sc.nextInt();
                            switch (orderChoice) {
                                case 1:
                                    System.out.println("켄터키통다리순살치킨이 장바구니에 추가되었습니다.");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("잘못된 입력입니다.");
                            }
                            break;
                        case 4:
                            System.out.println(goods.getMenuName("오리지널치킨") + "       \t | \t"
                                    + goods.getGoodsPrice(3000) + "  |  "
                                    + goods.getMenuExplain("KFC만의 11가지 비밀양념, 고압쿠킹 방식으로 육즙이 살아있어 촉촉 담백한 오리지널치킨"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인 \t\t 2. 취소");
                            orderChoice = sc.nextInt();
                            switch (orderChoice) {
                                case 1:
                                    System.out.println("오리지널치킨이 장바구니에 추가되었습니다.");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("잘못된 입력입니다.");
                            }
                            break;
                        case 5:
                            System.out.println(goods.getMenuName("핫크리스피치킨") + "      \t | \t"
                                    + goods.getGoodsPrice(3000) + "  |  "
                                    + goods.getMenuExplain("KFC만의 비법으로 매콤 바삭하게 튀겨낸 KFC 핫크리스피치킨"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인 \t\t 2. 취소");
                            orderChoice = sc.nextInt();
                            switch (orderChoice) {
                                case 1:
                                    System.out.println("핫크리스피치킨이 장바구니에 추가되었습니다.");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("잘못된 입력입니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }

    }
}