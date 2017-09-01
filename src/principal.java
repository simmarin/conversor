public class principal {
        public static void main(String[] args) {
            operacion op = new operacion();
            System.out.println("son " +op.kbamb(2048)+" mb");
            System.out.println("son " +op.mbakb(1)+" kb");
            System.out.println("son " +op.mbagb(1024)+" gb");
            System.out.println("son " +op.gbamb(1)+" mb");
            System.out.println("son " +op.gbatb(1024)+" tb");
            System.out.println("son " +op.tbagb(2)+" gb");
        }
    }


