package ticketautomat.commands;

import ticketautomat.components.Button;
import ticketautomat.components.CoinSlot;
import ticketautomat.components.PayComponent;

public class CancelCommand implements ICommand {

	private PayComponent pay;
	private CoinSlot slot;
	private Button btn;

	public CancelCommand(PayComponent pay, CoinSlot slot, Button btn){
		this.pay = pay;
		this.slot = slot;
		this.btn = btn;
	}

	public void execute() {
		slot.setDisabled(true);
		slot.removeListener(pay);
		btn.setDisabled(false);
		if(pay.getPayedValue() > 0 ){
			System.out.println("-Your Payback:" + pay.getPayedValue());
		}
		pay.clear();
	}
}
