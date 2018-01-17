package com.aravind;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class ProductCatalog {
	public List<String> getProductCategories(){
		List<String> categories=new ArrayList<>();
		categories.add("Books");
		categories.add("Home");
		categories.add("Clothes");
		return categories;
	}

}
