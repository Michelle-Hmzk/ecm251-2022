# ECM251 - Utilizando Git

Em primeiro lugar, configurar quem é o usuário ***nome*** e qual seu ***e-mail*** no pc.
```bash
Abrir "Git Bash Here", digitar:
git config --global user.name "nomeusuario"
git config --global user.email email@email.com
```

## Comandos para utilizar
- Comando para configuração de user:
```
git config --global user.name "nomeusuario"
```

- Comando para configuração de email:
```
git config --global user.email email@email.com
```

- Comando para vizualisar o status do git (se os arquivos batem, se falta algo em algum lugar...):
```bash
git status 
```

- Comando para inicializar um novo repositório:
```bash
git init
```

- Comando para iniciar o track (para adicionar qualquer coisa, seja um arquivo todo, uma alteração. Depois tem outro comando):
```bash
git add .
```

- Comando para comitar:
```bash
git commit -m "algum texto"
```

- Comando para salvar as mudanças do commit:
```
git push
```

- Comando para baixar/atualizar o git:
```
git pull
```

- Comando para clonar um repositório:
```
git clone "link do repositório"
```
