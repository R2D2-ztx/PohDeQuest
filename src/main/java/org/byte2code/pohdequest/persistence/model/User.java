package org.byte2code.pohdequest.persistence.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/** The User model entity */
@Entity
@Table(name = "user")
public class User extends AbstractModel {

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
   * Gets username
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /** * Sets the first name of the user
   *
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Gets the first name of the user
   *
   * @return the user last name
   */
  public String getFirstName() {
    return firstName;
  }

  /** * Sets the first name of the user
   *
   * @param firstName the name to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets the last name of the user
   *
   * @return the user last name
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
   * Gets the email of the user
   *
   * @return the user email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the email of the user
   *
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Gets the phone of the user
   *
   * @return the user phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Sets the phone of the user
   *
   * @param phone the phone to set
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }
}