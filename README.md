# battleship
a implementation of battleship boardgame in java with test

# BDD 
## Funcionalidade: PrintBoard

Como um jogador, eu quero poder apresentar o tabuleiro da minha batalha naval, para que eu possa visualizar minha próxima jogada.

### Cenário: Printar o tabuleiro

Dado que eu queira jogar batalha naval
Quando eu inicializar o jogo
Então o tabuleiro do jogo deve ser apresentado para mim
E uma mensagem "Digite as coordenadas do seu tiro:" deve ser exibida

## Funcionalidade: ClearBoard

Como um jogador, eu quero poder limpar o tabuleiro da minha batalha naval, para que eu possa iniciar um novo jogo.

### Cenário: Limpar o tabuleiro

Dado que eu queira jogar batalha naval
Quando eu inicializar o jogo
Então o tabuleiro do jogo deve ser apresentado para mim
E uma mensagem "Digite as coordenadas do seu tiro:" deve ser exibida

## Funcionalidade: Predict

Como um jogador, eu quero poder apresentar o tabuleiro da minha batalha naval, para que eu possa executar minha próxima jogada.

### Cenário: Atirar no navio

Dado que eu atire em qualquer lugar no tabuleiro
Quando eu acertar um navio rival
Então eu quero visualizar isso no tabuleiro como um "X"
E receber a mensagem "Você acertou um navio rival"

### Cenário: Atirar na água

Dado que eu atire em qualquer lugar no tabuleiro
Quando eu não acertar um navio rival
Então eu quero visualizar isso no tabuleiro como um "~"
E receber a mensagem "Você acertou a água"

### Cenário: Atirar onde já atirou

Dado que eu atire em qualquer lugar no tabuleiro
Quando eu atirar em um local que eu já havia atirado
Então eu devo receber a mensagem "Você já atirou neste local, escolha um novo!"
E ter uma nova oportunidade de tiro

### Cenário: Atirar fora do tabuleiro

Dado que eu digite números x e y para atirar em algum lugar do tabuleiro
Quando x ou y não corresponderem a uma posição existente do tabuleiro
Então uma mensagem "Você não pode atirar fora do tabuleiro. Tente novamente." deve ser exibida
E o jogador deve poder jogar novamente

## Funcionalidade: PrintGrid

Como um rival, eu quero poder apresentar o tabuleiro da minha batalha naval, para que eu possa apresentar ao jogador a próxima jogada.

### Cenário: Apresentar o tabuleiro

Dado que eu queira permitir uma jogada no tabuleiro da batalha naval
Quando o jogo for inicializado
Então o tabuleiro do jogo deve ser apresentado para o jogador
E uma mensagem "Digite as coordenadas do seu tiro:" deve ser exibida

## Funcionalidade: SetShip

Como um rival, eu quero poder definir a posição e o tamanho do meu navio e a orientação, para que a batalha naval possa começar.

### Cenário: Definir tamanho do navio

Dado que eu escolha o tamanho do meu navio
Quando eu digitar o tamanho em números inteiros
Então o tabuleiro deve armazenar o meu navio no tamanho definido

### Cenário: Definir localização do navio

Dado que eu escolha a localização do meu navio dentro de uma escala X, Y
Quando eu digitar o primeiro valor como um número inteiro, sendo ele a referência no eixo X
E digitar o segundo valor como um número inteiro, sendo ele a referência no eixo Y
Então o tabuleiro deve armazenar o meu navio na localização definida

### Cenário: Definir orientação horizontal do navio

Dado que eu escolha a orientação do meu navio
Quando eu digitar "Horizontal"
Então o tabuleiro deve armazenar o meu navio na orientação definida

### Cenário: Definir orientação vertical do navio

Dado que eu escolha a orientação do meu navio
Quando eu digitar "Vertical"
Então o tabuleiro deve armazenar o meu navio na orientação definida

## Funcionalidade: endGameVerification

Como um jogador, eu quero que o jogo finalize quando todos os navios forem atingidos, para que eu possa jogar novamente.

### Cenário: Todos os navios rivais atingidos

Dado que eu atinja um navio rival
Quando for o último navio rival no tabuleiro
Então o jogo deve ser finalizado
E uma mensagem "Você venceu em X jogadas" deve ser exibida

### Cenário: Restam navios rivais para serem atingidos

Dado que eu atinja um navio rival
Quando houver pelo menos mais um navio rival vivo
Então o jogo deve ser continuado
E uma nova jogada deve ser liberada para o jogador
