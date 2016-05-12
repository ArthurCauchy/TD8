package fr.univamu.iut.test;

public class NumeralToRoman {
	public static String getRoman(int numeralNumber) {
		if (numeralNumber < 1 || numeralNumber > 3999)
	        return "Invalid Roman Number Value";
	    String res = "";
	    while (numeralNumber >= 1000) {
	        res += "M";
	        numeralNumber -= 1000;        }
	    while (numeralNumber >= 900) {
	        res += "CM";
	        numeralNumber -= 900;
	    }
	    while (numeralNumber >= 500) {
	        res += "D";
	        numeralNumber -= 500;
	    }
	    while (numeralNumber >= 400) {
	        res += "CD";
	        numeralNumber -= 400;
	    }
	    while (numeralNumber >= 100) {
	        res += "C";
	        numeralNumber -= 100;
	    }
	    while (numeralNumber >= 90) {
	        res += "XC";
	        numeralNumber -= 90;
	    }
	    while (numeralNumber >= 50) {
	        res += "L";
	        numeralNumber -= 50;
	    }
	    while (numeralNumber >= 40) {
	        res += "XL";
	        numeralNumber -= 40;
	    }
	    while (numeralNumber >= 10) {
	        res += "X";
	        numeralNumber -= 10;
	    }
	    while (numeralNumber >= 9) {
	        res += "IX";
	        numeralNumber -= 9;
	    }
	    while (numeralNumber >= 5) {
	        res += "V";
	        numeralNumber -= 5;
	    }
	    while (numeralNumber >= 4) {
	        res += "IV";
	        numeralNumber -= 4;
	    }
	    while (numeralNumber >= 1) {
	        res += "I";
	        numeralNumber -= 1;
	    }    
	    return res;
	}
}
