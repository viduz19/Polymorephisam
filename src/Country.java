class Country {
    void naming(){
    }
}
class sriLanka extends Country{
    void naming(){
        System.out.println("Sri Lnaka");
    }
}
class India extends Country {
    void naming(){
        System.out.println("India");
    }
}
class Test2 {
    public static void main(String[] args) {
        Country c,c1;
        c = new sriLanka();
        c1 = new India();
        c.naming();
        c1.naming();
    }
}