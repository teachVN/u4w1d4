public class UsaCane {

    public static void main(String[] args) {
        Cane cane = new Cane("Doberman");

        cane.setNome("Luigi");
        cane.setZampe(4);

        System.out.println(cane.getNome());
        System.out.println(cane.getZampe());
        System.out.println(cane.getRazza());
    }
}
