package com.example.demo.arithmetic;

import org.springframework.stereotype.Service;

@Service
public class SubServices {
	public String sub(Arithemetic arithemetic)
	{
		int parameter1=arithemetic.getNumber1();
		int parameter2=arithemetic.getNumber2();
		int parameter3=parameter1-parameter2;
		return ("parameter1"+parameter1+" parameter2= " + parameter2 + " parameter3 = :"+parameter3);
		
	}

}
