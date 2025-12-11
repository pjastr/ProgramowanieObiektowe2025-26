package education;

public class School {

    private String name;
    private String address;
    private int students;

    public School(String address, String name, int students) {
        if (address == null || address.isEmpty()){
            this.address = "ul. Słoneczna 54, 10-710 Olsztyn";
        }
        else {
            this.address = address;
        }
        this.name = name;
        this.students = students > 0 ? students : 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty())
            this.address = address;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students > 0 ? students : this.students;
    }

    @Override
    public String toString() {
        if (name != null && !name.isEmpty()){
            return getClass().getSimpleName()+": Name: "+name+". Address: "+address+". " +
                    "Number of students: "+students+".";
        }
        return getClass().getSimpleName()+": Address: "+address+". " +
                "Number of students: "+students+".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;
        return address.equals(school.address);
    }

    @Override
    public int hashCode() {
        return address.hashCode();
    }

    public void recruitment(int value){
        this.students += value;
        if (students > 500) this.students = 500;
    }
}
