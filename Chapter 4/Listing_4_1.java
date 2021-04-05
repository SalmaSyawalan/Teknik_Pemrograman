package listing.tutorial;

import java.time.*;

public class Listing_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		//System.out.println(today);	//percobaan
		//System.out.println(date);		//percobaan
		date = date.minusDays(today - 1);	//date awalnya ke set hari ini(LocalDate.now), biar ke awal bulan date harus dikurang dgn nilai (hari ini - 1)
		//System.out.println(date);		//percobaan
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();	//dapet hari awal mulai bulan (1=senin, 2=selasa, ... , 7=minggu)
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for(int i = 1; i < value; i++) {
			System.out.print("    ");	//yg kosong di awal bulan
		}
		while (date.getMonthValue() == month) {		//misal sekarang bulan april, nilai dari date.getMonthValue harus sama dgn 4
			System.out.printf("%3d", date.getDayOfMonth());		//print tanggal harian
			if(date.getDayOfMonth() == today) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			date = date.plusDays(1);		//biar lanjut ke tanggal sejanjutnya
			if(date.getDayOfWeek().getValue() == 1) {
				System.out.println();
			}
		}
		//if(date.getDayOfWeek().getValue() != 1) System.out.println();
	}
}
