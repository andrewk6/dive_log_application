import java.util.HashMap;
import java.util.Set;

public class Navy_Table{
	
	private static final HashMap<Integer, Character> depth_10ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_15ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_20ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_25ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_30ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_35ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_40ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_45ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_50ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_55ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_60ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_70ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_80ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_90ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_100ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_110ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_120ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_130ft = new HashMap<Integer, Character>();
	private static final HashMap<Integer, Character> depth_140ft = new HashMap<Integer, Character>();
	
	public static final char getLetter(int depth, int mins) {
		char letter = 'A';
		
		switch(depth) {
		case 10: letter = depth_table_check(depth_10ft, mins);
		}
		return letter;
	}
	
	private static final char depth_table_check(HashMap<Integer, Character> dep, int mins) {
		char let = ' ';
		Set<Integer> keys = dep.keySet();
		for(Integer i : keys) {
			if(!(i < mins)) {
				return dep.get(i);
			}
		}
		return let;
	}
	
	public static final int getNoDecompLim(int depth) {
		if(depth <= 55)
			depth = (int)(Math.ceil(depth / 5d) * 5);
		else
			depth = (int)(Math.ceil(depth / 10d) * 10);
		System.out.println("Depth: " + depth);
		
		switch(depth) {
		case 25: return 595;
		case 30: return 371;
		case 35: return 232;
		case 40: return 163;
		case 45: return 125;
		case 50: return 92;
		case 55: return 74;
		case 60: return 60;
		case 70: return 48;
		case 80: return 39;
		case 90: return 30;
		case 100: return 25;
		case 110: return 20;
		case 120: return 15;
		case 130: return 10;
		case 140: return 10;
		default:
			if(depth < 25)
				return -1;
			else
				return 5;
		}
	}
	
	public static final void fillTable10ft() {
		depth_10ft.put(57, 'A');
		depth_10ft.put(101, 'B');
		depth_10ft.put(158, 'C');
		depth_10ft.put(245, 'D');
		depth_10ft.put(426, 'E');
	}

	public static final void fillTable15ft() {
		depth_15ft.put(36, 'A');
		depth_15ft.put(60, 'B');
		depth_15ft.put(88, 'C');
		depth_15ft.put(121, 'D');
		depth_15ft.put(163, 'E');
		depth_15ft.put(217, 'F');
		depth_15ft.put(297, 'G');
		depth_15ft.put(449, 'H');
	}

	public static final void fillTable20ft() {
		depth_20ft.put(26, 'A');
		depth_20ft.put(43, 'B');
		depth_20ft.put(61, 'C');
		depth_20ft.put(82, 'D');
		depth_20ft.put(106, 'E');
		depth_20ft.put(133, 'F');
		depth_20ft.put(165, 'G');
		depth_20ft.put(205, 'H');
		depth_20ft.put(256, 'I');
		depth_20ft.put(330, 'J');
		depth_20ft.put(461, 'K');
	}

	public static final void fillTable25ft() {
		depth_25ft.put(20, 'A');
		depth_25ft.put(33, 'B');
		depth_25ft.put(47, 'C');
		depth_25ft.put(62, 'D');
		depth_25ft.put(78, 'E');
		depth_25ft.put(97, 'F');
		depth_25ft.put(117, 'G');
		depth_25ft.put(140, 'H');
		depth_25ft.put(166, 'I');
		depth_25ft.put(198, 'J');
		depth_25ft.put(236, 'K');
		depth_25ft.put(285, 'L');
		depth_25ft.put(354, 'M');
		depth_25ft.put(469, 'N');
		depth_25ft.put(596, 'O');
	}

	public static final void fillTable30ft() {
		depth_30ft.put(17, 'A');
		depth_30ft.put(27, 'B');
		depth_30ft.put(38, 'C');
		depth_30ft.put(50, 'D');
		depth_30ft.put(62, 'E');
		depth_30ft.put(76, 'F');
		depth_30ft.put(91, 'G');
		depth_30ft.put(107, 'H');
		depth_30ft.put(125, 'I');
		depth_30ft.put(145, 'J');
		depth_30ft.put(167, 'K');
		depth_30ft.put(193, 'L');
		depth_30ft.put(223, 'M');
		depth_30ft.put(260, 'N');
		depth_30ft.put(307, 'O');
		depth_30ft.put(371, 'Z');
	}

	public static final void fillTable35ft() {
		depth_35ft.put(14, 'A');
		depth_35ft.put(23, 'B');
		depth_35ft.put(32, 'C');
		depth_35ft.put(42, 'D');
		depth_35ft.put(52, 'E');
		depth_35ft.put(63, 'F');
		depth_35ft.put(74, 'G');
		depth_35ft.put(87, 'H');
		depth_35ft.put(100, 'I');
		depth_35ft.put(115, 'J');
		depth_35ft.put(131, 'K');
		depth_35ft.put(148, 'L');
		depth_35ft.put(168, 'M');
		depth_35ft.put(190, 'N');
		depth_35ft.put(215, 'O');
		depth_35ft.put(232, 'Z');
	}

	public static final void fillTable40ft() {
		depth_40ft.put(12, 'A');
		depth_40ft.put(20, 'B');
		depth_40ft.put(27, 'C');
		depth_40ft.put(36, 'D');
		depth_40ft.put(44, 'E');
		depth_40ft.put(53, 'F');
		depth_40ft.put(63, 'G');
		depth_40ft.put(73, 'H');
		depth_40ft.put(84, 'I');
		depth_40ft.put(95, 'J');
		depth_40ft.put(108, 'K');
		depth_40ft.put(121, 'L');
		depth_40ft.put(135, 'M');
		depth_40ft.put(151, 'N');
		depth_40ft.put(163, 'O');
	}

