package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		String[] station_name = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		int[] check_box = new int[station_name.length];
		String name;
		boolean flag = false;
		boolean roop = false;
		int num = 0;

		for (int i = 0; i < check_box.length; i++) {

			check_box[i] = 0;

		}

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("ゲームスタート！\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (roop == false) {

			flag = false;
			name = reader.readLine();

			for (int i = 0; i < check_box.length; i++) {

				if (station_name[i].equals(name) && check_box[i] == 0) {

					check_box[i] = 1;
					num += 1;
					flag = true;

					if (num == station_name.length) {

						roop = true;

					}

					break;

				}

			}

			if (flag == false) {

				System.out.println(name + "  <----------------------入力ミス");
				System.out.println("あなたの負けです！");
				roop = true;

			}

		}

		if (num == station_name.length) {

			System.out.println("あなたの勝ちです！");

		}
	}

}
