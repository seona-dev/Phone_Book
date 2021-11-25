class PhoneBook
{
	private PhoneInfo[] infoArr;
	private static PhoneBook pb;
	private final int MAX_SIZE = 100;
	private int cnt = 0;

	private PhoneBook()
	{
		infoArr = new PhoneInfo[MAX_SIZE];
	}
	public static PhoneBook getPhoneBook()
	{
		if(pb == null)
			pb = new PhoneBook();
		return pb;
	}

	public int search(String name)
	{
		int start = 0;
		int end = cnt -1;
		int mid = (start + end) / 2;

		while(start <= end)
		{
			if(infoArr[mid].getName().compareTo(name) == 0) return mid;
			if(infoArr[mid].getName().compareTo(name) < 0) start = mid + 1;
			else end = mid - 1;
			mid = (start + end) / 2;
		}
		return -1;
	}

	public boolean generalInput(String name, String phoneNumber)
	{
		int idx = 0;

		if(cnt>=MAX_SIZE) return false;
		else
		{
			for(idx=0;idx<cnt;idx++)
			{
				if(infoArr[idx].getName().compareTo(name)>0) break;
			}
			for(int i=cnt;i>idx;i--)
			{
				infoArr[i] = infoArr[i-1];
			}
			infoArr[idx] = new PhoneInfo(name, phoneNumber);
			cnt++;
			return true;
		}
	}
	public boolean univInput(String name, String phoneNumber, String major, int year)
	{
		int idx = 0;

		if(cnt>=MAX_SIZE) return false;
		else
		{
			for(idx=0;idx<cnt;idx++)
			{
				if(infoArr[idx].getName().compareTo(name)>0) break;
			}
			for(int i=cnt;i>idx;i--)
			{
				infoArr[i] = infoArr[i-1];
			}
			infoArr[idx] = new PhoneUnivInfo(name, phoneNumber, major, year);
			cnt++;
			return true;
		}
	}
	public boolean companyInput(String name, String phoneNumber, String company)
	{
		int idx = 0;

		if(cnt>=MAX_SIZE) return false;
		else
		{
			for(idx=0;idx<cnt;idx++)
			{
				if(infoArr[idx].getName().compareTo(name)>0) break;
			}
			for(int i=cnt;i>idx;i--)
			{
				infoArr[i] = infoArr[i-1];
			}
			infoArr[idx] = new PhoneCompanyInfo(name, phoneNumber, company);
			cnt++;
			return true;
		}
	}

	public boolean searchInfo(String name)
	{
		int idx = search(name);

		if(idx == -1) return false;
		else
		{
			infoArr[idx].showInfo();
			return true;
		}
	}

	public boolean deleteInfo(String name)
	{
		int idx = search(name);

		if(idx == -1) return false;
		else
		{
			for(int i=idx;i<cnt-1;i++)
			{
				infoArr[i] = infoArr[i+1];
			}
			infoArr[cnt-1] = null;
			cnt--;
			return true;
		}
	}

	public boolean showAll()
	{
		if(cnt==0) return false;
		else
		{
			for(int i=0;i<cnt;i++)
				infoArr[i].showInfo();
			return true;
		}
	}
}