package de.jmb.buch.pdf;
import java.io.IOException;

public class PdfScanner {


	    public static void main(String[] args) throws IOException {
	        StringBuffer buff = new StringBuffer();    
	        PdfConverter pdfConverter = new PdfConverter(
			        "test.pdf");
			int numberOfPages = pdfConverter.getNumberOfPages();
			String s;
			for (int i = 1; i <= numberOfPages; i++) {
			    s  = PdfTextExtractor.getTextFromPage(pdfConverter, i);
			    buff.append(s + "\n");
			}
	        System.out.println(buff.toString());
	    }
	} 

//import java.io.IOException;
//
//import com.itextpdf.text.pdf.PdfReader;
//import com.itextpdf.text.pdf.parser.PdfTextExtractor;
//
//public class PdfLesen {
//    public static void main(String[] args) {
//        StringBuffer buff = new StringBuffer();    
//        try {
//            PdfReader reader = new PdfReader(
//                    "test.pdf");
//            int numberOfPages = reader.getNumberOfPages();
//            String s;
//            for (int i = 1; i <= numberOfPages; i++) {
//                s  = PdfTextExtractor.getTextFromPage(reader, i);
//                buff.append(s + "\n");
//            }    
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(buff.toString());
//    }
//} 

