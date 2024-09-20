package com.dodo.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileUploadService {

    @Autowired
    GridFsTemplate gridFsTemplate;

    public void uploadFile(MultipartFile file) throws IOException {
        DBObject dbObject = new BasicDBObject();
        dbObject.put("filename", file.getName());
        dbObject.put("contentType", file.getContentType());
        dbObject.put("contentType", file.getContentType());
        dbObject.put("userId", "12345");
        gridFsTemplate.store(file.getInputStream() , dbObject);
    }
}
