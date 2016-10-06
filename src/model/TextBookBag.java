package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TextBookBag {
	Textbook[] textBook;
	private int nElms;
	public TextBookBag(int maxSize){
		textBook = new Textbook[maxSize];
		nElms = 0;
	}
	
	public void addTextbook(Textbook t){
		textBook[nElms++] = t;
	}
	public boolean delete(Textbook value) {
		int j;
		for (j = 0; j < nElms; j++) {
			if (textBook[j] == value) {
				break;
			}
		}

		if (j == nElms) {
			return false;
		} else {
			for (int k = j; k < nElms - 1; k++) {
				textBook[k] = textBook[k + 1];
			
			}
			nElms--;
			return true;
		}
		
	}
	public boolean find(Textbook ISBN) {
		int j;
		for (j = 0; j < nElms; j++) {
			if (textBook[j].getISBN().equals(ISBN.getISBN())) {
				
				break;
			}
		}

		if (j == nElms) {
			return false;
		} else {
			return true;
		}
	}
	public void display(){
		for (int i = 0; i < nElms; i++){
			System.out.println(textBook[i]);
		}
		System.out.println("");
	}
	public int getNElms(){
		return nElms;
	}
	
	public void load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("textBookData.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		textBook = (Textbook[]) ois.readObject();
		ois.close();

	}

	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("textBookData.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(textBook);
		oos.close();
	}
	
}
