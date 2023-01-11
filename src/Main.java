public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Betta ivan = new Betta("Ivan", "Ivanovich", 1, 12000);
        Betta petr = new Betta("Petr", "Petrovich", 1, 11500);
        Betta vasia = new Betta("Vasia", "Petrovich", 1, 5000);
        Betta l = new Betta("L", "l", 1, 10000);
        Betta j = new Betta("J", "j", 1, 18000);
        Betta k = new Betta("K", "k", 1, 14000);


       // System.out.println("vasia = " + vasia);
       Betta.addBetteMap(vasia);
       Betta.addBetteMap(ivan);
       Betta.addBetteMap(petr);
        
        Betta.addBetteMap(l);
        Betta.addBetteMap(j);
        Betta.addBetteMap(k);
        //System.out.println("Betta.getBettaMap() = " + Betta.getBettaMap());
        Betta.Print(Betta.getBettaMap());
        Betta.sumSalary();
        System.out.println("*****************");
        Betta.mediumSalary();
        System.out.println("*****************");
        Betta.minSalary();
        System.out.println("******************");
        Betta.maxSalary();
        System.out.println("******************");
        Betta.higherMediumSalary();
        System.out.println("******************");
        //System.out.println("Betta.getBettaMap().size() = " + Betta.getBettaMap().size());
Betta.hMS();
    }
}
//public  Collection<Employee> hMS() {
//        Integer sum = 0;
//        Integer medium;
//        for (Employee value : employees.values()) {
//            sum += value.getSalary();
//        }
//        medium = sum / employees.size();
//        employees.entrySet().removeIf(entry-> entry.getValue().getSalary() < medium);
//
//
//        return this.employees.values();
//    }


//public Collection<Employee> getHigherMediumSalary() {
//        Integer sum = 0;
//        Integer medium;
//        for (Employee value : employees.values()) {
//            sum += value.getSalary();
//        }
//        medium = sum / employees.size();
//
//        for (Map.Entry<Integer, Employee> entry : employees1.entrySet()) {
//            Integer key = entry.getKey();
//            Employee value = entry.getValue();
//
//            if (value.getSalary() > medium) {
//                employees1.put(key, value);
//            }
//        }
//        return this.employees1.values();}


////////////////////////////////////////////////
//highSalary.add(value);  Set<Employee> highSalary = new HashSet<>();  return highSalary;