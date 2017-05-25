/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@ApplicationScoped
public class AlunoMB implements Serializable{

    /**
     * Creates a new instance of AlunoMB
     */
    public AlunoMB() {
    }
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void salvar(){
        System.out.println(matricula);
    }
}
