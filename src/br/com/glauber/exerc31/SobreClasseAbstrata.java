package br.com.glauber.exerc31;

public class SobreClasseAbstrata {
    public static void main(String[] args) {
        Account admin_account = new AdminAccount("AsaNorte", "123456");
        Account normal_account = new NormalAccount("PoloNorte", "654321");

        System.out.println("Admin_account is a admin? " + admin_account.isAdmin());
        System.out.println(admin_account.getCredentials());
        System.out.println();
        System.out.println("Normal_account is a admin? " + normal_account.isAdmin());
        System.out.println(normal_account.getCredentials());

    }
}