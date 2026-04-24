/**
 * 第7章 武士のお仕事
 *
 * 問題11 instanceof演算子
 *
 * instanceof演算子を利用する。
 *
 * 侍クラスの配列に（藩士、浪人）をランダムに入れ、
 * それぞれの人数を表示してください。
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれの人数を表示してみます。
 *
 * 藩士：3人
 *
 * 浪人：2人
 *
 */

package lesson07.challenge11;

//ここにSamuraiクラスを記述
abstract class Samurai {

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	abstract void work();

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {

	protected String domain;
	static int sum_retainer = 0;

	/**
	 * @return sum_retainer
	 */
	public static int getSum_retainer() {
		return sum_retainer;
	}

	public Retainer() {
		sum_retainer += 1;
	}

	/**
	 * 
	 */
	public Retainer(String name, String domain) {
		this.name = name;
		this.domain = domain;
	}

	@Override
	void work() {

		System.out.println("年貢を取り立てるよ～。");

	}

	@Override
	public String toString() {
		String str = "拙者は" + domain + "藩士、" + name + "ともうす。";
		return str;
	}

	@Override
	public boolean equals(Object object) {
		boolean match;
		Retainer retainer = (Retainer) object;
		if (this.domain.equals(retainer.domain)) {
			return match = true;
		} else {
			return match = false;
		}
	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai {

	static int sum_ronin = 0;

	/**
	 * @return sum_ronin
	 */
	public static int getSum_ronin() {
		return sum_ronin;
	}

	/**
	 * 
	 */
	public Ronin() {
		sum_ronin += 1;
	}

	/**
	 * 
	 */
	public Ronin(String name) {
		this.name = name;
	}

	void covered() {
		super.fight();
		System.out.println("傘張りするよ～。");
	}

	@Override
	void work() {

		System.out.println("傘張るよ～。");

	}

	@Override //re
	public String toString() {
		String str = "拙者は武州○△□村の浪人" + name + "ともうす。";
		return str;
	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("5人の侍を配列に詰めます。\n");

		//ここに適切な処理を記述
		Samurai[] class_array = new Samurai[5];
		for (int i = 0; i < class_array.length; i++) {
			int num = (int) ((Math.random() * 10) % 2 + 1);
			if (num == 1) {
				class_array[i] = new Retainer();
			} else {
				class_array[i] = new Ronin();
			}

		}

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれの人数を表示してみます。\n");

		int retainerCount = 0;
		int roninCount = 0;

		//ここに適切な処理を記述
		retainerCount = Retainer.sum_retainer;
		roninCount = Ronin.sum_ronin;

		System.out.println("藩士：" + retainerCount + "人");
		System.out.println("\n浪人：" + roninCount + "人");
	}
}
