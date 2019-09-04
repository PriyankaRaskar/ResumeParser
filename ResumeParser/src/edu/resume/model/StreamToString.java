package edu.resume.model;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

public class StreamToString {

	private InputStream stream;
	private String fileType;

	public StreamToString(InputStream stream, String fileType) {
		super();
		this.stream = stream;
		this.fileType = fileType;
	}

	public String getTextFromStream() {

		String resultText = null;

		// parse file according to their file type
		switch (fileType) {
		case "application/pdf":
			resultText = parsePdf();
			break;
		case "application/msword":
			resultText = parseDoc();
			break;
		case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
			resultText = parseDocx();
			break;
		}

		return resultText;
	}

	private String parseDocx() {
		String text = null;
		XWPFWordExtractor ex = null;
		try {
			XWPFDocument doc = new XWPFDocument(stream);
			ex = new XWPFWordExtractor(doc);
			text = ex.getText();

		} catch (Exception exep) {
			System.out.println(exep);
		} finally {
			if (ex != null)
				try {
					ex.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		return text;
	}

	private String parseDoc() {

		String text = null;

		POIFSFileSystem fs = null;
		WordExtractor we = null;
		try {
			fs = new POIFSFileSystem(stream);
			// File file = new File(PREFACE);
			// String fileType = Files.probeContentType(file.toPath());
			HWPFDocument doc = new HWPFDocument(fs);
			we = new WordExtractor(doc);
			text = we.getText();

		} catch (Exception exep) {
			exep.printStackTrace();
		} finally {
			if (we != null)
				try {
					we.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		return text;
	}

	// pdf to text method
	private String parsePdf() {

		StringBuffer sb = new StringBuffer();

		PdfReader reader = null;
		try {
			reader = new PdfReader(stream);
			PdfReaderContentParser parser = new PdfReaderContentParser(reader);
			TextExtractionStrategy strategy;
			for (int i = 1; i <= reader.getNumberOfPages(); i++) {
				strategy = parser.processContent(i, new SimpleTextExtractionStrategy());
				sb.append(strategy.getResultantText());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null)
				reader.close();
		}
		return sb.toString();
	}
}
