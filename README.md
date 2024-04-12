# WellDone

--Integration for PluSoft ("Desvendando o Potencial dos Dados: Explorando a AI
Generativa e o Deep Analytics para Impulsionar o
Crescimento Empresarial)
--
--Desafio:
Cada vez mais as empresas estão em busca de entender como os dados
gerados nas interações de encantamento, compra e atendimento podem
ajudar na condução do negócio. Leads, prospects e clientes geram dados
que podem ser transformados em insights e ações. Análise, predição e
prescrição são elementos fundamentais nessa jornada. Como a AI
generativa e o deep analytics podem ajudar nesse processo? Empresas
que entregarem essa proposta de valor podem crescer muito rápido em
um mercado avido por informações.
--

-- 
Integrantes:
--
--Thiago Ulrych - RM97951

--Bruno Ramos da Costa - RM551942

--Guilherme Faria de Aguiar - RM551374

--Henrique Roncon Pereira - RM99161

--Lucas Carabolad Bob - RM550519


--
Usabilidade
--
- Colocar Usuario e Senha no Application.Propeties para conexão com Banco Oracle
- (Para usar metodo delete, usar na ordem Pagamento, Pedido e depois cliente)
  
#
--
Tabela de EndPoints(Localhost:8080/well)
--

  Cliente:
  - FindAll (/clientes)
  - FindById ("/clientes/{id_cliente}")
  - Put ("/cliente/{id_cliente}")
  - Post @PostMapping("/salvarC")
  - Delete ("/cliented/{id_cliente}")

  Pagamento:
  - FindAll (/pagamentos)
  - FindById ("/pagamentos/{id}")
  - Put ("/pagamento/{id}")
  - Post ("/salvarPm")
  - Delete ("/pagamentod/{id_pagamento}")

  Pedido:
  - FindAll (/pedidos)
  - FindById ("/pedidos/{id}")
  - Put ("/pedido/{id}")
  - Post ("/salvarPd")
  - Delete("/pedidod/{id_pedidos}")

  Produto:
  - FindAll (/produtos)
  - FindById ("/produtos/{id}")
  - Put ("/produto/{id_produto}")
  - Post ("/salvarP")
  - Delete ("/produtod/{id_produto}")
#

--
WellDoneProject
--
#
--
Introdução:
--
  Imagine uma solução que torna a navegação em aplicativos mais fácil e acessível para todos, especialmente para aqueles que podem sentir-se perdidos ou confusos ao usar novas tecnologias. Nosso projeto visa criar um ChatBot inteligente que atua como um guia amigável, ajudando os usuários a navegar pela aplicação e responder suas dúvidas sobre produtos. Nosso foco principal é oferecer suporte para o público idoso, que muitas vezes enfrenta dificuldades com a tecnologia e pode se beneficiar enormemente de uma assistência personalizada e intuitiva.


--
Objetivos da Solução Idealizada
--
-- 
Facilitar a Navegação:
--
  O principal objetivo da nossa solução é tornar a navegação em aplicativos mais fácil e intuitiva para todos os usuários, especialmente para aqueles que enfrentam dificuldades devido à idade ou falta de experiência tecnológica.

--
Fornecer Assistência Personalizada:
--
  Queremos oferecer uma assistência personalizada aos usuários, adaptando as respostas e orientações do ChatBot de acordo com suas necessidades específicas e nível de familiaridade com a tecnologia.

-- 
Reduzir a Frustração e a Ansiedade: 
--
  Ao oferecer orientações claras e suporte em tempo real, nossa solução visa reduzir a frustração e a ansiedade que os usuários podem sentir ao usar aplicativos móveis, promovendo uma experiência mais positiva e gratificante.

-- 
Responder Dúvidas sobre Produtos:
--
  Além de ajudar na navegação, o ChatBot também fornecerá informações sobre os produtos, respondendo perguntas comuns dos usuários e ajudando-os a tomar decisões informadas sobre suas compras.

-- 
Promover a Inclusão Digital:
--
  Queremos promover a inclusão digital, garantindo que pessoas de todas as idades e níveis de experiência tecnológica possam aproveitar os benefícios dos aplicativos móveis, sem sentir-se excluídas ou sobrecarregadas.

--
Coletar Feedbacks e Melhorias Contínuas: 
--
  Nossa solução também incluirá mecanismos para coletar feedback dos usuários, permitindo-nos identificar áreas de melhoria e implementar atualizações contínuas para tornar o ChatBot ainda mais eficaz e útil.

--
Aumentar a Satisfação do Cliente:
--
  Ao fornecer uma experiência de usuário mais amigável e acessível, esperamos aumentar a satisfação do cliente e fortalecer o relacionamento entre os usuários e a aplicação. Isso pode resultar em maior fidelidade do cliente e aumento da recomendação boca a boca.







