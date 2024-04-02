# TG_assignment
Trabalho para matéria de teoria dos grafos
O trabalho consiste em usar os conceitos de grafos estudados ao longo do período para criar algo que possa utilizar estes,pode ser algum problema ou criar algum tipo de jogo.
A primeira parte é para modelar 2 tipos de trabalho e apresenta-los, no dia marcado a turma ira fazer uma votação e escolher qual dos 2 é mais interessante e relevante.
As 2 modelagens que eu escolhi serão jogos que usam diversos conceitos para funcionar.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1ª ideia

Possiveis temas:
-minimax
-menor caminho
-pontes ou articulares

Titulo: Marked for death 
DESCRIÇÃO:
1 ou 2 players(perguntar opnião qual é melhor).
O player é uma coelho e esta fugindo de um lobo,o jogo termina quando o coelho é pego pelo lobo,seu objetivo é entregar o maximo de comida para as tocas antes que o predador te pegue,o mapa consiste em um grafo bidirecionado em que os vestices são o locais em que o player vai se locomover e a as arestas são os caminhos que podem ser escolhidos.
Nos locais o player pode encontra comida que ao chegar no vertice ele coletará,alguns vertices serão marcados como "tocas",ao ficar neles deposita sua comida e ganha pontos,depositar gasta um turno de movimentação.
Ao longo do caminho voce pode utilizar algumas habilidades que servem para lhe dar uma vantagem de movimentação ou atrapalhar o predador ... (discrição das possiveis habilidades).

Algoritimo:
o codigo vai utilizar dos possiveis temas para organizar a maneira como ele sera implementado. O menor caminho vai ser utilizado pelo predador para dar track na possição do jogador e sempre pegar o menor caminho possivel ate ele OU ele usara o MINIMAX para determinar qual seria a melor posição para se locomover e encurralar a presa. Os algoritimos de ponte e articulares vao servir para as habilidades da presa como algum tipo de pulo ou atrasar o predador com alguma armadilha.
O mapa será gerado usando uma sequência de numeros aleatorios e suas arestas serão randomizadas da mesma maneira.
Serão utilizadas diversas estruturas de dados como:listas,arrays,filas, para armazenar de tudo(pontos,mapa,habilidades,etc)

2ª ideia

Possiveis temas:
-fluxo
-BFS
-Ponte/Articulares(MAYBE)

Jogo de Simulação Evacuação: Tunneling Pipe
O objetivo do jogo de evacuação é evacuar o maior número possível de pessoas de um prédio em chamas em um tempo limitado.
Prédio: Representado por um grafo, com:
Vértices: Salas, corredores, escadas, saídas de emergência.
Arestas: Portas, corredores, escadas.
Pessoas: Representadas como unidades de fluxo no grafo.

As pessoas só podem se mover através de vértices e arestas adjacentes.
A capacidade de cada aresta é limitada pelo número de pessoas que podem passar por ela ao mesmo tempo.
As pessoas podem se mover em qualquer direção, mas não podem voltar para um vértice que já deixaram.
As pessoas que chegam a uma saída de emergência são consideradas evacuadas.

Incêndio: O fogo se espalha pelo prédio ao longo do tempo, bloqueando algumas áreas e tornando outras mais perigosas.
Obstáculos: Portas trancadas, entulho e outros obstáculos podem dificultar a evacuação.

Algoritimo:
Fluxo máximo: Usado para determinar a rota mais eficiente para evacuar o maior número possível de pessoas no tempo limite.
Busca em largura: Usada para encontrar todas as rotas possíveis de um vértice para uma saída de emergência.
