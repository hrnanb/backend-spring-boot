/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.porfolio.Interface;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author herna
 */
public interface IFileService {

    public void save(MultipartFile file) throws Exception;

    public Resource load(String name) throws Exception;

    public void save(List<MultipartFile> files) throws Exception;

    public Stream<Path> loadAll() throws Exception;

}
