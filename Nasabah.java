public class Nasabah{
	public static void main(String[] args) {
		Bank nasabah1 = new Bank();
		Bank nasabah2 = new Bank();

		nasabah2.namaNasabah("Muhamad Nadi");
		nasabah2.addSaldo(80);
		nasabah2.minSaldo(20, "ini buat UKT");
		nasabah2.showInfo();
	}
}