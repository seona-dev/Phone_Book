class FriendManager
{
	private static FriendManager mng;
	private Friend[] fArr = null;

	int cnt = 0;

	private FriendManager()
	{
		fArr = new Friend[100];
	}
	
	public static FriendManager getManager()
	{
		if(mng == null)
		{
			mng = new FriendManager();
		}
		return mng;
	}

	public void inputHigh(String name, String phoneNumber, String address, String workPlace)
	{
		fArr[cnt++] = new HighFriend(name, phoneNumber, address, workPlace);
	}

	public void inputUniv(String name, String phoneNumber, String address, String major)
	{
		fArr[cnt++] = new UnivFriend(name, phoneNumber, address, major);
	}

	public void showAllData()
	{
		for(int i=0;i<cnt;i++)
			fArr[i].showData();
	}

	public void showBasicInfo()
	{
		for(int i=0;i<cnt;i++)
			fArr[i].showBasicInfo();
	}
}