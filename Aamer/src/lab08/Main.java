package lab08;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	static Camera[] cameraData;
	public static void main(String[] args) {
		readCameraData();
		
		System.out.println("Total Camera : " + cameraData.length);

	}
	private static void readCameraData() {
		try {
			Scanner fileReader = new Scanner(new File("Cameras.csv"));
			cameraData= new Camera[0];
			
			fileReader.nextLine();
			while(fileReader.hasNextLine()) {
				String[] data = fileReader.nextLine().split(",");
				Camera camera = new Camera(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]),
						Double.parseDouble(data[5]), data[6]);
				
				cameraData = Arrays.copyOf(cameraData, cameraData.length+1);
				cameraData[cameraData.length-1] = camera;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
