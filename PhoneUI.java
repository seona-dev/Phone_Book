import java.util.Scanner;

class PhoneUI
{
	private static PhoneBook pb = PhoneBook.getPhoneBook();
	public static Scanner sc = new Scanner(System.in);

	public static void selectUI()
	{
		System.out.println();
		System.out.println("�����ϼ���.");
		System.out.println("1. ����ó ����");
		System.out.println("2. �̸����� ã��");
		System.out.println("3. ����ó ����");
		System.out.println("4. ��� ����ó ����");
		System.out.println("5. ���α׷� ����");
		System.out.print("���� : ");
	}

	public static void categoryUI()
	{
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("���� >> ");
	}

	public static void generalInputUI()
	{
		String name, phoneNumber;

		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phoneNumber = sc.nextLine();
		System.out.println();
		if(pb.generalInput(name,phoneNumber))
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�");
		else
			System.out.println("���̻� �Է��� �� �����ϴ�.");
	}
	public static void univInputUI()
	{
		String name, phoneNumber, major;
		int year;

		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phoneNumber = sc.nextLine();
		System.out.print("���� : ");
		major = sc.nextLine();
		System.out.print("�г� : ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.println();
		if(pb.univInput(name,phoneNumber,major,year))
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�");
		else
			System.out.println("���̻� �Է��� �� �����ϴ�.");
	}
	public static void companyInputUI()
	{
		String name, phoneNumber, company;

		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phoneNumber = sc.nextLine();
		System.out.print("ȸ�� : ");
		company = sc.nextLine();
		System.out.println();
		if(pb.companyInput(name,phoneNumber,company))
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�");
		else
			System.out.println("���̻� �Է��� �� �����ϴ�.");
	}

	public static void searchUI()
	{
		String name;

		System.out.println("������ �˻��� �����մϴ�.");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		if(pb.searchInfo(name)) System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.");
		else System.out.println("�Է��Ͻ� �̸��� ��ġ�ϴ� ������ �����ϴ�.");
	}

	public static void deleteUI()
	{
		String name;

		System.out.println("������ ������ �����մϴ�.");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		if(pb.deleteInfo(name)) System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
		else System.out.println("�Է��Ͻ� �̸��� ��ġ�ϴ� ������ �����ϴ�.");
	}

	public static void showAllUI()
	{
		System.out.println("����� ��� ������ ǥ���մϴ�.");
		if(!pb.showAll()) System.out.println("����� ������ �������� �ʽ��ϴ�.");
	}

	public static void exitUI()
	{
		System.out.println("���� �����Ͻðڽ��ϱ�?");
		System.out.println("1. YES          2. NO");
		
	}

	public static void wrongUI()
	{
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
}