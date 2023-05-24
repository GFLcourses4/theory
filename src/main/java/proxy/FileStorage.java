interface FileStorage{
	void upload(String fileName, String content);
	String download(String fileName);
}
