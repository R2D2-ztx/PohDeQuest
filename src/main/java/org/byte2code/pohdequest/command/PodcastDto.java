package org.byte2code.pohdequest.command;

import javax.validation.constraints.*;

/**
 * The {@link org.byte2code.pohdequest.persistence.model.Podcast} data transfer object
 */
public class PodcastDto {

    private Integer id;

    @NotNull(message = "please type a podcast name")
    @NotBlank(message = "please type a podcast name")
    @Size(min = 3, max = 64)
    private String name;

    /**
     * Gets the id of the podcast dto
     *
     * @return the podcast dto id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id of the podcast dto
     *
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the name of the podcast dto
     *
     * @return the podcast dto name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the podcast dto
     *
     * @param name the name to set
     */
    public void name(String name) {
        this.name = name;
    }
}
