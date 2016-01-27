package it.piergiuseppe82.morse;

import org.junit.Test;
import org.junit.Assert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MorseTranslatorTest 
{
	private static final Logger log = LoggerFactory.getLogger(MorseTranslatorTest.class);
    @Test
    public void testTxtToMorse()
    {
    	log.debug("Avvio test testTxtToMorse");
    	String morseCode = MorseTranslator.toMorse("CIAO MONDO");
   		Assert.assertEquals("-.-. .. .- ---   -- --- -. -.. ---",morseCode);
   		log.debug("Test testTxtToMorse: OK ");
    	  		
    }

    @Test
    public void testTxtToMorseUnsensitiveCase()
    {
    	log.debug("Avvio test testTxtToMorseUnsensitiveCase");
    	String morseCode = MorseTranslator.toMorse("ciao mondo");
	   	Assert.assertEquals("-.-. .. .- ---   -- --- -. -.. ---",morseCode);
	   	log.debug("Test testTxtToMorseUnsensitiveCase: OK ");
   		
    }
}