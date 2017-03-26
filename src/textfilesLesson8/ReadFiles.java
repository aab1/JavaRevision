package textfilesLesson8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
/*the file name must be entered into the file reader or the path to the file if it is not the project folder
 *we need to store each line we read from the file therefore we create String line
 *while the line we are reading from is not empty then we print
 *To read a file from other location simply copy the path using location from perperty
 *e.gC:\\seleniumTraining\\JavaRevision\\file.txt
 *Ensure all the back slashes are doubled as shown above so java can recognise them*/
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedReader br_B = null;
		try{
			br = new BufferedReader(new FileReader("fileA.txt"));
			br_B = new BufferedReader(new FileReader("fileB.txt"));
			String line;
			String lineB;
			//fileA is the expected file
			while ((line = br.readLine()) !=null) {
				lineB = br_B.readLine();
				if(line.compareTo(lineB) == 0){
					System.out.println(line+" = "+lineB);
				}else{
					//you can create a new text file and write the failed result there
					System.out.println(line+" because it is not found in the other text file != "+lineB);
				}
				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				br.close();
				br_B.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
