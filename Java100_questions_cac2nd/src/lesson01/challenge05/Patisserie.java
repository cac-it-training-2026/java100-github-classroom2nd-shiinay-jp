/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Patisserieクラス
 */
public class Patisserie {

	public static void main(String[] args) throws IOException {

		/**
		 * シトロンの個数
		 */
		int shitoron_num;
		/**
		 * ショコラの個数
		 */
		int shokora_num;
		/**
		 * ピスターシュの個数
		 */
		int pisutashu_num;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		/**
		 * 最大３０個まで購入数を入力
		 */
		System.out.println("それぞれ何個ずつ買いますか？（最大３０個まで）");

		System.out.print("シトロン　　　>");
		String shitoron = reader.readLine();
		shitoron_num = Integer.parseInt(shitoron);

		System.out.print("ショコラ　　　>");
		String shokora = reader.readLine();
		shokora_num = Integer.parseInt(shokora);

		System.out.print("ピスターシュ　>");
		String pisutashu = reader.readLine();
		pisutashu_num = Integer.parseInt(pisutashu);

		/**
		 * それぞれの購入個数と合計金額を表示
		 */
		System.out.println("シトロン　　　" + shitoron + "個");
		System.out.println("ショコラ　　　" + shokora + "個");
		System.out.println("ピスターシュ　" + pisutashu + "個\n");
		System.out.println("合計個数　　" + (shitoron_num + shokora_num + pisutashu_num) + "個");
		System.out.println("合計金額　" + (shitoron_num * 250 + shokora_num * 280 + pisutashu_num * 320) + "円\n");
		System.out.println("をお買い上げですね。\n承りました。");

	}

}
