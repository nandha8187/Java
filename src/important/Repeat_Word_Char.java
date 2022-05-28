package important;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repeat_Word_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s ="never let the fear of striking out stop you from playing the game";

		String[] words =s.split("");

		System.out.println(s);

		Map<String, Integer> m =new LinkedHashMap<String,Integer>();

		for (String word : words) {

			if(m.containsKey(word))

			{

				Integer value =m.get(word);

				m.put(word, value+1);

			}

			else {
				m.put(word, 1);
			}

		}

		System.out.println(m);  

		Set<Entry<String, Integer>> entrySet = m.entrySet();	//to iterate amap,entryset is used

		for (Entry<String, Integer> entry : entrySet) {

			if(entry.getValue() >1) {

				System.out.println(entry);


			}  

		}


	}

}
