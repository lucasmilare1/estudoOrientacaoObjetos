public class exemplo {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa ("lucas",12,07,1998);
        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculIdade());

        eu.setNome("Lucas Milaré");

        System.out.println(eu.getNome());
    }
}
