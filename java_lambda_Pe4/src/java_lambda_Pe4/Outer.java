package java_lambda_Pe4;

import java.util.*;

public class Outer {

	public Hand method() {

		class Palm implements Hand {

			@Override
			public void Facepalm() {
				System.out.println("*facepalm*");

			}
			
		}
		Hand obj1=new Palm();
		return obj1;
	}

	public static void main(String[] args) {

		Outer obj= new Outer();
		Hand hand=obj.method();
		hand.Facepalm();
	}

}

interface Hand {

	public void Facepalm();
}