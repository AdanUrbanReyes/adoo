package modelo;

import java.util.Date;

public class Sales {
    private Employeer employeer;
    private Boss boss;
    private String barcodeProduc;
    private int amountSale;
    private Date date;//for insert datatime in mysql 'year/month/day hour:minute:second'
    private float total;
    public Sales(String barcodeProduc, int amountSale, Date date,Object user) {
        this.barcodeProduc = barcodeProduc;
        this.amountSale = amountSale;
        this.date = date;
        if(user instanceof Employeer){
            this.employeer=(Employeer)user;
        }else{
            if(user instanceof Boss){
                this.boss=(Boss)user;
            }
        }
    }

    public Employeer getEmployeer() {
        return employeer;
    }

    public Boss getBoss() {
        return boss;
    }

    public String getBarcodeProduc() {
        return barcodeProduc;
    }

    public int getAmountSale() {
        return amountSale;
    }

    public Date getDate() {
        return date;
    }
    public void setEmployeer(Employeer employeer) {
        this.employeer = employeer;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public void setBarcodeProduc(String barcodeProduc) {
        this.barcodeProduc = barcodeProduc;
    }

    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
}
