package entidades;

import java.util.ArrayList;
import java.util.Calendar;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel workerLevel;
	private double baseSalary;
	private ArrayList<HourContract> contracts;
	private Departament departament;
	
	
	public Worker(String name, WorkerLevel workerLevel, double baseSalary, Departament departament) {
		this.name = name;
		this.workerLevel = workerLevel;
		this.baseSalary = baseSalary;
		this.departament = departament;
		this.contracts = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}

	public WorkerLevel getWorkerLevel() {
		return workerLevel;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract (HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public double income(int year,  int month) {
		double sum = this.baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : this.contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}return sum;
	}
	
}
