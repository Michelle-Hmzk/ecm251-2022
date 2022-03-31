// Michelle Mitie Hamazaki 
// RA: 20.00539-3


public class Usuario{
    private String nome;
    private String email;
    private String senha;
    
    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public void visualizarUsuario() {
        System.out.println("Nome:" + nome);
    }

    public String getNome() {
        return nome;
    }

    private String getEmail() {
        return email;
    }

    private String getSenha() {
        return senha;
    }

}