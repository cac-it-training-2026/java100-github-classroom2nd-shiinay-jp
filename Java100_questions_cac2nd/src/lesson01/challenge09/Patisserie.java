/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		 * それぞれの合計金額およびすべての合計金額を算出
		 */
		double shitoron_sum = shitoron_num_2 * 250;
		double shokora_sum = shokora_num_2 * 280;
		double pisutashu_sum = pisutashu_num_2 * 320;
		double all_sum = shitoron_sum + shokora_sum + pisutashu_sum;
		/**
		 * 以下、購入個数および料金を表示
		 */
		System.out.println("シトロン　　　" + shitoron + "個");
		System.out.println("ショコラ　　　" + shokora + "個");
		System.out.println("ピスターシュ　" + pisutashu + "個\n");
		System.out.println("合計個数　　" + (shitoron_num_2 + shokora_num_2 + pisutashu_num_2) + "個");
		System.out.println("合計金額　" + (int) all_sum + "円\n");
		System.out.println("をお買い上げですね。\n承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + (int) (shitoron_num - shitoron_num_2) + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (int) (shokora_num - shokora_num_2) + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (int) (pisutashu_num - pisutashu_num_2) + "個");

		System.out.println("閉店時間となりました。\nまたのお越しをお待ちしております。\n");
		System.out.println("売上割合");
		System.out.println("売上合計　　　\\" + (int) all_sum + "\n");

		System.out.println("内訳");
		System.out.printf("シトロン　　　\\%d・・・%.1f%%\n", (int) shitoron_sum, shitoron_sum / all_sum * 100);
		System.out.printf("ショコラ　　　\\%d・・・%.1f%%\n", (int) shokora_sum, shokora_sum / all_sum * 100);
		System.out.printf("ピスターシュ　\\%d・・・%.1f%%\n", (int) pisutashu_sum, pisutashu_sum / all_sum * 100);

		System.out.println("明日の三食マカロンの配合が決まりました！\n");

		System.out.printf("シトロンの味　　　・・・%.1f%%\n", shitoron_sum / all_sum * 100);
		System.out.printf("ショコラの味　　　・・・%.1f%%\n", shokora_sum / all_sum * 100);
		System.out.printf("ピスターシュの味　・・・%.1f%%\n", pisutashu_sum / all_sum * 100);

		System.out.println("が楽しめます!\n\n値段は270円です。");

	}

}
