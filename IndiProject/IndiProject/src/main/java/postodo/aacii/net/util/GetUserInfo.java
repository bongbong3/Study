package postodo.aacii.net.util;

import javax.servlet.http.HttpServletRequest;

public class GetUserInfo {

	public static String getUserIp(HttpServletRequest req) {
		
		String ip = null;
		
        if (ip == null) {
            ip = req.getHeader("Proxy-Client-IP");
        }
        if (ip == null) {
            ip = req.getHeader("WL-Proxy-Client-IP"); // 웹로직
        }
        if (ip == null) {
            ip = req.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null) {
            ip = req.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null) {
            ip = req.getRemoteAddr();
        }

		return ip;
	}
	
}
