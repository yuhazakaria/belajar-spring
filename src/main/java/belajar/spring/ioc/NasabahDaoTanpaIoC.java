package belajar.spring.ioc;

public class NasabahDaoTanpaIoC {
	private KoneksiDatabase KoneksiDatabase;
	
	public NasabahDaoTanpaIoC() {
		KoneksiDatabase = new KoneksiDatabase();
		KoneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		KoneksiDatabase.setUsername("demo");
		KoneksiDatabase.setPassword("cobacoba");
	}
	
	private void connect() {
		KoneksiDatabase.connect();
	}
	
	private void disconnect() {
		
	}
	
	public void simpan() {
		connect();
		System.out.println("Menyimpan data");
		disconnect();
	}
	
	public void cariData() {
		
	}
}
