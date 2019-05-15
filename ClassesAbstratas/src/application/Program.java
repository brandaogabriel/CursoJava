package application;

import java.util.ArrayList;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Account> lista = new ArrayList<>();
		
		lista.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		lista.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		
		
	}

}
