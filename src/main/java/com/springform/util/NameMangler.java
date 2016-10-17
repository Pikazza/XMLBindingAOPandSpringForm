package com.springform.util;

import org.eclipse.persistence.oxm.XMLNameTransformer;

public class NameMangler implements XMLNameTransformer {

	public String transformAttributeName(String name) {
		// TODO Auto-generated method stub
		
		return name;
	}


	public String transformElementName(String name) {
		// TODO Auto-generated method stub
		
		return name;
	}


	public String transformRootElementName(String name) {
		// TODO Auto-generated method stub
		/*System.out.println("transformRootElementName" +name.substring(name.lastIndexOf('.') + 1));*/
		return name.substring(name.lastIndexOf('.') + 1);
	}

	public String transformTypeName(String name) {
		// TODO Auto-generated method stub
		
		return name;
	}
	
}