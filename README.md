## Ecm251-2022
### Repositório criado para a disciplina ECM251-2022
 
## Informações úteis:

#
## Para Logar:
Abrir o Git Bash Here
```
git config --global user.name "nomeusuario"
git config --global user.email email@email.com
```
Abrir o git hub e clonar os arquivos, gosto de (no mesmo Git Bash Here):
```
git clone (shift + insert)
```
#
## Conferindo dados:
```
git config --global user.name 
```
Aparece o nome insetido
```
git config --global user.email 
```
Aparece o email inserido

#

## Limpar credenciais:
Abrir o Git Bash Here
```
git config --global --unset user.name 
git config --global --unset user.email 
```
#

## Para trazer alterações no código:
```
git pull
```

#

## Para conferir o status do git:
```
git status
```

#

## Para comitar:
Utilizando o Git Bash (pro git quando ja tem pasta):
```
git add .
git commit -m "mensagem"
git push
```
Ou commitar após comitar pelo VSCODE
```
git push
```