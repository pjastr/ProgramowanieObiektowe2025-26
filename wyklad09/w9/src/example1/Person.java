package example1;

record Person(String name, int age) {}

record Employee(String name, int id) {
    public String employeeInfo() {
        return "Employee Info: Name = " + name + ", ID = " + id;
    }
}