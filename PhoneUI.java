import java.util.Scanner;

class PhoneUI
{
	private static PhoneBook pb = PhoneBook.getPhoneBook();
	public static Scanner sc = new Scanner(System.in);

	public static void selectUI()
	{
		System.out.println();
		System.out.println("선택하세요.");
		System.out.println("1. 연락처 저장");
		System.out.println("2. 이름으로 찾기");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 모든 연락처 보기");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
	}

	public static void categoryUI()
	{
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택 >> ");
	}

	public static void generalInputUI()
	{
		String name, phoneNumber;

		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.println();
		if(pb.generalInput(name,phoneNumber))
			System.out.println("데이터 입력이 완료되었습니다");
		else
			System.out.println("더이상 입력할 수 없습니다.");
	}
	public static void univInputUI()
	{
		String name, phoneNumber, major;
		int year;

		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("전공 : ");
		major = sc.nextLine();
		System.out.print("학년 : ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.println();
		if(pb.univInput(name,phoneNumber,major,year))
			System.out.println("데이터 입력이 완료되었습니다");
		else
			System.out.println("더이상 입력할 수 없습니다.");
	}
	public static void companyInputUI()
	{
		String name, phoneNumber, company;

		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("회사 : ");
		company = sc.nextLine();
		System.out.println();
		if(pb.companyInput(name,phoneNumber,company))
			System.out.println("데이터 입력이 완료되었습니다");
		else
			System.out.println("더이상 입력할 수 없습니다.");
	}

	public static void searchUI()
	{
		String name;

		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름 : ");
		name = sc.nextLine();
		if(pb.searchInfo(name)) System.out.println("데이터 검색이 완료되었습니다.");
		else System.out.println("입력하신 이름과 일치하는 정보가 없습니다.");
	}

	public static void deleteUI()
	{
		String name;

		System.out.println("데이터 삭제를 시작합니다.");
		System.out.print("이름 : ");
		name = sc.nextLine();
		if(pb.deleteInfo(name)) System.out.println("데이터 삭제가 완료되었습니다.");
		else System.out.println("입력하신 이름과 일치하는 정보가 없습니다.");
	}

	public static void showAllUI()
	{
		System.out.println("저장된 모든 정보를 표시합니다.");
		if(!pb.showAll()) System.out.println("저장된 정보가 존재하지 않습니다.");
	}

	public static void exitUI()
	{
		System.out.println("정말 종료하시겠습니까?");
		System.out.println("1. YES          2. NO");
		
	}

	public static void wrongUI()
	{
		System.out.println("잘못 입력하셨습니다.");
	}
}