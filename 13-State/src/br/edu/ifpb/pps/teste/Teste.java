package br.edu.ifpb.pps.teste;

import br.edu.ifpb.pps.model.Semaforo;

public class Teste {
//	 semáforo tem um temporizador com impulsos em intervalos regulares
//	 impulsos chegam ao controlador do semáforo como chamadas ao método tick();
//	 um tick() faz com que o semáforo faça:
//	  vermelho > verde; verde > amarelo; amarelo > vermelho.
	
//	 Ele também tem o panic(): controlador muda o semáforo p/ vermelho
//	 e também tem o off(): amarelo intermitente.
//	 O método on() é o que faz com que ele volte ao estado normal.
	
//	 Além dos métodos p/ alterar o estado, o semáforo ainda tem um que permite
//	 obter a cor atual do semáforo: status().
	
//	 O semáforo começa amarelo intermitente e quando recupera das situações de
//	 intermitência e de pânico (on()), fica vermelho.
	
	public static void main(String[] args){
		Semaforo semaforo = new Semaforo(); // iniciou - amarelo intermitente
		
		semaforo.toGreen(); // erro - continua amarelo intermitente
		semaforo.on(); // vermelho
		semaforo.toYellow(); // erro - continua vermelho
		semaforo.toGreen(); // verde
		semaforo.toRed(); // erro - continua verde
		semaforo.toYellow(); // amarelo
		semaforo.toRed(); // vermelho
		semaforo.toGreen(); // verde
		semaforo.off(); // amarelo intermitente
		
		semaforo.on(); // vermelho
		semaforo.toGreen(); // verde
		semaforo.toYellow(); // amarelo
		semaforo.panic(); // vermelho
		
	}
}
