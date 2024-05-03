package postmortem;

enum AccountType{
	SAVING, FIXED, CURRENT, LONG;
	private AccountType(){
		System.out.println("It is a account type");
	}
}