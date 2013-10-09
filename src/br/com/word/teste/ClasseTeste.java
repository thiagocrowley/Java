package br.com.word.teste;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor; 

import javax.swing.text.BadLocationException; 
import javax.swing.text.rtf.RTFEditorKit; 
import javax.swing.text.DefaultStyledDocument; 

import java.io.InputStream; 
import java.io.IOException; 
import java.io.File; 
import java.io.FileInputStream; 

public class ClasseTeste 
{ 
	public String enderecoRecurso; 

	File f = new File("c:/"); 
	FileInputStream is = new FileInputStream(f); 

	HWPFDocument wdoc = new HWPFDocument(is);
	WordExtractor extractor = new WordExtractor(wdoc); 

		    String conteudo = extractor.getText();

			conteudo = conteudo.replace("\n", " ");
			System.out.println("Conteudo do arquivo: " + conteudo); 

			public void setEnderecoRecurso(String enderecoRecurso)
			{ 
				this.enderecoRecurso = enderecoRecurso; //caminho do arquivo 
			} 

	public String getConteudo() 
	{ 
		File f = new File(this.enderecoRecurso); 
		FileInputStream is = null; 

		try 
		{ 
			is = new FileInputStream(f); 
		} 
		catch(IOException e) 
		{ 
			System.out.println("ERRO: " + e.getMessage()); 
			return null; 
		} 

		String bodyText = null; 

		DefaultStyledDocument styledDoc = new DefaultStyledDocument(); 
		try { 
			new RTFEditorKit().read(is, styledDoc, 0); 
			bodyText = styledDoc.getText(0, styledDoc.getLength()); 
		} 
		catch (IOException e) 
		{ 
			return "ERRO: Cannot extract text from a RTF document. Exception: " + e; 
		} 
		catch (BadLocationException e) 
		{ 
			return "ERRO: Cannot extract text from a RTF document. Exception: " + e; 
		} 
		return bodyText; 
	} 
}

