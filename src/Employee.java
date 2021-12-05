public class Employee {
    String name;
    int year;
    String add;
    void insert(String n,int y,String a){
        name=n;
        year=y;
        add=a;
    }
    
    void display(){
        System.out.println(name+"\t"+year+"\t"+add);
    }
    public static void main(String[] args) {
        Employee s1=new Employee();
        Employee s2=new Employee();
        Employee s3=new Employee();
        s1.insert("Rohan",2012,"Kanpur");
        s2.insert("Sunil",2015,"Mathura");
        s3.insert("Aman",2009,"Agra");
        System.out.println("Name\t"+"year\t"+"Adderese");
        s1.display();
        s2.display();
        s3.display();
    }
}
