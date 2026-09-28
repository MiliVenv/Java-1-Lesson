import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File dir = new File("test");
        boolean event = dir.mkdir();

        for(int i = 0; i <= 20; i++) {
            File f = new File(dir, "test_" + i + ".txt");
            f.createNewFile();
            try (OutputStream os = new FileOutputStream(f)) {
                os.write(("Java " + i).getBytes(StandardCharsets.UTF_8));
            }
        }

        for (File file : dir.listFiles()) {
            try (InputStream os = new FileInputStream(file)) {
                byte[] byte_array = os.readAllBytes();
                String content = new String(byte_array, StandardCharsets.UTF_8);
                if (content.equals("Java 7")) {
                    System.out.println("Нашёл вот он " + file.getName());
                }else {
                    System.out.println(file.getName());
                }
            }
        }

        System.out.println("\n2 Способ");

        for (File file : dir.listFiles()) {
            try (FileReader fr = new FileReader(file); Scanner sc = new Scanner(fr)) {

                while (sc.hasNextLine()) {
                    if (sc.nextLine().equals("Java 7")) {
                        System.out.println("Нашёл вот он " + file.getName());
                    }else {
                        System.out.println(file.getName());
                    }
                }
            }
        }

        for(int i = 0; i <= 20; i++) {
            File f = new File(dir, "test_" + i + ".txt");
            f.createNewFile();
            try (FileWriter os = new FileWriter(f, true)) {
                os.write("\nNice " + i);
            }
        }

        System.out.println("\n3 Способ");

        for(int i = 0; i <= 20; i++) {
            File f = new File(dir, "test_" + i + ".txt");
            f.createNewFile();
            try (OutputStream os = new FileOutputStream(f); BufferedOutputStream bf = new BufferedOutputStream(os)) {
                bf.write(("Java " + i).getBytes(StandardCharsets.UTF_8));
            }
        }

        for (File file : dir.listFiles()) {
            try (InputStream os = new FileInputStream(file); BufferedInputStream bf = new BufferedInputStream(os)) {
                byte[] byte_array = bf.readAllBytes();
                String content = new String(byte_array, StandardCharsets.UTF_8);
                if (content.equals("Java 7")) {
                    System.out.println("Нашёл вот он " + file.getName());
                }else {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
