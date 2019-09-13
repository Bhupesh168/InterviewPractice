package com.practice;

import java.util.Optional;

public class Java8 {
	static String a1=null;
	
	public static void main(String[] args) {

        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();
        System.out.println(nonEmptyGender);
        System.out.println("Non-Empty Optional:: " + nonEmptyGender.map(gender -> gender.toUpperCase()));
        System.out.println("Empty Optional    :: " + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));
        
    }
}
