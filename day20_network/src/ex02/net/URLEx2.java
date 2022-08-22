package ex02.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.lainyzine.com/ko/article/how-to-access-windows-10-remote-desktop-from-mac/#:~:text=%EB%A7%A5%EC%97%90%EC%84%9C%20%EC%9C%88%EB%8F%84%EC%9A%B0%EC%9D%98%20%EC%9B%90%EA%B2%A9,%ED%95%B4%EC%84%9C%20%EC%84%A4%EC%B9%98%EB%A5%BC%20%EC%A7%84%ED%96%89%ED%95%B4%EC%A3%BC%EC%84%B8%EC%9A%94.&text=%EC%84%A4%EC%B9%98%EA%B0%80%20%EC%99%84%EB%A3%8C%EB%90%98%EB%A9%B4%20%EC%9D%91%EC%9A%A9,Desktop%EC%9D%84%20%EC%B0%BE%EC%9D%84%20%EC%88%98%20%EC%9E%88%EC%8A%B5%EB%8B%88%EB%8B%A4.");
//		URL url2 = new URL("https://www.google.com/search?q=%EB%A5%98%EC%A7%84&sxsrf=ALiCzsbwXXhHCz7FVOgXSgHVkJjJH7MsxA%3A1661152422864&ei=piwDY52fNPTT2roPuMqAgAU&oq=yuna&gs_lcp=Cgdnd3Mtd2l6EAEYADIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwA0oECEEYAEoECEYYAFAAWABg3wtoAXABeACAAQCIAQCSAQCYAQDIAQrAAQE&sclient=gws-wiz");
		
		// URL이 가진 함수 사용
		System.out.println("protocol : " + url.getProtocol());
		System.out.println("host and Port Number : " + url.getAuthority());
		System.out.println("host : " + url.getHost());
		System.out.println("Port : " + url.getPort());
		System.out.println("Path : " + url.getPath());
		System.out.println("query : " + url.getQuery());
		System.out.println("file Name : " + url.getFile());
		System.out.println("reference : " + url.getRef());
	}
}
