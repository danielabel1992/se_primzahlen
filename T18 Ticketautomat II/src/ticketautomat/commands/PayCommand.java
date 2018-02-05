package ticketautomat.commands;

import ticketautomat.components.Button;
import ticketautomat.components.CoinSlot;
import ticketautomat.components.ICoinSlotListener;

public class PayCommand implements ICommand {
	private CoinSlot slot;
	private Button btn;
	private ICoinSlotListener pay;

	public PayCommand(CoinSlot slot, ICoinSlotListener pay, Button btn){
		this.slot = slot;
		this.btn = btn;
		this.pay = pay;
	}
	public void execute() {
		btn.setDisabled(true);
		slot.setDisabled(false);
		slot.addListener(pay);
	}
}
