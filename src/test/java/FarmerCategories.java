public class FarmerCategories {
    private String types;
    private String season;
    private String region;
    private String status;

    public FarmerCategories() {
    }

    public FarmerCategories(String types, String season, String region, String status) {
        this.types = types;
        this.season = season;
        this.region = region;
        this.status = status;
    }

    public String getTypes() {
        return this.types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FarmerCategories types(String types) {
        this.types = types;
        return this;
    }

    public FarmerCategories season(String season) {
        this.season = season;
        return this;
    }

    public FarmerCategories region(String region) {
        this.region = region;
        return this;
    }

    public FarmerCategories status(String status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof FarmerCategories)) {
            return false;
        }
        FarmerCategories farmerCategories = (FarmerCategories) o;
        return Objects.equals(types, farmerCategories.types) && Objects.equals(season, farmerCategories.season) && Objects.equals(region, farmerCategories.region) && Objects.equals(status, farmerCategories.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(types, season, region, status);
    }

    @Override
    public String toString() {
        return "{" +
            " types='" + getTypes() + "'" +
            ", season='" + getSeason() + "'" +
            ", region='" + getRegion() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }

}