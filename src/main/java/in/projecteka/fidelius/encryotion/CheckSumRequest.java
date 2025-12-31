package in.projecteka.fidelius.encryotion;

public class CheckSumRequest {
    private String encryptedData;

    public CheckSumRequest() {
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }
}
