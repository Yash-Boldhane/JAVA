package Collection.Arraylist;

public class QspiderRequirement {
	
		String name;
		String branch;
		int yop;
		int percentage;
		
		
		public QspiderRequirement() {
			// TODO Auto-generated constructor stub
		}

		public QspiderRequirement(String name, String branch, int yop, int percentage) {
			super();
			this.name = name;
			this.branch = branch;
			this.yop = yop;
			this.percentage = percentage;
		}

		@Override
		public String toString() {
			return "QspiderRequirement [name=" + name + ", branch=" + branch + ", yop=" + yop + ", percentage="
					+ percentage + "]";
		}
		
		public String getName()
		{
			return name;
		}
		
		public String getBranch()
		{
			return branch;
		}
		public int getYop()
		{
			return yop;
		}
		public int getPercentage()
		{
			return percentage;
		}
		
		
		
		
	}

