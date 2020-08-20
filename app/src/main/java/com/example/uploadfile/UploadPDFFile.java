package com.example.uploadfile;

public class UploadPDFFile {

    String name;
    String url;

    public UploadPDFFile() {
    }

    public UploadPDFFile(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
