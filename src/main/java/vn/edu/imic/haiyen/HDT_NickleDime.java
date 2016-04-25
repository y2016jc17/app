package vn.edu.imic.haiyen;

public class HDT_NickleDime extends HDT_Account {
	private static final float FEE = (float) 0.5;
	protected int withdrawCount;

	@Override
	protected void endMonth() {
		// double count = this.endMonthCharge();
		// this.balance -= count;
		// System.out.println("So tien con lai trong tai khoan: " +
		// this.balance);
		// System.out.println("Tong so giao dich: " + this.transactions);
		super.endMonth();
		this.withdrawCount = 0;
	};

	@Override
	protected double endMonthCharge() {
		// TODO Auto-generated method stub
		double fee = this.withdrawCount * FEE;
		this.withdrawCount = 0;
		return fee;
	}

	@Override
	protected void withdraw(double amount) {
		// this.balance -= amount;// amount >0
		super.withdraw(amount);
		withdrawCount++;

	}

}
