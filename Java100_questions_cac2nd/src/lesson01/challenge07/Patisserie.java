/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double shitoron_num = 30.0;
		/**
		 * ショコラの在庫個数
		 */
		double shokora_num = 30.0;
		/**
		 * ピスターシュの在庫個数	
		 */
		double pisutashu_num = 30.0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・" + shitoron_num + "個");
		System.out.println("ショコラ　　　\\280・・・" + shokora_num + "個");
		System.out.println("ピスターシュ　\\320・・・" + pisutashu_num + "個");

		/**
		 * 購入数をユーザーが入力
		 */
		System.out.println("それぞれ何個ずつ買いますか？");

		System.out.print("シトロン　　　>");
		String shitoron = reader.readLine();
		double shitoron_num_2 = Double.parseDouble(shitoron);

		System.out.print("ショコラ　　　>");
		String shokora = reader.readLine();
		double shokora_num_2 = Double.parseDouble(shokora);

		System.out.print("ピスターシュ　>");
		String pisutashu = reader.readLine();
		double pisutashu_num_2 = Double.parseDouble(pisutashu);

		/**
		 * 以下、購入個数および料金を表示
		 */
		System.out.println("シトロン　　　" + shitoron + "個");
		System.out.println("ショコラ　　　" + shokora + "個");
		System.out.println("ピスターシュ　" + pisutashu + "個\n");
		System.out.println("合計個数　　" + (shitoron_num_2 + shokora_num_2 + pisutashu_num_2) + "個");
		System.out
				.println("合計金額　" + (int) (shitoron_num_2 * 250 + shokora_num_2 * 280 + pisutashu_num_2 * 320) + "円\n");
		System.out.println("をお買い上げですね。\n承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + (int) (shitoron_num - shitoron_num_2) + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (int) (shokora_num - shokora_num_2) + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (int) (pisutashu_num - pisutashu_num_2) + "個");

	}

}
