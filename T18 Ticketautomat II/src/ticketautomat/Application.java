package ticketautomat;

import ticketautomat.commands.CancelCommand;
import ticketautomat.commands.ICommand;
import ticketautomat.components.CoinSlot;
import ticketautomat.components.PayComponent;
import ticketautomat.components.Touchpad;

public class Application {

	private Touchpad touchPad;
	private CoinSlot coinSlot;
	private PayComponent payComponent;

	public Application(){
		payComponent = new PayComponent();
		coinSlot = new CoinSlot();
		touchPad = new Touchpad(coinSlot, payComponent);
	}

	public void simulate1(){
		System.out.println("Ticketautomat Simulation 1");
		System.out.println(touchPad);
		System.out.println(payComponent);

		touchPad.getAddBtn().pressBtn();
		touchPad.getAddBtn().pressBtn();
		touchPad.getAddBtn().pressBtn();

		touchPad.getAddBtn().pressBtn();
		touchPad.getAddBtn().pressBtn();

		System.out.println(payComponent);

		touchPad.getOkBtn().pressBtn();

		System.out.println(touchPad);

		System.out.println(payComponent);

		coinSlot.insertCoin(5);
		coinSlot.insertCoin(5);
		coinSlot.insertCoin(2);
		coinSlot.insertCoin(2);
		coinSlot.insertCoin(2);

		System.out.println("Vielen Dank!");
		ICommand ccommand = new CancelCommand(payComponent,coinSlot, touchPad.getAddBtn());
		ccommand.execute();

		System.out.println("Ticketautomat simulation 1 finished");
		System.out.println(payComponent);
		System.out.println(touchPad);

	}

	public void simulate2(){
		System.out.println("Ticketautomat simulation 2");
		System.out.println(touchPad);
		System.out.println(payComponent);

		touchPad.getAddBtn().pressBtn();
		touchPad.getAddBtn().pressBtn();
		touchPad.getAddBtn().pressBtn();

		System.out.println(payComponent);

		touchPad.getOkBtn().pressBtn();

		System.out.println(touchPad);

		System.out.println(payComponent);

		coinSlot.insertCoin(5);
		coinSlot.insertCoin(3);
		System.out.println(payComponent);

		touchPad.getCancelBtn().pressBtn();


		System.out.println("Ticketautomat simulation 2 finished");
		System.out.println(payComponent);
		System.out.println(touchPad);

	}

	public static void main(String[] args) {
		Application app = new Application();
		app.simulate1();
		System.out.println("--------------");
		app.simulate2();
	}
}
