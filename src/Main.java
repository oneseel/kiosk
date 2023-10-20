import java.util.ArrayList;
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

        int waitingNumber = 0; // 대기 번호

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
        chickenMap.put(1, new MenuItems("갓양념블랙라벨", "KFC에서도 ‘양념 순살’을 먹고 싶다는 고객님들을 위해 준비했다! 블랙라벨 치킨의 변신! 닭다리 통살 블랙라벨이 갓양념과 만났다!", 3400, 1));
        chickenMap.put(2, new MenuItems("갓양념치킨", "달콤 매콤, 먹을수록 땡기는 맵달의 조화 한국인 입맛에 딱 맞춘 환상의 양념치킨", 3300, 1));
        chickenMap.put(3, new MenuItems("켄터키통다리순살치킨", "부드러운 닭다리 통살로 만든 최고급 프리미엄 치킨", 3100, 1));
        chickenMap.put(4, new MenuItems("오리지널치킨", "KFC만의 11가지 비밀양념, 고압쿠킹 방식으로 육즙이 살아있어 촉촉 담백한 오리지널치킨", 3000, 1));
        chickenMap.put(5, new MenuItems("핫크리스피치킨", "KFC만의 비법으로 매콤 바삭하게 튀겨낸 KFC 핫크리스피치킨", 3000, 1));

        // 버거맵
        burgerMap.put(1, new MenuItems("캡새버거", "탱글탱글한 새우살이 콕콕 그 새우버거가 KFC에서 더 맛있게 나왔새우", 4300, 1));
        burgerMap.put(2, new MenuItems("불고기버거", "달콤한 불고기 소스와 부드러운 패티로 더 맛있어진 불고기버거", 4300, 1));
        burgerMap.put(3, new MenuItems("징거버거", "더 커진 닭가슴살필렛과 상큼한 토마토가 어우러진 대표 치킨버거", 5500, 1));
        burgerMap.put(4, new MenuItems("켄터키통다리스파이시", "육즙가득 닭다리살에 스콜쳐소스로 매콤하게, 해시브라운으로 든든하게!", 7000, 1));
        burgerMap.put(5, new MenuItems("블랙라벨폴인치즈버거", "부드러운 통닭다리살과 크림치즈, 고다치즈, 블루치즈의 완벽한 조화의 버거", 7700, 1));

        // 사이드맵
        sideMap.put(1, new MenuItems("핫봉스틱", "핫윙 출시 30주년 기념, 더 놀라운 맛으로 돌아온 핫봉스틱!", 3500, 1));
        sideMap.put(2, new MenuItems("텐더", "담백한 치킨 안심살로 만들어 깔끔하게 먹을 수 있는 KFC 순살 치킨스낵", 3000, 1));
        sideMap.put(3, new MenuItems("너겟", "순 닭고기살로 만들어 부드럽고 쫄깃한 치킨너겟", 2200, 1));
        sideMap.put(4, new MenuItems("케이준후라이", "케이준 양념으로 더욱 고소하고 바삭해진 KFC 케이준후라이", 2300, 1));
        sideMap.put(5, new MenuItems("롱치즈스틱", "100% 자연산 치즈가 길~게 늘어나는 고소한 롱치즈스틱", 2000, 1));

        // 음료맵
        drinkMap.put(1, new MenuItems("코카콜라", "속까지 시원해지는 청량음료의 대표! 콜라", 2400, 1));
        drinkMap.put(2, new MenuItems("스프라이트", "속까지 시원해지는 청량음료 스프라이트!", 2400, 1));
        drinkMap.put(3, new MenuItems("아이스아메리카노", "KFC만의 고품질 원두를 사용해 향과 맛이 뛰어난 차가운 아메리카노", 2200, 1));
        drinkMap.put(4, new MenuItems("아이스초코", "KFC에서 즐기는 달콤한 아이스초코", 2200, 1));
        drinkMap.put(5, new MenuItems("오렌지주스", "KFC 오렌지주스", 2000, 1));

        // 옵션맵(치킨)
        MenuItems chickenItem1 = chickenMap.get(1);
        chickenItem1.addOption(1, new Option("갓양념블랙라벨(1조각)", 3400));
        chickenItem1.addOption(2, new Option("갓양념블랙라벨(3조각)", 9900));
        chickenItem1.addOption(3, new Option("갓양념블랙라벨(5조각)", 16200));
        chickenItem1.addOption(4, new Option("갓양념블랙라벨(8조각)", 25200));

        MenuItems chickenItem2 = chickenMap.get(2);
        chickenItem2.addOption(1, new Option("갓양념치킨(1조각)", 3300));
        chickenItem2.addOption(2, new Option("갓양념치킨(3조각)", 9600));
        chickenItem2.addOption(3, new Option("갓양념치킨(5조각)", 15700));
        chickenItem2.addOption(4, new Option("갓양념치킨(8조각)", 24200));

        MenuItems chickenItem3 = chickenMap.get(3);
        chickenItem3.addOption(1, new Option("켄터키통다리순살치킨(1조각)", 3100));
        chickenItem3.addOption(2, new Option("켄터키통다리순살치킨(3조각)", 9000));
        chickenItem3.addOption(3, new Option("켄터키통다리순살치킨(5조각)", 14700));
        chickenItem3.addOption(4, new Option("켄터키통다리순살치킨(8조각)", 22800));

        MenuItems chickenItem4 = chickenMap.get(4);
        chickenItem4.addOption(1, new Option("오리지널치킨(1조각)", 3000));
        chickenItem4.addOption(2, new Option("오리지널치킨(3조각)", 8700));
        chickenItem4.addOption(3, new Option("오리지널치킨(5조각)", 14200));
        chickenItem4.addOption(4, new Option("오리지널치킨(8조각)", 22000));

        MenuItems chickenItem5 = chickenMap.get(5);
        chickenItem5.addOption(1, new Option("핫크리스피치킨(1조각)", 3000));
        chickenItem5.addOption(2, new Option("핫크리스피치킨(3조각)", 8700));
        chickenItem5.addOption(3, new Option("핫크리스피치킨(5조각)", 14200));
        chickenItem5.addOption(4, new Option("핫크리스피치킨(8조각)", 22000));

        // 옵션맵(버거)
        MenuItems burgerItem1 = burgerMap.get(1);
        burgerItem1.addOption(1, new Option("캡새버거(단품)", 4300));
        burgerItem1.addOption(2, new Option("캡새버거(세트)", 6600));

        MenuItems burgerItem2 = burgerMap.get(2);
        burgerItem2.addOption(1, new Option("불고기버거(단품)", 4300));
        burgerItem2.addOption(2, new Option("불고기버거(세트)", 6600));

        MenuItems burgerItem3 = burgerMap.get(3);
        burgerItem3.addOption(1, new Option("징거버거(단품)", 5500));
        burgerItem3.addOption(2, new Option("징거버거(세트)", 7800));

        MenuItems burgerItem4 = burgerMap.get(4);
        burgerItem4.addOption(1, new Option("켄터키통다리스파이시(단품)", 7000));
        burgerItem4.addOption(2, new Option("켄터키통다리스파이시(세트)", 9300));

        MenuItems burgerItem5 = burgerMap.get(5);
        burgerItem5.addOption(1, new Option("블랙라벨폴인치즈버거(단품)", 7700));
        burgerItem5.addOption(2, new Option("블랙라벨폴인치즈버거(세트)", 10000));

        // 옵션맵(사이드)
        MenuItems sideItem1 = sideMap.get(1);
        sideItem1.addOption(1, new Option("핫봉스틱(2조각)", 3500));
        sideItem1.addOption(2, new Option("핫봉스틱(4조각)", 6900));

        MenuItems sideItem2 = sideMap.get(2);
        sideItem2.addOption(1, new Option("텐더(2조각)", 3000));
        sideItem2.addOption(2, new Option("텐더(4조각)", 5800));

        MenuItems sideItem3 = sideMap.get(3);
        sideItem3.addOption(1, new Option("너겟(4조각)", 2200));
        sideItem3.addOption(2, new Option("너겟(6조각)", 3100));
        sideItem3.addOption(3, new Option("너겟(10조각)", 5100));

        MenuItems sideItem4 = sideMap.get(4);
        sideItem4.addOption(1, new Option("케이준후라이(M)", 2300));
        sideItem4.addOption(2, new Option("케이준후라이(L)", 2800));

        // 옵션맵(음료)
        MenuItems drinkItem1 = drinkMap.get(1);
        drinkItem1.addOption(1, new Option("코카콜라(L)", 2400));
        drinkItem1.addOption(2, new Option("코카콜라(M)", 2200));

        MenuItems drinkItem2 = drinkMap.get(2);
        drinkItem2.addOption(1, new Option("스프라이트(L)", 2400));
        drinkItem2.addOption(2, new Option("스프라이트(M)", 2200));

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

            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                // <1번 치킨 상품>
                case 1:
                    int chickenChoice = menuItems("[CHICKEN MENU]", chickenMap, sc);

                    menuItemsChoiceMethod(sc, chickenMap, chickenChoice, order);
                    break;

               // <2번 버거 상품>
                case 2:
                    int burgerChoice = menuItems("[HAMBURGER MENU]", burgerMap, sc);

                    menuItemsChoiceMethod(sc, burgerMap, burgerChoice, order);
                    break;

                // <3번 사이드 상품>
                case 3:
                    int sideChoice = menuItems("[SIDE MENU]", sideMap, sc);

                    menuItemsChoiceMethod(sc, sideMap, sideChoice, order);
                    break;

                // <4번 음료 상품>
                case 4:
                    int drinkChoice = menuItems("[DRINK MENU]", drinkMap, sc);

                    menuItemsChoiceMethod(sc, drinkMap, drinkChoice, order);
                    break;

                // <5번 주문하기>
                case 5:
                    System.out.println("아래와 같이 주문 하시겠습니까?");
                    System.out.println();
                    System.out.println("[Order Menu]");
                    order.getOrder();

                    System.out.println();
                    System.out.println("[Total]");
                    int totalPrice = order.totalOrder();
                    System.out.println(totalPrice);

                    System.out.println();
                    System.out.println("1. 주문 \t\t 2. 메뉴판");
                    int orderMenuChoice = sc.nextInt();

                    switch (orderMenuChoice) {
                        case 1:
                            System.out.println();
                            System.out.println("주문이 완료되었습니다!");
                            System.out.println();
                            waitingNumber++;

                            System.out.println("대기번호는 [ " + waitingNumber + " ] 번 입니다.");
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
                        default:
                            System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
                            System.out.println();
                    }
                    break;

                // <0번 총 판매금액 조회>
                case 0:
                    ArrayList<MenuItems> soldItems = order.getSoldItems();
                    if (soldItems.isEmpty()) {
                        System.out.println("아직 판매된 상품이 없습니다.");
                    } else {
                        System.out.println("총 판매 상품 목록:");
                        for (MenuItems item : soldItems) {
                            System.out.println(item.getMenuName() + " \t|\t " + item.getMenuItemsPrice() +
                                    "원 \t|\t " + item.getSoldCount());
                        }
                    }
                    System.out.println();
                    int sales = order.getTotalSales();
                    System.out.println("현재까지 총 판매된 금액은 " + sales + "원 입니다.");
                    System.out.println();
                    System.out.println("1. 돌아가기");
                    int saleChoice = sc.nextInt();
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
                    System.out.println();
            }
        }
    }

    // 상품메뉴판 메서드
    private static int menuItems(String x, Map<Integer, MenuItems> menuItemsMap, Scanner sc) {
        System.out.println("KFC에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println(x);
        for (int i = 1; i <= menuItemsMap.size(); i++) {
            MenuItems item = menuItemsMap.get(i);
            System.out.println(i + ". " + item.getMenuName() + " \t|\t "
                    + item.getMenuItemsPrice() + "원" + " \t|\t " + item.getMenuDescription());
        }
        int menuItemsChoice = sc.nextInt();
        System.out.println();
        return menuItemsChoice;
    }

    // 장바구니 추가 메서드
    public static void menuItemsChoiceMethod(Scanner sc, Map<Integer, MenuItems> menuItemsMap, int menuItemsChoice, Order order) {
        if (menuItemsChoice >= 1 && menuItemsChoice <= menuItemsMap.size()) {
            MenuItems selectedMenuItem = menuItemsMap.get(menuItemsChoice);

            System.out.println(selectedMenuItem.getMenuName() + " \t|\t "
                    + selectedMenuItem.getMenuItemsPrice() + " \t|\t " + selectedMenuItem.getMenuDescription());

            // 옵션을 가지고 있는지 확인
            if (!selectedMenuItem.getOptionMap().isEmpty()) {
                System.out.println("위 메뉴의 어떤 옵션으로 추가하시겠습니까?");
                for (Map.Entry<Integer, Option> entry : selectedMenuItem.getOptionMap().entrySet()) {
                    Option option = entry.getValue();
                    System.out.println(entry.getKey() + ". " + option.getOptionName() + " \t|\t " +
                            option.getOptionPrice() + "원");
                }

                int optionChoice = sc.nextInt();

                if (optionChoice >= 1 && optionChoice <= selectedMenuItem.getOptionMap().size()) {
                    Option selectedOption = selectedMenuItem.getOptionMap().get(optionChoice);
                    MenuItems newItem = new MenuItems(selectedMenuItem.getMenuName(), selectedMenuItem.getMenuDescription(), selectedOption.getOptionPrice(), selectedMenuItem.getMenuItemCount());
                    order.addToCart(newItem);
                    System.out.println(newItem.getMenuName() + " - " + selectedOption.getOptionName() + "이(가) 장바구니에 추가되었습니다.");
                    System.out.println();
                } else {
                    System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
                    System.out.println();
                }
            } else {
                // 옵션이 없는 경우 메뉴를 그대로 추가
                MenuItems newItem = new MenuItems(selectedMenuItem.getMenuName(), selectedMenuItem.getMenuDescription(), selectedMenuItem.getMenuItemsPrice(), selectedMenuItem.getMenuItemCount());
                order.addToCart(newItem);
                System.out.println(newItem.getMenuName() + "이(가) 장바구니에 추가되었습니다.");
                System.out.println();
            }
        } else {
            System.out.println("잘못된 입력입니다. 메뉴판으로 돌아갑니다.");
            System.out.println();
        }
    }

    // 장바구니 추가 확인 메서드
    public static void orderCheckMethod(Map<Integer, MenuItems> menuItemsMap, int menuItemsChoice, int orderChoice) {
        switch (orderChoice) {
            case 1:
                System.out.println(menuItemsMap.get(menuItemsChoice).getMenuName() + "이(가) 장바구니에 추가되었습니다.");
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