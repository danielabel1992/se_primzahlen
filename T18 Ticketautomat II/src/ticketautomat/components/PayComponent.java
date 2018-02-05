package ticketautomat.components;

import ticketautomat.commands.ICommand;
import ticketautomat.commands.PayedCommand;

import java.time.LocalDateTime;

public class PayComponent implements ICoinSlotListener{
	private final static int INCREASE_VALUE = 3;
	private final static int INCREASE_MINUTES = 15;

	private int value;
	private int minutes;

	private int payedValue;

	public int getValue() {
		return value;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getPayedValue() {
		return payedValue;
	}



	public PayComponent(){
		value = 0;
		minutes = 0;
		payedValue = 0;
	}
	public void add(){
		value += PayComponent.INCREASE_VALUE;
		minutes += PayComponent.INCREASE_MINUTES;
	}
	public void clear(){
		value = 0;
		minutes = 0;
		payedValue = 0;
	}

	public void coinGetted(int coinValue, CoinSlot fromSlot) {
		payedValue += coinValue;
		if(payedValue >= value){
			ICommand command = new PayedCommand(fromSlot);
			command.execute();
			System.out.println(generateReceipt());
			clear();
		}
	}
	public Receipt generateReceipt(){
		Receipt r = new Receipt.Builder().date(LocalDateTime.now()).parkLife(minutes).amount(value).payedAmount(payedValue).build();
		return r;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PayComponent { ");
		stringBuilder.append("Park Fees: ").append(value).append(",");
		stringBuilder.append("Park Life: ").append(minutes).append(",");
		stringBuilder.append("Payed: ").append(payedValue);
		stringBuilder.append("}");
		return stringBuilder.toString();
	}
}
