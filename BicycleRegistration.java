public class BicycleRegistration

{ public static void main (String[] args){

	Bicycle bike_1,bike_2,bike1,bike2;

	String tag1,tag2,owner1,owner2;

    bike1 = new Bicycle();

	bike1.setOwnerName("Julia C. Berallo");

	bike2 = new Bicycle();

	bike2.setOwnerName("Lyza Denise");

	bike_1=new Bicycle();

	bike_1.settagNo("2002-194R");

	bike_2=new Bicycle();

	bike_2.settagNo("2022-234T");

	owner1=bike1.getOwnerName();

	owner2=bike2.getOwnerName();

	tag1=bike1.gettagNo();

	tag2=bike2.gettagNo();

	System.out.println(owner1+" owns a Bicycle with a tag number: " +"2002-194R");

	System.out.println(owner2+" also owns a Bicycle with a tag number: "+"2022-234T");

	}

}

