public class Proxy{
	public static void main(String[] args){
		FileStorage fileStorage = new FileStorageProxy();
		
		fileStorage.upload("file2.txt", "File 2 content");
		
		System.out.println(fileStorage.download("file1.txt"));
		System.out.println(fileStorage.download("file1.txt"));
		System.out.println(fileStorage.download("file2.txt"));
	}
}
