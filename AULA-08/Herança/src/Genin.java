public class Genin extends Ninja {

    public Genin(String name, String family, String[] jutsus, String mission) {
        super(name, family, jutsus);
        this.mission = mission;
        //TODO Auto-generated constructor stub
    }

    private String mission; 
    
    public String goToMission(){
        return String.format("%s esta indo na missao %s", getName(),mission); 
    }

    @Override
    public String train(){
        return String.format("%s está treinandoo jutsu %s", getName(),getJutsus()[0]);
    }
}
