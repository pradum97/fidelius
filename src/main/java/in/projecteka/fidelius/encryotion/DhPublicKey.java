package in.projecteka.fidelius.encryotion;

public class DhPublicKey {
    private String parameters = "Curve25519/32byte random key";
    private String keyValue;

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }
}
