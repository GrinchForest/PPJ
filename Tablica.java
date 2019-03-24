import java.util.*;
public class Tablica {//Tworzenie klasy
	public static void main (String[] args) {
int [] tab = new int[100]; // Stworzenie tablicy o 100 elementach
Random randomtab = new Random(); //Randomizacja tablicy
int t = 0 ; 
for (t = 0; t < 100; t++)
{tab[t] = randomtab.nextInt(10); //Wypelnienie tablicy
System.out.println(tab[t]); //Wyswietlenie tablicy
}





int sum = 0;
int x = 0 ;
for(x = 0 ; x < tab.length; x++)
{ sum += tab[x];}
System.out.println(sum);// Liczy sume elementow
	
Arrays.sort(tab);
System.out.println(Arrays.binarySearch(tab,0)); //Wyszukuje miejsce najmniejszego elementu
System.out.println(Arrays.binarySearch(tab,9));} // Wyszukuje miejsce najwiekszego elementu
	
int a = 1;
int wys = 0;
for(int i=0; i< tab.length ; i++ ) {
	if (a == tab[t]);
		wys++;}
System.out.println(wys); //Liczy wystpienie liczby 1 
	
}
}
