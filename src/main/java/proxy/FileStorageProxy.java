import java.util.HashMap;
import java.util.Map;

class FileStorageProxy implements FileStorage{
	private FileStorage fileStorage;
	private Map<String, String>cache;

	public FileStorageProxy(){
		fileStorage = new FileStorageImpl();
		cache = new HashMap<>();
	}
	
	public void upload(String fileName, String content){
		fileStorage.upload(fileName,content);
		cache.put(fileName,content);
	}

	public String download(String fileName){
		if(cache.containsKey(fileName)){
			System.out.println("Retrieving file " + fileName + " from cache");
			return cache.get(fileName);
		}else{
			String fileContent = fileStorage.download(fileName);
			cache.put(fileName, fileContent);
			return fileContent;
		}
	}
}
