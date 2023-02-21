package entities;

public class Individual extends TaxPayer {

	private Double outlay;
	
	public Individual() {
		super();
	}
	public Individual(String name, Double annualIncome, Double outlay) {
		super(name, annualIncome);
		this.outlay = outlay;
	}
	
	public Double getOutlay() {
		return outlay;
	}
	public void setOutlay(Double outlay) {
		this.outlay = outlay;
	}
	
	@Override
	public Double tax() {
		if(getAnnualIncome() < 20000) {
			return getAnnualIncome() * 0.15 - outlay * 0.5;
		}
		else {
			return getAnnualIncome() * 0.25 - outlay * 0.5;
		}
	}
}
