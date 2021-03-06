package com.swabunga.spell.event;


/**
 * This class tokenizes a input string.
 * <p>
 * <p>
 * It also allows for the string to be altered by calls to replaceWord(). The result after the spell
 * checking is completed is available to the call to getContext.
 * </p>
 *
 * @author Jason Height (jheight@chariot.net.au)
 * @author Anthony Roy  (ajr@antroy.co.uk)
 */
public class StringWordTokenizer
        extends AbstractWordTokenizer {

    //~ Constructors ............................................................

    /**
     * Creates a new StringWordTokenizer object.
     *
     * @param s the string to tokenize.
     */
    public StringWordTokenizer(String s) {
        super(s);
    }

    /**
     * Creates a new StringWordTokenizer object.
     *
     * @param wf the custom WordFinder to use in tokenizing. Note
     *           that the string to tokenize will be encapsulated within the WordFinder.
     */
    public StringWordTokenizer(WordFinder wf) {
        super(wf);
    }

    //~ Methods .................................................................

    /**
     * @return the final text.
     * @deprecated use getContext() instead as per the WordTokenizer
     * interface specification.
     */
    public String getFinalText() {

        return getContext();
    }

    /**
     * Replace the current word in the iteration with the String s.
     *
     * @param s the String to replace the current word.
     * @throws WordNotFoundException current word not yet set.
     */
    public void replaceWord(String s) {
        finder.replace(s);
    }
}