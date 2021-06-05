package br.com.jairo.suite;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jairo.page.ScreensPage;
import br.com.jairo.test.LoginTest;
import br.com.jairo.test.TransactionsTest;
import br.com.jairo.test.WithdrawalTest;
import br.com.jairo.test.BalanceTest;
import br.com.jairo.test.DepositTest;


@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	DepositTest.class,
	WithdrawalTest.class,
	TransactionsTest.class,
    BalanceTest.class	
})
public class Suite03 {
	
	public static ScreensPage realizaTransacoes = new ScreensPage();
	
	@BeforeClass
	public static void acessoGerente(){
		realizaTransacoes.acessarTelaLogin();	
	}

}
