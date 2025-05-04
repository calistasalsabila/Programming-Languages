class Category {
    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }

    public boolean isExpensive() {
        return expensive;
    }
}

public class g {
    public static void main(String[] args) {
        var category = new Category(); // sama aja kayak Category category = new Category();
        category.setId("A");
        System.out.println(category.getId());
        category.setExpensive(true);
        System.out.println(category.isExpensive());
        // category.id = "a"; eror karena harus pakai setId (harus method bukan field)
    }
}
