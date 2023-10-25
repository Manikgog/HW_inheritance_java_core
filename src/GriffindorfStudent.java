public class GriffindorfStudent extends HogwartsStudent {

    private int nobility;      // благородство
    private int honor;         // честь
    private int bravery;       // храбрость

    public GriffindorfStudent(String name, String surname, int witchcraft, int transgress, int nobility, int honor, int bravery){
        super(name, surname, witchcraft, transgress);
        if((nobility >= 0 && nobility <= 100) &&
                (honor >= 0 && honor <= 100) &&
                (bravery >= 0 && bravery <= 100)){
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        }else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public int getNobility(){
        return this.nobility;
    }

    public int getHonor(){
        return this.honor;
    }

    public int getBravery(){
        return this.bravery;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nБлагородство: " + this.nobility +
                "\nЧесть: " + this.honor +
                "\nХрабрость: " + this.bravery + "\n";
    }

    @Override public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        GriffindorfStudent g = (GriffindorfStudent) o;
         return  super.equals(g) &&
                this.nobility == (g).nobility &&
                this.honor == (g).getHonor() &&
                this.bravery == (g).bravery;
    }

    public int summOfProperties(){
        return this.getWitchcraft() + this.getTransgress() + this.bravery + this.honor + this.nobility;
    }

    public void compare(GriffindorfStudent student){
        if(this.summOfProperties() > student.summOfProperties()){
            System.out.println(this.getName() + " " + this.getSurname() + " лучший гриффиндорфец, чем " + student.getName() + " " + student.getSurname() + ".");
        }
        else if(this.summOfProperties() < student.summOfProperties()){
            System.out.println( student.getName() + " " +  student.getSurname() + " лучший гриффиндорфец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
        else{
            System.out.println( student.getName() + " " +  student.getSurname() + " равен по качествам " + this.getName() + " " + this.getSurname() + ".");
        }
    }

    public void printStudent(){
        System.out.println(this.toString());
    }
}
