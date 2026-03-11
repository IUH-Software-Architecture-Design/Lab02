package lab2.singleton;

public class CafeManager {
    private static CafeManager instance;

    private String shopName;
    private boolean open;

    private CafeManager() {
        this.shopName = "Default Cafe";
        this.open = false;
    }

    public static CafeManager getInstance() {
        if (instance == null) {
            instance = new CafeManager();
        }
        return instance;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
