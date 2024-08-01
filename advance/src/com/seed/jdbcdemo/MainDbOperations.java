package com.seed.jdbcdemo;

public class MainDbOperations {
	
	public static void main(String[] args) {
		
		DbOperations ops=new DbOperations();
		
		ops.addData(1, "ramu", 25000);
		ops.displayData();
		
	}

}
