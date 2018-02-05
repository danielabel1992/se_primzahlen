package ticketautomat.components;
import java.time.LocalDateTime;

public class Receipt {

	private LocalDateTime date;
	private int parkLife; // minutes
	private LocalDateTime parkEnd;

	private int amount; // in cent
	private int payedAmount;
	private int backAmount;

	private Receipt(Builder builder) {
		date = builder.date;
		parkLife = builder.parkLife;
		parkEnd = builder.parkEnd;
		amount = builder.amount;
		payedAmount = builder.payedAmount;
		backAmount = builder.backAmount;
	}

	public static class Builder {
		private LocalDateTime date;
		private int parkLife;
		private LocalDateTime parkEnd;

		private int amount; // in cent
		private int payedAmount;
		private int backAmount;

		public Builder date(LocalDateTime d) {
			date = d;
			return this;
		}

		public Builder parkLife(int life) {
			parkLife = life;
			parkEnd = date.plusMinutes(life);
			return this;
		}

		/*public Builder parkEnd(LocalDateTime end) {
			parkEnd = parkEnd;
			return this;
		}*/

		public Builder amount(int amount) {
			this.amount = amount;
			return this;
		}

		public Builder payedAmount(int payedAmount) {
			this.payedAmount = payedAmount;
			this.backAmount = payedAmount - amount;
			return this;
		}

		/*public Builder backAmount(int backAmount) {
			this.backAmount = backAmount;
			return this;
		}*/

		public Receipt build() {
			return new Receipt(this);
		}
	}
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Receipt { ");
		stringBuilder.append("Date = ").append(date).append(", ");
		stringBuilder.append("Park Life = ").append(parkLife).append(", ");
		stringBuilder.append("Park End = ").append(parkEnd).append(", ");
		stringBuilder.append("Amount = ").append(amount).append(", ");
		stringBuilder.append("Payed = ").append(payedAmount).append(", ");
		stringBuilder.append("Back = ").append(backAmount).append("}");
		return stringBuilder.toString();
	}
}
