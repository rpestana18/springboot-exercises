/**
 *
 */
package com.springboot.restful.exercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author RPestana
 *
 */

@Entity
@Table(name = "association")
public class Association {

    /*@GeneratedValue(strategy = GenerationType.AUTO)*/
    @Id
    @Column(name = "id_association")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cnpj")
    private String cnpj;

    public Association() {

    }

    public Association(long id, String name, String cnpj) {
        super();
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}