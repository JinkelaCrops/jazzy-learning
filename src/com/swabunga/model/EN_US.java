package com.swabunga.model;

import java.util.ArrayList;
import java.util.List;

public class EN_US extends Language {
    public EN_US() {
        List<String[]> brackets = new ArrayList<>();
        brackets.add(new String[]{"(", ")"});
        brackets.add(new String[]{"<", ">"});
        this.setBrackets(brackets);
        List<String> withSpaceAhead = new ArrayList<>();
        withSpaceAhead.add("(");
        withSpaceAhead.add("<");
        this.setPunctuationSpaceAhead(withSpaceAhead);
        List<String> withoutSpaceAhead = new ArrayList<>();
        withoutSpaceAhead.add(")");
        withoutSpaceAhead.add(">");
        this.setPunctuationNoSpaceAhead(withoutSpaceAhead);
        List<String> withSpaceBehind = new ArrayList<>();
        withSpaceBehind.add(")");
        withSpaceBehind.add(">");
        withSpaceBehind.add("(?<![0-9])\\.(?![0-9])"); // 0.09 | 0. 09 | 0 .09 | something .09  | 0.something
        this.setPunctuationSpaceBehind(withSpaceBehind);
        List<String> withoutSpaceBehind = new ArrayList<>();
        withoutSpaceBehind.add("(");
        withoutSpaceBehind.add("<");
        this.setPunctuationNoSpaceBehind(withoutSpaceBehind);
    }
}
