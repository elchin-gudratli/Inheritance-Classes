package com.bilgeadam.kalitim;

import com.bilgeadam.interfaces.IAskereGit;
import com.bilgeadam.interfaces.IEhliyetAl;

public class UsluCocuk extends Cocuk implements IAskereGit,IEhliyetAl{

	@Override
	public void EhliyetAl(String adi) {
	System.out.println(adi + " Ehliyet aliyor");
		
	}

	@Override
	public void AskereGit(String adi) {
		System.out.println(adi + " askere gidiyor.");
		
	}

}
