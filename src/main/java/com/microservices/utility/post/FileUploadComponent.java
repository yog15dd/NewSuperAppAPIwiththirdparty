/**
 * 
 */
package com.microservices.utility.post;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 33000005
 *
 */
@Component
public class FileUploadComponent {

	/**
	 * 
	 */
	public final String UPLOAD_DIR = "D:\\Spring Microservices\\SpringBootAPI\\src\\main\\resources\\static\\image";
	
	public String writeFile(String fileName, byte[] data) {
		String path = "";
		
		try {
			
			FileOutputStream fOutputStream = new FileOutputStream(UPLOAD_DIR + File.separator + fileName);
			
			fOutputStream.write(data);
			
			fOutputStream.flush();
			fOutputStream.close();
			
			path = UPLOAD_DIR + File.separator + fileName;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return path;
	}
	
	public String uploadFile(MultipartFile file) {
		
		//boolean f = false;
		String path = "";
		
		try {
			
			InputStream iStream = file.getInputStream();
			byte data[] = new byte[iStream.available()];
			
			iStream.read(data);
			
			FileOutputStream fOutputStream = new FileOutputStream(UPLOAD_DIR+"\\"+file.getOriginalFilename());
			
			fOutputStream.write(data);
			
			fOutputStream.flush();
			fOutputStream.close();
			//f = true;
			path = UPLOAD_DIR + File.separator + file.getOriginalFilename();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return path;
	}
	
	public boolean deleteFile(MultipartFile file) {
		boolean f = false;
		
		try {

			Files.deleteIfExists(Paths.get(UPLOAD_DIR+File.separator, file.getOriginalFilename()));
			f = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	public FileUploadComponent() {
		// TODO Auto-generated constructor stub
	}

}
