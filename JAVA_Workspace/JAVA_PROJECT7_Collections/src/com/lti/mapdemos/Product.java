package com.lti.mapdemos;

public class Product implements Comparable<Product> {
	int prdId;
	String prdName;
	double prdCost;
	
	@Override
	public int compareTo(Product p) {
		if(p.getPrdId()==this.getPrdId())
		{
	
		return 0;
		}
		else if(p.getPrdId()<this.getPrdId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
			}
	
	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public double getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(prdCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + prdId;
		result = prime * result + ((prdName == null) ? 0 : prdName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(prdCost) != Double.doubleToLongBits(other.prdCost))
			return false;
		if (prdId != other.prdId)
			return false;
		if (prdName == null) {
			if (other.prdName != null)
				return false;
		} else if (!prdName.equals(other.prdName))
			return false;
		return true;
	}

	public Product() {
		super();
	}

	public Product(int prdId, String prdName, double prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}

	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}

	
	
}
