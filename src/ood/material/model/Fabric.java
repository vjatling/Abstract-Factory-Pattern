package ood.material.model;

public abstract class Fabric {
	public abstract String getCOTTON();
	public abstract String getPOLYESTER();
	public abstract String getWOOLEN();
	
	@Override
	public String toString(){
		return "COTTON= "+this.getCOTTON()+", POLYESTER="+this.getPOLYESTER()+", WOOLEN="+this.getWOOLEN();
	}

}
