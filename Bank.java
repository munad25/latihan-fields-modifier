public class Bank{
	private int saldo;
	private String notice;
	private String nasabah;
	final int limitSaldo = 50;
	final String bankName = "Bank A";
	public static int noTransaksi = 0;


	public void addSaldo(int addSaldo){
		saldo += addSaldo;
		noTransaksi++;
	}
	public void namaNasabah(String namaNasabah){
		nasabah = namaNasabah;
	}
	public void minSaldo(int minSaldo){
		if ((saldo - minSaldo ) >= limitSaldo) {
			saldo -= minSaldo;
			noTransaksi++;
		}
		else{
			System.out.println("Saldo anda limit");
		}
	}

	public void minSaldo(int minSaldo, String pesan){
		if ((saldo - minSaldo ) > limitSaldo) {
			saldo -= minSaldo;
			noTransaksi++;
			System.out.println("Saldo anda : " +  saldo);
			System.out.println("Pesan : " + pesan);
		}
		else{
			System.out.println("Saldo anda limit");
		}
	}

	public int getSaldo(){
		return saldo;
	}

	public void showInfo(){
		System.out.println("Nama Bank : "+ bankName);
		if (nasabah != null) {
			System.out.println("Nama Nasabah :"+ nasabah);
		}
		System.out.println("Sisa Saldo : "+ saldo);
	}


}