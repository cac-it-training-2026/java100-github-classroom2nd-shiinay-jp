/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Patisserieクラス
 */
public class Patisserie {

	public static void main(String[] args) throws IOException {

		/**
		 * 読み取り
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("それぞれ何個ずつ買いますか？（最大３０個まで）");
		/**
		 * 以下購入数の入力
		 */
		System.out.print("シトロン　　　>");
		String shitoron = reader.readLine();

		System.out.print("ショコラ　　　>");
		String shokora = reader.readLine();

		System.out.print("ピスターシュ　>");
		String pisutashu = reader.readLine();
		/**
		 * 購入数に応じて表示
		 */
		System.out.println("シトロン　　　" + shitoron + "個");
		System.out.println("ショコラ　　　" + shokora + "個");
		System.out.println("ピスターシュ　" + pisutashu + "個\n");
		System.out.println("をお買い上げですね。\n承りました。");

	}

}
