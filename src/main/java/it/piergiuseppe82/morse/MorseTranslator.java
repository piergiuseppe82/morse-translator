package it.piergiuseppe82.morse;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MorseTranslator 
{
	private static final Map<String, String> txt2MorseMap;
	private static final Logger log = LoggerFactory.getLogger(MorseTranslator.class);
	    	
	static {
       		Map<String, String> aMap = new HashMap<String,String>();
	
        	aMap.put(" ", " ");//SPACE
		aMap.put("A", ".-");
		aMap.put("B", "-...");
		aMap.put("C", "-.-.");
		aMap.put("D", "-..");
		aMap.put("E", ".");
		aMap.put("F", "..-.");
		aMap.put("G", "--.");
		aMap.put("H", "....");
		aMap.put("I", "..");
		aMap.put("J", ".---");
		aMap.put("K", "-.-");
		aMap.put("L", ".-..");
		aMap.put("M", "--");
		aMap.put("N", "-.");
		aMap.put("O", "---");
		aMap.put("P", ".--.");
		aMap.put("Q", "--.-");
		aMap.put("R", ".-.");
		aMap.put("S", "...");
		aMap.put("T", "-");
		aMap.put("U", "..-");
		aMap.put("V", "...-");
		aMap.put("W", ".--");
		aMap.put("X", "-..-");
		aMap.put("Y", "-.--");
		aMap.put("Z", "--..");
		aMap.put("0", "-----");
		aMap.put("1", ".----");
		aMap.put("2", "..---");
		aMap.put("3", "...--");
		aMap.put("4", "....-");
		aMap.put("5", ".....");
		aMap.put("6", "-....");
		aMap.put("7", "--...");
		aMap.put("8", "---..");
		aMap.put("9", "----.");
		aMap.put("Ä", ".-.-");
		aMap.put("Á", ".--.-");
		aMap.put("Å", ".--.-");
		aMap.put("É", "..-..");
		aMap.put("Ñ", "--.--");
		aMap.put("Ö", "---.");
		aMap.put("Ü", "..--");

       		txt2MorseMap = Collections.unmodifiableMap(aMap);
   	}
    	
	public static String toMorse(String txt)
    	{
		String ret = "";
		if(txt != null){
			log.debug("Start translation - Input:"+txt);
			txt = txt.toUpperCase();
		  	for(int i = 0; i < txt.length(); i ++){
				char c = txt.charAt(i);
				String tmpCode = txt2MorseMap.get(""+c);
				ret = ret + tmpCode + " ";
				log.debug(ret);
		 	}
		 	
		}
		log.debug("End translation - Output: "+ret);
		return ret.trim();
    }
    	
}
