package com.rdayala.enums;

// this enum type defines state and behavior

public enum BookGener {
	BIOGRAPHY(12),
	HORROR(15);
	
	private BookGener(int minAgeToRead) {
		this.minAgeToRead = minAgeToRead;
	}
	
	// state of enum
	private int minAgeToRead;
	public int getMinAgeToRead() {
		return minAgeToRead;
	}
	
	public static void main(String[] args) {
		for(BookGener bookGenre : BookGener.values()) {
			System.out.println("\nName : " + bookGenre);  // uses toString() method ; toString() internally uses name() method unless overridden.
			System.out.println(", name() : " + bookGenre.name());
			System.out.println(", Ordinal : " + bookGenre.ordinal());
			System.out.println(", Declaring class : " + bookGenre.getDeclaringClass());
			System.out.println(", compareTo(HORROR) : " + bookGenre.compareTo(BookGener.HORROR));
			System.out.println(", equals(HORROR) : " + bookGenre.equals(BookGener.HORROR));
			System.out.println(", minAgeToRead : " + bookGenre.getMinAgeToRead()); // getting state of enum object
		}
	}
}

/* OUTPUT :

Name : BIOGRAPHY
, name() : BIOGRAPHY
, Ordinal : 0
, Declaring class : class com.rdayala.enums.BookGener
, compareTo(HORROR) : -1
, equals(HORROR) : false
, minAgeToRead : 12

Name : HORROR
, name() : HORROR
, Ordinal : 1
, Declaring class : class com.rdayala.enums.BookGener
, compareTo(HORROR) : 0
, equals(HORROR) : true
, minAgeToRead : 15

*/