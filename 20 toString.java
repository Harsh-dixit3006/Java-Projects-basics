class Students {

    String Name;

    int Age;

    int RollNo;

    public Students(String name, int age, int rollNo) {
        Name = name;
        Age = age;
        RollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student details are: {Name: "+Name+"," +
                                        "  Age: "+Age+"," +
                                        " Roll No:"+RollNo+"}";
    }

    public static void main(String[] args) {
        Students Stu = new Students("Harsh",20,1);
        System.out.println(Stu);
    }
}
