// YUNUS EMRE NAKKAŞ 250542021
package vizeçalışma;
import java.util.Scanner;
public class cvhvh {
	public static Scanner scanner=new Scanner(System.in);
	public static double calculateAverage(double vize,double finall,double odev) {
		return (vize*0.3)+(finall*0.4)+(odev*0.3);
	}
	public static String  isPassingGrade(double ortalama) {
		if(ortalama<=50) {
			return "KALDI";
		}
		else {
			return "GEÇTİ";
		}
	}
	public static String getLetterGrade(double ortalama) {
		if(ortalama<=100 && ortalama>90) {
			return "A";
		}
		else if(ortalama<=90 && ortalama>80) {
			return "B";
		}
		else if(ortalama<=80 && ortalama>70) {
			return "C";
		}
		else if(ortalama<=70 && ortalama>60) {
			return "D";
		}
		else {
			return "F";
		}	
	}
	public static boolean isHonorList(double ortalama) {
		boolean ortalama_kosulu=ortalama>=85;
		return ortalama_kosulu ;
	}
	public static boolean hasRetakeRight(double ortalama) {
		return ortalama<=50 && ortalama>=40;
	}
	public static boolean notkontrol(double vize,double finall,double ödev) {
		 boolean teknotkosulu = (vize >= 70) && (finall >= 70) && (ödev >= 70);
		 return teknotkosulu;
	}

	
	public static void main(String[] args) 
	{
		System.out.println("Lütfen vize notunuzu giriniz: ");
		double vize=scanner.nextDouble();
		System.out.println("Lütfen Final Notunuzu Giriniz: ");
		double finall=scanner.nextDouble();
		System.out.println("Lütfen Ödev Notunuzu Giriniz: ");
		double ödev=scanner.nextDouble();
		
		double ortalama=calculateAverage(vize,finall,ödev);
		
		System.out.println();
		System.out.println("=== OGRENCI NOT RAPORU ===");
		System.out.println("Vize Notunuz: "+vize);
		System.out.println("Final Notunuz: "+finall);
		System.out.println("Ödev notunuz: "+ödev);
		System.out.println("------------------------------");
		System.out.println("Ortalamanız: "+calculateAverage(vize,finall,ödev));
		System.out.println("Harf Notunuz: "+getLetterGrade(ortalama));
		System.out.println("Durum: "+isPassingGrade(ortalama));
		System.out.println("Onur Listesi: "+notkontrol(vize,finall,ödev)+isHonorList(ortalama));
		System.out.println("Bütünleme: "+hasRetakeRight(ortalama));
		
		
		
	}
	
}
