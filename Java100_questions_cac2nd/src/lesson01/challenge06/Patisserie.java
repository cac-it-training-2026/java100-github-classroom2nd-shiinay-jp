/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Patisserieクラス
 */
public class Patisserie {

	public static void main(String[] args) throws IOException {

		/**
		 * シトロンの在庫個数
		 */
		int shitoron_num = 30;
		/**
		 * ショコラの在庫個数
		 */
		int shokora_num = 30;
		/**
		 * ピスターシュの在庫個数
		 */
		int pisutashu_num = 30;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		/**
		 * おすすめ商品を表示（表示数：在庫数）
		 */
		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・" + shitoron_num + "個");
		System.out.println("ショコラ　　　\\280・・・" + shokora_num + "個");
		System.out.println("ピスターシュ　\\320・・・" + pisutashu_num + "個");

		/**
		 * 購入数の入力
		 */
		System.out.println("それぞれ何個ずつ買いますか？");

		System.out.print("シトロン　　　>");
		String shitoron = reader.readLine();
		int shitoron_num_2 = Integer.parseInt(shitoron);

		System.out.print("ショコラ　　　>");
		String shokora = reader.readLine();
		int shokora_num_2 = Integer.parseInt(shokora);

		System.out.print("ピスターシュ　>");
		String pisutashu = reader.readLine();
		int pisutashu_num_2 = Integer.parseInt(pisutashu);

		/**
		 * 以下、購入数及び在庫数を表示
		 */
		System.out.println("シトロン　　　" + shitoron + "個");
		System.out.println("ショコラ　　　" + shokora + "個");
		System.out.println("ピスターシュ　" + pisutashu + "個\n");
		System.out.println("合計個数　　" + (shitoron_num_2 + shokora_num_2 + pisutashu_num_2) + "個");
		System.out.println("合計金額　" + (shitoron_num_2 * 250 + shokora_num_2 * 280 + pisutashu_num_2 * 320) + "円\n");
		System.out.println("をお買い上げですね。\n承りました。");

		System.out.println("シトロン　　　\\250・・・残り" + (shitoron_num - shitoron_num_2) + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (shokora_num - shokora_num_2) + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (pisutashu_num - pisutashu_num_2) + "個");

	}

}
