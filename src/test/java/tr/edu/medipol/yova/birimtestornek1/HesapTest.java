package tr.edu.medipol.yova.birimtestornek1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesapTest {
	
	
	
	@Test
	public void test_ikiPozitifSayi() {
		// given 
		int sayi1 =2;
		int sayi2 = 5;
		// when
		int sonuc = Hesap.topla(sayi1, sayi2);
		//then
		
		assertEquals(7, sonuc);
	}
	
	
	@Test
	public void test_ikiNegatifSayi() {
		// given 
		int sayi1 = -2;
		int sayi2 = -5;
		// when
		int sonuc = Hesap.topla(sayi1, sayi2);
		//then
		
		assertEquals(-7, sonuc);
	}


	@Test
	public void testCikar() {
		// given 
				int sayi1 = 5;
				int sayi2 = 2;
				// when
				int sonuc = Hesap.cikar(sayi1, sayi2);
				//then
				
				assertEquals(3, sonuc);
	}

	@Test
	public void testCarp() {
		// given 
				int sayi1 = 2;
				int sayi2 = 5;
				// when
				int sonuc = Hesap.carp(sayi1, sayi2);
				//then
				
				assertEquals(10, sonuc);
	}

	@Test
	public void testBol() {
		// given 
		int sayi1 = 50;
		int sayi2 = 10;
		// when
		int sonuc = Hesap.bol(sayi1, sayi2);
		//then
		
		assertEquals(5, sonuc);
	}

}
