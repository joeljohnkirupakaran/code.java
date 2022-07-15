package week1.day3assignment;

public class MyMobile {
	String name = "john";
	long contactnumber = 987654321l;
	int extension = 91;

	public void makeCall() {
		System.out.println("make a call");
	}

	public void sendMsg() {
		System.out.println("send msg to");
	}

	private void payBills() {
		System.out.println("bill amount is 650");
	}

	public static void main(String[] args) {
		MyMobile mobile = new MyMobile();
		System.out.println(mobile.name);
		System.out.println(mobile.extension);
		System.out.println(mobile.contactnumber);
		mobile.makeCall();
		mobile.payBills();
		mobile.sendMsg();
	}

}
