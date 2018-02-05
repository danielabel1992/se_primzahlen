package ticketautomat.commands;

import ticketautomat.components.PayComponent;

public class AddCommand implements ICommand {
	private PayComponent payComponent;

	public AddCommand(PayComponent payComponent){
		this.payComponent = payComponent;
	}
	public void execute() {
		payComponent.add();
	}
}
