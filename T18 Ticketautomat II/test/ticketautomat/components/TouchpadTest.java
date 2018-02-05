package ticketautomat.components;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TouchpadTest {

	private Touchpad t;
	@BeforeEach
	void init(){
		CoinSlot coinSlot = new CoinSlot();
		PayComponent payComponent = new PayComponent();
		t = new Touchpad(coinSlot, payComponent);
	}

	@Test
	void getAddBtn() {
		assertNotNull(t.getAddBtn());
	}

	@Test
	void getCancelBtn() {
		assertNotNull(t.getCancelBtn());
	}

	@Test
	void getOkBtn() {
		assertNotNull(t.getOkBtn());
	}
}