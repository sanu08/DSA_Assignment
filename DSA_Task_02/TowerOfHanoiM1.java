package internetS.towerOfHanoi;

import java.util.Scanner;

public class TowerOfHanoiM1 {

	static int steps =1;
	public static int doTowers(int topN, char from, char inter, char to) {
		if (topN == 1) {
			steps++;
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter);
			steps++;
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);
		}
		return steps;
	}

	public static void main(String[] args) {
		//int nDisks = 4;
		 System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
		int step=doTowers(discs, 'A', 'B', 'C');
		System.out.println("Number of stpes is "+step);
	}

}