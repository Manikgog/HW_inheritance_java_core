public class SlizerinStudent extends HogwartsStudent {
    private int trick;             // хитрость
    private int determination;     // решительность
    private int ambition;          // амбициозность
    private int resourcefulness;   // находчивость
    private int lustForPower;      // жажда власти

    public SlizerinStudent(String name, String surname, int witchcraft, int transgress, int trick, int determination,
                    int ambition, int resourcefulness, int lustForPower){
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

    public int getTrick(){
        return this.trick;
    }

    public int getDetermination(){
        return this.determination;
    }

    public int getAmbition(){
        return this.ambition;
    }

    public int getResourcefulness(){
        return this.resourcefulness;
    }

    public int getLustForPower(){
        return this.lustForPower;
    }

    @Override
    public String toString(){
        return super.toString() +
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
        SlizerinStudent s = (SlizerinStudent) o;
        return super.equals(s) &&
                this.trick == (s).trick &&
                this.determination == (s).determination &&
                this.ambition == (s).ambition &&
                this.resourcefulness == (s).resourcefulness &&
                this.lustForPower == (s).lustForPower;
    }

    public int summOfProperties(){
        return this.getWitchcraft() + this.getTransgress() + this.lustForPower +
                this.trick + this.resourcefulness + this.ambition + this.determination;
    }

    public void compare(SlizerinStudent student){
        if(this.summOfProperties() > student.summOfProperties()){
            System.out.println(this.getName() + " " + this.getSurname() + " лучший слизеринец, чем " + student.getName() + " " + student.getSurname() + ".");
        }
        else if(this.summOfProperties() < student.summOfProperties()){
            System.out.println( student.getName() + " " +  student.getSurname() + " лучший слизеринец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
        else{
            System.out.println( student.getName() + " " +  student.getSurname() + " равен по качествам " + this.getName() + " " + this.getSurname() + ".");
        }
    }

    public void printStudent(){
        System.out.println(this.toString());
    }

}
