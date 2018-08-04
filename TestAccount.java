public class TestAccount {

	public static void main(String[] args) {
		
		Account anindya = new Account("Anindya",1000);
		System.out.println(anindya);
		int next = Account.getNextAccountNumber();
		System.out.println(next);
		Account name = new Account("name");
		System.out.println(name);
		next = Account.getNextAccountNumber();
		System.out.println(next);
		String result = anindya.transaction(name, 200);
		System.out.println(result);
		result = anindya.transaction(name, anindya.getBalance());
		System.out.println(result);
	}

}