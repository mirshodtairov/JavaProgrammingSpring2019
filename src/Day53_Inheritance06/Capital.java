package Day53_Inheritance06;

public class Capital extends Cities {
	

		private long population;
		public int count = 1;

		public Capital(int id, String name, long population) {
			super(id, name);
			this.population = population;
		}

		@Override
		public String toString() {
			return super.toString() + " population: " + population;
		}

		public long getPopulation() {
			return population;
		}

		public void setPopulation(long population) {
			this.population = population;
		}
		public static void buildARoad() {
	        System.out.println("capital - building a road");
	    }
	    public void letBuildARoad() {
	        buildARoad();
	    }

	
	

}
