package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.entities.FileEntity;
import guru.springframework.spring6restmvc.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/file")
public class UploadFileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload_to_db")
    public ResponseEntity<String> uploadFileToDB(@RequestParam("file") MultipartFile file) {
        try {
            FileEntity savedFile = fileService.saveFile(file);
            System.out.println("saved in db");
            return ResponseEntity.ok("File uploaded successfully: " + savedFile.getName() + "with id: " + savedFile.getId());
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Failed to upload file: " + e.getMessage());
        }
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {

        if (file.isEmpty()) {
            return ResponseEntity.ok().body("Please select a file to upload");
        }

        try {
            // Save the file to a local directory
            String uploadDir = "C:\\Users\\God -01.11\\Desktop/";
            File uploadDirectory = new File(uploadDir);
            if (!uploadDirectory.exists()) {
                uploadDirectory.mkdirs();
            }
            String filePath = uploadDir + file.getOriginalFilename();
            file.transferTo(new File(filePath));
            return ResponseEntity.ok().body("You successfully uploaded '" + file.getOriginalFilename() + "' to " + filePath);
        } catch (IOException e) {
            return ResponseEntity.ok().body("Failed to upload file: " + e.getMessage());
        }
    }

    @GetMapping("/retrieve")
    public ResponseEntity<String> getFile(@RequestParam("id") Long id) throws IOException {

        return ResponseEntity.ok(fileService.getFile(id));
    }
}
