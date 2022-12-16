class Person{
        String name;
        int age;
        float height;
        public void passValue(String n,int a,float h){
          name=n;
          age=a;
          height=h;
       
        }
        public void displayValue(){
           System.out.println("Name :" +name+ "Age :" +age+ "Height :" +height);
          
        }
        public static void main(String[] args){
           Person a1= new Person();
          
           a1.passValue("Divya",22,5.4f);
           a1.displayValue();

        }
}