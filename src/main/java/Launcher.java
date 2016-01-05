import org.yetiz.utils.CardGenerator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by yeti on 16/1/5.
 */
public class Launcher {

	private static Random random = new Random(System.currentTimeMillis());
	private static SimpleDateFormat MMYY = new SimpleDateFormat("MMYY");
	private static Calendar current = Calendar.getInstance();

	public static void main(String... args) {
		if (args.length != 3) {
			System.out.println("java -jar givemecard-1.0.jar <[A]mericanExpress, [C]hina Union Pay, [J]CB, [M]asterCard, [V]isa> <count> <with expire date?[Y/N]>");
			System.exit(1);
		}
		String type = args[0];
		int count = Integer.parseInt(args[1]);
		boolean withExpireDate = args[2].equals("Y");
		if (withExpireDate)
			System.out.println("    Card No\t Expire Date");
		else
			System.out.println("    Card No");
		for (int i = 0; i < count; i++) {
			switch (type) {
				case "A":
					System.out.print(CardGenerator.AmericanExpress() + (withExpireDate ? "" : "\n"));
					break;
				case "C":
					System.out.print(CardGenerator.ChinaUnionPay() + (withExpireDate ? "" : "\n"));
					break;
				case "J":
					System.out.print(CardGenerator.JCB() + (withExpireDate ? "" : "\n"));
					break;
				case "M":
					System.out.print(CardGenerator.MasterCard() + (withExpireDate ? "" : "\n"));
					break;
				case "V":
					System.out.print(CardGenerator.Visa() + (withExpireDate ? "" : "\n"));
					break;
			}
			if (withExpireDate) {
				Calendar calendar = Calendar.getInstance();
				calendar.set(random.nextInt(10) + current.get(Calendar.YEAR), random.nextInt(12) + 1, 1);
				System.out.println("\t" + MMYY.format(calendar.getTime()));
			}
		}
	}
}
