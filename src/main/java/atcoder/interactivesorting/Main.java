package atcoder.interactivesorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		// init
		String[] s = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = String.valueOf((char) ("A".charAt(0) + i));
		}
		
		List<String> temp = new ArrayList<String>();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-1; j++) {
				if (temp.size() == Q) {
					break;
				}
				if (temp.contains(s[j]+s[j+1]) || temp.contains(s[j+1]+s[j])) {
					continue;
				} else {
					temp.add(s[j]+s[j+1]);
					System.out.println("? " + s[j] + " " + s[j+1]);
					if (sc.hasNext()) {
						String ans = sc.next();
						if (">".equals(ans)) {
							String swap = s[j+1];
							s[j+1] = s[j];
							s[j] = swap;
						}
					}
				}
			}
		}
		String ansstr = "! ";
		for (int i = 0; i < N; i++) {
			ansstr += s[i];
		}
		System.out.println(ansstr);
	}

}
