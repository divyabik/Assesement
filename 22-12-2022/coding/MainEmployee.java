class Employee{
          String name;
          int id;
          int sal;
          double inc_salary;
          Employee(String name, int id,int sal)
         {
              this.name=name;
              this.id=id;
              this.sal=sal;       
         }
         public String toString()
         {
               return "Employee name  : "+name+"\n"+ "Employee id : "+id+"\n"+ "Salary : "+sal;
         }
        
         void increment(int incre_per)
        {
	float f=((float)incre_per/100)*sal;
	System.out.println("incremented salary of the employee"+" "+name+" is "+(f+sal));
       }

}
class MainEmployee{
         public static void main(String args[])
         {
                Employee e1=new Employee("Divya",17008,25000);
                System.out.println(e1);
                e1.increment(4);
          }

}
