package listing.tutorial;

import java.util.*;

class Pegawai{
	private static int nextId;
	
	private int id;
	private String name = "";	//instance field initialization
	//private double coba;
	private double salary;
	
	
	//static initialization bloc
	static {
		Random generator = new Random();
		//set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(10000);
	}
	
	//object initialization block
	//The initialization block runs first, and then the body of the constructor is executed.
	{
		id = nextId;
		nextId++;
	}
	
	//three overloaded constructors
	public Pegawai(String n, double s) {
		name = n;
		salary = s;
		//coba = s;
	}
	
	public Pegawai(double s) {		//ngambil method dr constructor yang ada (Pegawai(String, double)) 
		//call the Pegawai(String, double) constructor)
		this("Employee #" + nextId, s);	//ini nextId otomatis jd nama dan s otomatis jadi salary karena di constructor lain (yg senama) methodnya seperti itu
	}
	
	//the default constructor
	public Pegawai() {		//ini waktu dipanggil ga ngehasilin apa2 karena gaada return statement di dalem constructornya
		//name initialized to "" --see above
		//salary not explicitly set--initialized to 0
		//id initialized in initialization block
	}
	
	public String getName() {
		return name;
	}
	
	//public double getCoba() {
		//return coba;
	//}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
}

public class Listing_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pegawai[] staff = new Pegawai[3];
		
		staff[0] = new Pegawai("Harry", 40000);
		staff[1] = new Pegawai(60000);
		staff[2] = new Pegawai();
		
		//print out information about all employee(Pegawai) objects
		for(Pegawai e : staff)	//sampai anggota staff abis
			System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
			//yg staf 2 jd kosong karena pake yg gaada parameter
	}
}
