package com.example.book.controller.admin.file;

import lombok.Data;

@Data
public class UploadFile {

    private String originalFilename;
    private String storeFilename;

    public UploadFile(String originalFilename, String storeFilename) {
        this.originalFilename = originalFilename;
        this.storeFilename = storeFilename;
    }
}
