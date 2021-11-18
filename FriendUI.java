import java.util.Scanner;

class FriendUI
{
	public static Scanner sc = new Scanner(System.in);
	private static FriendManager mng = FriendManager.getManager();

	public static void selectUI()
	{
		System.out.println();
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 고교 정보 저장");
		System.out.println("2. 대학 친구 저장");
		System.out.println("3. 전체 정보 출력");
		System.out.println("4. 전체 기본 정보 출력");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택>> ");
	}

	public static void inputHighUI()
	{
		String name, phoneNumber, address, workPlace;
		System.out.println("고교 친구 정보를 저장합니다.");
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("주소 : ");
		address = sc.nextLine();
		System.out.print("직장 : ");
		workPlace = sc.nextLine();
		mng.inputHigh(name, phoneNumber, address, workPlace);
		System.out.println("입력하신 고교 친구 정보가 저장되었습니다.");
	}

	public static void inputUnivUI()
	{
		String name, phoneNumber, address, major;
		System.out.println("대학 친구 정보를 저장합니다.");
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("주소 : ");
		address = sc.nextLine();
		System.out.print("전공 : ");
		major = sc.nextLine();
		mng.inputUniv(name, phoneNumber, address, major);
		System.out.println("입력하신 대학 친구 정보가 저장되었습니다.");
	}

	public static void showAllDataUI()
	{
		System.out.println("저장된 모든 친구의 전체 정보를 표시합니다.");
		mng.showAllData();
	}

	public static void showBasicInfoUI()
	{
		System.out.println("저장된 모든 친구의 기본 데이터를 표시합니다.");
		mng.showBasicInfo();
	}
}