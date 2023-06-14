package Hashtable;

public class Main {
    public static void main(String[] args) {
        // Minha implementação de Hashtable
        HashtableDev hashtableDev = new HashtableDev(10);
        hashtableDev.add("Coordenador", "Laura");
        hashtableDev.add("Gerente", "João");
        hashtableDev.add("Desenvolvedor", "Carlos");
        hashtableDev.add("Analista", "Mariana");
        System.out.println(hashtableDev);

        System.out.println(hashtableDev.search("Gerente"));
        System.out.println(hashtableDev.search("Analista"));

        System.out.println(hashtableDev.remove("Gerente"));
        System.out.println(hashtableDev.remove("Desenvolvedor"));
        System.out.println(hashtableDev);
    }
}
