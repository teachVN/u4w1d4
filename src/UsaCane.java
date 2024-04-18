public class UsaCane {

    public static void main(String[] args) {
        Cane cane = new Cane("Luigi", 4, "Doberman");

//        cane.setNome("Luigi");
//        cane.setZampe(4);

        System.out.println(cane.getNome());
        System.out.println(cane.getZampe());
        System.out.println(cane.getRazza());

        System.out.println(cane.visualizzaDati());

        cane.verso();

        //Animale animale = new Animale("cane");

        Animale animale = new Cane("Luigi", 4, "pastore tedesco");

        System.out.println(animale.getZampe());
        System.out.println(animale.visualizzaDati());

        Animale[] animali = new Animale[3];

        animali[0]=animale;
        animali[1]=new Cane("Carlo", 4, "pastore tedesco");
        animali[2]=new Cane("Roberto", 4, "pastore tedesco");

        for (int i=0; i< animali.length;i++){
            System.out.println(animali[i].getNome());
            animali[i].verso();
        }

    }
}
