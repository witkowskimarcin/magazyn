package com.example.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USEDPRODUCT")
public class UsedProduct {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usedproduct_seq")
    @SequenceGenerator(name = "usedproduct_seq", sequenceName = "usedproduct_seq", allocationSize = 1)
    private Long id;

    @Column(name = "quanitity")
    @NotNull
    private int quanitity;

    @Column(name = "pickedQuanitity")
    private int pickedQuanitity=0;

    @Column(name = "BARCODE")

    private String barCodeProduct;

    @Column(name = "ISPICKED")
    private boolean isPicked;

    private Long idStaticProduct;

    private Date exprDate;

    @OneToMany
    private List<UsedProductLot> usedProductLots;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuanitity() {
        return quanitity;
    }

    public void setQuanitity(int quanitity) {
        this.quanitity = quanitity;
    }

    public boolean isPicked() {
        return isPicked;
    }

    public void setPicked(boolean picked) {
        isPicked = picked;
    }

    public String getBarCodeProduct() {
        return barCodeProduct;
    }

    public void setBarCodeProduct(String barCodeProduct) {
        this.barCodeProduct = barCodeProduct;
    }

    public Long getIdStaticProduct() {
        return idStaticProduct;
    }

    public void setIdStaticProduct(Long idStaticProduct) {
        this.idStaticProduct = idStaticProduct;
    }

    public Date getExprDate() {
        return exprDate;
    }

    public void setExprDate(Date exprDate) {
        this.exprDate = exprDate;
    }

    public int getPickedQuanitity() {
        return pickedQuanitity;
    }

    public void setPickedQuanitity(int pickedQuanitity) {
        this.pickedQuanitity = pickedQuanitity;
    }

    public List<UsedProductLot> getUsedProductLots() {
        return usedProductLots;
    }

    public void setUsedProductLots(List<UsedProductLot> usedProductLots) {
        this.usedProductLots = usedProductLots;
    }
}
