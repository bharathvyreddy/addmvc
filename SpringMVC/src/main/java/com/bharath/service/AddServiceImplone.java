package com.bharath.service;



import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("addq")
public class AddServiceImplone implements AddService {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
