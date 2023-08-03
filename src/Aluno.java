public class Aluno {

    private String nome;
    private int ra, pv1,pv2,nt;
    private float media;

    public Aluno(String nome, int ra, int pv1, int pv2, int nt) {
        this.nome = nome;
        this.ra = ra;
        this.pv1 = pv1;
        this.pv2 = pv2;
        this.nt = nt;
    }

    public void CalcMedia(){
        media = (float) (pv1 * 0.35) + (float)(pv2 * 0.35) + (float)(nt * 0.3);

        System.out.println(nome + " obteve a media " + media);

    }

    public void Situacao(){
        if( media >= 7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }

    @Override
    public String toString (){
        return nome + ra + media;
    }

}