import java.util.Scanner;

class FriendMain
{
	private static final int INPUT_HIGH_FRIEND = 1;
	private static final int INPUT_UNIV_FRIEND = 2;
	private static final int SHOW_ALL_INFO = 3;
	private static final int SHOW_BASIC_DATA = 4;
	private static final int QUIT_THIS_PROGRAM = 5;

	public static void main(String[] args)
	{
		Scanner sc = FriendUI.sc;
		int selectNum = 0;

		while(true)
		{
			FriendUI.selectUI();
			selectNum = sc.nextInt();
			sc.nextLine();

			switch(selectNum)
			{
			case INPUT_HIGH_FRIEND:
				FriendUI.inputHighUI();
				break;				
			case INPUT_UNIV_FRIEND:
				FriendUI.inputUnivUI();
				break;
			case SHOW_ALL_INFO:
				FriendUI.showAllDataUI();
				break;				
			case SHOW_BASIC_DATA:
				FriendUI.showBasicInfoUI();
				break;
			case QUIT_THIS_PROGRAM:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
		}
	}
}