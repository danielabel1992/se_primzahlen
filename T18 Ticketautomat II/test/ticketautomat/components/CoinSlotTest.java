package ticketautomat.components;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinSlotTest {

	@Test
	void setDisabled() {
		CoinSlot slit = new CoinSlot();
		boolean old = slit.isDisabled();
		slit.setDisabled(false);
		boolean ne = slit.isDisabled();
		assertTrue(old != ne);
	}
}