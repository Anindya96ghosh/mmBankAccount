public class PaymentGateway {
	
		public static boolean transfer(Account sender, Account reciever, double amount) 
		{
			
			boolean status;
			if(sender.getBalance() == amount) {
				status = true;
			}
			else {
				status = false;
			}
			return status;
		}
}