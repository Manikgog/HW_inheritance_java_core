public abstract class HogwartsStudent {

    private String name;            // Имя
    private String surname;         // Фамилия
    private int witchcraft;        // мощность
    private int transgress;        // трансгрессирование

    public HogwartsStudent(String name, String surname, int witchcraft, int transgress){
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

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getWitchcraft(){
        return this.witchcraft;
    }

    public int getTransgress(){
        return this.transgress;
    }

    @Override public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        HogwartsStudent h = (HogwartsStudent) o;
        return this.name.equals(h.name) &&
                this.surname.equals(h.surname) &&
                this.witchcraft == h.witchcraft &&
               this.transgress == h.transgress;
    }

    @Override public String toString(){
        return "Имя и Фамилия студента: " + this.name + " " + this.surname +
                "\nМощность: " + this.witchcraft +
                "\nТрансгрессирование: " + this.transgress;
    }

    public int summOfProperties(){
        return this.witchcraft + this.transgress;
    }

    public void compare(HogwartsStudent student){
        if(this.summOfProperties() > student.summOfProperties()){
            System.out.println(this.name + " " + this.surname + " обладает большей силой магии и трансгрессией, чем " + student.name + " " + student.surname + ".");
        }else if(this.summOfProperties() < student.summOfProperties()){
            System.out.println(this.name + " " + this.surname + " обладает меньшей силой магии и трансгрессией, чем " + student.name + " " + student.surname + ".");
        }else{
            System.out.println(this.name + " " + this.surname + " обладает равной силой магии и трансгрессией, с " + student.name + " " + student.surname + ".");
        }
    }
}
