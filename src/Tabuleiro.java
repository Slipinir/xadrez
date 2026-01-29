public class Tabuleiro {

                private char[][] casas;


                public Tabuleiro() {
                casas = new char [8][8];
                inicializar();
                colocarPeoes();
                colocarTorres();
                colocarCavalo();
                colocarBispo();
                colocarQueen();
                colocarKing();
                }

                private void inicializar() {
                        for (int linha = 0; linha < 8; linha++) {
                        for (int coluna = 0; coluna <8; coluna++) {
                                casas[linha][coluna] = '.';                    
                        }
                }
        }

                public void mostrar() {

    // letras das colunas
        System.out.println("  a b c d e f g h");

    // percorre as linhas de cima para baixo (8 até 1)
        for (int linha = 7; linha >= 0; linha--) {

        // número da linha
        System.out.print((linha + 1) + " ");

        for (int coluna = 0; coluna < 8; coluna++) {
        System.out.print(casas[linha][coluna] + " ");
        }

        System.out.println();
        }
}



                public void colocarPeoes () {
                        for (int coluna = 0; coluna<8; coluna++) {
                        casas[1][coluna] = 'p'; 
                        }
                        for (int coluna = 0; coluna<8; coluna++) {
                                casas[6][coluna] = 'P'; 
                }
        }

                public void colocarTorres() {

                        //torre preta 
                        casas[0][0] = 't';
                        casas[0][7] = 't';


                        //torre branca
                        casas[7][0] = 'T';
                        casas[7][7] = 'T';

                }

                public void colocarBispo() {
                        
                        //Bispo preta
                        casas[0][2] = 'b';
                        casas[0][5] = 'b';

                        //Bispo branca

                        casas[7][2] = 'B';
                        casas[7][5] = 'B';
                
                }
                public void colocarCavalo() {
                        
                        //Cavalo preta
                        casas[0][1] = 'c';
                        casas[0][6] = 'c';

                        //Cavalo branca

                        casas[7][1] = 'C';
                        casas[7][6] = 'C';
                
                }
                public void colocarQueen() {
                        
                        //Rainha preta
                        casas[0][3] = 'q';

                        //Rainha branca

                        casas[7][3] = 'Q';
                }

                public void colocarKing() {
                        
                        //Rei preta
                        casas[0][4] = 'k';
                        // Rei Branco
                        casas[7][4] = 'K';
                
                }
                }