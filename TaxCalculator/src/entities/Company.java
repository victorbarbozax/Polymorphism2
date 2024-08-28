package entities;

public class Company extends TaxPayer{

	private Integer numberOffEmployees;
	
	public Company() {
	}
	
	public Company(String name, Double anualIncome, Integer numberOffEmployees) {
		super(name, anualIncome);
		this.numberOffEmployees = numberOffEmployees;
	}
	
	public Integer getNumberOffEmployees() {
		return numberOffEmployees;
	}

	public void setNumberOffEmployees(Integer numberOffEmployees) {
		this.numberOffEmployees = numberOffEmployees;
	}

	@Override
	public Double tax() {
        if (numberOffEmployees > 10) {
        	return getAnualIncome() * 0.14;
        }
        else {
        	return getAnualIncome() * 0.16;
        }
	}

}
