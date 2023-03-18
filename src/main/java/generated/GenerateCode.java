package generated;

import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class GenerateCode {
	public static void main(String[] args) throws Exception {
		String data="je suis le fichier coder";
		String path="E:\\Qrcode.jpg";
		
		BitMatrix matrix=new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 500, 300);
		
		MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
		
		
	}

}
