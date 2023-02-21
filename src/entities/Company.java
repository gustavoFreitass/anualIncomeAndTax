package entities;

public class Company extends TaxPayer {
	
	private Integer numberEmp;
	
	public Company() {
		super();
	}
	public Company(String name, Double annualIncome, Integer numberEmp) {
		super(name, annualIncome);
		this.numberEmp = numberEmp;
	}
	
	public Integer getNumberEmp() {
		return numberEmp;
	}
	public void setNumberEmp(Integer numberEmp) {
		this.numberEmp = numberEmp;
	}
	
	@Override
	public Double tax() {
		if(numberEmp <= 10) {
			return getAnnualIncome() * 0.16; 
		}
		else {
			return getAnnualIncome() * 0.14;
		}
	}
}
