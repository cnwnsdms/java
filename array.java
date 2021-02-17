public class array {

	public static void main(String[] args) {
	
//		String[] cars = {"Camaro","Corvette","Tesla"};
//		
//		cars[0] ="Mustang";
//		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "Corbette";
		cars[2] = "Tesla";
		
		for(int i=0; i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
//		String[][] cars1 = new String[3][3];
		
		String[][] cars1 = {
					{"Camaro","Corvette","Silverado"},
					{"Mustang","Ranger","15"},
					{"Ferrari","Lambo","Tesla"}
				};

		
//		cars1[0][0] ="Camaro";
//		cars1[0][1] ="Corvette";
//		cars1[0][2] ="Silverado";
//		cars1[1][0] ="Mustang";
//		cars1[1][1] ="Ranger";
//		cars1[1][2] ="F-15";
//		cars1[2][0] ="Ferrari";
//		cars1[2][1] ="Lambo";
//		cars1[2][2] ="Tesla";
	
		for(int i=0;i<cars1.length;i++) {
			System.out.println();
			for(int j=0;j<cars1[i].length;j++) {
				System.out.println(cars1[i][j]+" ");
			}
		}
		
	}

}
