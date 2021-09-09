package ood.test;

import ood.fabric.factory.FabricFactory;
import ood.material.model.Fabric;


public class TestFabricFactory {

	public static void main(String[] args) {
			Fabric Shirt =
FabricFactory.getFabric("shirt", "cotton", "polyester", "woolen");
			Fabric Jacket =
FabricFactory.getFabric("jacket", "cotton", "polyester", "woolen");					
			System.out.println("Factory Shirt Config::"+Shirt);
			System.out.println("Factory Jacket Config::"+Jacket);	

	}

}
