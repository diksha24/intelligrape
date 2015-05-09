class Ex_gs
{
   String name;
   String gen;
   int age;
   String add;
   String comp;
   int id;
   int sal; 
   public String toString()
   {
    print(name+" is a "+gen+" aged "+age+\
    " who lives at "+add+". He works for "+comp+" employee id "+id+\
    " and draws "+sal+" lots of money!!!");
   }
   public static void main(String...a)
   {
      def obj=new Ex_gs();
      obj.name="Kunal";
      obj.gen="male";
      obj.age=22;
      obj.add="Noida";
      obj.comp="Intelligrape";
      obj.id=1;
      obj.sal=32000;
      print(obj.toString());
   }
}