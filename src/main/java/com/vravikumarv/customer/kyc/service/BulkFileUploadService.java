package com.vravikumarv.customer.kyc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Slf4j
@Service
public class BulkFileUploadService {

    public void saveFile(MultipartFile file) {
        try {
            FileOutputStream stream = new FileOutputStream(new File(file.getOriginalFilename()));
            //BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(new File("/bulk-files/".concat(file.getOriginalFilename()))));
            stream.write(file.getBytes());
        } catch (IOException e) {
            log.error(e.getMessage());
            log.atError();
            throw new RuntimeException(e);
        }
    }
}
