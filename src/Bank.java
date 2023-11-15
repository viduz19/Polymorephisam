class Bank {
    void savingBalance(){
    }
}
class BOC  extends Bank {
    void savingBalance() {
        System.out.println("50000");
    }
}
class peopleBank extends Bank {
    void savingBalance() {
        System.out.println("40000");
    }
}
class NSB  extends Bank {
    void savingBalance() {
        System.out.println("30000");
    }
}
class Test{
    public static void main(String[] args) {
     Bank b;
     b = new BOC();
     b.savingBalance();
     b = new peopleBank();
     b.savingBalance();
     b = new NSB();
     b.savingBalance();
    }
}

