package com.bilgeadam.kalitim;

import com.bilgeadam.interfaces.IOzellik;
import com.bilgeadam.interfaces.IOzellik2;
import com.bilgeadam.oop.Insan;


public class Anne extends Insan implements IOzellik,IOzellik2
{

	@Override
	public void Oku(String adi) {
	 
		System.out.println(adi + " Okuyor");
		
	}

	@Override
	public void Yaz(String adi) {
		
		System.out.println(adi + " Yaziyor");
		
	}

	@Override
	public void Dinle(String adi) {
		System.out.println(adi + " Dinliyor.");
		
	}



}
