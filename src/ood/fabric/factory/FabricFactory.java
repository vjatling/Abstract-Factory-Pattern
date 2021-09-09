package ood.fabric.factory;

import ood.material.model.Fabric;
import ood.material.model.Shirt;
import ood.material.model.Jacket;


public class FabricFactory {

	public static Fabric getFabric(String type, String cotton, String polyester, String woolen){
		if("Shirt".equalsIgnoreCase(type)) return new Shirt(cotton, polyester, woolen);
		else if("Jacket".equalsIgnoreCase(type)) return new Jacket(cotton, polyester, woolen);
		
		return null;
	}

}
