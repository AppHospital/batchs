package fr.alm.app_hospital;

public class Jira {

	private String cardNumber;
	private String description;
	private String inChargeOf;

	public Jira() {
	}

	public Jira(String cardNumber, String description, String inChargeOf) {
		super();
		this.cardNumber = cardNumber;
		this.description = description;
		this.inChargeOf = inChargeOf;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInChargeOf() {
		return inChargeOf;
	}

	public void setInChargeOf(String inChargeOf) {
		this.inChargeOf = inChargeOf;
	}

}
