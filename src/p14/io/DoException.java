package p14.io;
import java.io.*;
/**
 * 完整的文件异常处理
 * @author JERRY
 *
 */
public class DoException {
	public static void main(String[] args){
		FileInputStream fin = null;//声明引用
		try{
			fin = new FileInputStream("InputStreamException.txt");//实例化
			byte[] bs = new byte[6];
			int len = 0;
			while((len=fin.read(bs))!=-1){
				for(int i = 0 ; i < len ; i ++){
					System.out.print((char)bs[i]+" ");
				}
				System.out.println();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(fin != null){
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
