// Melissa Rios de Sousa
// RU: 4025304

import java.util.Scanner;

public class Principal {

	// Código principal, contendo o Menu do cofrinho e a chamada de métodos.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();

		while(true) {
			System.out.println("\n--- MENU ---");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Valor total convertido para Real");
			System.out.println("5 - Encerrar\n");
			System.out.println("Digite o número correspondente ao que deseja realizar:");
			
			int opcao;
            
			do {
                while (!teclado.hasNextInt()) { // Verifica se o valor digitado é um inteiro.
                    System.out.println("Opção inválida. Digite o número novamente: ");
                    teclado.next();
                }
                opcao = teclado.nextInt();
                if (opcao <= 0 || opcao > 5) { // Verifica se o valor digitado está entre as opções de menu.
                    System.out.println("Opção inválida. Digite o número novamente: ");

                }
            } while (opcao <= 0 || opcao > 5); // Repete enquanto o valor não estiver entre 1 e 5.
			
			switch(opcao) {
			    
                case 1:
			    // Corresponde à adição de moedas no cofrinho.
					
					System.out.println("Escolha o tipo da moeda que deseja adicionar:");
					System.out.println("1 - Real");
					System.out.println("2 - Dólar");
					System.out.println("3 - Euro\n");
					int tipo = teclado.nextInt();
									
					if (tipo == 1) {
						System.out.println("\nDigite o valor da moeda que deseja adicionar: ");
						double valor = teclado.nextDouble();
						Real real = new Real(valor);
						cofrinho.adicionar(real); // Adiciona Real no cofrinho.                  
						break;
					} 
					else if (tipo == 2) {
						System.out.println("\nDigite o valor da moeda que deseja adicionar: ");
						double valor = teclado.nextDouble();
						Dolar dolar = new Dolar(valor);
						cofrinho.adicionar(dolar); // Adiciona Dólar no cofrinho.  
						break;
					} 
					else if (tipo == 3) {
						System.out.println("\nDigite o valor da moeda que deseja adicionar: ");
						double valor = teclado.nextDouble();
						Euro euro = new Euro(valor);
						cofrinho.adicionar(euro); // Adiciona Euro no cofrinho.  
						break;
					} 
					else {
						System.out.println("\nOpção inválida."); // Digitado moeda inválida.
						break;
					}
						
				case 2:
			    // Corresponde à remoção de moedas no cofrinho.

				    System.out.println("Qual moeda voce deseja remover ?");
				    System.out.println("1 - Real");
				    System.out.println("2 - Dólar");
				    System.out.println("3 - Euro\n");
				    opcao = teclado.nextInt();

				    if(opcao == 1) {
				        System.out.println("\nDigite o valor da moeda que deseja remover: ");
						System.out.println("OBS: Só é possível remover o valor total da moeda.");
				        double valor = teclado.nextDouble();
						Real real = new Real(valor);
				        cofrinho.remover(real); // Remove Real no cofrinho.    
				        break;
				    }
				    else if(opcao == 2) {
				        System.out.println("\nDigite o valor da moeda que deseja remover: ");
						System.out.println("OBS: Só é possível remover o valor total da moeda.");						
				        double valor = teclado.nextDouble();
						Dolar dolar = new Dolar(valor);
				        cofrinho.remover(dolar); // Remove Real no cofrinho. 
				        break;
				    }
				    else if(opcao == 3){
				        System.out.println("\nDigite o valor da moeda que deseja remover: ");
						System.out.println("OBS: Só é possível remover o valor total da moeda.");
				        double valor = teclado.nextDouble();
						Euro euro = new Euro(valor);
				        cofrinho.remover(euro); // Remove Real no cofrinho. 
				        break;
				    }
				    else {
				    	System.out.println("\nOpção inválida."); // Digitado moeda inválida.
				        break;
				    }
				    
				case 3:
					// Lista as moedas presentes no cofrinho.
					System.out.println("\nListar moedas:");
					cofrinho.listagemMoedas(); // Chama o método de listar moedas da classe Cofrinho.
					break;

				case 4:
                    System.out.println("\nValor total em real:");
					cofrinho.converterMoedas(); // Chama o método de converter moedas da classe Cofrinho.
					break;
                    
				case 5:
					System.out.println("\nEncerrando o programa...");
			        teclado.close(); // Fecha o Scanner para evitar vazamentos de recursos.
			        return; // Encerra o programa.

				default:
			        System.out.println("\nOpção inválida, tente novamente.");

			}		
					
		}
	}
}
