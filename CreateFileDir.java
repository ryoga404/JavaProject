import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileDir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scannerオブジェクト作成

        try {
            System.out.print("ディレクトリ作成:1/ファイル作成:2: ");
            int choice = scanner.nextInt(); //整数を受け取る
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("新しく作成するディレクトリのパス: ");
                String dirName = scanner.nextLine();
                File dir = new File(dirName); //指定されたパスを作成する

                if (!dir.exists()) {
                    boolean created = dir.mkdir();
                    if (created) {
                        System.out.println("ディレクトリが作成されました: " + dir.getAbsolutePath());
                    } else {
                        System.out.println("ディレクトリの作成に失敗しました。");
                    }
                } else {
                    System.out.println("指定されたディレクトリはすでに存在します: " + dir.getAbsolutePath());
                }
            } else if (choice == 2) {
                System.out.print("作成したいファイルのパス（フルパス）: ");
                String fileName = scanner.nextLine();
                File file = new File(fileName);

                // ファイルの存在を確認し、存在しなければ新しいファイルを作成
                if (!file.exists()) {
                    boolean created = file.createNewFile();
                    if (created) {
                        System.out.println("ファイルが作成されました: " + file.getAbsolutePath());
                    } else {
                        System.out.println("ファイルの作成に失敗しました。");
                    }
                } else {
                    System.out.println("指定されたファイルはすでに存在します: " + file.getAbsolutePath());
                }
            } else {
                System.out.println("無効な選択です。1または2を選んでください。");
            }
        } catch (IOException e) {
            System.out.println("エラーが発生しました: " + e.getMessage());
        } finally {
            // Scannerを閉じる
            scanner.close();
        }
    }
}
