package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class PeopleBag {

	private Student[] student;
	private Faculty[] faculty;
	private int nElms;
	private int fElms;
	
	public PeopleBag(int maxSize){
		
		student = new Student[maxSize];
		faculty = new Faculty[maxSize];
		
		nElms = 0;
		fElms = 0;
	}
	
	
	public void addStudent(Student s){
	
		student[nElms++] = s;
		
	}
	public void addFaculty(Faculty f){
		faculty[fElms++] = f;
	}
	public boolean deleteStudent(Student value) {
		int j;
		for (j = 0; j < nElms; j++) {
			if (student[j] == value) {
				break;
			}
		}

		if (j == nElms) {
			return false;
		} else {
			for (int k = j; k < nElms - 1; k++) {
				student[k] = student[k + 1];
			
			}
			nElms--;
			return true;
		}
		}
		public boolean deleteFaculty(Faculty value) {
			int j;
			for (j = 0; j < fElms; j++) {
				if (faculty[j] == value) {
					break;
				}
			}

			if (j == fElms) {
				return false;
			} else {
				for (int k = j; k < fElms - 1; k++) {
					faculty[k] = faculty[k + 1];
				
				}
				fElms--;
				return true;
			}
			
		}
		public boolean findStudent(Student id) {
			int j;	
			for (j = 0; j < nElms; j++) {
				if (student[j].getId().equals(id.getId())) {
					break;
				}
			}

			if (j == nElms) {
				return false;
			} else {
				return true;
			}
		}
		public boolean findFaculty(Faculty id) {
			int j;	
			for (j = 0; j < nElms; j++) {
				if (faculty[j].getId().equals(id.getId())) {
					break;
				}
			}

			if (j == fElms) {
				return false;
			} else {
				return true;
			}
		}

		public void displayStudent(){
			for (int j = 0; j < nElms; j++){
				System.out.println(student[j]);
			}
			System.out.println("");
		}
		public void display(){
			for (int i = 0; i < nElms; i++){
				System.out.println(faculty[i]);
			}
			System.out.println("");
		}
		public int getNElms(){
			return nElms;
		}
		public int getFElms(){
			return fElms;
		}
		public void saveStudent() throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try
		{
			fos = new FileOutputStream("studentData.dat");
			oos = new ObjectOutputStream(fos);
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {
			oos.writeObject(student[nElms]);
			oos.close();
		}
	
	}
		public void saveFaculty() throws IOException {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try
			{
				fos = new FileOutputStream("facultyData.dat");
				oos = new ObjectOutputStream(fos);
			}catch(IOException e){
				e.printStackTrace();
			}
			finally {
				oos.writeObject(faculty[nElms]);
				oos.close();
			}
		
		}
		public void loadStudent() throws IOException, ClassNotFoundException {
			FileInputStream fis = new FileInputStream("studentData.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			student = (Student[]) ois.readObject();
			ois.close();
		}
		public void loadFaculty() throws IOException, ClassNotFoundException {
			FileInputStream fis = new FileInputStream("facultyData.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			faculty = (Faculty[]) ois.readObject();
			ois.close();

		}
		@Override
		public String toString() {
			return "PeopleBag [student=" + Arrays.toString(student) + ", faculty=" + Arrays.toString(faculty)
					+ ", fElms=" + fElms + "]";
		}
		
	}

