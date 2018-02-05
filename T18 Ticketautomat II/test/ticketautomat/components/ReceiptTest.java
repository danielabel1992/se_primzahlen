package ticketautomat.components;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTest {

	@Test
	void getReceipt() {
		int value = 3;
		int minutes = 15;
		int payedValue = 4;
		Receipt r = new Receipt.Builder().date(LocalDateTime.now()).parkLife(minutes).amount(value).payedAmount(payedValue).build();
		System.out.println(r);
		assertNotNull(r);
	}
}