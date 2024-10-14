-Xms: Define o tamanho inicial da heap. Por exemplo, -Xms512m define o tamanho inicial da heap para 512 megabytes.

-Xmx: Define o tamanho máximo da heap. Por exemplo, -Xmx1024m define o tamanho máximo da heap para 1024 megabytes.

-Xss: Define o tamanho da pilha para cada thread. Por exemplo, -Xss256k define o tamanho da pilha para 256 kilobytes.

verbose:gc Mostra os logs do garbage collector.

java -XX:+UseZGC -jar yourApplication.jar

-XX:+PrintCompilation

Eden Space Espaço onde fica os objetos criados pela primeira vez.

Survivor Space Espaço onde fica os objetos que se recriaram n vezes, sendo n acima de um limite de criação de objetos

Old Generation Aqui o objeto passou por muitas coletas de lixo e ele é promovido da Survivor Space para a Old Generation

Application ClassLoader -> Platform ClassLoader -> Bootstrap ClassLoader

O processo de carregamento de classes pelo ClassLoader ocorre em três etapas principais:

1. Carregamento (Loading): Nesta etapa, o ClassLoader lê os bytes que compõem a classe a partir de seu arquivo .class e os transforma em uma instância da classe java.lang.Class na memória.

2. Linkagem (Linking): Após carregar a classe, o ClassLoader realiza a linkagem que prepara a classe para execução. A linkagem envolve três subetapas: verificação (verifica se a classe é válida), preparação (aloca memória para variáveis estáticas e inicializa seus valores padrão) e resolução (substitui referências simbólicas por referências diretas).

3. Inicialização (Initialization): Por fim, a classe é inicializada, o que significa que seus campos estáticos são definidos para os valores especificados pelo código e os blocos estáticos são executados.

JVM é uma especificação

Runtime Data Areas
- Method Area
- Heap
- Java Stack
- PC Registers
- Native Method Stack

[https://www.scientecheasy.com/2021/03/what-is-jvm.html/#google_vignette](https://www.scientecheasy.com/2021/03/what-is-jvm.html/#google_vignette)

## 📝 Licença

Projeto desenvolvido por [Alura](https://www.alura.com.br) e utilizado nos cursos de Spring Boot.

Instrutor: [Rodrigo Ferreira](https://cursos.alura.com.br/user/rodrigo-ferreira) 

---
