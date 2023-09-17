package basketmanager;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class WebPage {
	public static void Facebook() {
		try {
			URI FB= new URI("https://www.facebook.com/groups/838698772847567/?multi_permalinks=1538967052820732&notif_t=group_activity&notif_id=1497539576788818");
			java.awt.Desktop.getDesktop().browse(FB);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void Mail() {
		try {
			URI FB= new URI("https://mail.google.com/mail/u/0/#inbox");
			java.awt.Desktop.getDesktop().browse(FB);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void Ytube() {
		try {
			URI FB= new URI("https://www.youtube.com/");
			java.awt.Desktop.getDesktop().browse(FB);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
