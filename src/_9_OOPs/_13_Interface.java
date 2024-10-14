package _9_OOPs;

interface Sports {
	public void setHomeTeam(String name);

	public void setVisitingTeam(String name);
}

interface Football extends Sports {
	public void homeTeamScored(int points);

	public void visitingTeamScored(int points);

	public void endOfQuarter(int quarter);
}

interface Hockey extends Sports {
	public void homeGoalScored();

	public void visitingGoalScored();

	public void endOfPeriod(int period);

	public void overtimePeriod(int ot);
}

public class _13_Interface implements Hockey {

	public void setHomeTeam(String name) {
		System.out.println("Home team: " + name);
	}

	public void setVisitingTeam(String name) {
	}

	public void homeGoalScored() {
	}

	public void visitingGoalScored() {
	}

	public void endOfPeriod(int period) {
	}

	public void overtimePeriod(int ot) {
	}

	public static void main(String[] args) {
		Hockey hockeyDemo = new _13_Interface();
		hockeyDemo.setHomeTeam("India");
	}
}