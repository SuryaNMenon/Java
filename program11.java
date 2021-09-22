class Employee{
    int empid;
    String empName, phNumber, deptName;
    Employee(int empid, String empName, String phNumber, String deptName){
        this.empid = empid;
        this.empName = empName;
        this.phNumber = phNumber; 
        this.deptName = deptName;
    }
    void printData(){
        System.out.println("Employee ID: " +this.empid + "\nName: " + this.empName + "\nPhone number: " + this.phNumber + "\nDepartment Name: " + this.deptName);
    }
}

class AsstProf extends Employee{
    String speciality;
    AsstProf(int empid, String empName, String phNumber, String deptName, String speciality){
        super(empid, empName, phNumber, deptName);
        this.speciality = speciality;
    }
    void printData(){
        System.out.println("Employee ID: " +this.empid + "\nName: " + this.empName + "\nPhone number: " + this.phNumber + "\nDepartment Name: " + this.deptName + "\nSpeciality: " + this.speciality);
    }
}

class AssoProf extends Employee{
    String speciality;
    AssoProf(int empid, String empName, String phNumber, String deptName, String speciality){
        super(empid, empName, phNumber, deptName);
        this.speciality = speciality;
    }
    void printData(){
        System.out.println("Employee ID: " +this.empid + "\nName: " + this.empName + "\nPhone number: " + this.phNumber + "\nDepartment Name: " + this.deptName + "\nSpeciality: " + this.speciality);
    }
}

class Professor extends Employee{
    String speciality;
    Professor(int empid, String empName, String phNumber, String deptName, String speciality){
        super(empid, empName, phNumber, deptName);
        this.speciality = speciality;
    }
    void printData(){
        System.out.println("Employee ID: " +this.empid + "\nName: " + this.empName + "\nPhone number: " + this.phNumber + "\nDepartment Name: " + this.deptName + "\nSpeciality: " + this.speciality);
    }
}

public class program11 {
    public static void main(String[] args){
        Employee e = new Employee(101, "Surya", "7012839192", "IT");
        AssoProf ap = new AssoProf(102, "Jim", "7816673819", "CS", "Machine Learning");
        AsstProf asp = new AsstProf(103, "John", "7810276341", "ME", "Cybersecurity");
        Professor p = new Professor(104, "Jenny", "7836719301", "EEE", "BlockChain");
        e.printData();
        ap.printData();
        asp.printData();
        p.printData();
    }
}
