package tr.edu.medipol.yova.birimtestornek1;

import org.apache.commons.lang3.StringUtils;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Uygulama a��l�yor");
		
		String ornekMetin= "                   yazilim    ortam ve ara�lari";
		String sonuc = metniFormatla(ornekMetin);
		System.out.println(ornekMetin + " formatland�: --> " + sonuc);

	}

	
	public static String metniFormatla(String kaynakMetin) { 
		String formatliMetin;
		// ADIM1: bo�luklar� temizle
		// static new diyip yeni nesne olu�turmadan �a��rabiliyoruz.
		formatliMetin = StringUtils.deleteWhitespace(kaynakMetin);
		
		// ADIM2: ba� harfini b�y�t
		formatliMetin = StringUtils.capitalize(formatliMetin);
		// ADIM3: uzunsa metni k�salt
		formatliMetin = StringUtils.abbreviate(formatliMetin, 25);
		return formatliMetin;
	}
}
