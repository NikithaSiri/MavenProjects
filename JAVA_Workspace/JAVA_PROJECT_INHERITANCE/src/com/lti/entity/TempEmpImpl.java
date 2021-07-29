package com.lti.entity;

public class TempEmpImpl implements IPerson {

	int tempId;
    double salPerDay;
    int noDays;
    
    @Override
    public void calc() {
	
   double tSal= salPerDay*noDays;
   System.out.println("temp emp sal " +tSal);
    }
	public TempEmpImpl(int tempId, double salPerDay, int noDays) {
		super();
		this.tempId = tempId;
		this.salPerDay = salPerDay;
		this.noDays = noDays;
	}



	public int getTempId() {
		return tempId;
	}



	public void setTempId(int tempId) {
		this.tempId = tempId;
	}



	public double getSalPerDay() {
		return salPerDay;
	}



	public void setSalPerDay(double salPerDay) {
		this.salPerDay = salPerDay;
	}



	public int getNoDays() {
		return noDays;
	}



	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}



	@Override
	public String toString() {
		return "TempEmpImpl [tempId=" + tempId + ", salPerDay=" + salPerDay + ", noDays=" + noDays + "]";
	}
	

}
