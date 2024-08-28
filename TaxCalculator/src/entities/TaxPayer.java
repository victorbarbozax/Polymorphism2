package entities;

public abstract class TaxPayer{
	private String name;
	private Double AnualIncome;  //renda anual
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anualIncome) {
        super();
		this.name = name;
		AnualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return AnualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		AnualIncome = anualIncome;
	}
	
	public abstract Double tax();
	}

