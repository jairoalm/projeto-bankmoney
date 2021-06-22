package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.accountPage.WithdrawalPage;
import br.com.jairo.config.Listener;

public class WithdrawalTest extends Listener {

	private WithdrawalPage withdrawal = new WithdrawalPage();

	@Test
	public void realizarSaque() throws InterruptedException {
		withdrawal.withdrawButton();
		withdrawal.setWithdrawalValue("100");
		withdrawal.saveValueWithdrawal();
		
		Assert.assertEquals("Transaction successful", withdrawal.successfulWithdrawal());

		/*Assert.assertEquals("Transaction Failed. You can not withdraw amount more than the balance.",
				withdrawal.errorWithdrawing());*/

		// System.out.println(sacar.saqueRealizadoComSucesso());
	}
}
