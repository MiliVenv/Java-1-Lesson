public class Director {

    public static Programer getMidle(Rang rang) {
        if (rang != null) {
            Programer midle = new Programer();
            midle.setFirstName("Василий");
            midle.setLastName("Петров");
            midle.setAge(24);
            midle.setHardSkils(HardSkils.Logic);
            midle.setSoftSkils(SoftSkils.Good);
            return midle;
        }
        return null;
    }

    public static Programer getJunior(Rang rang) {
        if (rang != null) {
            Programer junior = new Programer();
            junior.setFirstName("Василий");
            junior.setLastName("Петров");
            junior.setAge(18);
            junior.setHardSkils(HardSkils.Inst);
            junior.setSoftSkils(SoftSkils.Lisen);
            return junior;
        }
        return null;
    }

    public static Programer getSenior(Rang rang) {
        if (rang != null) {
            Programer senior = new Programer();
            senior.setFirstName("Василий");
            senior.setLastName("Петров");
            senior.setAge(36);
            senior.setHardSkils(HardSkils.Lang);
            senior.setSoftSkils(SoftSkils.Speek);
            return senior;
        }
        return null;
    }

}
