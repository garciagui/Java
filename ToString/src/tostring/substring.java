package tostring;

public class substring {

    public static void main(String[] args) {
        String arquivo = "gabriel gordão.mp3";
//      Come a olhar so depois do indice indicado.
//                       indice indicado
//                             |
        if (arquivo.substring(14).equalsIgnoreCase(".mp3")) {
            System.out.println("Arquivo de musica.");
        } else {
            System.out.println("Arquivo desconhecido!");
        }
    }

}
