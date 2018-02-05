package ticketautomat.components;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PayComponentTest {
	private PayComponent pay;

	@BeforeEach
	void init(){
		pay = new PayComponent();
	}

	@Test
	void add() {
		pay.add();
		int val = pay.getValue();
		int min = pay.getMinutes();
		assertTrue(val > 0 && min > 00);
	}

	@Test
	void clear() {
		pay.add();
		pay.clear();
		int val = pay.getValue();
		int min = pay.getMinutes();
		assertTrue(val == 0 && min == 0);
	}

	@Test
	void coinGetted() {
		CoinSlot slot = new CoinSlot();
		pay.add();
		pay.coinGetted(3, slot);
		int payed = pay.getPayedValue();
		assertTrue(payed > 0);
		assertTrue(slot.isDisabled());
	}

	@Test
	void generateReceipt() {
		pay.add();
		CoinSlot slot = new CoinSlot();
		pay.coinGetted(3, slot);
		Receipt r = pay.generateReceipt();
		System.out.println(r);
		assertNotNull(r);
	}
}