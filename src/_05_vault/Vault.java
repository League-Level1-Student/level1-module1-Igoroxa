package _05_vault;

public class Vault {
	int secretcode = 88888;
	
	Vault(int x){
		secretcode = x;
	}
	
	boolean tryCode(int guess) {
		if(guess == secretcode) {
			return true;
		}else {
			return false;
		}
	}
}
