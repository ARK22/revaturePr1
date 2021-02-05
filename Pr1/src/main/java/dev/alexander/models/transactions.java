package dev.alexander.models;

public class transactions {

	private int transaction_id;
	private double amount;
	private int form_id;
	private String date;

	public transactions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public transactions(int transaction_id, double amount, int form_id, String date) {
		super();
		this.transaction_id = transaction_id;
		this.amount = amount;
		this.form_id = form_id;
		this.date = date;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getForm_id() {
		return form_id;
	}

	public void setForm_id(int form_id) {
		this.form_id = form_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "transactions [transaction_id=" + transaction_id + ", amount=" + amount + ", form_id=" + form_id
				+ ", date=" + date + "]";
	}

}
