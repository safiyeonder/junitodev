package tr.edu.medipol.yova.birimtestornek1;
// test s�n�f� package ismi main paketiyle ayn� olur. 
// JUnit testi oldu�unu belirtmek i�in baz� importlar yapmam�z gerekiyor 

import org.junit.Test;

import static org.junit.Assert.*; // * i�indeki her �eyi getirir. 

public class MainTest {

	
	@Test // bunu ifadeyi koydu�umuzda methodu test methodu yap�yor. 
	public void testMetniFormatla() { // notasyonu koydu�umuz i�in test methodunun ismine test koymam�z daha iyi olur. 
		//de�er d�nmez void yaz�yoruz
		// test edece�imiz metodu �a��rmam�z gerekiyor 
		// �n ko�ullar  (GIVEN) testin �al��mas� i�in gerekli girdiler burada tan�mlan�r.  sahteler de buraya yaz�l�r.
		
		String kaynakMetin= "      ders    1"; 
		
		// when bu oldu�unda ko�ullar Test edilercek kodun �a��r�lmas� 
		
		String sonuc= Main.metniFormatla(kaynakMetin);
		
	    // Kontroller (THEN) sonu� do�ru mu de�il mi 
				// assert komutlar�m�z var bu k�sm� yazabilmek i�in j unit asseert projeye dahil edilmeli
		assertNotNull(sonuc); // sonucun null olup olmas���n� kontrol et
		assertEquals("Ders1",sonuc); // sonucun Ders 1 olup olams���n� kontrol et.
				
				// sa� t�k > run as > Junit 
		 //  ye�il yanarsa ba�ar�l�
		
		//Otomatik olarak nas�l �al��t�r�l�r: direlt projenin �st�ne sa� t�k maven test dedi�imizde
		// maven �al���r.
		
		// test sonucu failure deemek testin de�il girilen sonucun hatal� oldu�unu g�sterir. 
	}
	
	
}
