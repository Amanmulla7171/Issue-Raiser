import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Component
public class FileUtil {

    private final String uploadDir = "./uploads/";

    public String saveFile(MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            throw new IOException("Failed to store empty file.");
        }

        String uniqueFileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        Path path = Paths.get(uploadDir + uniqueFileName);
        Files.createDirectories(path.getParent());
        Files.copy(file.getInputStream(), path);

        return uniqueFileName;
    }

    public File getFile(String fileName) {
        return new File(uploadDir + fileName);
    }

    public void deleteFile(String fileName) {
        File file = new File(uploadDir + fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}