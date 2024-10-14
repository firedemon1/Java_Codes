package _9_OOPs;

enum WEEKDAY_17_4 {

	// override the toString() method for custom description
	MONDAY {
		@Override
		public String toString() {
			return "Day 1";
		}
	},
	TUESDAY {
		@Override
		public String toString() {
			return "Day 2";
		}
	},
	WEDNESDAY {
		@Override
		public String toString() {
			return "Day 3";
		}
	},
	THRUSDAY {
		@Override
		public String toString() {
			return "Day 4";
		}
	},
	FRIDAY {
		@Override
		public String toString() {
			return "Day 5";
		}
	},
	SATURDAY {
		@Override
		public String toString() {
			return "Day 6";
		}
	},
	SUNDAY {
		@Override
		public String toString() {
			return "Day 7";
		}
	};
}

public class _17_4_EnumString2 {
	public static void main(String[] args) {
		// invoke toString() internally
		System.out.println(WEEKDAY_17_4.MONDAY);
		// invoke toString explicitly
		System.out.println(WEEKDAY_17_4.TUESDAY.toString());
		// invoke name() method to get the default name
		System.out.println(WEEKDAY_17_4.WEDNESDAY.name());
	}
}