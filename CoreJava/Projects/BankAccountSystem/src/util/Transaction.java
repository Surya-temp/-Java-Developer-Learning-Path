package util;

import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
	private String transactionId;
	private String type;
	private double amount;
	private LocalDateTime dateTime;
	
	public Transaction(String type, double amount) {
		this.transactionId=UUID.randomUUID().toString();
		this.type=type;
		this.amount=amount;
		this.dateTime=LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + dateTime + "] " + type + ": ₹" + amount + " (ID: " + transactionId + ")";
	}
}
