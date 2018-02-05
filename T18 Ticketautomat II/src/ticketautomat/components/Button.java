package ticketautomat.components;

import ticketautomat.commands.ICommand;

public class Button {

	private boolean isDisabled;

	private ICommand command;
	private String type;

	public Button(String type){
		this.type = type;
		isDisabled = false;
	}
	public Button(String type, ICommand command){
		this.type = type;
		isDisabled = false;
		this.command = command;
	}
	public Button(String type, ICommand command, boolean isDisabled) {
		this.type = type;
		this.isDisabled = isDisabled;
		this.command = command;
	}
	public void pressBtn() {
		if(!isDisabled){
			System.out.println("--- pressed button " +type);
			command.execute();
		}

	}
	public void setCommand(ICommand command) {
		this.command = command;
	}
	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean disabled) {
		isDisabled = disabled;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Button-").append(type).append(" ");
		if(isDisabled){
			stringBuilder.append("not available");
		}else{
			stringBuilder.append("available");
		}
		return stringBuilder.toString();
	}
}
