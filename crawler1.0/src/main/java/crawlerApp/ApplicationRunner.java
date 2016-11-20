package crawlerApp;

/**
 * @author Explorer
 *
 */
public class ApplicationRunner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			CreateInstance thread = new CreateInstance( "Thread-"+i);
		      thread.start();
		}
	}

}
