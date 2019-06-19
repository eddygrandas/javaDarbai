package lt.codeAcademy.blogas;

import lt.codeAcademy.blogas.controller.UploadingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class BlogasApplication {

	public static void main(String[] args) {
		new File(UploadingController.uploadingDir).mkdirs();
		SpringApplication.run(BlogasApplication.class, args);
	}

}
