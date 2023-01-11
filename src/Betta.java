import java.util.*;

public class Betta {

    private static int couter;
    private int id;
    private String firstName;
    private String lastName;
    private int departament;
    private int salary;

    private static Map<Integer, Betta> bettaMap = new HashMap<>();
    private static Map<Integer, Betta> newBettaMap = new HashMap<>();

    public static Map<Integer, Betta> getNewBettaMap() {
        return newBettaMap;
    }

    public Betta(String firstName, String lastName, int departament, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departament = departament;
        this.salary = salary;
    }

    public static void addBetteMap(Betta betta) {
        Integer b = 0;
        Random random = new Random();
        b = random.nextInt(1000) + 1;

        bettaMap.put(b, betta);

    }

    public static void sumSalary() {
        Integer sum = 0;
        for (Betta value : bettaMap.values()) {
            sum += value.getSalary();
        }
        System.out.println("sum = " + sum);
    }

    public static void mediumSalary() {
        Integer sum = 0;
        Integer medium;
        for (Betta value : bettaMap.values()) {
            sum += value.getSalary();
        }
        medium = sum / bettaMap.size();
        System.out.println("medium = " + medium);
    }

    public static Integer mediumSalaryR() {
        Integer sum = 0;
        Integer medium;
        for (Betta value : bettaMap.values()) {
            sum += value.getSalary();
        }
        medium = sum / bettaMap.size();
        //System.out.println("mediumSalaryR = " + medium);
        return medium;
    }
//Integer highMedium;
//        for (Betta value: bettaMap.values()) {
//            if (value.getSalary()>mediumSalaryR()) {
//            }

    public static void higherMediumSalary() {
        Set <Betta> bb = new HashSet<>();
        for (Map.Entry<Integer, Betta> entry : bettaMap.entrySet()) {
            Integer key = entry.getKey();
            Betta value = entry.getValue();

            if (value.getSalary() > mediumSalaryR()) {

               // newBettaMap.put(key, value);
                bb.add(value);
            }
        }
        System.out.println("bb = " + bb);
        // Betta.Print(getNewBettaMap());
    }

    public static void hMS() {
        Set <Betta> bb = new TreeSet<>();
        Integer sum = 0;
        Integer medium;
        for (Betta value : bettaMap.values()) {
            sum += value.getSalary();
        }
        medium = sum / bettaMap.size();
        bettaMap.entrySet().removeIf(entry-> entry.getValue().getSalary() < medium);


        Betta.Print(getBettaMap());
    }

//bettaMap.removeIf(i -> i % 2 == 0);
    //System.out.println(itr.next());
    //System.out.println("Key: " + entry.getKey());
    //System.out.println("Value: " + entry.getValue().getSalary());

    //}
    // Integer m=10000;
    //        Iterator<Map.Entry<Integer, Betta>> itr = bettaMap.entrySet().iterator();
    //        while (itr.hasNext()) {
    //            Map.Entry<Integer, Betta> entry = itr.next();
    //           if (entry.getValue().getSalary() < mediumSalaryR()) {
    //               bettaMap.remove(entry.getKey());
    //            }


    //for (Map.Entry<Integer, Betta> entry : bettaMap.entrySet()) {
    //            Integer key = entry.getKey();
    //            Betta value = entry.getValue();
    //
    //            if (value.getSalary()<mediumSalaryR()) {
    //
    //                bettaMap.put(key, value);
    //            }
    //
    //        }
    //        Betta.Print(getNewBettaMap());


    public static void minSalary() {
        Integer min = 10000000;
        for (Betta value : bettaMap.values()) {
            if (value.getSalary() < min) {
                min = value.getSalary();
            }
        }
        System.out.println("min = " + min);
    }

    public static void maxSalary() {
        Integer max = -1;
        for (Betta value : bettaMap.values()) {
            if (value.getSalary() > max) {
                max = value.getSalary();
            }
        }
        System.out.println("max = " + max);
    }

    public static void Print(Map b) {
        b.forEach(
                (key, value)
                        -> System.out.println(key + " = " + value));
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static Map<Integer, Betta> getBettaMap() {
        return bettaMap;
    }

    public static void setBettaMap(Map<Integer, Betta> bettaMap) {
        Betta.bettaMap = bettaMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Betta betta = (Betta) o;
        return id == betta.id && departament == betta.departament && salary == betta.salary && Objects.equals(firstName, betta.firstName) && Objects.equals(lastName, betta.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, departament, salary);

    }

    @Override
    public String toString() {
        return "Betta{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departament=" + departament +
                ", salary=" + salary +
                '}';
    }
}
// public static void higherMediumSalary() {
//        for (Map.Entry<Integer, Betta> entry : bettaMap.entrySet()) {
//            Integer key = entry.getKey();
//            Betta value = entry.getValue();
//
//            if (value.getSalary() > mediumSalaryR()) {
//
//                newBettaMap.put(key, value);
//            }
//        }
//        Betta.Print(getNewBettaMap());
//    }
//
//    public static void hMS() {
//        bettaMap.entrySet().removeIf(entry-> entry.getValue().getSalary() < 11750);
//
//
//        Betta.Print(getBettaMap());
//    }