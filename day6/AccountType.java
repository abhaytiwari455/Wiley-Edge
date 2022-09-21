
public enum AccountType {

	
	SAVINGS(10),CURRENT(5);
	
	int interest;
	AccountType(int interest) {
		// TODO Auto-generated constructor stub
		this.interest=interest;
	}
	
	public int getInterestRate() {
		return interest;
	}
}