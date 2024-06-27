package tr.edu.medipol.yova.birimtestornek1;

import org.apache.commons.lang3.StringUtils;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Uygulama açýlýyor");
		
		String ornekMetin= "                   yazilim    ortam ve araçlari";
		String sonuc = metniFormatla(ornekMetin);
		System.out.println(ornekMetin + " formatlandý: --> " + sonuc);

	}

	
	public static String metniFormatla(String kaynakMetin) { 
		String formatliMetin;
		// ADIM1: boþluklarý temizle
		// static new diyip yeni nesne oluþturmadan çaðýrabiliyoruz.
		formatliMetin = StringUtils.deleteWhitespace(kaynakMetin);
		
		// ADIM2: baþ harfini büyüt
		formatliMetin = StringUtils.capitalize(formatliMetin);
		// ADIM3: uzunsa metni kýsalt
		formatliMetin = StringUtils.abbreviate(formatliMetin, 25);
		return formatliMetin;
	}
}
