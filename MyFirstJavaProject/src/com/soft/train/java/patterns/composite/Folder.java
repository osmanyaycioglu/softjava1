package com.soft.train.java.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    protected String       folder;
    protected List<Folder> subFolder;

    public void addSubfolder(final Folder folderParam) {
        if (this.subFolder == null) {
            this.subFolder = new ArrayList<>();
        }
        this.subFolder.add(folderParam);
    }

    public String getFolder() {
        return this.folder;
    }

    public void setFolder(final String folderParam) {
        this.folder = folderParam;
    }

    public List<Folder> getSubFolder() {
        return this.subFolder;
    }

    public void setSubFolder(final List<Folder> subFolderParam) {
        this.subFolder = subFolderParam;
    }


}
