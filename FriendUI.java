import java.util.Scanner;

class FriendUI
{
	public static Scanner sc = new Scanner(System.in);
	private static FriendManager mng = FriendManager.getManager();

	public static void selectUI()
	{
		System.out.println();
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. �� ���� ����");
		System.out.println("2. ���� ģ�� ����");
		System.out.println("3. ��ü ���� ���");
		System.out.println("4. ��ü �⺻ ���� ���");
		System.out.println("5. ���α׷� ����");
		System.out.print("����>> ");
	}

	public static void inputHighUI()
	{
		String name, phoneNumber, address, workPlace;
		System.out.println("�� ģ�� ������ �����մϴ�.");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phoneNumber = sc.nextLine();
		System.out.print("�ּ� : ");
		address = sc.nextLine();
		System.out.print("���� : ");
		workPlace = sc.nextLine();
		mng.inputHigh(name, phoneNumber, address, workPlace);
		System.out.println("�Է��Ͻ� �� ģ�� ������ ����Ǿ����ϴ�.");
	}

	public static void inputUnivUI()
	{
		String name, phoneNumber, address, major;
		System.out.println("���� ģ�� ������ �����մϴ�.");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phoneNumber = sc.nextLine();
		System.out.print("�ּ� : ");
		address = sc.nextLine();
		System.out.print("���� : ");
		major = sc.nextLine();
		mng.inputUniv(name, phoneNumber, address, major);
		System.out.println("�Է��Ͻ� ���� ģ�� ������ ����Ǿ����ϴ�.");
	}

	public static void showAllDataUI()
	{
		System.out.println("����� ��� ģ���� ��ü ������ ǥ���մϴ�.");
		mng.showAllData();
	}

	public static void showBasicInfoUI()
	{
		System.out.println("����� ��� ģ���� �⺻ �����͸� ǥ���մϴ�.");
		mng.showBasicInfo();
	}
}