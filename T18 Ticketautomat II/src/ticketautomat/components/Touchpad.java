package ticketautomat.components;

import ticketautomat.commands.AddCommand;
import ticketautomat.commands.CancelCommand;
import ticketautomat.commands.ICommand;
import ticketautomat.commands.PayCommand;

public class Touchpad {

	private Button addBtn;
	private Button cancelBtn;
	private Button okBtn;

	public Touchpad(CoinSlot slot, PayComponent pay){

		addBtn = new Button("Add");
		ICommand addCommand = new AddCommand(pay);
		addBtn.setCommand(addCommand);


		okBtn = new Button("Pay");
		ICommand payCommand = new PayCommand(slot, pay, addBtn);
		okBtn.setCommand(payCommand);

		cancelBtn = new Button("Cancel");
		ICommand cancelCommand = new CancelCommand(pay,slot, getOkBtn());
		cancelBtn.setCommand(cancelCommand);

	}

	public Button getAddBtn() {
		return addBtn;
	}

	public Button getCancelBtn() {
		return cancelBtn;
	}

	public Button getOkBtn() {
		return okBtn;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Touchpanel { ");
		stringBuilder.append(addBtn.toString()).append(",");
		stringBuilder.append(okBtn.toString()).append(",");
		stringBuilder.append(cancelBtn.toString());
		stringBuilder.append("}");
		return stringBuilder.toString();
	}
}
