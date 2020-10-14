import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CaesarCode {
    public static void main(String[] args) {
        String mail = ("Еъёчхф Вхзёюлх, адздёиу ф ждэщхб")
                .replaceAll("\\p{Punct}"," ").toLowerCase();;


        List<Character> alphavit = new ArrayList<Character>(Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к',
                    'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'));

        int step = 1;
        String rez = "";

            for (int j = 0; j < alphavit.size() ; j++) {
                int repIndex = mail.indexOf(alphavit.get(0));
                rez = mail.replace(mail.charAt(repIndex), alphavit.get(step));
                ++ step;
                if (step == 32){
                 step = step-31;
                }
                System.out.println(rez);
            }


//
//        if (mail.charAt(0) == alphavit.get(5)){
//           String rez =  mail.replace(mail.charAt(0), alphavit.get(5+3));
//            System.out.println(rez);
//        }






    }
}
