package ood.material.model;

public class Shirt extends Fabric {

	private String cotton;
	private String polyester;
	private String woolen;
	
	public Shirt(String cotton, String polyester, String woolen){
		this.cotton=cotton;
		this.polyester=polyester;
		this.woolen=woolen;
	}
	@Override
	public String getCOTTON() {
		return this.cotton;
	}

	@Override
	public String getPOLYESTER() {
		return this.polyester;
	}

	@Override
	public String getWOOLEN() {
		return this.woolen;
	}

}
