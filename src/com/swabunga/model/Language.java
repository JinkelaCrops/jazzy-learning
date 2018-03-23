package com.swabunga.model;

import java.util.List;
import java.util.Map;

public class Language {

    private Map<String, String> punctuationStem;

    private List<String[]> brackets;

    private List<String> punctuationSpaceAhead;

    private List<String> punctuationSpaceBehind;

    private List<String> punctuationNoSpaceAhead;

    private List<String> punctuationNoSpaceBehind;

    public Map<String, String> getPunctuationStem() {
        return punctuationStem;
    }

    public void setPunctuationStem(Map<String, String> punctuationStem) {
        this.punctuationStem = punctuationStem;
    }

    public List<String[]> getBrackets() {
        return brackets;
    }

    public void setBrackets(List<String[]> brackets) {
        this.brackets = brackets;
    }

    public List<String> getPunctuationSpaceAhead() {
        return punctuationSpaceAhead;
    }

    public void setPunctuationSpaceAhead(List<String> punctuationSpaceAhead) {
        this.punctuationSpaceAhead = punctuationSpaceAhead;
    }

    public List<String> getPunctuationSpaceBehind() {
        return punctuationSpaceBehind;
    }

    public void setPunctuationSpaceBehind(List<String> punctuationSpaceBehind) {
        this.punctuationSpaceBehind = punctuationSpaceBehind;
    }

    public List<String> getPunctuationNoSpaceAhead() {
        return punctuationNoSpaceAhead;
    }

    public void setPunctuationNoSpaceAhead(List<String> punctuationNoSpaceAhead) {
        this.punctuationNoSpaceAhead = punctuationNoSpaceAhead;
    }

    public List<String> getPunctuationNoSpaceBehind() {
        return punctuationNoSpaceBehind;
    }

    public void setPunctuationNoSpaceBehind(List<String> punctuationNoSpaceBehind) {
        this.punctuationNoSpaceBehind = punctuationNoSpaceBehind;
    }
}
