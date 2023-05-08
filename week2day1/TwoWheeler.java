package week2day1;

public class TwoWheeler {

         
		int noOfWheels=2;
		short noOfMirrors=2;
		long chassisNumber=6574893L;
		boolean isPunctured=true;
		double runningKM=89;
		String bikeName="Hero Honda";
		
  public static void main(String[] args)
  {
		TwoWheeler  twoWheeler =new TwoWheeler();
		System.out.println(twoWheeler.noOfWheels);
		System.out.println(twoWheeler.noOfMirrors);
		System.out.println(twoWheeler.chassisNumber);
		System.out.println(twoWheeler.isPunctured);
		System.out.println(twoWheeler.runningKM);
		System.out.println(twoWheeler.bikeName);
	}

}
