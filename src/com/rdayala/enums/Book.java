package com.rdayala.enums;

// this is an example of nested enum

public class Book {

	// nested enum are implicitly static
	public enum BookGenere {
		BIOGRAPHY(12) {
			// defining enum constant specific class body
			boolean isKidFriendly(int age) {
				return age >= minAgeToRead;
			}
		},
		HORROR(15) {
			// defining enum constant specific class body
			boolean isKidFriendly(int age) {
				return age >= minAgeToRead;
			}
		};
		
		private BookGenere(int minAgeToRead) {
			this.minAgeToRead = minAgeToRead;
		}
		
		// state of enum
		protected int minAgeToRead;
		public int getMinAgeToRead() {
			return minAgeToRead;
		}
		
		
		abstract boolean  isKidFriendly(int age);
		
		// using enum in switch statement
		/*		
		public boolean isKidFriendly(int age) {
			switch(this) {
			case BIOGRAPHY:
				return age >= minAgeToRead;
			case HORROR:
				return age >= minAgeToRead;
			}
			return false;
		}
		*/
	}
	
	public static void main(String[] args) {
		for(Book.BookGenere bookGenre : Book.BookGenere.values()) {
			System.out.println("\nName : " + bookGenre);  // uses toString() method ; toString() internally uses name() method unless overridden.
			System.out.println(", name() : " + bookGenre.name());
			System.out.println(", Ordinal : " + bookGenre.ordinal());
			System.out.println(", Declaring class : " + bookGenre.getDeclaringClass());
			System.out.println(", compareTo(HORROR) : " + bookGenre.compareTo(Book.BookGenere.HORROR));
			System.out.println(", equals(HORROR) : " + bookGenre.equals(Book.BookGenere.HORROR));
			System.out.println(", minAgeToRead : " + bookGenre.getMinAgeToRead()); // getting state of enum object
			System.out.println(", isKidFriendly : " + bookGenre.isKidFriendly(13));
		}
	}
	
}
