import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Menu> menuMap = new HashMap<>();
        Map<Integer, Goods> goodsMap = new HashMap<>();

        int choice; // 메뉴 선택
        int goodsChoice; // 상품 선택

        menuMap.put(1, new Menu("Chicken", "치킨입니다."));
        menuMap.put(2, new Menu("Hamburger", "햄버거입니다."));
        menuMap.put(3, new Menu("Side", "사이드입니다."));
        menuMap.put(4, new Menu("Drink", "음료입니다."));

        while (true) {
            // <메인 메뉴>
            System.out.println("KFC에 오신걸 환영합니다.");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
            System.out.println();
            System.out.println("[KFC MENU]");
            for (int i = 1; i <= menuMap.size(); i++) {
                Menu menu = menuMap.get(i);
                System.out.println(i + ". " + menu.getMenuName() + " \t|\t " + menu.getMenuDescription());
            }
            System.out.println();
            System.out.println("[ORDER MENU]");
            System.out.println("5. Order \t|\t 장바구니를 확인 후 주문합니다.");
            System.out.println("6. Cancel \t|\t 진행중인 주문을 취소합니다.");
            System.out.println();

            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                // <1번 치킨 상품>
                case 1:
                    goodsMap.put(1, new Goods("갓양념블랙라벨", "KFC에서도 ‘양념 순살’을 먹고 싶다는 고객님들을 위해 준비했다! 블랙라벨 치킨의 변신! 닭다리 통살 블랙라벨이 갓양념과 만났다!", 3400));
                    goodsMap.put(2, new Goods("갓양념치킨", "달콤 매콤, 먹을수록 땡기는 맵달의 조화 한국인 입맛에 딱 맞춘 환상의 양념치킨", 3300));
                    goodsMap.put(3, new Goods("켄터키통다리순살치킨", "부드러운 닭다리 통살로 만든 최고급 프리미엄 치킨", 3100));
                    goodsMap.put(4, new Goods("오리지널치킨", "KFC만의 11가지 비밀양념, 고압쿠킹 방식으로 육즙이 살아있어 촉촉 담백한 오리지널치킨", 3000));
                    goodsMap.put(5, new Goods("핫크리스피치킨", "KFC만의 비법으로 매콤 바삭하게 튀겨낸 KFC 핫크리스피치킨", 3000));
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println();
                    System.out.println("[Chicken Menu]");
                    for (int i = 1; i <= goodsMap.size(); i++) {
                        Goods chickenGoods = goodsMap.get(i);
                        System.out.println(i + ". " + chickenGoods.getMenuName() + " \t|\t "
                                + chickenGoods.getGoodsPrice() + " \t|\t " + chickenGoods.getMenuDescription());
                    }
                    goodsChoice = sc.nextInt();
                    System.out.println();

                    goodsChoiceMethod(sc, goodsMap, goodsChoice);
                    break;

                    // <2번 버거 상품>
                case 2:
                    goodsMap.put(1, new Goods("캡새버거", "탱글탱글한 새우살이 콕콕 그 새우버거가 KFC에서 더 맛있게 나왔새우", 4300));
                    goodsMap.put(2, new Goods("불고기버거", "달콤한 불고기 소스와 부드러운 패티로 더 맛있어진 불고기버거", 4300));
                    goodsMap.put(3, new Goods("징거버거", "더 커진 닭가슴살필렛과 상큼한 토마토가 어우러진 대표 치킨버거", 5500));
                    goodsMap.put(4, new Goods("켄터키통다리스파이시", "육즙가득 닭다리살에 스콜쳐소스로 매콤하게, 해시브라운으로 든든하게!", 7000));
                    goodsMap.put(5, new Goods("블랙라벨폴인치즈버거", "부드러운 통닭다리살과 크림치즈, 고다치즈, 블루치즈의 완벽한 조화의 버거", 7700));
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println();
                    System.out.println("[Hamburger Menu]");
                    for (int i = 1; i <= goodsMap.size(); i++) {
                        Goods burgerGoods = goodsMap.get(i);
                        System.out.println(i + ". " + burgerGoods.getMenuName() + " \t|\t "
                                + burgerGoods.getGoodsPrice() + " \t|\t " + burgerGoods.getMenuDescription());
                    }
                    goodsChoice = sc.nextInt();
                    System.out.println();

                    goodsChoiceMethod(sc, goodsMap, goodsChoice);
                    break;

                    // <3번 사이드 상품>
                case 3:
                    goodsMap.put(1, new Goods("핫봉스틱(2조각)", "핫윙 출시 30주년 기념, 더 놀라운 맛으로 돌아온 핫봉스틱!", 3500));
                    goodsMap.put(2, new Goods("텐더(2조각)", "담백한 치킨 안심살로 만들어 깔끔하게 먹을 수 있는 KFC 순살 치킨스낵", 3000));
                    goodsMap.put(3, new Goods("너겟(4조각)", "순 닭고기살로 만들어 부드럽고 쫄깃한 치킨너겟", 2200));
                    goodsMap.put(4, new Goods("케이준후라이", "케이준 양념으로 더욱 고소하고 바삭해진 KFC 케이준후라이", 2300));
                    goodsMap.put(5, new Goods("롱치즈스틱", "100% 자연산 치즈가 길~게 늘어나는 고소한 롱치즈스틱", 2000));
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println();
                    System.out.println("[Side Menu]");
                    for (int i = 1; i <= goodsMap.size(); i++) {
                        Goods sideGoods = goodsMap.get(i);
                        System.out.println(i + ". " + sideGoods.getMenuName() + " \t|\t "
                                + sideGoods.getGoodsPrice() + " \t|\t " + sideGoods.getMenuDescription());
                    }
                    goodsChoice = sc.nextInt();
                    System.out.println();

                    goodsChoiceMethod(sc, goodsMap, goodsChoice);
                    break;

                    // <4번 음료 상품>
                case 4:
                    goodsMap.put(1, new Goods("코카콜라", "속까지 시원해지는 청량음료의 대표! 콜라", 2400));
                    goodsMap.put(2, new Goods("스프라이트", "속까지 시원해지는 청량음료 스프라이트!", 2400));
                    goodsMap.put(3, new Goods("아이스아메리카노", "KFC만의 고품질 원두를 사용해 향과 맛이 뛰어난 차가운 아메리카노", 2200));
                    goodsMap.put(4, new Goods("아이스초코", "KFC에서 즐기는 달콤한 아이스초코", 2200));
                    goodsMap.put(5, new Goods("오렌지주스", "KFC 오렌지주스", 2000));
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println();
                    System.out.println("[Hamburger Menu]");
                    for (int i = 1; i <= goodsMap.size(); i++) {
                        Goods drinkGoods = goodsMap.get(i);
                        System.out.println(i + ". " + drinkGoods.getMenuName() + " \t|\t "
                                + drinkGoods.getGoodsPrice() + " \t|\t " + drinkGoods.getMenuDescription());
                    }
                    goodsChoice = sc.nextInt();
                    System.out.println();

                    goodsChoiceMethod(sc, goodsMap, goodsChoice);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 처음으로 돌아갑니다");
                    System.out.println();
            }
        }
    }

    // 장바구니 추가
    public static void goodsChoiceMethod(Scanner sc, Map<Integer, Goods> goodsMap, int goodsChoice) {
        int orderChoice;
        if (goodsChoice >= 1 && goodsChoice <= goodsMap.size()) {
            System.out.println(goodsMap.get(goodsChoice).getMenuName() + " \t|\t "
                    + goodsMap.get(goodsChoice).getGoodsPrice() + " \t|\t "
                    + goodsMap.get(goodsChoice).getMenuDescription());

            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인 \t\t 2. 취소");

            orderChoice = sc.nextInt();
            System.out.println();

            orderCheckMethod(goodsMap, goodsChoice, orderChoice);
        } else {
            System.out.println("잘못된 입력입니다. 처음으로 돌아갑니다");
            System.out.println();
        }
    }

    // 장바구니 추가 확인
    public static void orderCheckMethod(Map<Integer, Goods> goodsMap, int goodsChoice, int orderChoice) {
        switch (orderChoice) {
            case 1:
                System.out.println(goodsMap.get(goodsChoice).getMenuName() + "이(가) 장바구니에 추가되었습니다.");
                System.out.println();
                break;
            case 2:
                System.out.println("취소되었습니다. 처음으로 돌아갑니다.");
                System.out.println();
                break;
            default:
                System.out.println("잘못된 입력입니다. 처음으로 돌아갑니다");
                System.out.println();
        }
    }
}