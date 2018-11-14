package com.jk.util;

import java.util.Random;


/**
 * 
 * 
 * @author Administrator
 *
 */
public class Rownum {
	

public static Integer row() {
	Random random = new Random();
	String result="";
	for (int i=0;i<6;i++){
		result+=random.nextInt(10);
		
	}
	
	Integer rannum = Integer.valueOf(result);
	return rannum;
	 }

}
