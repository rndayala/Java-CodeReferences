package com.rdayala.problemsolving;

public class MinimumDistance {
	public int solve(String A) {
		int dis = -1;
		int mindis = -1;
		int startIndex = -1;
		boolean charXFoundFlag = false;
		char[] strArray = A.toCharArray();
		int length = A.length();
		for (int i = 0; i < length; i++) {
			// System.out.println(strArray[i]);
			if (strArray[i] == 'x') {
				// System.out.println("char x found");
				if (startIndex == -1 && !charXFoundFlag) {
					startIndex = i;
				} else {
					if (!charXFoundFlag) {
						dis = i - startIndex;
						startIndex = i;
					} else {
						startIndex = i;
					}
				}
				charXFoundFlag = true;
			}
			if (strArray[i] == 'o') {
				if (startIndex == -1) {
					startIndex = i;
				} else {
					if (charXFoundFlag) {
						dis = i - startIndex;
						startIndex = i;
						charXFoundFlag = false;
					} else {
						startIndex = i;
					}
				}
			}
			if (mindis == -1) {
				mindis = dis;
			} else if (dis < mindis) {
				mindis = dis;
			}

		}

		return mindis;
	}

	public static void main(String[] args) {
		MinimumDistance md = new MinimumDistance();
		// int dist = md.solve("x...o.x...o");
		// int dist = md.solve("o..o.xx.ooo.x.o.o");
		int dist = md.solve("o....o");
		System.out.println(dist);
	}
}
