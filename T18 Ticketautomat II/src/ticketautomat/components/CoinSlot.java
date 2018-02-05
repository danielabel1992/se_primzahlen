package ticketautomat.components;

import java.util.ArrayList;

public class CoinSlot {

	private boolean isDisabled;
	private ArrayList<ICoinSlotListener> listeners;

	public CoinSlot(){
		isDisabled = true;
		listeners = new ArrayList<ICoinSlotListener>();
	}

	public boolean isDisabled() {
		return isDisabled;
	}
	public void insertCoin(int coinValue) {
		System.out.println("--- insert coin " +coinValue);
		for (ICoinSlotListener listener: listeners)
			listener.coinGetted(coinValue, this);
	}

	public void setDisabled(boolean disabled) {
		isDisabled = disabled;
	}
	public void addListener(ICoinSlotListener listener) { listeners.add(listener);
	}
	public void removeListener(ICoinSlotListener listener) { listeners.remove(listener);
	}
	public void removeAllListener(){
		listeners.clear();
	}
}
