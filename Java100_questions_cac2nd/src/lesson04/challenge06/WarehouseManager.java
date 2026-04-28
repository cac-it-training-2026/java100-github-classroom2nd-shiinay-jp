/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];
		int[] random = { 0, 0, 0, 0, 0 };
		int[] box = new int[5];
		int num = 0;
		int intputNum = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;

		//ここに重複チェックおよび値の代入処理を記述する
		for (int i = 0; i < 5; i++) {

			while (true) {

				num = 0;

				intputNum = (int) (Math.random() * 10) % 5 + 1;

				for (int j = 0; j < 5; j++) {

					if (intputNum != random[j]) {

						num += 1;

					}

				}

				if (num == 5) {

					random[i] = intputNum;
					break;

				}

			}

		}

		for (int i = 0; i < random.length; i++) {

			ABKosanArray[i] = random[i];

		}

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		for (int i = 0; i < box.length; i++) {

			if (ABKosanArray[i] == 1) {
				one = i;

			} else if (ABKosanArray[i] == 2) {
				two = i;

			} else if (ABKosanArray[i] == 3) {
				three = i;

			} else if (ABKosanArray[i] == 4) {
				four = i;
			}

		}

		ABKosanArray[one] = random[three];
		ABKosanArray[two] = random[four];
		ABKosanArray[three] = random[one];
		ABKosanArray[four] = random[two];

		System.out.println("入れ替え後の状態は、");
		for (int i = 0; i < ABKosanArray.length; i++) {
			System.out.print(ABKosanArray[i]);
			if (i != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
