package ticketautomat.commands;

import ticketautomat.components.CoinSlot;

public class PayedCommand implements ICommand {
	private CoinSlot slot;

	public PayedCommand(CoinSlot slot){
		this.slot = slot;
	}
	public void execute() {
		slot.setDisabled(true);
		//slot.removeAllListener();
	}
}
