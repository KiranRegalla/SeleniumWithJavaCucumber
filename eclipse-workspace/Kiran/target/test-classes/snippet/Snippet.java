package snippet;

public class Snippet {
	String projectPath = System.getProperty("user.dir");
	String filePath = projectPath + "/QE-index.html";
	driver.get("file://" + filePath);
}

