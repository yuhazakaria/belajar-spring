package belajar.spring.ioc;

public class NasabahDaoIoc {
private KoneksiDatabase KoneksiDatabase;
	
	public NasabahDaoIoc() {
		//tidak ada inisialisasi, karena sudah dihandle orang lain
	}
	
	
	public void setKoneksiDatabase(KoneksiDatabase koneksiDatabase) {
		this.KoneksiDatabase = koneksiDatabase;
	}



	private void connect() {
		KoneksiDatabase.connect();
	}
	
	private void disconnect() {
		
	}
		
	public void cariData() {
		
	}

	public void simpan() {
		connect();
		System.out.println("Menyimpan data");
		disconnect();
		
	}
}

