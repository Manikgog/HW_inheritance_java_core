public class Griffindorf extends Hogwarts {

    private byte nobility;      // благородство
    private byte honor;         // честь
    private byte bravery;       // храбрость
    public Griffindorf(String name, String surname, byte witchcraft, byte transgress, byte nobility, byte honor, byte bravery){
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

    public Griffindorf(String name, String surname, int witchcraft, int transgress, int nobility, int honor, int bravery){
        super(name, surname, witchcraft, transgress);
        if((nobility >= 0 && nobility <= 100) &&
                (honor >= 0 && honor <= 100) &&
                (bravery >= 0 && bravery <= 100)){
            this.nobility = (byte)nobility;
            this.honor = (byte)honor;
            this.bravery = (byte)bravery;
        }else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public byte getNobility(){
        return this.nobility;
    }

    public byte GetHonor(){
        return this.honor;
    }

    public byte GetBravery(){
        return this.bravery;
    }

    @Override
    public String toString(){
        return "Имя и Фамилия студента: " + this.GetName() + " " + this.GetSurname() +
                "\nМощность: " + this.GetWitchcraft() +
                "\nТрансгрессирование: " + this.GetTransgress() +
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
        return this.GetName().equals(((Griffindorf) o).GetName()) &&
                this.GetSurname().equals(((Griffindorf) o).GetSurname()) &&
                this.GetWitchcraft() == ((Griffindorf) o).GetWitchcraft() &&
                this.GetTransgress() == ((Griffindorf) o).GetTransgress() &&
                this.nobility == ((Griffindorf) o).nobility &&
                this.honor == ((Griffindorf) o).GetHonor() &&
                this.bravery == ((Griffindorf) o).bravery;
    }

    public int summOfProperties(){
        return this.GetWitchcraft() + this.GetTransgress() + this.bravery + this.honor + this.nobility;
    }

    public void compare(Object student){
        if(this.getClass() != student.getClass()){
            System.out.println("Студент c другого факультета.");
            return;
        }

        if(this.summOfProperties() > ((Griffindorf)student).summOfProperties()){
            System.out.println(this.GetName() + " " + this.GetSurname() + " лучший гриффиндорфец, чем " + ((Griffindorf)student).GetName() + " " + ((Griffindorf)student).GetSurname() + ".");
        }
        else if(this.summOfProperties() < ((Griffindorf)student).summOfProperties()){
            System.out.println(((Griffindorf) student).GetName() + " " + ((Griffindorf) student).GetSurname() + " лучший гриффиндорфец, чем " + this.GetName() + " " + this.GetSurname() + ".");
        }
        else{
            System.out.println(((Griffindorf) student).GetName() + " " + ((Griffindorf) student).GetSurname() + " равен по качествам " + this.GetName() + " " + this.GetSurname() + ".");
        }
    }

}
