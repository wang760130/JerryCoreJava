package p15.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class Url {

	public static void main(String[] args) {
		try {
			//创建URL对象
			URL url = new URL("http://www.baidu.com");
			
			//创建URL对象的openConnection方法
			URLConnection conn=url.openConnection();
			
			//创建URL对象的URLConnection方法的getInputStream
			InputStream in= conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line=null;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
