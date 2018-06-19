import java.lang.Math;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.commons.io.*;
public class java_pi {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		// Main thead to open a PDF file and read the text within.
		//Need to determine how to format text so that the output resembles what is in the PDF file.
        int k;
        double acc = 0.0;
        File file = new File("U:\\Open SIMS\\Data for Open SIMS\\Application and Confirmation Data\\OUAC.PDF");
        PDDocument document = PDDocument.load(file);
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);
        document.close();
        
        System.out.println(text);
        for (k=0;k<10000;k++ ) {
        	acc = acc + Math.pow (-1,k)/(2*k+1);
        }
        acc = 4 *acc;
        System.out.print("pi: ");
        System.out.print(acc);
	}

}
