## Ecm251-2022
### Repositório criado para a disciplina ECM251-2022
 
## Informações úteis:

### Para Logar: 
```Abrir o "Git Bash Here" na tela inicial do PC e digitar:```
```
git config --global user.name "nomeusuario"
git config --global user.email email@email.com
```

#
### Para clonar arquivos:
```Abrir o git hub, copiar a URL colar no "Git Bash Here" (em qualquer lugar, tanto em uma pasta, quanto na tela inicial):```
```
git clone (shift + insert)
```

#
### Conferindo dados:
```Para conferir o nome ou user inserido:```
```
git config --global user.name 
```

```Para conferir e-mail inserido:```
```
git config --global user.email 
```

#
### Para trazer alterações feitas nó código que estão no git hub:
```
git pull
```

#
### Para criar uma branch nova:
```
git checkout -b (nome)
```

```
git clone (shift+insert)
cd pasta 
git checkout -b (nome)
git merge (nome de uma branch) "atualiza a branch"
mkdir (nome)
cd (nome)/
python -m venv .
cd Scripts 
./activate 
```

#
### Para conferir o status do git:
```
git status
```

#
### Para comitar:
```Utilizando o Git Bash:```
```
git add .
git commit -m "mensagem"
git push
```

```Ou commitar após comitar pelo VSCODE:```
```
git push
```

#
### Limpar credenciais:
```Abrir o Git Bash Here```
```
git config --global --unset user.name 
git config --global --unset user.email 
```
