public class Cogtevran extends Hogwarts {
    private byte smart;     // ум
    private byte wisdom;    // мудрость
    private byte witty;     // остроумие
    private byte creativity;// творчество
    public Cogtevran(String name, String surname, byte witchcraft, byte transgress, byte smart, byte wisdom, byte witty, byte creativity){
        super(name, surname, witchcraft, transgress);
        if((smart >= 0 && smart <= 100) &&
                (wisdom >= 0 && wisdom <= 100) &&
                (witty >= 0 && witty <= 100) &&
                (creativity >= 0 && creativity <= 100)){
            this.smart = smart;
            this.wisdom = wisdom;
            this.witty = witty;
            this.creativity = creativity;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public Cogtevran(String name, String surname, int witchcraft, int transgress, int smart, int wisdom, int witty, int creativity){
        super(name, surname, witchcraft, transgress);
        if((smart >= 0 && smart <= 100) &&
                (wisdom >= 0 && wisdom <= 100) &&
                (witty >= 0 && witty <= 100) &&
                (creativity >= 0 && creativity <= 100)){
            this.smart = (byte)smart;
            this.wisdom = (byte)wisdom;
            this.witty = (byte)witty;
            this.creativity = (byte)creativity;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public byte GetSmart(){
        return this.smart;
    }

    public byte GetWisdom(){
        return this.wisdom;
    }

    public byte GetWitty(){
        return this.witty;
    }

    public byte GetCreativity(){
        return this.creativity;
    }

    @Override
    public String toString(){
        return "Имя и Фамилия студента: " + this.GetName() + " " + this.GetSurname() +
                "\nМощность: " + this.GetWitchcraft() +
                "\nТрансгрессирование: " + this.GetTransgress() +
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
        return this.GetName().equals(((Cogtevran) o).GetName()) &&
                this.GetSurname().equals(((Cogtevran) o).GetSurname()) &&
                this.GetWitchcraft() == ((Cogtevran) o).GetWitchcraft() &&
                this.GetTransgress() == ((Cogtevran) o).GetTransgress() &&
                this.smart == ((Cogtevran) o).smart &&
                this.wisdom == ((Cogtevran) o).wisdom &&
                this.witty == ((Cogtevran) o).witty &&
                this.creativity == ((Cogtevran) o).creativity;
    }

    public int summOfProperties(){
        return this.GetWitchcraft() + this.GetTransgress() + this.witty +
                this.creativity + this.wisdom + this.smart;
    }

    public void compare(Object student){
        if(this.getClass() != student.getClass()){
            System.out.println("Студент c другого факультета.");
            return;
        }

        if(this.summOfProperties() > ((Cogtevran)student).summOfProperties()){
            System.out.println(this.GetName() + " " + this.GetSurname() + " лучший когтевранец, чем " + ((Cogtevran)student).GetName() + " " + ((Cogtevran)student).GetSurname() + ".");
        }
        else if(this.summOfProperties() < ((Cogtevran)student).summOfProperties()){
            System.out.println(((Cogtevran) student).GetName() + " " + ((Cogtevran) student).GetSurname() + " лучший когтевранец, чем " + this.GetName() + " " + this.GetSurname() + ".");
        }
        else{
            System.out.println(((Cogtevran) student).GetName() + " " + ((Cogtevran) student).GetSurname() + " равен по качествам " + this.GetName() + " " + this.GetSurname() + ".");
        }
    }

}
