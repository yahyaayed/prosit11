public class Departement {
    private int depId;
    private String depName;

    public Departement(int depId, String depName) {
        this.depId = depId;
        this.depName = depName;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Departement :" +
                "depId=" + depId +
                ", depName='" + depName + '\''
                ;
    }
}
