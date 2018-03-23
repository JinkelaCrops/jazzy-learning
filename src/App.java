import com.swabunga.model.EN_US;
import com.swabunga.model.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Language enUS = new EN_US();
        String src = "0.09 0. 09 0 .09 ds. <IIIIIIo ipo.>...<>";
//        List<Character> bracket = new ArrayList<>();
//        char[] charSrc = src.toCharArray();
//        for (int i = 0; i < charSrc.length; i++) {
//            switch (charSrc[i]) {
//                case '.':
//                    if (charSrc[i - 1] != '0' || charSrc[i + 1] != '0') {
//                        System.out.println(i);
//                    }
//                case '<':
//                    System.out.println(i);
//                    bracket.add('<');
//            }
//        }

        Pattern p = Pattern.compile("\\.\\.\\.|\\.|<|>");
        Matcher m = p.matcher(src);
        while (m.find()) {
            switch (m.group(0)) {
                case "...":
                    System.out.println("... " + m.start() + "-" + m.end());
                    break;
                case ".":
                    if (!src.substring(m.start() - 1, m.start()).equals("0") || !src.substring(m.end(), m.end() + 1).equals("0")) {
                        System.out.println(". " + m.start());
                    }
                    break;
                case "<":
                    System.out.println("< " + m.start());
                    break;
                case ">":
                    System.out.println("> " + m.start());
                    break;
            }
        }

    }
}
