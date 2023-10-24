public class Hogwarts {

    private String name;            // Имя
    private String surname;         // Фамилия
    private byte witchcraft;        // мощность
    private byte transgress;        // трансгрессирование

    public Hogwarts(String name, String surname, byte witchcraft, byte transgress){
        if((witchcraft >= 0 && witchcraft <= 100) &&
                (transgress >= 0 && transgress <= 100)){
            this.name = name;
            this.surname = surname;
            this.witchcraft = witchcraft;
            this.transgress = transgress;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public Hogwarts(String name, String surname, int witchcraft, int transgress){
        if((witchcraft >= 0 && witchcraft <= 100) &&
                (transgress >= 0 && transgress <= 100)){
            this.name = name;
            this.surname = surname;
            this.witchcraft = (byte)witchcraft;
            this.transgress = (byte)transgress;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public String GetName(){
        return this.name;
    }

    public String GetSurname(){
        return this.surname;
    }

    public byte GetWitchcraft(){
        return this.witchcraft;
    }

    public byte GetTransgress(){
        return this.transgress;
    }

    @Override public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        return this.name.equals(((Hogwarts) o).name) &&
                this.surname.equals(((Hogwarts) o).surname) &&
                this.witchcraft == ((Hogwarts) o).witchcraft &&
               this.transgress == ((Hogwarts) o).transgress;
    }

    public void compareWitchcraft(Hogwarts student){
        if(this.witchcraft > student.witchcraft){
            System.out.println(this.name + " " + this.surname + " обладает большей силой магии, чем " + student.name + " " + student.surname + ".");
        }else if(this.witchcraft < student.witchcraft){
            System.out.println(this.name + " " + this.surname + " обладает меньшей силой магии, чем " + student.name + " " + student.surname + ".");
        }else{
            System.out.println(this.name + " " + this.surname + " обладает равной силой магии, с " + student.name + " " + student.surname + ".");
        }
    }

    public void compareTransgress(Hogwarts student){
        if(this.transgress > student.transgress){
            System.out.println(this.name + " " + this.surname + " обладает большим расстоянием магического действия, чем " + student.name + " " + student.surname + ".");
        }else if(this.transgress < student.transgress){
            System.out.println(this.name + " " + this.surname + " обладает меньшим расстоянием магического действия, чем " + student.name + " " + student.surname + ".");
        }else{
            System.out.println(this.name + " " + this.surname + " обладает равнымрасстоянием магического действия с " + student.name + " " + student.surname + ".");
        }
    }



}
