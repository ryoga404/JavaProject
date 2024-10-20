import java.io.File;
import java.util.Scanner;

@SuppressWarnings("resource")

public class DeleteFile {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("削除するファイルパスを入力:");
        String file_path = scanner.nextLine();
        File file = new File(file_path);

        if (file.delete()) {
            System.out.println("ファイルを削除しました");
        } else {
            System.out.println("ファイルの削除に失敗しました");
        }
    }
}
