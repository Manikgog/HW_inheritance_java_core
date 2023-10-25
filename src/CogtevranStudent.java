public class CogtevranStudent extends HogwartsStudent {
    private int smart;     // ум
    private int wisdom;    // мудрость
    private int witty;     // остроумие
    private int creativity;// творчество

    public CogtevranStudent(String name, String surname, int witchcraft, int transgress, int smart, int wisdom, int witty, int creativity){
        super(name, surname, witchcraft, transgress);
        if((smart >= 0 && smart <= 100) &&
                (wisdom >= 0 && wisdom <= 100) &&
                (witty >= 0 && witty <= 100) &&
                (creativity >= 0 && creativity <= 100)){
            this.smart =  smart;
            this.wisdom =  wisdom;
            this.witty =  witty;
            this.creativity =  creativity;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public int getSmart(){
        return this.smart;
    }

    public int getWisdom(){
        return this.wisdom;
    }

    public int getWitty(){
        return this.witty;
    }

    public int getCreativity(){
        return this.creativity;
    }

    @Override
    public String toString(){
        return   super.toString() +
                "\nБлагородство: " + this.smart +
                "\nЧесть: " + this.wisdom +
                "\nХрабрость: " + this.witty +
                "\nТворчество: " + this.creativity + "\n";
    }

    @Override public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        CogtevranStudent c = (CogtevranStudent) o;
        return super.equals(c) &&
                this.smart == (c).smart &&
                this.wisdom == (c).wisdom &&
                this.witty == (c).witty &&
                this.creativity == (c).creativity;
    }

    public int summOfProperties(){
        return this.getWitchcraft() + this.getTransgress() + this.witty +
                this.creativity + this.wisdom + this.smart;
    }

    public void compare(CogtevranStudent student){
        if(this.summOfProperties() > student.summOfProperties()){
            System.out.println(this.getName() + " " + this.getSurname() + " лучший когтевранец, чем " + student.getName() + " " + student.getSurname() + ".");
        }
        else if(this.summOfProperties() < student.summOfProperties()){
            System.out.println( student.getName() + " " +  student.getSurname() + " лучший когтевранец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
        else{
            System.out.println( student.getName() + " " +  student.getSurname() + " равен по качествам " + this.getName() + " " + this.getSurname() + ".");
        }
    }

    public void printStudent(){
        System.out.println(this.toString());
    }

}
