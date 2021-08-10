package com.rdayala.enums;

public enum BookGenre {
	BIOGRAPHY,
	HORROR;  // if we want to add anything after constants, then we need to end constants with a semicolon.
	
	public static void main(String[] args) {
		for(BookGenre bookGenre : BookGenre.values()) {
			System.out.println("\nName : " + bookGenre);  // uses toString() method ; toString() internally uses name() method unless overridden.
			System.out.println(", name() : " + bookGenre.name());
			System.out.println(", Ordinal : " + bookGenre.ordinal());
			System.out.println(", Declaring class : " + bookGenre.getDeclaringClass());
			System.out.println(", compareTo(HORROR) : " + bookGenre.compareTo(BookGenre.HORROR));
			System.out.println(", equals(HORROR) : " + bookGenre.equals(BookGenre.HORROR));
		}
	}
}

/* Output :

Name : BIOGRAPHY
, name() : BIOGRAPHY
, Ordinal : 0
, Declaring class : class com.rdayala.enums.BookGenre
, compareTo(HORROR) : -1
, equals(HORROR) : false

Name : HORROR
, name() : HORROR
, Ordinal : 1
, Declaring class : class com.rdayala.enums.BookGenre
, compareTo(HORROR) : 0
, equals(HORROR) : true

*/
