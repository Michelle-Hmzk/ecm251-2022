public class AcademicStudent extends Ninja{

    public AcademicStudent(String name, String family, String[] jutsus) {
        super(name, family, jutsus);
        //TODO Auto-generated constructor stub
    }

    public String play(){
        return String.format("%s está brincando com a familia: %s",getName(), getFamily());
    }
    
}
