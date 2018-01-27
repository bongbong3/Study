package Chapter12MultiThread;

import java.awt.Toolkit;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * multi thread
 * @author kfx20
 *
 */
public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("beep");			
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}

}
