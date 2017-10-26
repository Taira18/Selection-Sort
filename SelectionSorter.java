import java.util.*;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
		
		for (int h = wordList.size()-1; h > 0; h--) {
			for (int i = 0; i < wordList.size(); i++ ) {
				
					if (wordList.get(i).compareTo(wordList.get(h))>0) {
						Collections.swap(wordList, i, h);
					}
				
			}
		}
		
	}
}
