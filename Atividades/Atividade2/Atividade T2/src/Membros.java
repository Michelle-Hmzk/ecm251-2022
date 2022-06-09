public class Membros implements Mensagens {
    private String nome;
    private String email;
    private String funcao;

    public Membros (String nome, String email, String funcao) {
        this.setNome(nome);
        this.setEmail(email);
        this.setFuncao(funcao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Nome do membro = " + nome + " função =" + funcao; 
    }
}
