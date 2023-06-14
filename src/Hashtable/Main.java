package Hashtable;

import java.util.Hashtable;

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

        // Nativo (java.util.Hashtable)
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(10, "Primeiro");
        hashtable.put(20, "Segundo");
        hashtable.put(30, "Terceiro");

        System.out.println("A tabela contém a chave 2? " + hashtable.containsKey(20));
        System.out.println("A tabela contém o valor Terceiro? " + hashtable.containsValue("Terceiro"));
        System.out.println("Valor associado à chave 10: " + hashtable.get(10));
        System.out.println("Elemento removido: " + hashtable.remove(20));
        System.out.println("Tamanho da tabela: " + hashtable.size());

        System.out.println(hashtable);
        System.out.println("Pares chave/valor:");
        for (Integer chave : hashtable.keySet()) {
            System.out.println(chave + "/" + hashtable.get(chave));
        }
    }
}
