package Animais;

public class Cachorro extends Animal{
        // Atributos
        static int numerosDeCachorros;
        private int tamanhoDoRabo;

        // Construtor Padrão

        // Contrutores Adicionados
        public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
                super(nome, cor, altura, peso, estadoDeEspirito);
                this.nome = nome;
                this.cor = cor;
                this.altura = altura;
                this.peso = peso;
                this.tamanhoDoRabo = tamanhoDoRabo;
                this.estadoDeEspirito = estadoDeEspirito;

                numerosDeCachorros ++;
        }

        // MÉTODOS
        public static int getNumerosDeCachorros() {
                return numerosDeCachorros;
        }

        public static void setNumerosDeCachorros(int numerosDeCachorros) {
                Cachorro.numerosDeCachorros = numerosDeCachorros;
        }

        //Get = Obtem o valor de um atributo.
        public String getNome() {
                return this.nome;
        }

        //Set = Modifica o valor de um atributo.
        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getCor() {
                return cor;
        }

        public void setCor(String cor) {
                this.cor = cor;
        }

        public int getAltura() {
                return altura;
        }

        public void setAltura(int altura) {
                this.altura = altura;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public int getTamanhoDoRabo() {
                return tamanhoDoRabo;
        }

        public void setTamanhoDoRabo(int tamanhoDoRabo) {
                this.tamanhoDoRabo = tamanhoDoRabo;
        }

        public String getEstadoDeEspirito() {
                return estadoDeEspirito;
        }
                public String pegar() {
                return "Bolinha";
        }

        public String interegir(String acao) {

                switch (acao) {
                        case "carinho":
                                this.estadoDeEspirito = "Feliz"; break;
                        case "Vai dormir!":
                                this.estadoDeEspirito = "Bravo!"; break;
                        case "pisar na patinha":
                                this.estadoDeEspirito = "Triste!"; break;
                        default:
                                this.estadoDeEspirito = "Neutro!";
                }
                return this.estadoDeEspirito;



//                if (acao.equals("carinho")) {
//                        this.estadoDeEspirito = "Feliz";
//                } else if (acao.equals("Vai dormir!")){
//                        this.estadoDeEspirito = "Bravo";
//                } else {
//                        this.estadoDeEspirito = "Neutro";
//                }
//
//               return estadoDeEspirito;
        }

        @Override
        public String toString() {
                return "Cachorro{" +
                        "nome='" + nome + '\'' +
                        '}';
        }

        @Override
        public void soar() {
                System.out.println("Au, au, au!");
        }
}
