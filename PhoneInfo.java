class PhoneInfo
{
	String name;
	String phoneNumber;

	PhoneInfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName()
	{
		return name;
	}
	public void showInfo()
	{
		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}
}

class PhoneUnivInfo extends PhoneInfo
{
	String major;
	int year;

	PhoneUnivInfo(String name, String phoneNumber, String major, int year)
	{
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo
{
	String company;

	PhoneCompanyInfo(String name, String phoneNumber, String company)
	{
		super(name, phoneNumber);
		this.company = company;
	}
	public void showInfo()
	{
		super.showInfo();
		System.out.println("회사 : " + company);
	}
}