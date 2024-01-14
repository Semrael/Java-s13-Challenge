package employeeApp.enums;

public enum Plan {
    //alttaki üç şey plan enumının instance'ları oluyor
    BASIC( "BASIC",3000),
    MEDIUM("MEDIUM",5000),
    ADVANCE("ADVANCE",8000);

    private String name;
    private int price;

    //enamlar acces modifire'a izin vermez "public" kullandırmaz yani
     Plan(String name,int price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
         return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
