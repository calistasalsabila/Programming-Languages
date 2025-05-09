public class Company {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Non-static inner class
    public class Employee {
        private String nameEmployee;

        public void setName(String name) {
            this.nameEmployee = name;
        }

        public String getName() {
            return this.nameEmployee;
        }

        // Mengakses atribut outer class
        public String getCompany() {
            return Company.this.name;
        }
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.setName("Tech Corp");

        Company.Employee e = c.new Employee();
        e.setName("Dj");

        System.out.println(e.getName()); // Dj
        System.out.println(e.getCompany()); // Tech Corp
    }
}
