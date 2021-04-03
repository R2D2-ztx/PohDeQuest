package org.byte2code.pohdequest.persistence.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * The User model entity
 */
@Entity
@Table(name = "user")
public class User extends AbstractModel {

    @Id
    private Integer id;

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @ManyToMany
    @JoinTable(
            name = "subscriptions",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "podcast_id"))
    private Set<Podcast> podcasts;


    /**
     * Gets the first name of the customer
     *
     * @return the customer last name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer
     *
     * @param firstName the name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the customer
     *
     * @return the customer last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user
     *
     * @param lastName the name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the email of the customer
     *
     * @return the customer email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the customer
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone of the customer
     *
     * @return the customer phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone of the customer
     *
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the user subscriptions
     *
     * @return the podcasts
     */
    public Set<Subscriptions> getSubscriptions() {
        return subscriptions;
    }

    /**
     * Subscribe to a new Podcast
     *
     * @param subscription the user to add
     */
    public void addSubscription(Subscriptions subscription) {
        subscriptions.add(subscription);
        subscriptions.setSubscriptions(this);
    }

    /**
     *
     * Unsubscribe to a Podcast from the subscriptions
     *
     * @param subscription the user to remove
     */
    public void removeSubscription(Subscriptions subscription) {
        subscriptions.remove(subscription);
        subscriptions.setSubscription(null);
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {

        // printing recipients with lazy loading
        // and no session will cause issues
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", subscriptions =" + subscriptions+
                "} " + super.toString();
    }
}



