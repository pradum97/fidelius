package in.projecteka.fidelius.encryotion;

public class EncryptionResponse {

    private String encryptedData;
    private String keyToShare;
    private String checksum;


    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getKeyToShare() {
        return keyToShare;
    }

    public void setKeyToShare(String keyToShare) {
        this.keyToShare = keyToShare;
    }
}
