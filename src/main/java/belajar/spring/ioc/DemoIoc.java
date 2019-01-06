package belajar.spring.ioc;

public class DemoIoc {
	public static void main(String[] args) {
		NasabahDaoIoc nd = new NasabahDaoIoc();
		KoneksiDatabase KoneksiDatabase = new KoneksiDatabase();
		KoneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		KoneksiDatabase.setUsername("demo");
		KoneksiDatabase.setPassword("cobacoba");
		
		nd.simpan();
		nd.setKoneksiDatabase(KoneksiDatabase);
	}
}
