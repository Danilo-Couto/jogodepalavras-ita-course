## Funcionamento do Jogo

1. **Principal**: Representa a classe principal com o método `main()`. É responsável por interagir com o usuário no console, sem conhecer detalhes sobre a lógica do jogo.

2. **BancoDePalavras**: Classe que contém uma lista de palavras. Retorna uma palavra aleatória dessa lista.

3. **Embaralhador**: Interface para classes responsáveis por embaralhar palavras. Pelo menos duas implementações devem ser fornecidas.

4. **FabricaEmbaralhadores**: Retorna uma implementação de Embaralhador aleatoriamente.

5. **MecanicaDoJogo**: Interface que define a lógica do jogo. Determina quando o jogo termina, se o usuário acertou a palavra, quantas tentativas são permitidas, pontuação do jogador, entre outros. Deve haver pelo menos duas implementações.

6. **FabricaMecanicaDoJogo**: Retorna uma implementação de MecanicaDoJogo.

## Implementação

- A classe `Principal` interage com o usuário, utilizando métodos definidos na interface `MecanicaDoJogo`.

- As implementações de `MecanicaDoJogo` usam a interface `Embaralhador` para embaralhar as palavras.

- As implementações de `Embaralhador` contêm algoritmos para embaralhar palavras.


## Testes de Unidade

Foram incluídos testes de unidade para as classes de embaralhamento, garantindo que as palavras são embaralhadas corretamente.

---
**Instruções para o Desenvolvedor:** É importante manter a estrutura do jogo flexível para permitir a troca de implementações de embaralhamento e mecânica do jogo no futuro. Certifique-se de documentar adequadamente as interfaces e fornecer métodos necessários para obter informações relevantes sobre as implementações.

# Jogo das Palavras Embaralhadas

Orientação a Objetos com Java
by Instituto Tecnológico da Aeronáutica

## Sobre este Curso

Neste curso, assumimos que você já sabe desenvolver programas pequenos em Java, mas você talvez não se sinta ainda confortável em projetar programas mais complexos com método e organização.

O objetivo deste curso é fazer você compreender os princípios de orientação a objetos por meio da linguagem Java e saber como eficientemente aplicar esses princípios na prática quando projetando e desenvolvendo software de maneira ágil. Os conceitos discutidos e experimentados por você neste curso serão a base para você poder compreender os novos conceitos apresentados nos cursos seguintes desta especialização.

Os conceitos Java apresentados neste curso incluem o seguinte: revisão de conceitos básicos de orientação a objetos, tais como classes, objetos, métodos e atributos, variáveis de instância e de classe; responsabilidades, colaborações e cartões CRC; testes de unidade, uso de plataforma IDE como o Eclipse; herança, classes concretas e abstratas, interfaces, modificadores de acesso, encapsulamento, métodos de acesso; aprofundamento nos conceitos de polimorfismo, sobrecarga e sobreposição; associação de classes, agregação e composição; exceções, delegação e acoplamento abstrato. Em seguida, vocês serão apresentados aos principais princípios usados para organizar o desenvolvimento de programas orientados a objetos com qualidade, dentre os quais, os princípios "Tell, Don't Ask!" e "Law of Demeter". Sempre que conveniente, cada conceito será representado por meio de diagramas UML. Você será exposto a propriedades e anotações em Java.

Ao final deste curso, você terá amadurecido de tal modo suas habilidades de programação que você será capaz de implementar versões iniciais do componente de gamificação constante do Trabalho de Conclusão da Especialização, com base nas boas práticas exercitadas neste curso.

**Nível:** Intermediário  
**Compromisso:** 50 horas  
**Idioma:** Português (Brasil)  
**Classificação média do usuário:** 4.8
