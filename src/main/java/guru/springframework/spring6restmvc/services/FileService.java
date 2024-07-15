package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.entities.FileEntity;
import guru.springframework.spring6restmvc.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public FileEntity saveFile(MultipartFile file) throws IOException {
        FileEntity fileEntity = new FileEntity();
        fileEntity.setName(file.getOriginalFilename());
        fileEntity.setType(file.getContentType());
        fileEntity.setSize(file.getSize());
        fileEntity.setContent(file.getBytes());

        System.out.println("saving in db");
        return fileRepository.save(fileEntity);
    }

    public String getFile(Long id) throws IOException {
        FileEntity fileEntity = fileRepository.getById(id);

        if (Objects.isNull(fileEntity)) {
            return "file not found";
        }

        try {
            // Save the file to a local directory
            String uploadDir = "C:\\Users\\God -01.11\\Desktop/";
            File uploadDirectory = new File(uploadDir);
            if (!uploadDirectory.exists()) {
                uploadDirectory.mkdirs();
            }
            String filePath = uploadDir + fileEntity.getName();
            Files.write(Path.of(filePath), fileEntity.getContent());

            return "You successfully downloaded '" + fileEntity.getName() + "' to " + filePath;
        } catch (IOException e) {
            return "Failed to upload file: " + e.getMessage();
        }
    }
}
