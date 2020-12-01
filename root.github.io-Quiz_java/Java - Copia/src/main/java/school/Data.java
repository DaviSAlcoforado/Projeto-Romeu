//definir o package
package school;

public class Data {

    private int acertosTotais = 0;
	private int acertosIndividuais;
    private int participantes = 0;

    Data (int acertosTotais, int acertosIndividuais, int participantes){
        setAcertosIndividuais(acertosIndividuais);
        setAcertosTotais(acertosTotais);
        setParticipantes(participantes);
    }

    void setAcertosTotais (int acertos){
        this.acertosTotais = acertos;
    }

    void setAcertosIndividuais (int acertos){
        this.acertosIndividuais = acertos;
        this.participantes +=1;
    }

    void setParticipantes (int acertos){
        this.participantes = acertos;
    }

    void somaAosAcertosTotais(int somativo){
        this.acertosTotais += somativo;
    }

    void zeraAcertosIndividuais(){
        this.acertosIndividuais = 0;
    }

    int getAcertosTotais (){
        return this.acertosTotais;
    }

    int getAcertosIndividuais (){
        return this.acertosIndividuais;
    }

    int getParticipantes(){
        return this.participantes;
    }


    
}