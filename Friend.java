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
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phoneNumber);
		System.out.println("주소 : "+address);
	}

	public void showBasicInfo()
	{
		System.out.println();
		System.out.println("이름 : "+name);
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
		System.out.println("직장 : "+workPlace);
	}

	public void showBasicInfo()
	{
		super.showBasicInfo();
		System.out.println("전화번호 : "+super.getPhoneNumber());
		System.out.println("직장 : "+workPlace);
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
		System.out.println("전공 : "+major);
	}

	public void showBasicInfo()
	{
		super.showBasicInfo();
		System.out.println("전공 : "+major);
	}
}