	public static final void fillTable45ft() {
		depth_45ft.put(11, 'A');
		depth_45ft.put(17, 'B');
		depth_45ft.put(24, 'C');
		depth_45ft.put(31, 'D');
		depth_45ft.put(39, 'E');
		depth_45ft.put(46, 'F');
		depth_45ft.put(55, 'G');
		depth_45ft.put(63, 'H');
		depth_45ft.put(72, 'I');
		depth_45ft.put(82, 'J');
		depth_45ft.put(92, 'K');
		depth_45ft.put(102, 'L');
		depth_45ft.put(114, 'M');
		depth_45ft.put(125, 'N');
	}

	public static final void fillTable50ft() {
		depth_50ft.put(9, 'A');
		depth_50ft.put(15, 'B');
		depth_50ft.put(21, 'C');
		depth_50ft.put(28, 'D');
		depth_50ft.put(34, 'E');
		depth_50ft.put(41, 'F');
		depth_50ft.put(48, 'G');
		depth_50ft.put(56, 'H');
		depth_50ft.put(63, 'I');
		depth_50ft.put(71, 'J');
		depth_50ft.put(80, 'K');
		depth_50ft.put(89, 'L');
		depth_50ft.put(92, 'M');
	}

	public static final void fillTable55ft() {
		depth_55ft.put(8, 'A');
		depth_55ft.put(14, 'B');
		depth_55ft.put(19, 'C');
		depth_55ft.put(25, 'D');
		depth_55ft.put(31, 'E');
		depth_55ft.put(37, 'F');
		depth_55ft.put(43, 'G');
		depth_55ft.put(50, 'H');
		depth_55ft.put(56, 'I');
		depth_55ft.put(63, 'J');
		depth_55ft.put(71, 'K');
		depth_55ft.put(74, 'L');
	}

	public static final void fillTable60ft() {
		depth_60ft.put(7, 'A');
		depth_60ft.put(12, 'B');
		depth_60ft.put(17, 'C');
		depth_60ft.put(22, 'D');
		depth_60ft.put(28, 'E');
		depth_60ft.put(33, 'F');
		depth_60ft.put(39, 'G');
		depth_60ft.put(45, 'H');
		depth_60ft.put(51, 'I');
		depth_60ft.put(57, 'J');
		depth_60ft.put(60, 'K');
	}

	public static final void fillTable70ft() {
		depth_70ft.put(6, 'A');
		depth_70ft.put(10, 'B');
		depth_70ft.put(14, 'C');
		depth_70ft.put(19, 'D');
		depth_70ft.put(23, 'E');
		depth_70ft.put(28, 'F');
		depth_70ft.put(32, 'G');
		depth_70ft.put(37, 'H');
		depth_70ft.put(42, 'I');
		depth_70ft.put(47, 'J');
		depth_70ft.put(48, 'K');
	}

	public static final void fillTable80ft() {
		depth_80ft.put(5, 'A');
		depth_80ft.put(9, 'B');
		depth_80ft.put(12, 'C');
		depth_80ft.put(16, 'D');
		depth_80ft.put(20, 'E');
		depth_80ft.put(24, 'F');
		depth_80ft.put(28, 'G');
		depth_80ft.put(32, 'H');
		depth_80ft.put(36, 'I');
		depth_80ft.put(39, 'J');
	}

	public static final void fillTable90ft() {
		depth_90ft.put(4, 'A');
		depth_90ft.put(7, 'B');
		depth_90ft.put(11, 'C');
		depth_90ft.put(14, 'D');
		depth_90ft.put(17, 'E');
		depth_90ft.put(21, 'F');
		depth_90ft.put(24, 'G');
		depth_90ft.put(28, 'H');
		depth_90ft.put(30, 'I');
	}

	public static final void fillTable100ft() {
		depth_100ft.put(4, 'A');
		depth_100ft.put(6, 'B');
		depth_100ft.put(9, 'C');
		depth_100ft.put(12, 'D');
		depth_100ft.put(15, 'E');
		depth_100ft.put(18, 'F');
		depth_100ft.put(21, 'G');
		depth_100ft.put(25, 'H');
	}

	public static final void fillTable110() {
		depth_110ft.put(3, 'A');
		depth_110ft.put(6, 'B');
		depth_110ft.put(8, 'C');
		depth_110ft.put(11, 'D');
		depth_110ft.put(14, 'E');
		depth_110ft.put(16, 'F');
		depth_110ft.put(19, 'G');
		depth_110ft.put(20, 'H');
	}

	public static final void fillTable120() {
		depth_120ft.put(3, 'A');
		depth_120ft.put(5, 'B');
		depth_120ft.put(7, 'C');
		depth_120ft.put(10, 'D');
		depth_120ft.put(12, 'E');
		depth_120ft.put(15, 'F');
	}

	public static final void fillTable130() {
		depth_130ft.put(2, 'A');
		depth_130ft.put(4, 'B');
		depth_130ft.put(6, 'C');
		depth_130ft.put(9, 'D');
		depth_130ft.put(10, 'E');
	}
	
	public static final void fillTable140() {
		depth_140ft.put(2, 'A');
		depth_140ft.put(4, 'B');
		depth_140ft.put(6, 'C');
		depth_140ft.put(8, 'D');
		depth_140ft.put(10, 'E');
	}
}
