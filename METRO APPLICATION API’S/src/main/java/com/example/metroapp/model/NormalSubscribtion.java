
package com.example.metroapp.model;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.Date;

@Entity
@DynamicInsert
@Table(name="normalsubscription")
public class NormalSubscribtion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    //@JsonManagedReference
    @OneToOne
    @JoinColumn(name="user_id")
    User user;

    String full_name;
    String email;
    String phone;
    String national_id;
    String country;
    String city;
    String source;
    String target;
    Date start_date;
    Date end_date;
    int period;
   // @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="subscription_id")
   Subscription subscription;

    Integer trips_num;
    Boolean in_use;
    public NormalSubscribtion(){}

    public NormalSubscribtion(String full_name, String email, String phone, String national_id, String country,String city, String source, String target,int period) {
        this.full_name = full_name;
        this.email = email;
        this.phone = phone;
        this.national_id = national_id;
        this.country = country;
        this.city = city;
        this.source = source;
        this.target = target;
        this.period=period;
        this.in_use=false;
    }
    public int getSubscription_id() {
        return id;
    }

    public void setSubscription_id(int id) {
        this.id = id;
    }


    public String getfull_name() {
        return full_name;
    }

    public void setfull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getnational_id() {
        return national_id;
    }

    public void setnational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }


    public void setTarget(String target) {
        this.target = target;
    }


    public Boolean getIn_use() {
        return in_use;
    }

    public void setIn_use(Boolean in_use) {
        this.in_use = in_use;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Integer getTrips_num() {
        return trips_num;
    }

    public void setTrips_num(Integer trips_num) {
        this.trips_num = trips_num;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
