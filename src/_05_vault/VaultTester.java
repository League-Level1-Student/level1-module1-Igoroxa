package _05_vault;

public class VaultTester {
	public static void main(String[] args) {
		
		Vault safe = new Vault(35);
		boolean try1 = safe.tryCode(1);
		System.out.println(try1);
		
		Vault safe2 = new Vault(3535);
		
		JamesBond test = new JamesBond();
		int code = test.findCode(safe);
		int code2 = test.findCode(safe2);
		System.out.println(code);
		System.out.println(code2);
	}
}
