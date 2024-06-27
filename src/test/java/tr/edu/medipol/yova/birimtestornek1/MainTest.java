package tr.edu.medipol.yova.birimtestornek1;
// test sýnýfý package ismi main paketiyle ayný olur. 
// JUnit testi olduðunu belirtmek için bazý importlar yapmamýz gerekiyor 

import org.junit.Test;

import static org.junit.Assert.*; // * içindeki her þeyi getirir. 

public class MainTest {

	
	@Test // bunu ifadeyi koyduðumuzda methodu test methodu yapýyor. 
	public void testMetniFormatla() { // notasyonu koyduðumuz için test methodunun ismine test koymamýz daha iyi olur. 
		//deðer dönmez void yazýyoruz
		// test edeceðimiz metodu çaðýrmamýz gerekiyor 
		// ön koþullar  (GIVEN) testin çalýþmasý için gerekli girdiler burada tanýmlanýr.  sahteler de buraya yazýlýr.
		
		String kaynakMetin= "      ders    1"; 
		
		// when bu olduðunda koþullar Test edilercek kodun çaðýrýlmasý 
		
		String sonuc= Main.metniFormatla(kaynakMetin);
		
	    // Kontroller (THEN) sonuç doðru mu deðil mi 
				// assert komutlarýmýz var bu kýsmý yazabilmek için j unit asseert projeye dahil edilmeli
		assertNotNull(sonuc); // sonucun null olup olmasýðýný kontrol et
		assertEquals("Ders1",sonuc); // sonucun Ders 1 olup olamsýðýný kontrol et.
				
				// sað týk > run as > Junit 
		 //  yeþil yanarsa baþarýlý
		
		//Otomatik olarak nasýl çalýþtýrýlýr: direlt projenin üstüne sað týk maven test dediðimizde
		// maven çalýþýr.
		
		// test sonucu failure deemek testin deðil girilen sonucun hatalý olduðunu gösterir. 
	}
	
	
}
