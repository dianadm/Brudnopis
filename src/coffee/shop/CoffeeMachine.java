package coffee.shop;

import java.util.*;
import java.sql.*;
//import java.sql.Date;
//Error:(6, 1) java: a type with the same simple name is already defined by the single-type-import of java.sql.Date
import java.util.Date;

public class CoffeeMachine {

/*	Error:(8, 9) java: reference to Date is ambiguous
	both class java.sql.Date in java.sql and class java.util.Date in java.util match*/

	Date dateOfCoffeeImport;

//	public static void main(String... args) {
//	public static void main(String[] args) {
//	public static void main(String [] args) {
	public static void main(String params[]) {
		System.out.println(params.length);
	}

}

class Coffee {

}
