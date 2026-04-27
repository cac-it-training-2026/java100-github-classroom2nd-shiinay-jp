/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ここにOmegalianクラスを記述する
class Omegalian {

	private String item;

	/**
	 * @return item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item セットする item
	 */
	public void setItem(String item) {

		Pattern p = Pattern.compile("([0-9])[^0-9]*$");
		Matcher m = p.matcher(item);

		if (m.find()) {

			String end_num = m.group();

			char ch = end_num.charAt(0);

			end_num = changeLastChar(ch);

			this.item = item.substring(0, m.start(1)) + end_num + item.substring(m.end(1));

		} else {

			this.item = item;

		}

	}

	private String changeLastChar(char ch) {

		String end_word;

		switch (ch) {
		case '1':
			end_word = "one";
			break;
		case '2':
			end_word = "two";
			break;
		case '3':
			end_word = "three";
			break;
		case '4':
			end_word = "four";
			break;
		case '5':
			end_word = "five";
			break;
		case '6':
			end_word = "six";
			break;
		case '7':
			end_word = "seven";
			break;
		case '8':
			end_word = "eight";
			break;
		case '9':
			end_word = "nine";
			break;
		case '0':
			end_word = "zero";
			break;
		default:
			end_word = String.valueOf(ch);
			break;
		}

		return end_word;

	}

}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		item = omegalian.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
