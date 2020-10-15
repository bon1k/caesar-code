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
    static int repIndex;
    public static void main(String[] args)  {
        String mail = ("Еъёчхф Вхзёюлх")
                .replaceAll("\\p{Punct}"," ").toLowerCase();

        List<Character> alphavit = new ArrayList<Character>(Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к',
                'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к',
                'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'));


        List<Character> rez = new ArrayList<Character>();
        int step = 1;
        while (step<32){

        for (int i = 0; i < mail.length(); i++) {
            for (int j = 0; j < 32; j++) {
                if (mail.charAt(i) == alphavit.get(j)){
                   rez.add(alphavit.get(j+step));
                }
            }
        }
        System.out.println(rez+" "+step);
        step++;
        rez.clear();
        }
    }
}

