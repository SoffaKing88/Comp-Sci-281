//Nick Soffa
//Comp Sci 281
//10-23-14

import java.io.*;
import java.util.*;

public class LoneSurvivor{
	public static void main(String args[]){

		int numValues = Integer.parseInt(args[0]);
		int count = Integer.parseInt(args[1]);
		
		CircularList list = new CircularList(numValues);

		System.out.println(list.count(count));

	}
}

class CircularList{

	public ArrayList<String> circleList;

	public CircularList(int numValues){
		circleList = new ArrayList<String>();
		for(int i = 0; i < numValues; i++){
			circleList.add(String.valueOf(i));
		}
	}

	public String count(int countBy){
		String winner;
		int listCounter = 0;
		while(circleList.size() > 1){
			listCounter += countBy;
			if(listCounter >= circleList.size()){
				listCounter -= circleList.size();
			}
		
			circleList.remove(listCounter);
		}
		winner = circleList.get(0);
		return winner;
	}
}