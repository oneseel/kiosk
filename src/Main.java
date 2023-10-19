import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        Map<Integer, Menu> menuMap = new HashMap<>();
        Map<Integer, Map<Integer, MenuItems>> menuItemsMap = new HashMap<>();
        Map<Integer, MenuItems> chickenMap = new HashMap<>();
        Map<Integer, MenuItems> burgerMap = new HashMap<>();
        Map<Integer, MenuItems> sideMap = new HashMap<>();
        Map<Integer, MenuItems> drinkMap = new HashMap<>();

        int choice; // 메뉴 선택

        // 메뉴맵
        menuMap.put(1, new Menu("Chicken", "치킨입니다."));
        menuMap.put(2, new Menu("Hamburger", "햄버거입니다."));
        menuMap.put(3, new Menu("Side", "사이드입니다."));
        menuMap.put(4, new Menu("Drink", "음료입니다."));

        // 상품맵
        menuItemsMap.put(1, chickenMap);
        menuItemsMap.put(2, burgerMap);
        menuItemsMap.put(3, sideMap);
        menuItemsMap.put(4, drinkMap);

        // 치킨맵
        chickenMap.put(1, new MenuItems("갓양념블랙라벨", "KFC에서도 ‘양념 순살’을 먹고 싶다는 고객님들을 위해 준비했다! 블랙라벨 치킨의 변신! 닭다리 통살 블랙라벨이 갓양념과 만났다!", 3400));
        chickenMap.put(2, new MenuItems("갓양념치킨", "달콤 매콤, 먹을수록 땡기는 맵달의 조화 한국인 입맛에 딱 맞춘 환상의 양념치킨", 3300));
        chickenMap.put(3, new MenuItems("켄터키통다리순살치킨", "부드러운 닭다리 통살로 만든 최고급 프리미엄 치킨", 3100));
        chickenMap.put(4, new MenuItems("오리지널치킨", "KFC만의 11가지 비밀양념, 고압쿠킹 방식으로 육즙이 살아있어 촉촉 담백한 오리지널치킨", 3000));
        chickenMap.put(5, new MenuItems("핫크리스피치킨", "KFC만의 비법으로 매콤 바삭하게 튀겨낸 KFC 핫크리스피치킨", 3000));

        // 버거맵
        burgerMap.put(1, new MenuItems("캡새버거", "탱글탱글한 새우살이 콕콕 그 새우버거가 KFC에서 더 맛있게 나왔새우", 4300));
        burgerMap.put(2, new MenuItems("불고기버거", "달콤한 불고기 소스와 부드러운 패티로 더 맛있어진 불고기버거", 4300));
        burgerMap.put(3, new MenuItems("징거버거", "더 커진 닭가슴살필렛과 상큼한 토마토가 어우러진 대표 치킨버거", 5500));
        burgerMap.put(4, new MenuItems("켄터키통다리스파이시", "육즙가득 닭다리살에 스콜쳐소스로 매콤하게, 해시브라운으로 든든하게!", 7000));
        burgerMap.put(5, new MenuItems("블랙라벨폴인치즈버거", "부드러운 통닭다리살과 크림치즈, 고다치즈, 블루치즈의 완벽한 조화의 버거", 7700));

        // 사이드맵
        sideMap.put(1, new MenuItems("핫봉스틱(2조각)", "핫윙 출시 30주년 기념, 더 놀라운 맛으로 돌아온 핫봉스틱!", 3500));
        sideMap.put(2, new MenuItems("텐더(2조각)", "담백한 치킨 안심살로 만들어 깔끔하게 먹을 수 있는 KFC 순살 치킨스낵", 3000));
        sideMap.put(3, new MenuItems("너겟(4조각)", "순 닭고기살로 만들어 부드럽고 쫄깃한 치킨너겟", 2200));
        sideMap.put(4, new MenuItems("케이준후라이", "케이준 양념으로 더욱 고소하고 바삭해진 KFC 케이준후라이", 2300));
        sideMap.put(5, new MenuItems("롱치즈스틱", "100% 자연산 치즈가 길~게 늘어나는 고소한 롱치즈스틱", 2000));

        // 음료맵
        drinkMap.put(1, new MenuItems("코카콜라", "속까지 시원해지는 청량음료의 대표! 콜라", 2400));
        drinkMap.put(2, new MenuItems("스프라이트", "속까지 시원해지는 청량음료 스프라이트!", 2400));
        drinkMap.put(3, new MenuItems("아이스아메리카노", "KFC만의 고품질 원두를 사용해 향과 맛이 뛰어난 차가운 아메리카노", 2200));
        drinkMap.put(4, new MenuItems("아이스초코", "KFC에서 즐기는 달콤한 아이스초코", 2200));
        drinkMap.put(5, new MenuItems("오렌지주스", "KFC 오렌지주스", 2000));

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
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println();
                    System.out.println("[CHICKEN MENU]");
                    for (int i = 1; i <= chickenMap.size(); i++) {
                        MenuItems chickenGoods = chickenMap.get(i);
                        System.out.println(i + ". " + chickenGoods.getMenuName() + " \t|\t "
                                + chickenGoods.getMenuItemsPrice() + " \t|\t " + chickenGoods.getMenuDescription());
                    }
                    int chickenChoice = sc.nextInt();
                    System.out.println();

                    goodsChoiceMethod(sc, chickenMap, chickenChoice);
                    order.addToCart(chickenMap, chickenChoice);
                    break;

               // <2번 버거 상품>
                case 2:
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println();
                    System.out.println("[HAMBURGER MENU]");
                    for (int i = 1; i <= burgerMap.size(); i++) {
                        MenuItems burgerGoods = burgerMap.get(i);
                        System.out.println(i + ". " + burgerGoods.getMenuName() + " \t|\t "
                                + burgerGoods.getMenuItemsPrice() + " \t|\t " + burgerGoods.getMenuDescription());
                    }
                    int burgerChoice = sc.nextInt();
                    System.out.println();

                    goodsChoiceMethod(sc, burgerMap, burgerChoice);
                    order.addToCart(burgerMap, burgerChoice);
                    break;

                // <3번 사이드 상품>
                case 3:
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println();
                    System.out.println("[SIDE MENU]");
                    for (int i = 1; i <= sideMap.size(); i++) {
                        MenuItems sideGoods = sideMap.get(i);
                        System.out.println(i + ". " + sideGoods.getMenuName() + " \t|\t "
                                + sideGoods.getMenuItemsPrice() + " \t|\t " + sideGoods.getMenuDescription());
                    }
                    int sideChoice = sc.nextInt();
                    System.out.println();

                    goodsChoiceMethod(sc, sideMap, sideChoice);
                    order.addToCart(sideMap, sideChoice);
                    break;

                // <4번 음료 상품>
                case 4:
                    System.out.println("KFC에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                    System.out.println();
                    System.out.println("[DRINK MENU]");
                    for (int i = 1; i <= drinkMap.size(); i++) {
                        MenuItems drinkGoods = drinkMap.get(i);
                        System.out.println(i + ". " + drinkGoods.getMenuName() + " \t|\t "
                                + drinkGoods.getMenuItemsPrice() + " \t|\t " + drinkGoods.getMenuDescription());
                    }
                    int drinkChoice = sc.nextInt();
                    System.out.println();

                    goodsChoiceMethod(sc, drinkMap, drinkChoice);
                    order.addToCart(drinkMap, drinkChoice);
                    break;

                // <5번 주문하기>
                case 5:
                    System.out.println("아래와 같이 주문 하시겠습니까?");
                    System.out.println();
                    System.out.println("[Order Menu]");
                    order.getOrder();

                    System.out.println();
                    System.out.println("[Total]");
                    double totalPrice = order.totalOrder();
                    System.out.println(totalPrice);

                    System.out.println();
                    System.out.println("1. 주문 \t\t 2. 메뉴판");
                    int orderMenuChoice = sc.nextInt();

                    switch (orderMenuChoice) {
                        case 1:
                            System.out.println();
                            System.out.println("주문이 완료되었습니다!");
                            System.out.println();
                            System.out.println("대기번호는 [ 1 ] 번 입니다.");
                            System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
                            System.out.println();
                            order.clearOrder();
                            try {
                                Thread.sleep(3000); // 3초 대기
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 2:
                            System.out.println("메뉴판으로 돌아갑니다.");
                            System.out.println();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
                            System.out.println();
                    }
                    break;

                 // <6번 취소하기>
                case 6:
                    System.out.println("진행하던 주문을 취소하시겠습니까?");
                    System.out.println("1. 확인 \t\t 2. 취소");
                    int cancelChoice = sc.nextInt();
                    System.out.println();

                    switch (cancelChoice) {
                        case 1:
                            order.clearOrder();
                            System.out.println("진행하던 주문이 취소되었습니다.");
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("메뉴판으로 돌아갑니다.");
                            System.out.println();
                            break;
                    }
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
                    System.out.println();
            }
        }
    }

    // 장바구니 추가
    public static void goodsChoiceMethod(Scanner sc, Map<Integer, MenuItems> menuItemsMap, int goodsChoice) {
        int orderChoice;
        if (goodsChoice >= 1 && goodsChoice <= menuItemsMap.size()) {
            System.out.println(menuItemsMap.get(goodsChoice).getMenuName() + " \t|\t "
                    + menuItemsMap.get(goodsChoice).getMenuItemsPrice() + " \t|\t "
                    + menuItemsMap.get(goodsChoice).getMenuDescription());

            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인 \t\t 2. 취소");

            orderChoice = sc.nextInt();
            System.out.println();

            orderCheckMethod(menuItemsMap, goodsChoice, orderChoice);
        } else {
            System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
            System.out.println();
        }
    }

    // 장바구니 추가 확인
    public static void orderCheckMethod(Map<Integer, MenuItems> menuItemsMap, int goodsChoice, int orderChoice) {
        switch (orderChoice) {
            case 1:
                System.out.println(menuItemsMap.get(goodsChoice).getMenuName() + "이(가) 장바구니에 추가되었습니다.");
                System.out.println();
                break;
            case 2:
                System.out.println("취소되었습니다. 메뉴판으로 돌아갑니다.");
                System.out.println();
                break;
            default:
                System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
                System.out.println();
        }
    }
}