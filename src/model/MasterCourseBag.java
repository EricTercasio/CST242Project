package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class MasterCourseBag {
	private Course[] c;
	private int nElems;
	

	public MasterCourseBag(int maxSize) {
		c = new Course[maxSize];
		nElems = 0;
		
	}

	public void add(Course course) {
		c[nElems++] = course;
	}
	public String getCourses(){
		return Arrays.toString(c);
	}
	public Course findByCourseNumber(String courseNumber) {
		int i = -1;
		for(i = 0; i < nElems; i++) {
			if(c[i].getCourseNumber().equals(courseNumber)){
				break;
			}
		}
		if(i == nElems) {
			return null;
		} else {
			return c[i];
		}
	}

	public int getnElems() {
		return nElems;
	}

	public void saveCourses() throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try
		{
			fos = new FileOutputStream("coursesData.dat");
			oos = new ObjectOutputStream(fos);
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {
			oos.writeObject(c[nElems]);
			oos.close();
		}
	}
		public void loadCourses() throws IOException, ClassNotFoundException {
			FileInputStream fis = new FileInputStream("coursesData.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Course[]) ois.readObject();
			ois.close();
		}

	
	@Override
	public String toString() {
		return "MasterCourseBag [c=" + Arrays.toString(c) + ", nElems=" + nElems + "]";
	}

}
