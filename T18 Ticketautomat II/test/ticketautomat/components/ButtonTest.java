package ticketautomat.components;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {

	@Test
	void setDisabled() {
		Button b = new Button("TestBtn");
		boolean old = b.isDisabled();
		b.setDisabled(true);
		boolean ne = b.isDisabled();
		assertTrue(old != ne);
	}
}