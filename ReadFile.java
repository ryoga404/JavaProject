import java.io.File; //ファイルを操作するためのクラスをインポート
import java.io.FileReader; //ファイルを読み込むためのクラスをインポート
import java.io.FileNotFoundException; //指定したファイルが見つからない場合の例外をインポート
import java.io.IOException; //入出力中に発生する一般的な例外をインポート

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("../hello.txt");
            FileReader filereader = new FileReader(file); //ファイルオブジェクト生成
            int ch; //文字を格納する整数型を宣言
            while((ch = filereader.read()) != -1) { //read()はファイルの終わりに達すると-1をかえすのでそうでない間ループ
                System.out.print((char)ch); //整数を文字列型に変換して出力（文字を整数に→その整数を文字に復元）
            }
            filereader.close(); //Closeしてリソース開放
        } catch (FileNotFoundException e) { //エラーハンドリング
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
