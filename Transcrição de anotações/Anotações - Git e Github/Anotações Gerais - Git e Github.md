# Anotações Gerais - Git e Github :bookmark_tabs:

### ==**Git:**==

- Software que ajuda a criar e monitorar diferentes versões de código
- ==Sistema de versionamento de código distribuído==
- Git X Github = são complementares porém diferentes
- Não possui interface gráfica, possui CLI (Command-Line Interface)
- Principais objetos: blobs, trees, commits
- **==Comandos básicos:==**
  - =='dir'==-- lista pastas/diretórios
  - =='cd'== -- muda diretório
  - =='cd ..'== -- volta um diretório
  - ==ctrl + l== -- limpa informações da tela
  - ==tab==-- autocompleta comando
  - =='mkdir'== -- cria diretório/pasta
  - =='>'== -- redireciona fluxo
  - =='del'== -- deleta arquivos
  - =='rmdir'== -- deleta diretório/pasta (se estiver vazia)
  - =='ls'== -- lista arquivos daquela pasta/diretório
  - =='git init'== --inicia um repositório do git naquele local
  - =='git add'== -- move arquivos específicos para staged (versionamento do código)
  - =='git add *'== ou =='git add .'== --pega tudo que foi modificado e manda para staged
  - =='git commit -m'== -- comita arquivos
  - =='mv'== - move arquivos
  - =='git clone'== -- clona repositórios remotos para o seu repositório local
  - =='git status'==-- informa estados de arquivos (modified, unmodified, staged)
  - Entre outros..

-  SHA1(Security Hash Algorithm):  algoritmo de encriptação. Identifica arquivos de forma segura e curta, através de um conjunto distinto de 40 caracteres.

-  Chave SSH:  forma de estabelecer conexão segura entre máquina local e o Github (uma chave pública e uma privada)

- Flags: são adições aos comandos que modificam como eles funcionam

- Markdown: outra forma de escrever arquivo HTML

- Commits sempre apontam um parent (a não ser que seja o primeiro commit), que é o commit anterior a ele. Através disso ´podemos ver o histórico de commits e alterações.

- Conflito de merge: é preciso fazer um 'pull', definir as alterações manualmente, e só entaõ é possível fazer o 'push'

- Como funciona:

  | Servidor (Github) |         Ambiente de Desenvolvimento (Git)         |
  | ----------------- | :-----------------------------------------------: |
  | Remote Repository | Local Repository; Staging Area; Working Directory |

- Github: uma das plataformas existentes de repositório remoto