package com.phoenix.inner;
//outer class
public class Account {
	
	private int accNo;
	private String ownerName;
	private float balance;
	private static int count;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String ownerName, float balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void printDetails() {
		System.out.println("accNo: "+accNo+
							"ownerName: "+ownerName+
							"balance:" +balance);
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	//non-static inner class
	public  class Locker{
		private int lockerId;
		private String label;
		
		public Locker() {
			// TODO Auto-generated constructor stub
		}

		public Locker(int lockerId, String label) {
			super();
			this.lockerId = lockerId;
			this.label = label;
		}
		public void lock() {
			System.out.println("Locked Acount No: "+accNo);
		
		}
		public void unlock() {
			System.out.println("Unlocked Account No: "+accNo);
		}
		public void keepThings() {
			System.out.println("Things are kept in locker");
		}//end of Locker inner class

	
}//end of Account outer class
	
	
	
	
	
	
	
	
	
	
	
	
}
