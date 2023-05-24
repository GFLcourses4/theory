class FileStorageImpl implements FileStorage{

	public void upload(String fileName, String content){
		System.out.println("Uploading file " + fileName + " to remote storage");
	}
	public String download(String fileName){
		System.out.println("Downloading file " + fileName + " from remote storage" );
		return "File content of " + fileName;
	}
}
