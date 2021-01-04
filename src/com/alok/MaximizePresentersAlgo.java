/**
 * 
 */
package com.alok;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * @author Alok Soni
 *
 */
public class MaximizePresentersAlgo {
	public static void main(String[] args) {
		MaximizePresentersAlgo obj = new MaximizePresentersAlgo();
		if(!obj.isFileExist()) {
			System.out.println("Presentation_File.csv file not found");
			return;
		}
		List<Presentation> list = obj.readPresentationFile();
		if(list == null) {
			System.out.println("Given presentation list is empty");
			return;
		}
		
		Comparator<Presentation> comparator = Comparator.comparing(Presentation:: getNoOfHours)
														.thenComparing(Presentation::getPresentationCost);
		List<Presentation> sortedList = list.stream().sorted(comparator).collect(Collectors.toList());
		
		System.out.println("Presenters list");
		System.out.println(
				"Presenter Name" + "	" + "No. of Hours for Presentation" + "	" + "Cost benefit for presenter");
		System.out.println(sortedList);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide the no of hours in session:");
		int sessionHour = scanner.nextInt();
		scanner.close();
		System.out.println("Total Number of sessions are : ");
		List<Presentation> result = obj.getNumberOfSessions(sessionHour, sortedList);
		if (result == null || result.isEmpty()) {
			System.out.println("Not enough presenters");
		} else {
			System.out.println(result);
		}

	}

	public boolean isFileExist(){
		return new File("Presentation_File.csv").exists();
	}
	public List<Presentation> getNumberOfSessions(int hours, List<Presentation> list) {
		List<Presentation> result = new ArrayList<>();
		int totalHour = 0;
		for (int i = 0; i < list.size(); i++) {
			Presentation presentation = list.get(i);
			if (presentation.getNoOfHours() <= (hours / 2) && hours >= (totalHour + presentation.getNoOfHours())) {
				totalHour = totalHour + presentation.getNoOfHours();
				result.add(presentation);
			}else if(totalHour != hours) {	//This is to add the session if total hours is not equal to the given hour so will take session(not fully utllized)
				result.add(presentation);
				break;
			}
		}
		return result;
	}

	/**
	 * Method to Read the csv file
	 * 
	 * @return - List of Presentation
	 */
	public List<Presentation> readPresentationFile() {
		try {
			String line = "";
			String splitBy = ",";
			int counter = 0;
			List<Presentation> list = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader("Presentation_File.csv"));
			while ((line = br.readLine()) != null) {
				if (counter == 0) {
					counter++;
					continue;
				}
				String[] presentation = line.split(splitBy);
				Presentation pre = getPresentation(presentation);
				list.add(pre);
			}
			br.close();
			return list;
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Presentation_File.csv file not found");
		}
		return null;
	}

	/**
	 * Method to create the presentation object from array(row data in csv)
	 * 
	 * @param arr - row data in csv
	 * @return - Presentation object
	 */
	public Presentation getPresentation(String[] arr) {
		Presentation presentation = new Presentation(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2].substring(1)));		
		return presentation;
	}

}
