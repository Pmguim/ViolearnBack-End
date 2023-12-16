# violearn-backend

Protótipo do violearn, que tem como objetivo ser um aplicativo para aprendizado de violão;
Nesse arquivos consta as funcionalidades de autentificação, criação e exclusão do usuário assim como a criação de posts

Link do projeto -> https://violearn-frontend.vercel.app/

Elementos adicionados:

1.  **JWT Token (JSON Web Token):**
    -   A implementação de JWT oferece uma maneira segura e eficiente de gerenciar a autenticação e a autorização no seu projeto. Os tokens são frequentemente utilizados para manter o estado da autenticação do usuário sem a necessidade de armazenar informações no servidor, o que pode escalar melhor e reduzir a carga no servidor.
2.  **Bcrypt:**
    -   Utilizar o Bcrypt para armazenar senhas aumenta significativamente a segurança do sistema. Isso protege as informações dos usuários, mesmo em casos de vazamento de dados, pois o processo de descriptografia de senhas é extremamente difícil.
3.  **Paginação de Posts e Cifras:**
    -   A paginação é útil para melhorar a experiência do usuário, especialmente quando há grandes quantidades de dados. Isso reduz a carga na transferência de dados, melhora o desempenho e proporciona uma navegação mais fluida.
4.  **Docker:**
    -   O uso de contêineres Docker facilita a criação, distribuição e implantação consistente de aplicações. Isso garante que o ambiente de desenvolvimento seja o mesmo que o de produção, minimizando problemas de inconsistência e simplificando o processo de escalabilidade.

*Utilização do back-end pode ser feita com o postman ou o insomnia*
  
Rotas:  
rotas /user: ---  
Post: /signup - criar usuário  
Post: /signin logar - usuário

Get: /top_five - 5 usuários mais ativos  
Get: /perfil - retorna o usuário logado

Delete: /delete - deleta o usuário logado

Put: /user/update - atualiza os dados de usuário e atualiza o username em todas as postagens e cifras automaticamente

rotas /post: ----

Post: ---- cria post  
Delete: /{postId} ---- deleta post  
Delete: /user ---- deleta todas as postagens desse usuário  
Get: /page={page}/size={size} ---- tras as postagens paginadas  
Get: /user/page={page}/size={size} ---- traz as postagens paginadas do usuário logado

rotas /cifra: ----

Post: cria cifra  
Delete: /{cifraid} deleta cifra  
Delete: /user deleta todas as cifras desse usuário  
Get: /page={page}/size={size} tras as cifras paginadas  
Get: /user/page={page}/size={size} traz as cifras paginadas do usuário logado

rotas /file: ----

String IMAGE_PATH = "./dados/imagens/";

Get: IMAGE_PATH + "/{path}/{fileName} ---- retorna a imagem ao front

String FILE_PATH = "./dados/file/";

Get: FILE_PATH + "/{path}/{fileName}" ---- retorna o arquivo da cifra ao front
