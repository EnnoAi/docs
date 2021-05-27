package com.sismics.docs.core.event;

import com.google.common.base.MoreObjects;

/**
 * File Processing ended event.
 *
 * @author ddutour
 */
public class FileProcessingEndedAsyncEvent extends UserEvent {
    /**
     * File ID.
     */
    private String fileId;

    /**
     * Document ID.
     */
    private String documentId;


    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("fileId", fileId)
                .add("documentId", documentId)
                .toString();
    }
}