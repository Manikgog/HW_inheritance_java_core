public class PuffendujStudent extends HogwartsStudent {
    private int diligence;     // трудолюбивость
    private int loyalty;       // верность
    private int honesty;       // честность
    public PuffendujStudent(String name, String surname, int witchcraft, int transgress, int diligence, int loyalty, int honesty){
        super(name, surname, witchcraft, transgress);
        if((diligence >= 0 && diligence <= 100) &&
                (loyalty >= 0 && loyalty <= 100) &&
                (honesty >= 0 && honesty <= 100)){
            this.diligence = diligence;
            this.loyalty = loyalty;
            this.honesty = honesty;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public int getDiligence(){
        return this.diligence;
    }

    public int getLoyalty(){
        return this.loyalty;
    }

    public int getHonesty(){
        return this.honesty;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nБлагородство: " + this.diligence +
                "\nЧесть: " + this.loyalty +
                "\nХрабрость: " + this.honesty + "\n";
    }

    @Override public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PuffendujStudent p = (PuffendujStudent) o;
        return super.equals(p) &&
                this.diligence == (p).diligence &&
                this.honesty == (p).honesty &&
                this.loyalty == (p).loyalty;
    }

    public int summOfProperties(){
        return this.getWitchcraft() + this.getTransgress() + this.honesty + this.loyalty + this.diligence;
    }

    public void compare(PuffendujStudent student){
        if(this.summOfProperties() > student.summOfProperties()){
            System.out.println(this.getName() + " " + this.getSurname() + " лучший пуфендуец, чем " + student.getName() + " " + student.getSurname() + ".");
        }
        else if(this.summOfProperties() < student.summOfProperties()){
            System.out.println( student.getName() + " " +  student.getSurname() + " лучший пуфендуец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
        else{
            System.out.println( student.getName() + " " +  student.getSurname() + " равен по качествам " + this.getName() + " " + this.getSurname() + ".");
        }
    }

    public void printStudent(){
        System.out.println(this.toString());
    }

}
