package com.cb.farmerapp.activies.model;

public class FarmerActivity {
    private String dairy;
    private String hotCulture;
    private String fishing;

    public FarmerActivity(String dairy, String hotCulture, String fishing) {
        this.dairy = dairy;
        this.hotCulture = hotCulture;
        this.fishing = fishing;
    }

    public String getDairy() {
        return dairy;
    }

    public void setDairy(String dairy) {
        this.dairy = dairy;
    }

    public String getHotCulture() {
        return hotCulture;
    }

    public void setHotCulture(String hotCulture) {
        this.hotCulture = hotCulture;
    }

    public String getFishing() {
        return fishing;
    }

    public void setFishing(String fishing) {
        this.fishing = fishing;
    }
}
