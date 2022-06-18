package day4.question4;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IPL i = new IPL();
		i.homeTeamStadium(Stadium.EDEN_GARDENS_STADIUM);
		sc.close();
	}
}
