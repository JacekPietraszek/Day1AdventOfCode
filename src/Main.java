import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int sumAll = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("src/data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                List<Character> list = new ArrayList<>();

                System.out.println(line);
                for (int i = 0; i < line.length(); i++) {
                    char sym = line.charAt(i);
                    if (Character.isDigit(sym)) {
                        list.add(sym);
                    }
                }
                System.out.println(list);
                String number = list.get(0) + "" + list.get(list.size() - 1);
                int num = Integer.parseInt(number);
                System.out.println(num);
                sumAll +=num;
                System.out.println(sumAll);
            }

        }
    }
}