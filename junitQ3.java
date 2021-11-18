//junit Q3

package junitque3;

import junit.framework.Test;

public class BankAccount {
	
	double accBanlance;
	
	
	
	public BankAccount(double accBanlance) {
		super();
		this.accBanlance = accBanlance;
	}

	
	void withDraw(double withDrawAmt) throws InsufficientFundsException {
		
		if(withDrawAmt>accBanlance)
			throw new InsufficientFundsException("InsufficientFundsException");
		
		accBanlance=accBanlance-withDrawAmt;
		
		System.out.println("Amount WithDrawn: "+withDrawAmt);
		System.out.println("Available Balance: "+accBanlance);
	}
	
	public static void main(String[] args) {
		
		BankAccount acc1=new BankAccount(20000.00);

		try {
			acc1.withDraw(20000.00);
		} catch (InsufficientFundsException e) {
		
			e.printStackTrace();
		}
		
	}

}
// test program prg2
package junitque3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		BankAccount acc1 = new BankAccount(20000.00);

		assertThrows(InsufficientFundsException.class, () -> acc1.withDraw(21000.0));

	}
//3rd prg


package junitque3;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String msg) {
		super(msg);
	}

}