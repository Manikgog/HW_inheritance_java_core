public class Slizerin extends Hogwarts {
    private byte trick;             // хитрость
    private byte determination;     // решительность
    private byte ambition;          // амбициозность
    private byte resourcefulness;   // находчивость
    private byte lustForPower;      // жажда власти
    public Slizerin(String name, String surname, byte witchcraft, byte transgress, byte trick, byte determination,
                    byte ambition, byte resourcefulness, byte lustForPower){
        super(name, surname, witchcraft, transgress);
        if((trick >= 0 && trick <= 100) &&
                (determination >= 0 && determination <= 100) &&
                (ambition >= 0 && ambition <= 100) &&
                (resourcefulness >= 0 && resourcefulness <= 100) &&
                (lustForPower >= 0 && lustForPower <= 100)){
            this.trick = trick;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.lustForPower = lustForPower;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public Slizerin(String name, String surname, int witchcraft, int transgress, int trick, int determination,
                    int ambition, int resourcefulness, int lustForPower){
        super(name, surname, witchcraft, transgress);
        if((trick >= 0 && trick <= 100) &&
                (determination >= 0 && determination <= 100) &&
                (ambition >= 0 && ambition <= 100) &&
                (resourcefulness >= 0 && resourcefulness <= 100) &&
                (lustForPower >= 0 && lustForPower <= 100)){
            this.trick = (byte)trick;
            this.determination = (byte)determination;
            this.ambition = (byte)ambition;
            this.resourcefulness = (byte)resourcefulness;
            this.lustForPower = (byte)lustForPower;
        }
        else {
            System.out.println("Значения должны быть от 0 до 100");
        }
    }

    public byte GetTrick(){
        return this.trick;
    }

    public byte GetDetermination(){
        return this.determination;
    }

    public byte GetAmbition(){
        return this.ambition;
    }

    public byte GetResourcefulness(){
        return this.resourcefulness;
    }

    public byte GetLustForPower(){
        return this.lustForPower;
    }

    @Override
    public String toString(){
        return "Имя и Фамилия студента: " + this.GetName() + " " + this.GetSurname() +
                "\nМощность: " + this.GetWitchcraft() +
                "\nТрансгрессирование: " + this.GetTransgress() +
                "\nБлагородство: " + this.trick +
                "\nЧесть: " + this.determination +
                "\nХрабрость: " + this.ambition +
                "\nТворчество: " + this.resourcefulness +
                "\nЖажда власти: " + this.lustForPower +"\n";
    }

    @Override public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        return this.GetName().equals(((Slizerin) o).GetName()) &&
                this.GetSurname().equals(((Slizerin) o).GetSurname()) &&
                this.GetWitchcraft() == ((Slizerin) o).GetWitchcraft() &&
                this.GetTransgress() == ((Slizerin) o).GetTransgress() &&
                this.trick == ((Slizerin) o).trick &&
                this.determination == ((Slizerin) o).determination &&
                this.ambition == ((Slizerin) o).ambition &&
                this.resourcefulness == ((Slizerin) o).resourcefulness &&
                this.lustForPower == ((Slizerin) o).lustForPower;
    }

    public int summOfProperties(){
        return this.GetWitchcraft() + this.GetTransgress() + this.lustForPower +
                this.trick + this.resourcefulness + this.ambition + this.determination;
    }

    public void compare(Object student){
        if(this.getClass() != student.getClass()){
            System.out.println("Студент c другого факультета.");
            return;
        }

        if(this.summOfProperties() > ((Slizerin)student).summOfProperties()){
            System.out.println(this.GetName() + " " + this.GetSurname() + " лучший слизеринец, чем " + ((Slizerin)student).GetName() + " " + ((Slizerin)student).GetSurname() + ".");
        }
        else if(this.summOfProperties() < ((Slizerin)student).summOfProperties()){
            System.out.println(((Slizerin) student).GetName() + " " + ((Slizerin) student).GetSurname() + " лучший слизеринец, чем " + this.GetName() + " " + this.GetSurname() + ".");
        }
        else{
            System.out.println(((Slizerin) student).GetName() + " " + ((Slizerin) student).GetSurname() + " равен по качествам " + this.GetName() + " " + this.GetSurname() + ".");
        }
    }

}
