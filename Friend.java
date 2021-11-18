class Friend
{
	private String name;
	private String phoneNumber;
	private String address;

	Friend(String name, String phoneNumber, String address)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public void showData()
	{
		System.out.println();
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ��ȣ : "+phoneNumber);
		System.out.println("�ּ� : "+address);
	}

	public void showBasicInfo()
	{
		System.out.println();
		System.out.println("�̸� : "+name);
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}
}

class HighFriend extends Friend
{
	private String workPlace;

	HighFriend(String name, String phoneNumber, String address, String workPlace)
	{
		super(name, phoneNumber, address);
		this.workPlace = workPlace;
	}

	public void showData()
	{
		super.showData();
		System.out.println("���� : "+workPlace);
	}

	public void showBasicInfo()
	{
		super.showBasicInfo();
		System.out.println("��ȭ��ȣ : "+super.getPhoneNumber());
		System.out.println("���� : "+workPlace);
	}
}

class UnivFriend extends Friend
{
	private String major;

	UnivFriend(String name, String phoneNumber, String address, String major)
	{
		super(name, phoneNumber, address);
		this.major = major;
	}

	public void showData()
	{
		super.showData();
		System.out.println("���� : "+major);
	}

	public void showBasicInfo()
	{
		super.showBasicInfo();
		System.out.println("���� : "+major);
	}
}