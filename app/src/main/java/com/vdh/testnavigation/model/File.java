package com.vdh.testnavigation.model;

public class File {
    private String mFileType;
    private String nNumFile;

    public File(String mFileType, String nNumFile) {
        this.mFileType = mFileType;
        this.nNumFile = nNumFile;
    }

    public String getFileType() {
        return mFileType;
    }

    public void setFileType(String mFileType) {
        this.mFileType = mFileType;
    }

    public String getNumFile() {
        return nNumFile;
    }

    public void setnNuFile(String nNumFile) {
        this.nNumFile = nNumFile;
    }
}
