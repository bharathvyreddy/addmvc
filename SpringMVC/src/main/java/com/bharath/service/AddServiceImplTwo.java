package com.bharath.service;

import org.springframework.stereotype.Service;

@Service
public class AddServiceImplTwo implements AddService {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
