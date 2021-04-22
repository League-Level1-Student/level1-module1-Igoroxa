package _05_vault;

public class JamesBond {
	int findCode(Vault v){
		for (int i = 0; i < 1000000; i++) {
			boolean bond = v.tryCode(i);
	if (bond == true) {
		return i;
	}		
		}
	return -1;
		
	}
}
