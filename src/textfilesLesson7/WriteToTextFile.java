package textfilesLesson7;
import java.io.File;
import java.io.PrintWriter;

public class WriteToTextFile {

	public static void main(String[] args) {
		/*To view where the file is: right click on the project
		 * select property and copy the path displayed for location */
		try{
			File file = new File("file.txt");
			
			if(!file.exists()){//if the file does not exist
				file.createNewFile();
			}
			PrintWriter writeIntoFile = new PrintWriter(file);
			writeIntoFile.println("This is the first content of my file");
			writeIntoFile.println("This can also be replaced by variable");
			writeIntoFile.println("I can also write numbers e.g."+ 2000);
			writeIntoFile.close();
			System.out.println("The file has now been created");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
