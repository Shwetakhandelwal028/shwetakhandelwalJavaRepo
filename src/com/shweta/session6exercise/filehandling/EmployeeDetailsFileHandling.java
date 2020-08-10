package com.shweta.session6exercise.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeDetailsFileHandling {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Employee.txt");
		FileWriter fileWriter = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Employee name");
		String empName = input.nextLine();
		try {
			file.createNewFile();
			if(file.exists()) {
				fileWriter = new FileWriter(file);
				
				fileWriter.write(empName);
				System.out.println("File found : "+file.getName());
				System.out.println("File found : "+file.getAbsolutePath());

			}else {
				
				throw new FileNotFoundException("File not found by name : "+file.getName());
			}
			
		} catch (IOException e) {
			System.out.println(" Error Occurred");
			e.printStackTrace();
		} finally {
			fileWriter.close();
		}
		}

	}


