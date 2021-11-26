import java.util.Scanner;

class NumberException extends Exception
{
	int number;

	NumberException(int number)
	{
		this.number = number;
	}
	public String getMessage()
	{
		return number+"에 해당하는 선택은 존재하지 않습니다.";
	}
}

interface Menu
{
	int INPUT_INFO = 1;
	int SEARCH_INFO = 2;
	int DELETE_INFO = 3;
	int SHOW_ALL = 4;
	int EXIT_PROGRAM = 5;

	int GENERAL = 1;
	int UNIV = 2;
	int COMPANY = 3;

	int YES = 1;
	int NO = 2;
}

class PhoneMain implements Menu
{
	public static void main(String[] args)
	{
		Scanner sc = PhoneUI.sc;

		while(true)
		{
			try{
				PhoneUI.selectUI();
				int select = sc.nextInt();
				sc.nextLine();
				System.out.println();

				switch(select)
				{
				case INPUT_INFO :
					PhoneUI.categoryUI();
					int category = sc.nextInt();
					sc.nextLine();
					System.out.println();
					switch(category)
					{
					case GENERAL:
						PhoneUI.generalInputUI();
						break;
					case UNIV:
						PhoneUI.univInputUI();
						break;
					case COMPANY:
						PhoneUI.companyInputUI();
						break;
					default:
						throw new NumberException(category);
					}
					break;
				case SEARCH_INFO : 
					PhoneUI.searchUI();
					break;
				case DELETE_INFO :
					PhoneUI.deleteUI();
					break;
				case SHOW_ALL :
					PhoneUI.showAllUI();
					break;
				case EXIT_PROGRAM :
					PhoneUI.exitUI();
					int exit = sc.nextInt();
					sc.nextLine();
					switch(exit)
					{
					case YES : 
						System.out.println("프로그램을 종료합니다.");
						sc.close();
						return;
					case NO : 
						System.out.println("메뉴 화면으로 돌아갑니다.");
						break;
					default :
						throw new NumberException(exit);
					}
					break;
				default:
					throw new NumberException(select);
				}
			} catch (NumberException e) {
				System.out.println(e.getMessage());
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
			}
		}
	}
}