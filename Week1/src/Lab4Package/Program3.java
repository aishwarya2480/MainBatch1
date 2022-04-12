package Lab4Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=109;
		double sal=1200;
		String desi="Intern";
		try {
			FileOutputStream fout = new FileOutputStream("employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(id);
			out.writeObject(sal);
			out.writeObject(desi);
			out.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.txt"));
			System.out.println(""+ois.readObject());
			System.out.println(""+ois.readObject());
			System.out.println(""+(String)ois.readObject());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
