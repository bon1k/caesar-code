import java.io.*;
import java.nio.charset.StandardCharsets;

public class CaesarCode {
    public static void main(String[] args) {

        File file = new File("D:\\DevelopJava\\caesar-code\\respositori file\\code.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String mail = bufferedReader.readLine().replaceAll("\\p{Punct}"," ").toLowerCase();;

            char[] charMail = mail.toCharArray();
            char [] alpfavit = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к',
                    'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};


            System.out.println(alpfavit);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
