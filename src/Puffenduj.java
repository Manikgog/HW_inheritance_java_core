public class Puffenduj extends Hogwarts {
    private byte diligence;     // трудолюбивость
    private byte loyalty;       // верность
    private byte honesty;       // честность
    public Puffenduj(String name, String surname, byte witchcraft, byte transgress, byte diligence, byte loyalty, byte honesty){
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

    public Puffenduj(String name, String surname, int witchcraft, int transgress, int diligence, int loyalty, int honesty){
        super(name, surname, witchcraft, transgress);
        if((diligence >= 0 && diligence <= 100) &&
                (loyalty >= 0 && loyalty <= 100) &&
                (honesty >= 0 && honesty <= 100)){
            this.diligence = (byte)diligence;
            this.loyalty = (byte)loyalty;
            this.honesty = (byte)honesty;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public byte GetDiligence(){
        return this.diligence;
    }

    public byte GetLoyalty(){
        return this.loyalty;
    }

    public byte GetHonesty(){
        return this.honesty;
    }

    @Override
    public String toString(){
        return "Имя и Фамилия студента: " + this.GetName() + " " + this.GetSurname() +
                "\nМощность: " + this.GetWitchcraft() +
                "\nТрансгрессирование: " + this.GetTransgress() +
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
        return this.GetName().equals(((Puffenduj) o).GetName()) &&
                this.GetSurname().equals(((Puffenduj) o).GetSurname()) &&
                this.GetWitchcraft() == ((Puffenduj) o).GetWitchcraft() &&
                this.GetTransgress() == ((Puffenduj) o).GetTransgress() &&
                this.diligence == ((Puffenduj) o).diligence &&
                this.honesty == ((Puffenduj) o).honesty &&
                this.loyalty == ((Puffenduj) o).loyalty;
    }

    public int summOfProperties(){
        return this.GetWitchcraft() + this.GetTransgress() + this.honesty + this.loyalty + this.diligence;
    }

    public void compare(Object student){
        if(this.getClass() != student.getClass()){
            System.out.println("Студент c другого факультета.");
            return;
        }

        if(this.summOfProperties() > ((Puffenduj)student).summOfProperties()){
            System.out.println(this.GetName() + " " + this.GetSurname() + " лучший пуфендуец, чем " + ((Puffenduj)student).GetName() + " " + ((Puffenduj)student).GetSurname() + ".");
        }
        else if(this.summOfProperties() < ((Puffenduj)student).summOfProperties()){
            System.out.println(((Puffenduj) student).GetName() + " " + ((Puffenduj) student).GetSurname() + " лучший пуфендуец, чем " + this.GetName() + " " + this.GetSurname() + ".");
        }
        else{
            System.out.println(((Puffenduj) student).GetName() + " " + ((Puffenduj) student).GetSurname() + " равен по качествам " + this.GetName() + " " + this.GetSurname() + ".");
        }
    }

}
